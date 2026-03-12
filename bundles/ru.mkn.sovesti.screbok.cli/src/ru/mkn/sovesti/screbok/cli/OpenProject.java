package ru.mkn.sovesti.screbok.cli;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

final class OpenProject {

	IProject around(IPath location) throws CoreException {
		IProjectDescription description = ws().loadProjectDescription(location.append(".project"));
		IProject handle = ws().getRoot().getProject(description.getName());
		maybeCreate(description, handle);
		maybeOpen(handle);
		return handle;
	}

	private void maybeCreate(IProjectDescription description, IProject handle) throws CoreException {
		if (!handle.exists()) {
			handle.create(description, null);
		}
	}

	private void maybeOpen(IProject handle) throws CoreException {
		if (!handle.isOpen()) {
			handle.open(null);
		}
	}

	private IWorkspace ws() {
		return ResourcesPlugin.getWorkspace();
	}
}
