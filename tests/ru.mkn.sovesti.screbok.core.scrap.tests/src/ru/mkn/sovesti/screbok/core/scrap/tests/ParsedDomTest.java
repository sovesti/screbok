package ru.mkn.sovesti.screbok.core.scrap.tests;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.w3c.dom.Document;

import ru.mkn.sovesti.screbok.core.scrap.FetchDom;
import ru.mkn.sovesti.screbok.mlm.model.ParsedDomNode;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.RawText;

public final class ParsedDomTest {

	@Test
	public void treeContainsText() {
		assertTrue(nodes(tree()) //
				.filter(RawText.class::isInstance) //
				.map(RawText.class::cast) //
				.map(RawText::getText) //
				.filter(text -> text.contains("The Morfologik addon provides a command line tool")) //
				.findAny() //
				.isPresent());
	}

	private Stream<MarkupNode> nodes(MarkupNode node) {
		List<EObject> list = new ArrayList<>();
		node.eAllContents().forEachRemaining(list::add);
		return list.stream().filter(MarkupNode.class::isInstance).map(MarkupNode.class::cast);
	}

	private MarkupNode tree() {
		return new ParsedDomNode(openNlp().getDocumentElement()).get();
	}

	private Document openNlp() {
		return new FetchDom("https://opennlp.apache.org/docs/2.5.7/manual/opennlp.html").get().unwrap();
	}
}
