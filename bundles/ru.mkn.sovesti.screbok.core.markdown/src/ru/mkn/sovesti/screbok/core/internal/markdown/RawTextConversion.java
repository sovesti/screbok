package ru.mkn.sovesti.screbok.core.internal.markdown;

import java.util.List;
import java.util.stream.Stream;

import org.commonmark.node.Node;
import org.commonmark.node.SoftLineBreak;
import org.commonmark.node.Text;

import ru.mkn.sovesti.screbok.common.lang.JoiningCollector;
import ru.mkn.sovesti.screbok.mlm.model.api.RawText;

public record RawTextConversion(RawText text) implements MarkdownNodeConversion {

	@Override
	public void convert(Node parent) {
		Stream.of(new CleanedText().apply(text.getText()).split("\n")) //
				.map(Text::new) //
				.collect(new JoiningCollector<>(SoftLineBreak::new)) //
				.forEach(parent::appendChild);
	}

	@Override
	public List<Child> children() {
		return List.of();
	}

}