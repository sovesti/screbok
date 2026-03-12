package ru.mkn.sovesti.screbok.core.markdown;

import java.util.Objects;

import org.commonmark.renderer.markdown.MarkdownRenderer;

import ru.mkn.sovesti.screbok.core.internal.markdown.MarkdownTree;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;

public final class Markdown {

	private final MarkupNode root;

	public Markdown(MarkupNode root) {
		this.root = Objects.requireNonNull(root);
	}

	public String render() {
		return MarkdownRenderer.builder().build().render(new MarkdownTree().build(root));
	}
}
