package ru.mkn.sovesti.screbok.dsm.model.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

import ru.mkn.sovesti.screbok.dsm.model.matching.MatchedTree;
import ru.mkn.sovesti.screbok.dsm.model.matching.TreeMatchResult;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupList;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.RawText;

public final class TreeMatchingTest {

	@Test
	public void treeMatched() {
		assertTrue(matchHtml().unmatched().isEmpty());
	}

	@Test
	public void treeContainsText() {
		assertEquals( //
				List.of("Apache OpenNLP Developer Documentation", //
						"Description", //
						"The Apache OpenNLP library is a machine learning based toolkit"), //
				nodes(matchHtml().tree()) //
						.filter(RawText.class::isInstance) //
						.map(RawText.class::cast) //
						.map(RawText::getText) //
						.toList());
	}

	@Test
	public void tocMatched() {
		assertTrue(matchToc().unmatched().isEmpty());
	}

	@Test
	public void treeContainsLists() {
		assertEquals(6, //
				nodes(matchToc().tree()) //
						.filter(MarkupList.class::isInstance) //
						.map(MarkupList.class::cast) //
						.count());
	}

	private Stream<MarkupNode> nodes(MarkupNode node) {
		List<EObject> list = new ArrayList<>();
		node.eAllContents().forEachRemaining(list::add);
		return list.stream().filter(MarkupNode.class::isInstance).map(MarkupNode.class::cast);
	}

	private TreeMatchResult matchToc() {
		ResourceSet rs = new ResourceSetImpl();
		return new MatchedTree(data().tocRules(rs)).from(data().tocTree(rs).getRoot());
	}

	private TreeMatchResult matchHtml() {
		return new MatchedTree(data().htmlRules()).from(data().htmlTree());
	}

	private MatchingTestData data() {
		return new MatchingTestData();
	}
}
