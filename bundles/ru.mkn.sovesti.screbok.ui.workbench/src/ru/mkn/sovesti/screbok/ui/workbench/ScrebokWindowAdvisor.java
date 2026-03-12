package ru.mkn.sovesti.screbok.ui.workbench;

import java.util.stream.Stream;

import org.eclipse.core.runtime.IExtension;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.internal.dialogs.WorkbenchWizardElement;
import org.eclipse.ui.internal.wizards.AbstractExtensionWizardRegistry;
import org.eclipse.ui.wizards.IWizardCategory;
import org.eclipse.ui.wizards.IWizardDescriptor;

@SuppressWarnings("restriction")
public final class ScrebokWindowAdvisor extends WorkbenchWindowAdvisor {

	public ScrebokWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	@Override
	public void preWindowOpen() {
		final IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		configurer.setInitialSize(new Point(1920, 1080));
		configurer.setTitle("Screbok");
		super.preWindowOpen();
	}

	@Override
	public void postWindowOpen() {
		Stream.of(PlatformUI.getWorkbench().getNewWizardRegistry().getRootCategory().getCategories()) //
				.flatMap(this::wizards) //
				.filter(wd -> !"org.eclipse.ui.Basic".equals(wd.getCategory().getId())) //
				.map(WorkbenchWizardElement.class::cast) //
				.forEach(this::remove);
	}

	private void remove(WorkbenchWizardElement wizard) {
		newWizards().removeExtension(extension(wizard), new Object[] { wizard });
	}

	private IExtension extension(WorkbenchWizardElement wizard) {
		return wizard.getConfigurationElement().getDeclaringExtension();
	}

	private AbstractExtensionWizardRegistry newWizards() {
		return (AbstractExtensionWizardRegistry) PlatformUI.getWorkbench().getNewWizardRegistry();
	}

	private Stream<IWizardDescriptor> wizards(IWizardCategory category) {
		return Stream.concat(Stream.of(category.getCategories()).flatMap(this::wizards),
				Stream.of(category.getWizards()));
	}

}
