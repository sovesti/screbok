package ru.mkn.sovesti.screbok.common.io;

import org.eclipse.core.resources.ResourcesPlugin;

public final class WorkspaceFile {

	public String path(String... segments) {
		return new FileUnder().path( //
				ResourcesPlugin.getWorkspace().getRoot().getLocation(), segments);
	}
}
