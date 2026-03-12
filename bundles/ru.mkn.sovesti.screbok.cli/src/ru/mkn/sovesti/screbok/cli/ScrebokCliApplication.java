package ru.mkn.sovesti.screbok.cli;

import java.util.Optional;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import ru.mkn.sovesti.screbok.slm.model.ResolvedLaunch;
import ru.mkn.sovesti.screbok.slm.model.ScrebokRun;

/**
 * This class controls all aspects of the application's execution
 */
public class ScrebokCliApplication implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		runLaunch(new ScrebokArguments(context));
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
		// nothing to do
	}

	private void runLaunch(ScrebokArguments args) throws CoreException {
		Optional<ResolvedLaunch> launch = args.launch();
		if (launch.isPresent()) {
			new ScrebokRun(launch.get()).run(new NullProgressMonitor());
		}
	}
}
