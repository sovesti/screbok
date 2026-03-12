package ru.mkn.sovesti.screbok.core.internal.markdown;

import java.util.List;

import org.commonmark.node.Node;

import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;

interface MarkdownNodeConversion {

	void convert(Node parent);

	List<Child> children();

	record Child(Node parent, MarkupNode node) {
	}
}
