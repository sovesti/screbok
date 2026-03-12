package ru.mkn.sovesti.screbok.mlm.model;

import java.util.List;
import java.util.function.Function;

import org.eclipse.emf.ecore.util.EcoreUtil;

import ru.mkn.sovesti.screbok.common.emf.EObjectContents;
import ru.mkn.sovesti.screbok.mlm.model.api.LineBreak;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.RawText;

public final class AllText implements Function<MarkupNode, List<MarkupNode>> {

	@Override
	public List<MarkupNode> apply(MarkupNode node) {
		return new EObjectContents(node).ofType(MarkupNode.class) //
				.filter(this::text) //
				.map(EcoreUtil::copy) //
				.toList();
	}

	private boolean text(MarkupNode node) {
		return node instanceof RawText || node instanceof LineBreak;
	}

}
