package ru.mkn.sovesti.screbok.slm.model;

import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;

import ru.mkn.sovesti.screbok.common.eclipse.FolderUnderProject;
import ru.mkn.sovesti.screbok.common.emf.FreshResource;
import ru.mkn.sovesti.screbok.common.emf.SavedEObject;
import ru.mkn.sovesti.screbok.core.markdown.Markdown;
import ru.mkn.sovesti.screbok.core.scrap.StoredMedia;
import ru.mkn.sovesti.screbok.dsm.model.api.Rule;
import ru.mkn.sovesti.screbok.dsm.model.matching.MatchedTree;
import ru.mkn.sovesti.screbok.dsm.model.matching.TreeMatchResult;
import ru.mkn.sovesti.screbok.dsm.model.rules.CollectedRules;
import ru.mkn.sovesti.screbok.mlm.model.api.SitePage;
import ru.mkn.sovesti.screbok.slm.model.api.Convert;

public final class ConversionRun {

	private final Convert convert;
	private final LaunchContext context;
	private final Set<Rule> rules;

	public ConversionRun(Convert convert, LaunchContext context) {
		this.convert = Objects.requireNonNull(convert);
		this.context = Objects.requireNonNull(context);
		this.rules = new HashSet<>();
	}

	public void perform() {
		rules.addAll(new CollectedRules().fromBook(convert.getBook()));
		convert.getPages().forEach(this::perform);
	}

	private void perform(SitePage page) {
		TreeMatchResult result = new MatchedTree(rules).from(context.pages().get(page.getUri()).getRoot());
		result.unmatched().forEach(node -> context.log().report(Status.warning("Unmatched node: " + node.getName())));
		freshResource(page).ifPresent(new SavedEObject(result.tree(), context.log())::toResource);
		try {
			write(page, result);
		} catch (Exception e) {
			context.log().report(e);
		}
	}

	private void write(SitePage page, TreeMatchResult result) throws CoreException, IOException {
		IFolder folder = new FolderUnderProject(context.project()).ensure(convert.getOutput());
		folder.getFile(outputFile(page)).write(markdown(result).getBytes(), false, false, false, context.monitor());
		for (StoredMedia media : context.media().values()) {
			media.copyTo(folder.getLocation().toFile());
		}
	}

	private String outputFile(SitePage page) {
		return page.getName() + new ResourceSuffix().get() + ".md";
	}

	private String markdown(TreeMatchResult result) {
		return new Markdown(result.tree()).render();
	}

	private Optional<Resource> freshResource(SitePage page) {
		return new FreshResource(context.project(), page, page.getName() + new ResourceSuffix().get() + ".mlm") //
				.under(convert.getOutput());
	}
}
