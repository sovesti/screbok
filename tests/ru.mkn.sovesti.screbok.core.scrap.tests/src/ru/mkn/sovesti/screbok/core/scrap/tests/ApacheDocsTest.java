package ru.mkn.sovesti.screbok.core.scrap.tests;

import java.util.Optional;

import org.junit.Test;
import org.w3c.dom.Document;

import ru.mkn.sovesti.screbok.common.io.WorkspaceFile;
import ru.mkn.sovesti.screbok.common.lang.Result;
import ru.mkn.sovesti.screbok.core.scrap.FetchDom;
import ru.mkn.sovesti.screbok.core.scrap.FetchImage;
import ru.mkn.sovesti.screbok.mlm.model.api.Site;
import ru.mkn.sovesti.screbok.mlm.model.api.SiteMedia;
import ru.mkn.sovesti.screbok.mlm.model.meta.MlmFactory;

public final class ApacheDocsTest {

	@Test
	public void domFetched() {
		openNlpDom().unwrap();
	}

	@Test
	public void imagesFetched() {
		treeImage().unwrap().get();
	}

	private Result<Document, Exception> openNlpDom() {
		return new FetchDom(openNlp().getUri() + "opennlp.html").get();
	}

	private Result<Optional<SiteMedia>, Exception> treeImage() {
		return new FetchImage(openNlp().getUri() + "images/parsetree1.png", openNlp(),
				new WorkspaceFile().path("parsetree1.png")).get();
	}

	private Site openNlp() {
		Site site = MlmFactory.eINSTANCE.createSite();
		site.setUri("https://opennlp.apache.org/docs/2.5.7/manual/");
		return site;
	}
}
