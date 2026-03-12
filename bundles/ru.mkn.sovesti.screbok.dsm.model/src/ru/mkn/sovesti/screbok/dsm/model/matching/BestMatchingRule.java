package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;

import ru.mkn.sovesti.screbok.dsm.model.api.Rule;

final class BestMatchingRule {

	private final Collection<Rule> rules;
	private final TreeContext context;

	BestMatchingRule(Collection<Rule> rules, TreeContext context) {
		this.rules = Objects.requireNonNull(rules);
		this.context = Objects.requireNonNull(context);
	}

	Optional<MatchedNode> find(UnmatchedSequence sequence) {
		return rules(sequence.targetContainer(), sequence) //
				.sorted() //
				.filter(MatchedNode::matches) //
				.findFirst();
	}

	private Stream<MatchedNode> rules(EObject parent, UnmatchedSequence sequence) {
		return Stream.concat(fromRules(parent, sequence), common(parent, sequence));
	}

	private Stream<RuleMatchedNode> fromRules(EObject parent, UnmatchedSequence sequence) {
		return rules.stream().map(rule -> new RuleMatchedNode(sequence, parent, rule, context()));
	}

	private Stream<MatchedNode> common(EObject parent, UnmatchedSequence sequence) {
		return Stream.of(new RawTextMatchedNode(sequence, context()), //
				new UnwrappingRule(parent, context()).apply(sequence));
	}

	private MatchingContext context() {
		return new MatchingContext(context);
	}

}
