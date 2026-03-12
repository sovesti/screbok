package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.Optional;

interface MatchedNode extends Comparable<MatchedNode> {

	boolean matches();

	Optional<RuleMatchResult> matched();

	int priority();

	default @Override int compareTo(MatchedNode other) {
		return other.priority() - priority();
	}
}
