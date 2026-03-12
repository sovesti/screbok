package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import ru.mkn.sovesti.screbok.common.lang.NonEmpty;
import ru.mkn.sovesti.screbok.mlm.model.api.Anchor;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.Placeholder;
import ru.mkn.sovesti.screbok.mlm.model.api.Wildcard;

public final class MatchingContext {

	private final Map<Optional<String>, List<MarkupNode>> placeholders;
	private final Map<Optional<String>, Integer> wildcards;
	private final Map<String, Anchor> anchors;
	private final List<UnmatchedSequence> imaginaries;

	public MatchingContext(TreeContext context) {
		this(context.anchors(), context.imaginaries());
	}

	public MatchingContext(Map<String, Anchor> anchors, //
			List<UnmatchedSequence> imaginaries) {
		this.placeholders = new HashMap<>();
		this.wildcards = new HashMap<>();
		this.anchors = Objects.requireNonNull(anchors);
		this.imaginaries = Objects.requireNonNull(imaginaries);
	}

	public Collection<MarkupNode> unmatchedAncestors() {
		return placeholders.values().stream().flatMap(List::stream).toList();
	}

	void putPlaceholder(Placeholder placeholder, MarkupNode target) {
		placeholders.computeIfAbsent(key(placeholder), key -> new ArrayList<>()).add(target);
	}

	void hitWildcard(Wildcard wildcard) {
		wildcards.merge(key(wildcard), 1, Integer::sum);
	}

	public UnmatchedSequence lastUnmatched() {
		return imaginaries.getLast();
	}

	UnmatchedSequence pushUnmatchedSequence() {
		imaginaries.add(new UnmatchedSequence());
		return lastUnmatched();
	}

	UnmatchedSequence popUnmatchedSequence() {
		UnmatchedSequence last = imaginaries.removeLast();
		while (last.empty()) {
			last = imaginaries.removeLast();
		}
		return last;
	}

	void observeUnmatched(List<UnmatchedSequence> sequences) {
		imaginaries.addAll(sequences);
	}

	Optional<List<MarkupNode>> placeholderMatches(Placeholder placeholder) {
		return Optional.ofNullable(placeholders.get(key(placeholder)));
	}

	int wildcardRepetitions(Wildcard wildcard) {
		return Optional.ofNullable(wildcards.get(key(wildcard))).orElse(0);
	}

	void putAnchor(Anchor anchor) {
		anchors.put(anchor.getName(), anchor);
	}

	private Optional<String> key(Placeholder placeholder) {
		return Optional.ofNullable(placeholder.getKey()).filter(new NonEmpty());
	}

	private Optional<String> key(Wildcard wildcard) {
		return Optional.ofNullable(wildcard.getKey()).filter(new NonEmpty());
	}
}
