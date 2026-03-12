package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.Objects;
import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;

import ru.mkn.sovesti.screbok.dsm.model.api.Rule;
import ru.mkn.sovesti.screbok.dsm.model.meta.DsmFactory;
import ru.mkn.sovesti.screbok.mlm.model.api.Wildcard;
import ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode;
import ru.mkn.sovesti.screbok.mlm.model.meta.MlmFactory;

final class UnwrappingRule implements Function<UnmatchedSequence, MatchedNode> {

	private final EObject parent;
	private final MatchingContext context;

	UnwrappingRule(EObject parent, MatchingContext context) {
		this.parent = Objects.requireNonNull(parent);
		this.context = Objects.requireNonNull(context);
	}

	@Override
	public MatchedNode apply(UnmatchedSequence sequence) {
		return new RuleMatchedNode(sequence, parent, rule(), context);
	}

	private Rule rule() {
		Rule rule = DsmFactory.eINSTANCE.createRule();
		WrappingNode wrapping = MlmFactory.eINSTANCE.createWrappingNode();
		wrapping.getChildren().add(wildcard());
		rule.getPattern().add(wrapping);
		rule.getResult().add(wildcard());
		rule.setPriority(-1);
		return rule;
	}

	private Wildcard wildcard() {
		Wildcard wildcard = MlmFactory.eINSTANCE.createWildcard();
		wildcard.getRepeated().add(MlmFactory.eINSTANCE.createPlaceholder());
		return wildcard;
	}

}
