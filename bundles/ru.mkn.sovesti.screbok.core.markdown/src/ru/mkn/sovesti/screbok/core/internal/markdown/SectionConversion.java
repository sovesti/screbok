package ru.mkn.sovesti.screbok.core.internal.markdown;

import java.util.ArrayList;
import java.util.List;

import org.commonmark.node.Heading;
import org.commonmark.node.Node;

import ru.mkn.sovesti.screbok.mlm.model.api.Section;

public record SectionConversion(Section node, List<Child> children) implements MarkdownNodeConversion {

	public SectionConversion(Section node) {
		this(node, new ArrayList<>());
	}

	@Override
	public void convert(Node parent) {
		appendTitle(parent);
		new ChildrenList(parent, node.getChildren()).moveTo(children);
	}

	private void appendTitle(Node parent) {
		Heading title = new Heading();
		title.setLevel(node.getLevel());
		children.add(new Child(title, node.getTitle()));
		parent.appendChild(title);
	}

}