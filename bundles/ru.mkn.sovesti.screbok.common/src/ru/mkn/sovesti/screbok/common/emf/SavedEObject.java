package ru.mkn.sovesti.screbok.common.emf;

import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import ru.mkn.sovesti.screbok.common.eclipse.ReportChannel;

public final class SavedEObject {

	private final EObject root;
	private final ReportChannel log;

	public SavedEObject(EObject root, ReportChannel log) {
		this.root = Objects.requireNonNull(root);
		this.log = Objects.requireNonNull(log);
	}

	public void toResource(Resource resource) {
		resource.getContents().add(root);
		try {
			resource.save(new HashMap<>());
		} catch (IOException e) {
			log.report(e);
		}
	}
}
