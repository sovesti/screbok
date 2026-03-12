package ru.mkn.sovesti.screbok.common.eclipse;

import java.util.Objects;
import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public final class ResolvedProject {

	private final EObject beacon;

	public ResolvedProject(EObject beacon) {
		this.beacon = Objects.requireNonNull(beacon);
	}

	public Optional<IProject> maybeGet() {
		return Optional.ofNullable(beacon.eResource()) //
				.map(Resource::getURI) //
				.map(uri -> uri.toPlatformString(true)) //
				.map(Path::new) //
				.map(ResourcesPlugin.getWorkspace().getRoot()::getFile) //
				.map(IFile::getProject);
	}

}
