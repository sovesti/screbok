package ru.mkn.sovesti.screbok.core.internal.markdown;

import java.util.List;
import java.util.Objects;

import org.commonmark.node.Node;

import ru.mkn.sovesti.screbok.core.internal.markdown.MarkdownNodeConversion.Child;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;

final class ChildrenList {

	private final Node parent;
	private final List<MarkupNode> nodes;

	ChildrenList(Node parent, List<MarkupNode> nodes) {
		this.parent = Objects.requireNonNull(parent);
		this.nodes = Objects.requireNonNull(nodes);
	}

	void moveTo(List<Child> target) {
		nodes.stream().map(child -> new Child(parent, child)).forEach(target::add);
	}
}
