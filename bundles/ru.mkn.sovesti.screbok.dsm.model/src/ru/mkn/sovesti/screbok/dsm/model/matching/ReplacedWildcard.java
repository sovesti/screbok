package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;

import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.Wildcard;

final class ReplacedWildcard {

	private final ReplacingCopierState state;
	private final Function<EObject, EObject> copy;

	ReplacedWildcard(ReplacingCopierState state, Function<EObject, EObject> copy) {
		this.state = Objects.requireNonNull(state);
		this.copy = Objects.requireNonNull(copy);
	}

	List<MarkupNode> expand(Wildcard repeat) {
		List<MarkupNode> repeats = new ArrayList<>();
		state.pushWildcard(repeat);
		expand(repeat.getRepeated(), repeats);
		state.popWildcard();
		return repeats;
	}

	private void expand(List<MarkupNode> sequence, List<MarkupNode> repeats) {
		while (!state.finishedWildcard()) {
			sequence.stream() //
					.map(copy) //
					.filter(MarkupNode.class::isInstance) //
					.map(MarkupNode.class::cast) //
					.forEach(repeats::add);
			state.incrementWildcard();
		}
	}
}
