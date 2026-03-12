package ru.mkn.sovesti.screbok.ui.workbench;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

public final class ScrebokApplication implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		Display display = PlatformUI.createDisplay();
		try {
			return run(display) == PlatformUI.RETURN_RESTART ? PlatformUI.RETURN_RESTART : IApplication.EXIT_OK;
		} finally {
			display.dispose();
		}
	}

	private int run(Display display) {
		return PlatformUI.createAndRunWorkbench(display, new ScrebokWorkbenchAdvisor());
	}

	@Override
	public void stop() {
	}

}
