package ru.mkn.sovesti.screbok.dsm.model.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import ru.mkn.sovesti.screbok.dsm.model.matching.NodesMatch;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;

public final class SingleNodeMatchingTest {

	@Test
	public void emptyNodesMatch() {
		assertTrue(matchesReal(data().emptyPattern()));
	}

	@Test
	public void namedNodesMatch() {
		assertTrue(matchesReal(data().namedPattern()));
	}

	@Test
	public void differentlyNamedNodesDontMatch() {
		assertFalse(matchesReal(data().wronglyNamedPattern()));
	}

	@Test
	public void attributedNodesMatch() {
		assertTrue(matchesReal(data().attributedPattern()));
	}

	@Test
	public void differentlyAttributedNodesDontMatch() {
		assertFalse(matchesReal(data().wronglyAttributedPattern()));
	}

	@Test
	public void irrelevantlyAttributedNodesDontMatch() {
		assertFalse(matchesReal(data().unknownAttributePattern()));
	}

	@Test
	public void placeholderPatternMatches() {
		assertTrue(matchesReal(data().placeholder()));
	}

	@Test
	public void complexPatternMatches() {
		assertTrue(matchesReal(data().complexPattern()));
	}

	private boolean matchesReal(MarkupNode pattern) {
		return new NodesMatch().testMany(List.of(pattern), List.of(data().realNode())).isPresent();
	}

	private MatchingTestData data() {
		return new MatchingTestData();
	}
}
