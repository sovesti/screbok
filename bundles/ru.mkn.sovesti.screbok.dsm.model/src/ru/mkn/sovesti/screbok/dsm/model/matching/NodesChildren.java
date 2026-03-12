package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;

final class NodesChildren {

	private final MatchingContext context;
	private final MatchingPositions positions;

	NodesChildren(MatchingContext context, List<MarkupNode> patterns, List<MarkupNode> targets) {
		this.context = Objects.requireNonNull(context);
		positions = new MatchingPositions(patterns, targets);
	}

	Optional<Integer> match() {
		while (positions.pattern().isPresent() && positions.target().isPresent()) {
			if (!step()) {
				return withWildcards();
			}
		}
		return withWildcards();
	}

	private Optional<Integer> withWildcards() {
		positions.matchedWildcards().forEach(context::hitWildcard);
		return positions.matchedTo();
	}

	private boolean step() {
		if (new NodesMatch(context).test(positions.pattern().get(), positions.target().get())) {
			positions.matched();
			return true;
		}
		return positions.didntMatch();
	}
}
