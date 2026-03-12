package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import ru.mkn.sovesti.screbok.mlm.model.api.Placeholder;
import ru.mkn.sovesti.screbok.mlm.model.api.Wildcard;

final class ReplacingCopierState {

	private final MatchingContext context;
	private final Map<Placeholder, Integer> replacement;
	private final List<WildcardCounter> wildcards;

	ReplacingCopierState(MatchingContext context) {
		this.context = Objects.requireNonNull(context);
		replacement = new HashMap<>();
		wildcards = new ArrayList<>();
	}

	int nextReplacement(Placeholder placeholder) {
		return replacement.merge(placeholder, 1, Integer::sum) - 1;
	}

	void pushWildcard(Wildcard wildcard) {
		wildcards.add(new WildcardCounter(context.wildcardRepetitions(wildcard)));
	}

	void popWildcard() {
		wildcards.removeLast();
	}

	boolean finishedWildcard() {
		return wildcards.getLast().finished();
	}

	void incrementWildcard() {
		wildcards.set(wildcards.size() - 1, wildcards.getLast().increment());
	}

	boolean inWildcard() {
		return !wildcards.isEmpty();
	}

	MatchingContext context() {
		return context;
	}

	private record WildcardCounter(int until, int current) {

		WildcardCounter(int until) {
			this(until, 0);
		}

		WildcardCounter increment() {
			return new WildcardCounter(until, current + 1);
		}

		boolean finished() {
			return current >= until;
		}
	}
}
