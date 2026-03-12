package ru.mkn.sovesti.screbok.core.scrap;

import java.util.Objects;
import java.util.function.Supplier;

import org.w3c.dom.Document;

import ru.mkn.sovesti.screbok.common.lang.Result;
import ru.mkn.sovesti.screbok.mlm.model.ParsedDomNode;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.SitePage;
import ru.mkn.sovesti.screbok.mlm.model.meta.MlmFactory;

public final class FetchPage implements Supplier<Result<SitePage, Exception>> {

	private final String url;

	public FetchPage(String url) {
		this.url = Objects.requireNonNull(url);
	}

	@Override
	public Result<SitePage, Exception> get() {
		return new FetchDom(url).get().map(this::page);
	}

	private SitePage page(Document document) {
		SitePage page = MlmFactory.eINSTANCE.createSitePage();
		page.setUri(url);
		page.setRoot(root(document));
		return page;
	}

	private MarkupNode root(Document document) {
		MarkupNode element = new ParsedDomNode(document.getDocumentElement()).get();
		element.setLanguage(Html.language);
		return element;
	}
}
