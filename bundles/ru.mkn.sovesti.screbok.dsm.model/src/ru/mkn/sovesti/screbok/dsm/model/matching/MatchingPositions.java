package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.Wildcard;

final class MatchingPositions {

	private final Iterated patterns;
	private final Iterated targets;
	private final List<WildcardMatch> matched;
	private final List<Wildcard> stack;
	private final List<Integer> positions;

	MatchingPositions(List<MarkupNode> patterns, List<MarkupNode> targets) {
		this.patterns = new Iterated(patterns);
		this.targets = new Iterated(targets);
		matched = new ArrayList<>();
		stack = new ArrayList<>();
		positions = new ArrayList<>();
	}

	void matched() {
		targets.next();
		step();
	}

	boolean didntMatch() {
		if (stack.isEmpty()) {
			patterns.finish();
			return false;
		}
		stack.removeLast();
		targets.back(positions.removeLast());
		while (!matched.isEmpty() && matched.getLast().to() > targets.position()) {
			matched.removeLast();
		}
		step();
		return true;
	}

	Stream<Wildcard> matchedWildcards() {
		return matched.stream().map(WildcardMatch::wildcard);
	}

	private void step() {
		if (stack.isEmpty()) {
			patterns.next();
			return;
		}
		setPosition(position() + 1);
		fall();
		if (!stack.isEmpty() && position() == stack.getLast().getRepeated().size()) {
			setPosition(0);
			matched.add(new WildcardMatch(stack.getLast(), targets.position()));
		}
	}

	Optional<MarkupNode> pattern() {
		fall();
		return currentPattern();
	}

	private void fall() {
		while (currentPattern().filter(Wildcard.class::isInstance).isPresent()) {
			stack.add((Wildcard) currentPattern().get());
			positions.add(0);
		}
	}

	Optional<MarkupNode> target() {
		return targets.current();
	}

	Optional<Integer> matchedTo() {
		return Optional.of(targets.position()).filter(to -> to > 0);
	}

	private Optional<MarkupNode> currentPattern() {
		if (stack.isEmpty()) {
			return patterns.current();
		}
		return Optional.of(stack.getLast().get(position()));
	}

	private int position() {
		return positions.getLast();
	}

	private void setPosition(int value) {
		positions.set(positions.size() - 1, value);
	}

	private final class Iterated {
		private final List<MarkupNode> nodes;
		private int position;

		private Iterated(List<MarkupNode> nodes) {
			this.nodes = Objects.requireNonNull(nodes);
			position = 0;
		}

		private void next() {
			position++;
		}

		private void back(int length) {
			position -= length;
		}

		private void finish() {
			position = nodes.size();
		}

		private int position() {
			return position;
		}

		private Optional<MarkupNode> current() {
			return Optional.of(position).filter(i -> i < nodes.size()).map(nodes::get);
		}
	}

	private record WildcardMatch(Wildcard wildcard, int to) {
	}
}