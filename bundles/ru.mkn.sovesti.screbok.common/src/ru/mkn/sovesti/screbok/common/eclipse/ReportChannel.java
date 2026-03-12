package ru.mkn.sovesti.screbok.common.eclipse;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public interface ReportChannel {

	public void report(IStatus status);

	default public void report(Throwable throwable) {
		report(Status.error(throwable.getMessage(), throwable));
	}

	record PlatformLog(Bundle bundle) implements ReportChannel {

		public PlatformLog(Class<?> clazz) {
			this(FrameworkUtil.getBundle(clazz));
		}

		@Override
		public void report(IStatus status) {
			Platform.getLog(bundle).log(status);
		}

	}
}
