package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import ru.mkn.sovesti.screbok.common.lang.NonEmpty;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.NodeAttribute;
import ru.mkn.sovesti.screbok.mlm.model.api.Placeholder;
import ru.mkn.sovesti.screbok.mlm.model.api.Wildcard;
import ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode;

public final class NodesMatch {

	private final MatchingContext context;

	public NodesMatch() {
		this(new MatchingContext(new HashMap<>(), new ArrayList<>()));
	}

	public NodesMatch(MatchingContext context) {
		this.context = Objects.requireNonNull(context);
	}

	boolean test(MarkupNode pattern, MarkupNode target) {
		if (nameDoesntMatch(pattern, target) || attributesDontMatch(pattern, target)) {
			return false;
		}
		if (pattern instanceof Placeholder placeholder) {
			context.putPlaceholder(placeholder, target);
			return true;
		}
		if (!(target instanceof WrappingNode wrapping)) {
			return false;
		}
		if (pattern instanceof Wildcard wildcard) {
			return testMany(List.of(wildcard), wrapping.getChildren()).isPresent();
		}
		if (pattern instanceof WrappingNode complex) {
			return childrenMatch(complex.getChildren(), wrapping.getChildren());
		}
		return false;
	}

	public Optional<Integer> testMany(List<MarkupNode> pattern, List<MarkupNode> targets) {
		if (pattern.isEmpty()) {
			return Optional.of(0);
		}
		Optional<Integer> to = new NodesChildren(context, pattern, targets).match();
		if (to.isEmpty()) {
			return Optional.empty();
		}
		return Optional.of(repeatChildrenMatch(pattern, targets, to));
	}

	private int repeatChildrenMatch(List<MarkupNode> pattern, List<MarkupNode> children, Optional<Integer> to) {
		int total = 0;
		while (to.isPresent()) {
			total += to.get();
			to = new NodesChildren(context, pattern, children.subList(total, children.size())).match();
		}
		return total;
	}

	private boolean childrenMatch(List<MarkupNode> patterns, List<MarkupNode> targets) {
		if (patterns.isEmpty()) {
			return true;
		}
		return new NodesChildren(context, patterns, targets).match().isPresent();
	}

	private boolean attributesDontMatch(MarkupNode pattern, MarkupNode target) {
		return pattern.getAttributes().stream().anyMatch(attr -> attributeDoesntMatch(attr, target));
	}

	private boolean nameDoesntMatch(MarkupNode pattern, MarkupNode target) {
		return new NonEmpty().test(pattern.getName()) //
				&& !pattern.getName().equals(target.getName());
	}

	private boolean attributeDoesntMatch(NodeAttribute expected, MarkupNode target) {
		return target.getAttributes().stream() //
				.filter(attr -> Objects.equals(expected.getName(), attr.getName())) //
				.filter(found -> attributeMatch(expected, found)) //
				.findFirst() //
				.isEmpty();
	}

	private boolean attributeMatch(NodeAttribute expected, NodeAttribute found) {
		return !new NonEmpty().test(expected.getValue()) //
				|| Objects.equals(found.getValue(), expected.getValue());
	}
}
