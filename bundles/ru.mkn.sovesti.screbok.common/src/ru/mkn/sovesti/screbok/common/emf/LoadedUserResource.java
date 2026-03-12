package ru.mkn.sovesti.screbok.common.emf;

import java.util.Objects;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;

import ru.mkn.sovesti.screbok.common.eclipse.ReportChannel;
import ru.mkn.sovesti.screbok.common.io.UserDirFile;

public final class LoadedUserResource<T extends EObject> {

	private final Class<T> type;
	private final ResourceSet rs;

	public LoadedUserResource(Class<T> type, ResourceSet rs) {
		this.type = Objects.requireNonNull(type);
		this.rs = Objects.requireNonNull(rs);
	}

	public T at(String... segments) {
		return new LoadedResource(new StandaloneResource( //
				new UserDirFile().path(segments), rs).create(), //
				new ReportChannel.PlatformLog(getClass())).root(type).get();
	}

}
