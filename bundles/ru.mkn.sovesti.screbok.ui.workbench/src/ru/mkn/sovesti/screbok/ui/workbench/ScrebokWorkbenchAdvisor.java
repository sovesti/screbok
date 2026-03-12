package ru.mkn.sovesti.screbok.ui.workbench;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;

public final class ScrebokWorkbenchAdvisor extends WorkbenchAdvisor {

	@Override
	public String getInitialWindowPerspectiveId() {
		return "ru.mkn.sovesti.screbok.perspective";
	}

	@Override
	public void preStartup() {
	}

	@Override
	public void initialize(IWorkbenchConfigurer configurer) {
		super.initialize(configurer);
		configurer.setSaveAndRestore(true);
		IDE.registerAdapters();
		PlatformUI.getWorkbench().getSharedImages();
		declareWorkbenchImage(IDE.SharedImages.IMG_OBJ_PROJECT, "icons/full/obj16/prj_obj.png");
		declareWorkbenchImage(IDE.SharedImages.IMG_OBJ_PROJECT_CLOSED, "icons/full/obj16/cprj_obbj.png");
	}

	@SuppressWarnings("restriction")
	private void declareWorkbenchImage(String name, String path) {
		URL url = FileLocator.find(Platform.getBundle(IDEWorkbenchPlugin.IDE_WORKBENCH), new Path(path), null);
		ImageDescriptor desc = ImageDescriptor.createFromURL(url);
		getWorkbenchConfigurer().declareImage(name, desc, true);
	}

	@Override
	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		return new ScrebokWindowAdvisor(configurer);
	}

}
