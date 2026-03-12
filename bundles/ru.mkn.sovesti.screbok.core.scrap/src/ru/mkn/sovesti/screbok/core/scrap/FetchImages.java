package ru.mkn.sovesti.screbok.core.scrap;

import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.eclipse.core.runtime.Path;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ru.mkn.sovesti.screbok.common.eclipse.ReportChannel;
import ru.mkn.sovesti.screbok.mlm.model.api.Site;

public final class FetchImages {

	private final String to;
	private final Site site;
	private final ReportChannel log;

	public FetchImages(String to, Site site, ReportChannel log) {
		this.to = Objects.requireNonNull(to);
		this.site = Objects.requireNonNull(site);
		this.log = Objects.requireNonNull(log);
	}

	public Map<String, StoredMedia> imagesFrom(Document document) {
		return addresses(document.getElementsByTagName("img")) //
				.map(this::fetch) //
				.flatMap(Optional::stream) //
				.collect(Collectors.toMap(StoredMedia::reference, Function.identity()));
	}

	private Optional<StoredMedia> fetch(String address) {
		return new FetchImage(fullAddress(address), site, fullTo(address)).get() //
				.unwrapOr(log::report) //
				.flatMap(Function.identity()) //
				.map(media -> new StoredMedia(address, media, new File(fullTo(address))));
	}

	private String fullAddress(String address) {
		return new Path(site.getUri()).append(address).toString();
	}

	private String fullTo(String address) {
		return new Path(to).append(address).toString();
	}

	private Stream<String> addresses(NodeList images) {
		return IntStream.range(0, images.getLength()) //
				.mapToObj(images::item) //
				.map(Node::getAttributes) //
				.map(map -> map.getNamedItem("src")) //
				.map(Node::getNodeValue);
	}

}
