package ru.mkn.sovesti.screbok.common.emf;

import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;

import org.eclipse.emf.ecore.resource.Resource;

import ru.mkn.sovesti.screbok.common.eclipse.ReportChannel;

public final class LoadedResource {

	private final Resource resource;
	private final ReportChannel log;

	public LoadedResource(Resource resource, ReportChannel log) {
		this.resource = Objects.requireNonNull(resource);
		this.log = Objects.requireNonNull(log);
	}

	public <T> Optional<T> root(Class<T> type) {
		try {
			resource.load(new HashMap<>());
		} catch (IOException e) {
			log.report(e);
			return Optional.empty();
		}
		return resource.getContents().stream() //
				.filter(type::isInstance) //
				.map(type::cast) //
				.findFirst();
	}
}
