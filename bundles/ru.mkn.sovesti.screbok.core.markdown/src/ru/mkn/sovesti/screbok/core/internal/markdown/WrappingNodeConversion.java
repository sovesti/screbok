package ru.mkn.sovesti.screbok.core.internal.markdown;

import java.util.ArrayList;
import java.util.List;

import org.commonmark.node.Node;

import ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode;

public record WrappingNodeConversion(WrappingNode node, List<Child> children) implements MarkdownNodeConversion {

	public WrappingNodeConversion(WrappingNode node) {
		this(node, new ArrayList<>());
	}

	@Override
	public void convert(Node parent) {
		new ChildrenList(parent, node.getChildren()).moveTo(children);
	}

}