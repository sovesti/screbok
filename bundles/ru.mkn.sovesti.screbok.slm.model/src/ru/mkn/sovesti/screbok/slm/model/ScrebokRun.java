package ru.mkn.sovesti.screbok.slm.model;

import java.util.Objects;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.IProgressMonitor;

import ru.mkn.sovesti.screbok.common.eclipse.ReportChannel;
import ru.mkn.sovesti.screbok.slm.model.api.Action;

public final class ScrebokRun implements ICoreRunnable {

	private final ResolvedLaunch launch;

	public ScrebokRun(ResolvedLaunch launch) {
		this.launch = Objects.requireNonNull(launch);
	}

	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
		LaunchContext context = context(monitor);
		for (Action action : launch.launch().getActions()) {
			action.run(context);
		}
	}

	private LaunchContext context(IProgressMonitor monitor) throws CoreException {
		return new LaunchContext(new ReportChannel.PlatformLog(getClass()), monitor, launch.project());
	}

}
