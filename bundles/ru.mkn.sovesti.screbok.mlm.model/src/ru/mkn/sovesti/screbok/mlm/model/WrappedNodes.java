package ru.mkn.sovesti.screbok.mlm.model;

import java.util.List;
import java.util.function.Function;

import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode;
import ru.mkn.sovesti.screbok.mlm.model.meta.MlmFactory;

public final class WrappedNodes implements Function<List<? extends MarkupNode>, MarkupNode> {

	@Override
	public MarkupNode apply(List<? extends MarkupNode> nodes) {
		WrappingNode node = MlmFactory.eINSTANCE.createWrappingNode();
		node.getChildren().addAll(nodes);
		node.setTransient(true);
		return node;
	}

	public MarkupNode lazy(List<? extends MarkupNode> nodes) {
		if (nodes.size() == 1) {
			return nodes.get(0);
		}
		return apply(nodes);
	}

}
