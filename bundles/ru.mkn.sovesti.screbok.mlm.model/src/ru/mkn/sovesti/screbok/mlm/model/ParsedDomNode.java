package ru.mkn.sovesti.screbok.mlm.model;

import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import org.w3c.dom.Node;
import org.w3c.dom.Text;

import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.NodeAttribute;
import ru.mkn.sovesti.screbok.mlm.model.api.RawText;
import ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode;
import ru.mkn.sovesti.screbok.mlm.model.meta.MlmFactory;

public final class ParsedDomNode implements Supplier<MarkupNode> {

	private final Node node;

	public ParsedDomNode(Node node) {
		this.node = Objects.requireNonNull(node);
	}

	@Override
	public MarkupNode get() {
		if (node instanceof Text) {
			return text();
		} else {
			return wrapping();
		}
	}

	private RawText text() {
		RawText parsed = MlmFactory.eINSTANCE.createRawText();
		parsed.setText(node.getNodeValue());
		return parsed;
	}

	private MarkupNode wrapping() {
		WrappingNode fresh = MlmFactory.eINSTANCE.createWrappingNode();
		fresh.setName(node.getNodeName());
		attributes(fresh);
		children(fresh);
		return fresh;
	}

	private void attributes(WrappingNode fresh) {
		IntStream.range(0, node.getAttributes().getLength()) //
				.mapToObj(node.getAttributes()::item) //
				.map(this::attribute) //
				.forEach(fresh.getAttributes()::add);
	}

	private void children(WrappingNode fresh) {
		IntStream.range(0, node.getChildNodes().getLength()) //
				.mapToObj(node.getChildNodes()::item) //
				.map(ParsedDomNode::new) //
				.map(Supplier::get) //
				.forEach(fresh.getChildren()::add);
	}

	private NodeAttribute attribute(Node node) {
		NodeAttribute fresh = MlmFactory.eINSTANCE.createNodeAttribute();
		fresh.setName(node.getNodeName());
		fresh.setValue(node.getNodeValue());
		return fresh;
	}

}
