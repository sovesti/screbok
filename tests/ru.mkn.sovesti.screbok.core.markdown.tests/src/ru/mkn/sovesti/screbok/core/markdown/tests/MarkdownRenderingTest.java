package ru.mkn.sovesti.screbok.core.markdown.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ru.mkn.sovesti.screbok.core.markdown.Markdown;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;

public final class MarkdownRenderingTest {

	@Test
	public void rendersSections() {
		assertEquals("""
				# Big heading

				## Small heading

				some text
								""", render(data().sectionTree()));
	}

	@Test
	public void rendersLink() {
		assertEquals("""
				[Apache OpenNLP](https://opennlp.apache.org/docs/2.5.7/manual/opennlp.html)
								""", render(data().link()));
	}

	@Test
	public void rendersCode() {
		assertEquals("""
				```
				 Hello world
				```
								""", render(data().code()));
	}

	@Test
	public void rendersLists() {
		assertEquals("""
				- Do
				- Done
								""", render(data().list()));
	}

	@Test
	public void rendersEmphasized() {
		assertEquals("""
				**bold** *italic*
								""", render(data().emphasized()));
	}

	private MarkdownTestData data() {
		return new MarkdownTestData();
	}

	private String render(MarkupNode node) {
		return new Markdown(node).render();
	}
}
