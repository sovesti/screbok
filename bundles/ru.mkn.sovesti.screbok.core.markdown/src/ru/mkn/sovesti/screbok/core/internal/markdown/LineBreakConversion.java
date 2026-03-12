package ru.mkn.sovesti.screbok.core.internal.markdown;

import java.util.List;

import org.commonmark.node.Node;
import org.commonmark.node.SoftLineBreak;

public record LineBreakConversion() implements MarkdownNodeConversion {

	@Override
	public void convert(Node parent) {
		parent.appendChild(new SoftLineBreak());
	}

	@Override
	public List<Child> children() {
		return List.of();
	}

}