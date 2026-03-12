package ru.mkn.sovesti.screbok.common.eclipse;

import java.util.Objects;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;

public final class FolderUnderProject {

	private final IProject project;

	public FolderUnderProject(IProject project) {
		this.project = Objects.requireNonNull(project);
	}

	public IFolder ensure(String path) throws CoreException {
		return ensure(new Path(path));
	}

	public IFolder ensure(IPath path) throws CoreException {
		if (path.segmentCount() == 1) {
			return create(project.getFolder(path.segment(0)));
		}
		return create(ensure(path.removeLastSegments(1)).getFolder(path.lastSegment()));
	}

	private IFolder create(IFolder folder) throws CoreException {
		if (!folder.exists()) {
			folder.create(IResource.NONE, false, new NullProgressMonitor());
		}
		return folder;
	}

}
