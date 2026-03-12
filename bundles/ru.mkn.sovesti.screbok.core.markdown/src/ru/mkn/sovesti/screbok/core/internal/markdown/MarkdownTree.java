package ru.mkn.sovesti.screbok.core.internal.markdown;

import java.util.ArrayList;
import java.util.List;

import org.commonmark.node.Document;

import ru.mkn.sovesti.screbok.core.internal.markdown.MarkdownNodeConversion.Child;
import ru.mkn.sovesti.screbok.mlm.model.api.CodeListing;
import ru.mkn.sovesti.screbok.mlm.model.api.Emphasized;
import ru.mkn.sovesti.screbok.mlm.model.api.Image;
import ru.mkn.sovesti.screbok.mlm.model.api.LineBreak;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupList;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.RawText;
import ru.mkn.sovesti.screbok.mlm.model.api.Reference;
import ru.mkn.sovesti.screbok.mlm.model.api.Section;
import ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode;

public final class MarkdownTree {

	private final List<Child> children;

	public MarkdownTree() {
		this.children = new ArrayList<>();
	}

	public Document build(MarkupNode root) {
		Document document = new Document();
		children.add(new Child(document, root));
		while (!children.isEmpty()) {
			convert(children.removeLast());
		}
		return document;
	}

	private void convert(Child current) {
		MarkdownNodeConversion conversion = conversion(current.node());
		conversion.convert(current.parent());
		children.addAll(conversion.children().reversed());
	}

	private MarkdownNodeConversion conversion(MarkupNode node) {
		return switch (node) {
		case WrappingNode wrapping -> new WrappingNodeConversion(wrapping);
		case Section section -> new SectionConversion(section);
		case MarkupList list -> new ListConversion(list);
		case Reference reference -> new ReferenceConversion(reference);
		case Image image -> new ImageConversion(image);
		case CodeListing listing -> new CodeConversion(listing);
		case Emphasized emphasized -> new EmphasizedConversion(emphasized);
		case RawText text -> new RawTextConversion(text);
		case LineBreak line -> new LineBreakConversion();
		default -> new EmptyConversion();
		};
	}

}
