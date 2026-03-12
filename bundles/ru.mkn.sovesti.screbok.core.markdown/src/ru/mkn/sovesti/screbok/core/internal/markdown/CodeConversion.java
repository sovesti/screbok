package ru.mkn.sovesti.screbok.core.internal.markdown;

import java.util.List;
import java.util.stream.Stream;

import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.Node;

import ru.mkn.sovesti.screbok.core.markdown.Markdown;
import ru.mkn.sovesti.screbok.mlm.model.AllText;
import ru.mkn.sovesti.screbok.mlm.model.WrappedNodes;
import ru.mkn.sovesti.screbok.mlm.model.api.CodeListing;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;

public record CodeConversion(CodeListing node) implements MarkdownNodeConversion {

	@Override
	public void convert(Node parent) {
		FencedCodeBlock code = new FencedCodeBlock();
		code.setLiteral(cleaned(new Markdown(contents()).render()));
		parent.appendChild(code);
	}

	private MarkupNode contents() {
		return new WrappedNodes().apply(new AllText().apply(node.getContent()));
	}

	private String cleaned(String rendered) {
		rendered = new CleanedText().apply(rendered);
		for (String special : specialCharacters()) {
			if (rendered.startsWith("\\" + special)) {
				rendered = rendered.replaceFirst("\\" + special, special);
			}
		}
		return rendered;
	}

	@Override
	public List<Child> children() {
		return List.of();
	}

	private List<String> specialCharacters() {
		return Stream.of('-', '#', '=', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9') //
				.map(Object::toString) //
				.toList();
	}

}