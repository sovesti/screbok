package ru.mkn.sovesti.screbok.core.internal.markdown;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.commonmark.node.BulletList;
import org.commonmark.node.ListBlock;
import org.commonmark.node.ListItem;
import org.commonmark.node.Node;
import org.commonmark.node.OrderedList;
import org.commonmark.node.SoftLineBreak;

import ru.mkn.sovesti.screbok.common.emf.EObjectContents;
import ru.mkn.sovesti.screbok.mlm.model.UnwrappedNodes;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupList;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;

public record ListConversion(MarkupList node, List<Child> children) implements MarkdownNodeConversion {

	public ListConversion(MarkupList node) {
		this(node, new ArrayList<>());
	}

	@Override
	public void convert(Node parent) {
		ListBlock list = createList();
		List<MarkupNode> unwrapped = node.getItems().stream() //
				.flatMap(new UnwrappedNodes()::stream) //
				.toList();
		unwrapped.stream() //
				.flatMap(child -> item(list, child, unwrapped.getLast())) //
				.forEach(children::add);
		parent.appendChild(list);
	}

	private Stream<Child> item(ListBlock list, MarkupNode child, MarkupNode last) {
		ListItem item = listItem(list, child == last || hasTable(child));
		return new UnwrappedNodes().stream(child).map(node -> new Child(item, child));
	}

	private ListItem listItem(ListBlock block, boolean last) {
		ListItem item = new ListItem();
		block.appendChild(item);
		if (!last) {
			block.appendChild(new SoftLineBreak());
		}
		return item;
	}
	
	private boolean hasTable(MarkupNode child) {
		return new EObjectContents(child).ofType(MarkupList.class).findAny().isPresent();
	}

	private ListBlock createList() {
		return switch (node.getType()) {
		case NUMBERED -> new OrderedList();
		default -> new BulletList();
		};
	}

}