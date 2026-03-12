package ru.mkn.sovesti.screbok.slm.model;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.w3c.dom.Document;

import ru.mkn.sovesti.screbok.common.eclipse.FolderUnderProject;
import ru.mkn.sovesti.screbok.common.emf.FreshResource;
import ru.mkn.sovesti.screbok.common.emf.SavedEObject;
import ru.mkn.sovesti.screbok.core.scrap.FetchDom;
import ru.mkn.sovesti.screbok.core.scrap.FetchImages;
import ru.mkn.sovesti.screbok.mlm.model.ParsedDomNode;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.SitePage;
import ru.mkn.sovesti.screbok.slm.model.api.Scrap;

public final class ScrappingRun {

	private final Scrap scrap;
	private final LaunchContext context;

	public ScrappingRun(Scrap scrap, LaunchContext context) {
		this.scrap = Objects.requireNonNull(scrap);
		this.context = Objects.requireNonNull(context);
	}

	public void perform() throws CoreException {
		for (SitePage page : scrap.getPages()) {
			perform(page);
		}
	}

	private void perform(SitePage page) throws CoreException {
		Optional<Resource> resource = freshResource(page);
		if (!resource.isPresent()) {
			return;
		}
		SitePage copy = EcoreUtil.copy(page);
		context.pages().put(page.getUri(), copy);
		fetch(page).ifPresent(node -> copy.setRoot(node));
		new SavedEObject(copy, context.log()).toResource(resource.get());
	}

	private Optional<Resource> freshResource(SitePage page) {
		return new FreshResource(context.project(), page, page.getName() + ".mlm").under(scrap.getOutput());
	}

	private Optional<MarkupNode> fetch(SitePage page) throws CoreException {
		Optional<Document> dom = dom(page);
		dom.map(new FetchImages(folder(), page.getSite(), context.log())::imagesFrom) //
				.ifPresent(context.media()::putAll);
		return dom //
				.map(Document::getDocumentElement) //
				.map(ParsedDomNode::new) //
				.map(Supplier::get);
	}

	private String folder() throws CoreException {
		return new FolderUnderProject(context.project()).ensure(scrap.getOutput()).getLocation().toString();
	}

	private Optional<Document> dom(SitePage page) {
		return new FetchDom(page.getUri()).get().unwrapOr(context.log()::report);
	}
}
