package ru.mkn.sovesti.screbok.core.internal.markdown;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.commonmark.node.Link;
import org.commonmark.node.Node;

import ru.mkn.sovesti.screbok.common.emf.EObjectContainer;
import ru.mkn.sovesti.screbok.core.markdown.Markdown;
import ru.mkn.sovesti.screbok.mlm.model.AllText;
import ru.mkn.sovesti.screbok.mlm.model.WrappedNodes;
import ru.mkn.sovesti.screbok.mlm.model.api.Reference;
import ru.mkn.sovesti.screbok.mlm.model.api.Section;

public record ReferenceConversion(Reference node, List<Child> children) implements MarkdownNodeConversion {

	public ReferenceConversion(Reference node) {
		this(node, new ArrayList<>());
	}

	@Override
	public void convert(Node parent) {
		Link link = new Link();
		link.setDestination(maybeLinkToSection());
		parent.appendChild(link);
		Optional.ofNullable(node.getTitle()) //
				.ifPresent(title -> children.add(new Child(link, title)));
	}

	private String maybeLinkToSection() {
		return Optional.ofNullable(node.getReferenced()) //
				.map(EObjectContainer::new) //
				.flatMap(eoc -> eoc.ofType(Section.class)) //
				.map(Section::getTitle) //
				.map(new AllText()) //
				.map(new WrappedNodes()) //
				.map(Markdown::new) //
				.map(Markdown::render) //
				.map(this::reference) //
				.orElse(node.getLink());
	}

	private String reference(String raw) {
		return "#" + raw.trim().replaceAll("[ |\\u00a0]", "-").replaceAll("[\\.\\(\\)]", "").toLowerCase();
	}

}