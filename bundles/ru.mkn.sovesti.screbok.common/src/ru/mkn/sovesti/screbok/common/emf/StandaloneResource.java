package ru.mkn.sovesti.screbok.common.emf;

import java.util.Objects;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public final class StandaloneResource {

	private final String path;
	private final ResourceSet rs;

	public StandaloneResource(String path, ResourceSet rs) {
		this.path = Objects.requireNonNull(path);
		this.rs = Objects.requireNonNull(rs);
	}

	public StandaloneResource(String path) {
		this(path, new ResourceSetImpl());
	}

	public Resource create() {
		return rs.getResource(URI.createFileURI(path), true);
	}
}
