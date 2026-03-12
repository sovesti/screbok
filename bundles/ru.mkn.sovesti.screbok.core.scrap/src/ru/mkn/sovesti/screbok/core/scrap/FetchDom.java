package ru.mkn.sovesti.screbok.core.scrap;

import java.io.InputStream;
import java.net.URI;
import java.util.Objects;
import java.util.function.Supplier;

import org.w3c.dom.Document;
import org.w3c.tidy.Tidy;

import ru.mkn.sovesti.screbok.common.lang.Result;
import ru.mkn.sovesti.screbok.common.lang.Result.Err;
import ru.mkn.sovesti.screbok.common.lang.Result.Ok;

public final class FetchDom implements Supplier<Result<Document, Exception>> {

	private final String url;

	public FetchDom(String url) {
		this.url = Objects.requireNonNull(url);
	}

	@Override
	public Result<Document, Exception> get() {
		try (InputStream fetch = new URI(url).toURL().openStream()) {
			return new Ok<>(parseDom(fetch));
		} catch (Exception e) {
			return new Err<>(e);
		}
	}

	private Document parseDom(InputStream fetch) {
		Tidy tidy = new Tidy();
		tidy.setQuiet(true);
		tidy.setInputEncoding(Html.encoding);
		tidy.setShowWarnings(false);
		return cleanDom(tidy.parseDOM(fetch, null));
	}

	private Document cleanDom(Document document) {
		document.normalizeDocument();
		return document;
	}

}
