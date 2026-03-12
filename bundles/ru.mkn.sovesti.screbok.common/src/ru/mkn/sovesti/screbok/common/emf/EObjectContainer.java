package ru.mkn.sovesti.screbok.common.emf;

import java.util.Objects;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;

public final class EObjectContainer {

	private final EObject element;

	public EObjectContainer(EObject element) {
		this.element = Objects.requireNonNull(element);
	}

	public <T extends EObject> Optional<T> ofType(Class<T> type) {
		Optional<EObject> current = Optional.of(element);
		while (current.isPresent()) {
			if (current.filter(type::isInstance).isPresent()) {
				return current.map(type::cast);
			}
			current = current.map(EObject::eContainer);
		}
		return Optional.empty();
	}
}
