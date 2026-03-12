package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.RawText;

final class RawTextMatchedNode implements MatchedNode {

	private final UnmatchedSequence sequence;
	private final MatchingContext context;

	RawTextMatchedNode(UnmatchedSequence raw, MatchingContext context) {
		this.sequence = Objects.requireNonNull(raw);
		this.context = Objects.requireNonNull(context);
	}

	@Override
	public boolean matches() {
		return sequence.first() instanceof RawText;
	}

	@Override
	public Optional<RuleMatchResult> matched() {
		return Optional.of(sequence) //
				.map(UnmatchedSequence::first) //
				.filter(RawText.class::isInstance) //
				.map(this::result);
	}

	private RuleMatchResult result(MarkupNode text) {
		context.observeUnmatched(List.of(sequence.suffix(1)));
		return new RuleMatchResult(List.of(text), 1, context);
	}

	@Override
	public int priority() {
		return -1;
	}

}
