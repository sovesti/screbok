package ru.mkn.sovesti.screbok.dsm.model.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;

import ru.mkn.sovesti.screbok.dsm.model.matching.RuleMatchResult;
import ru.mkn.sovesti.screbok.dsm.model.matching.RuleMatchedNode;
import ru.mkn.sovesti.screbok.mlm.model.api.ImaginaryNode;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.Section;
import ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode;

public final class RuleMatchingTest {

	@Test
	public void ignoringRuleMatches() {
		assertTrue(data().matchedRule(data().placeholder(), data().ignoringRule()).matched() //
				.stream() //
				.map(RuleMatchResult::nodes) //
				.flatMap(List::stream) //
				.map(WrappingNode.class::cast) //
				.map(WrappingNode::getChildren) //
				.flatMap(List::stream) //
				.findAny() //
				.isEmpty());
	}

	@Test
	public void unwrappingRuleMatches() {
		assertEquals(List.of("name"), data() //
				.matchedRule(data().placeholder(), data().unwrappingRule()).matched() //
				.map(RuleMatchResult::nodes).stream() //
				.flatMap(List::stream) //
				.map(ImaginaryNode.class::cast) //
				.map(ImaginaryNode::getOrigin) //
				.map(MarkupNode::getName) //
				.toList());
	}

	@Test
	public void sectionTitleMatches() {
		assertEquals("name1", ((ImaginaryNode) section().getTitle()).getOrigin().getName());
	}

	@Test
	public void sectionBodyMatches() {
		assertEquals("name2", ((ImaginaryNode) section().getChildren().get(0)).getOrigin().getName());
	}

	@Test
	public void sectionBodyUnmatchedAncestors() {
		assertEquals(Set.of("name1", "name2"), sectionUnmatchedAncestors().stream() //
				.map(MarkupNode::getName) //
				.collect(Collectors.toSet()));
	}

	private Collection<MarkupNode> sectionUnmatchedAncestors() {
		return sectionRule().matched().get().context().unmatchedAncestors();
	}

	private Section section() {
		return sectionRule().matched().get().nodes().stream().map(Section.class::cast).toList().getFirst();
	}

	private RuleMatchedNode sectionRule() {
		RuleMatchedNode rule = data().matchedRule(data().complexPattern(), data().titledSectionRule());
		assertTrue(rule.matches());
		return rule;
	}

	private MatchingTestData data() {
		return new MatchingTestData();
	}
}
