package ru.mkn.sovesti.screbok.common.io;

import org.eclipse.core.runtime.Path;

public final class UserDirFile {

	public String path(String... segments) {
		return new FileUnder().path( //
				new Path(System.getProperty("user.dir")), segments);
	}

}
