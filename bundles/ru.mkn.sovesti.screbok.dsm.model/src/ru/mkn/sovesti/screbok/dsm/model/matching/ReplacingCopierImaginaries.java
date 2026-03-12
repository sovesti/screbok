package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;

import ru.mkn.sovesti.screbok.mlm.model.FreshImaginary;
import ru.mkn.sovesti.screbok.mlm.model.api.ImaginaryNode;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;

final class ReplacingCopierImaginaries {

	private final List<UnmatchedSequence> sink;
	private final Map<EObject, UnmatchedSequence> tails;

	ReplacingCopierImaginaries() {
		this.sink = new ArrayList<>();
		this.tails = new HashMap<>();
	}

	void cut(EObject object) {
		Optional.ofNullable(tails.remove(object)).ifPresent(sink::add);
	}

	List<ImaginaryNode> create(EObject parent, List<MarkupNode> targets) {
		return targets.stream().map(t -> create(parent, t)).toList();
	}

	ImaginaryNode create(EObject parent, MarkupNode target) {
		ImaginaryNode imaginary = new FreshImaginary(target).create();
		observe(parent, new UnmatchedPair(imaginary.getOrigin(), imaginary));
		return imaginary;
	}

	void observe(EObject parent, UnmatchedPair imaginary) {
		tails.computeIfAbsent(parent, o -> new UnmatchedSequence()).add(imaginary);
	}

	List<UnmatchedSequence> all() {
		return Stream.concat(sink.stream(), tails.values().stream()).toList();
	}
}
