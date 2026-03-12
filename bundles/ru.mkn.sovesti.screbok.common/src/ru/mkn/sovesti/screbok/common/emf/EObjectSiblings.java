package ru.mkn.sovesti.screbok.common.emf;

import java.util.List;
import java.util.Objects;

import org.eclipse.emf.ecore.EObject;

public final class EObjectSiblings {

	private final EObject element;

	public EObjectSiblings(EObject element) {
		this.element = Objects.requireNonNull(element);
	}

	@SuppressWarnings("unchecked")
	public void addAll(List<EObject> others) {
		((List<EObject>) element.eContainer().eGet(element.eContainingFeature())).addAll(others);
	}
}
