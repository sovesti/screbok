package ru.mkn.sovesti.screbok.core.markdown.tests;

import ru.mkn.sovesti.screbok.mlm.model.api.CodeListing;
import ru.mkn.sovesti.screbok.mlm.model.api.EmphasisType;
import ru.mkn.sovesti.screbok.mlm.model.api.Emphasized;
import ru.mkn.sovesti.screbok.mlm.model.api.ListType;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupList;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.RawText;
import ru.mkn.sovesti.screbok.mlm.model.api.Reference;
import ru.mkn.sovesti.screbok.mlm.model.api.Section;
import ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode;
import ru.mkn.sovesti.screbok.mlm.model.meta.MlmFactory;

final class MarkdownTestData {

	MarkupNode sectionTree() {
		WrappingNode root = MlmFactory.eINSTANCE.createWrappingNode();
		Section head = MlmFactory.eINSTANCE.createSection();
		head.setTitle(text("Big heading"));
		head.setLevel(1);
		root.getChildren().add(head);
		Section body = MlmFactory.eINSTANCE.createSection();
		body.setTitle(text("Small heading"));
		body.setLevel(2);
		body.getChildren().add(text("some text"));
		root.getChildren().add(body);
		return root;
	}

	MarkupNode link() {
		WrappingNode root = MlmFactory.eINSTANCE.createWrappingNode();
		Reference reference = MlmFactory.eINSTANCE.createReference();
		reference.setTitle(text("Apache OpenNLP"));
		reference.setLink("https://opennlp.apache.org/docs/2.5.7/manual/opennlp.html");
		root.getChildren().add(reference);
		return root;
	}

	MarkupNode code() {
		WrappingNode root = MlmFactory.eINSTANCE.createWrappingNode();
		CodeListing listing = MlmFactory.eINSTANCE.createCodeListing();
		listing.setContent(text(" Hello world"));
		root.getChildren().add(listing);
		return root;
	}

	MarkupNode list() {
		WrappingNode root = MlmFactory.eINSTANCE.createWrappingNode();
		MarkupList list = MlmFactory.eINSTANCE.createMarkupList();
		list.setType(ListType.BULLETED);
		list.getItems().add(text("Do"));
		list.getItems().add(text("Done"));
		root.getChildren().add(list);
		return root;
	}

	MarkupNode emphasized() {
		WrappingNode root = MlmFactory.eINSTANCE.createWrappingNode();
		root.getChildren().add(emphasized("bold", EmphasisType.BOLD));
		root.getChildren().add(text(" "));
		root.getChildren().add(emphasized("italic", EmphasisType.ITALIC));
		return root;
	}

	MarkupNode emphasized(String text, EmphasisType type) {
		Emphasized node = MlmFactory.eINSTANCE.createEmphasized();
		node.getParts().add(text(text));
		node.setType(type);
		return node;
	}

	private MarkupNode text(String text) {
		RawText raw = MlmFactory.eINSTANCE.createRawText();
		raw.setText(text);
		return raw;
	}
}
