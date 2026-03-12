package ru.mkn.sovesti.screbok.common.emf;

import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.eclipse.emf.ecore.EObject;

public final class EObjectContents {

	private final EObject element;

	public EObjectContents(EObject element) {
		this.element = Objects.requireNonNull(element);
	}

	public <T extends EObject> Stream<T> ofType(Class<T> type) {
		return Stream.concat(Stream.of(element), streamContents()) //
				.filter(type::isInstance) //
				.map(type::cast);
	}

	private <T extends EObject> Stream<EObject> streamContents() {
		return StreamSupport.stream( //
				Spliterators.spliteratorUnknownSize(element.eAllContents(), Spliterator.ORDERED), false);
	}
}
