package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

import ru.mkn.sovesti.screbok.dsm.model.api.Rule;
import ru.mkn.sovesti.screbok.mlm.model.FreshImaginary;
import ru.mkn.sovesti.screbok.mlm.model.api.ImaginaryNode;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode;
import ru.mkn.sovesti.screbok.mlm.model.meta.MlmFactory;

public final class MatchedTree {

	private final TreeContext context;
	private final BestMatchingRule best;
	private final List<UnmatchedPair> unmatched;

	public MatchedTree(Collection<Rule> rules) {
		context = new TreeContext();
		best = new BestMatchingRule(rules, context);
		unmatched = new ArrayList<>();
	}

	public TreeMatchResult from(MarkupNode from) {
		WrappingNode node = MlmFactory.eINSTANCE.createWrappingNode();
		match(from, node);
		new TreeLinkage(context).accept(node);
		return new TreeMatchResult(node, unmatched.stream().map(UnmatchedPair::origin).toList());
	}

	private void match(MarkupNode from, WrappingNode node) {
		imaginaryRoot(from, node);
		while (!context.imaginaries().stream().allMatch(UnmatchedSequence::empty)) {
			matchLast();
		}
		unmatched.forEach(unmatch -> new ReplaceImaginary(unmatch.imaginary()) //
				.with(EcoreUtil.copy(unmatch.origin())));
	}

	private ImaginaryNode imaginaryRoot(MarkupNode from, WrappingNode node) {
		ImaginaryNode imaginary = new FreshImaginary(from).create();
		matchingContext().pushUnmatchedSequence().add(imaginary);
		node.getChildren().add(imaginary);
		return imaginary;
	}

	private void matchLast() {
		UnmatchedSequence next = matchingContext().popUnmatchedSequence();
		best.find(next).ifPresentOrElse( //
				success -> matched(success, next), () -> unmatched(next));
	}

	private MatchingContext matchingContext() {
		return new MatchingContext(context);
	}

	private boolean unmatched(UnmatchedSequence next) {
		return unmatched.addAll(next.children());
	}

	private void matched(MatchedNode success, UnmatchedSequence next) {
		replaceAll(next, success.matched().get());
	}

	private void replaceAll(UnmatchedSequence next, RuleMatchResult match) {
		new ReplaceImaginary(next.prefix(match.matched())).with(match.nodes());
	}

}
