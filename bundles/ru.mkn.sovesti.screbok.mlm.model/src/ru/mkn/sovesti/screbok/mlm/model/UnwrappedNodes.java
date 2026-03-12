package ru.mkn.sovesti.screbok.mlm.model;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode;

public final class UnwrappedNodes implements Function<List<MarkupNode>, List<MarkupNode>> {

	@Override
	public List<MarkupNode> apply(List<MarkupNode> nodes) {
		return nodes.stream().flatMap(this::stream).toList();
	}

	public Stream<MarkupNode> stream(MarkupNode node) {
		if (node instanceof WrappingNode wrapping && wrapping.isTransient()) {
			return wrapping.getChildren().stream().flatMap(this::stream);
		}
		return Stream.of(node);
	}

}
