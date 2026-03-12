package ru.mkn.sovesti.screbok.common.io;

import org.eclipse.core.runtime.IPath;

final class FileUnder {

	String path(IPath path, String... segments) {
		for (String segment : segments) {
			path = path.append(segment);
		}
		return path.toString();
	}

}
