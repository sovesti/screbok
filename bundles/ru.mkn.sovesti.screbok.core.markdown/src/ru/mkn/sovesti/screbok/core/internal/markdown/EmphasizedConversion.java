package ru.mkn.sovesti.screbok.core.internal.markdown;

import java.util.ArrayList;
import java.util.List;

import org.commonmark.node.Emphasis;
import org.commonmark.node.Node;
import org.commonmark.node.StrongEmphasis;
import org.commonmark.node.Text;

import ru.mkn.sovesti.screbok.mlm.model.api.Emphasized;

public record EmphasizedConversion(Emphasized node, List<Child> children) implements MarkdownNodeConversion {

	public EmphasizedConversion(Emphasized node) {
		this(node, new ArrayList<>());
	}

	@Override
	public void convert(Node parent) {
		Node emphasis = createEmphasis();
		parent.appendChild(emphasis);
		new ChildrenList(emphasis, node.getParts()).moveTo(children);
	}

	private Node createEmphasis() {
		return switch (node.getType()) {
		case BOLD -> new StrongEmphasis();
		case ITALIC -> new Emphasis();
		default -> new Text();
		};
	}

}