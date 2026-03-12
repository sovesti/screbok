package ru.mkn.sovesti.screbok.core.scrap;

import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

import ru.mkn.sovesti.screbok.common.lang.Result;
import ru.mkn.sovesti.screbok.common.lang.Result.Err;
import ru.mkn.sovesti.screbok.common.lang.Result.Ok;
import ru.mkn.sovesti.screbok.mlm.model.api.Site;
import ru.mkn.sovesti.screbok.mlm.model.api.SiteMedia;
import ru.mkn.sovesti.screbok.mlm.model.meta.MlmFactory;

public final class FetchImage implements Supplier<Result<Optional<SiteMedia>, Exception>> {

	private final String url;
	private final Site site;
	private final String to;

	public FetchImage(String url, Site site, String to) {
		this.url = Objects.requireNonNull(url);
		this.site = Objects.requireNonNull(site);
		this.to = Objects.requireNonNull(to);
	}

	@Override
	public Result<Optional<SiteMedia>, Exception> get() {
		if (path().toFile().exists()) {
			return new Ok<>(media());
		}
		try (InputStream in = new URI(url).toURL().openStream()) {
			path().toFile().getParentFile().mkdirs();
			Files.copy(in, path());
			return new Ok<>(media());
		} catch (Exception e) {
			return new Err<>(e);
		}
	}

	private Path path() {
		return Paths.get(to);
	}

	private Optional<SiteMedia> media() {
		SiteMedia media = MlmFactory.eINSTANCE.createSiteMedia();
		media.setUri(url);
		media.setSite(site);
		return Optional.of(media);
	}

}
