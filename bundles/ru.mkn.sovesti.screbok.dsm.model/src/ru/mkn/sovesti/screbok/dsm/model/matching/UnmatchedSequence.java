package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import ru.mkn.sovesti.screbok.mlm.model.api.ImaginaryNode;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;

record UnmatchedSequence(List<UnmatchedPair> children) {

	UnmatchedSequence() {
		this(new ArrayList<>());
	}

	boolean empty() {
		return children.isEmpty();
	}

	void add(ImaginaryNode imaginary) {
		add(new UnmatchedPair(imaginary.getOrigin(), imaginary));
	}

	void add(UnmatchedPair pair) {
		children.add(pair);
	}

	List<MarkupNode> raw() {
		return children.stream().map(UnmatchedPair::origin).toList();
	}

	MarkupNode first() {
		return children.stream().map(UnmatchedPair::origin).findFirst().get();
	}

	EObject targetContainer() {
		return children.getFirst().imaginary().eContainer();
	}

	List<EObject> prefix(int until) {
		return children.subList(0, until).stream() //
				.map(UnmatchedPair::imaginary) //
				.map(EObject.class::cast) //
				.toList();
	}

	UnmatchedSequence suffix(int from) {
		return new UnmatchedSequence(new ArrayList<>(children.subList(from, children.size())));
	}
}
