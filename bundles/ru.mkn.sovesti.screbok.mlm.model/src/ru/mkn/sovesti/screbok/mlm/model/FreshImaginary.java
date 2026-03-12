package ru.mkn.sovesti.screbok.mlm.model;

import java.util.Objects;

import ru.mkn.sovesti.screbok.mlm.model.api.ImaginaryNode;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.meta.MlmFactory;

public final class FreshImaginary {

	private final MarkupNode origin;

	public FreshImaginary(MarkupNode origin) {
		this.origin = Objects.requireNonNull(origin);
	}

	public ImaginaryNode create() {
		ImaginaryNode node = MlmFactory.eINSTANCE.createImaginaryNode();
		node.setOrigin(origin);
		node.setName(origin.getName());
		node.setUri(origin.getUri());
		return node;
	}
}
