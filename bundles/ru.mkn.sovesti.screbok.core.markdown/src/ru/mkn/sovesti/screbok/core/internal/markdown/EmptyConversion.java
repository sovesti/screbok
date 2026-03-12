package ru.mkn.sovesti.screbok.core.internal.markdown;

import java.util.List;

import org.commonmark.node.Node;

public record EmptyConversion() implements MarkdownNodeConversion {

	@Override
	public void convert(Node parent) {
	}

	@Override
	public List<Child> children() {
		return List.of();
	}

}