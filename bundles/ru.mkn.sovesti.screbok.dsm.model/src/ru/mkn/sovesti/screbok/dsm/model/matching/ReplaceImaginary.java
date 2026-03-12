package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import ru.mkn.sovesti.screbok.mlm.model.WrappedNodes;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;

final class ReplaceImaginary {

	private final List<EObject> imaginary;

	ReplaceImaginary(EObject imaginary) {
		this(List.of(imaginary));
	}

	ReplaceImaginary(List<EObject> imaginary) {
		this.imaginary = Objects.requireNonNull(imaginary);
	}

	void with(MarkupNode node) {
		with(List.of(node));
	}

	void with(List<MarkupNode> nodes) {
		Optional.ofNullable(first().eContainer()).ifPresent( //
				container -> with(container, first().eContainingFeature(), nodes));
	}

	@SuppressWarnings("unchecked")
	void with(EObject container, EStructuralFeature reference, List<MarkupNode> nodes) {
		if (reference.isMany()) {
			List<EObject> list = (List<EObject>) container.eGet(reference);
			list.addAll(list.indexOf(first()), nodes);
			list.removeAll(imaginary);
		} else {
			container.eSet(reference, new WrappedNodes().lazy(nodes));
		}
	}

	private EObject first() {
		return imaginary.getFirst();
	}
}
