package ru.mkn.sovesti.screbok.common.emf;

import java.util.Objects;
import java.util.Optional;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public final class FreshResource {

	private final IProject project;
	private final EObject beacon;
	private final String name;

	public FreshResource(IProject project, EObject beacon, String name) {
		this.project = Objects.requireNonNull(project);
		this.beacon = Objects.requireNonNull(beacon);
		this.name = Objects.requireNonNull(name);
	}

	public Optional<Resource> under(String folder) {
		return Optional.ofNullable(project.getFullPath()) //
				.map(path -> path.append(new Path(folder))) //
				.map(path -> path.append(name)) //
				.map(IPath::toString) //
				.map(URI::createURI) //
				.map(beacon.eResource().getResourceSet()::createResource);
	}
}
