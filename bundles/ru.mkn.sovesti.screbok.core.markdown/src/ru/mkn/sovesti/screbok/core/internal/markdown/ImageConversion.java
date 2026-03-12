package ru.mkn.sovesti.screbok.core.internal.markdown;

import java.util.ArrayList;
import java.util.List;

import org.commonmark.node.Node;

import ru.mkn.sovesti.screbok.mlm.model.api.Image;

public record ImageConversion(Image node, List<Child> children) implements MarkdownNodeConversion {

	public ImageConversion(Image node) {
		this(node, new ArrayList<>());
	}

	@Override
	public void convert(Node parent) {
		org.commonmark.node.Image image = new org.commonmark.node.Image();
		image.setDestination(node.getLink());
		parent.appendChild(image);
	}

}