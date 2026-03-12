package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

import ru.mkn.sovesti.screbok.common.emf.EObjectContents;
import ru.mkn.sovesti.screbok.mlm.model.api.Anchor;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.Reference;

final class TreeLinkage implements Consumer<MarkupNode> {

	private final TreeContext context;

	TreeLinkage(TreeContext context) {
		this.context = Objects.requireNonNull(context);
	}

	@Override
	public void accept(MarkupNode node) {
		new EObjectContents(node).ofType(Reference.class).forEach(this::accept);
	}

	private void accept(Reference reference) {
		find(reference.getLink()) //
				.or(() -> find(reference.getLink().substring(1))) //
				.ifPresent(reference::setReferenced);
	}

	private Optional<Anchor> find(String link) {
		return context.findAnchor(link);
	}

}
