package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;

import ru.mkn.sovesti.screbok.common.lang.Cached;
import ru.mkn.sovesti.screbok.dsm.model.api.Rule;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;

public final class RuleMatchedNode implements MatchedNode {

	private final Rule rule;
	private final EObject parent;
	private final MatchingContext context;
	private final Cached<Optional<RuleMatchResult>> result;

	public RuleMatchedNode(MarkupNode origin, //
			Rule rule, MatchingContext context) {
		this(new UnmatchedSequence(List.of(new UnmatchedPair(origin))), //
				origin.eContainer(), rule, context);
	}

	public RuleMatchedNode(UnmatchedSequence raw, EObject parent, //
			Rule rule, MatchingContext context) {
		this.rule = Objects.requireNonNull(rule);
		this.parent = Objects.requireNonNull(parent);
		this.context = Objects.requireNonNull(context);
		result = new Cached<>(() -> match(raw));
	}

	public boolean matches() {
		return matched().isPresent();
	}

	public Optional<RuleMatchResult> matched() {
		return result.get();
	}

	public int priority() {
		return rule.getPriority();
	}

	private Optional<RuleMatchResult> match(UnmatchedSequence sequence) {
		return new NodesChildren(context, rule.getPattern(), sequence.raw()).match() //
				.map(matched -> new RuleMatchResult(copy(matched, sequence), matched, context));
	}

	private List<MarkupNode> copy(int matched, UnmatchedSequence sequence) {
		return new ReplacingCopier(context, sequence.first(), parent) //
				.copyAll(rule.getResult(), sequence.suffix(matched)).stream().toList();
	}

}
