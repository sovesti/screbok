package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

import ru.mkn.sovesti.screbok.mlm.model.WrappedNodes;
import ru.mkn.sovesti.screbok.mlm.model.api.Anchor;
import ru.mkn.sovesti.screbok.mlm.model.api.ImaginaryNode;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.Placeholder;
import ru.mkn.sovesti.screbok.mlm.model.api.Wildcard;

final class ReplacingCopier extends Copier {

	private static final long serialVersionUID = 1L;
	private final MarkupNode origin;
	private final EObject parent;
	private final ReplacingCopierState state;
	private final ReplacingCopierImaginaries imaginaries;

	ReplacingCopier(MatchingContext context, MarkupNode origin, EObject parent) {
		this.origin = Objects.requireNonNull(origin);
		this.parent = Objects.requireNonNull(parent);
		this.imaginaries = new ReplacingCopierImaginaries();
		this.state = new ReplacingCopierState(context);
	}

	List<MarkupNode> copyAll(List<? extends EObject> objects, UnmatchedSequence remaining) {
		imaginaries.cut(parent);
		List<EObject> copies = copyAll(parent, objects);
		imaginaries.cut(parent);
		remaining.children().forEach(imaginary -> imaginaries.observe(parent, imaginary));
		state.context().observeUnmatched(imaginaries.all());
		return copies.stream().map(MarkupNode.class::cast).toList();
	}

	private List<EObject> copyAll(EObject parent, List<? extends EObject> objects) {
		List<EObject> copies = new ArrayList<>();
		fillCopies(parent, copies, new ArrayList<>(objects), 0);
		return copies;
	}

	@SuppressWarnings("unchecked")
	private <T> void fillCopies(EObject parent, List<T> copies, List<T> origins, int at) {
		while (at < origins.size()) {
			List<T> placeholders = placeholders(origins.subList(at, origins.size()));
			at += placeholders.size();
			flatImaginaries(parent, placeholders) //
					.forEach(copy -> copies.add((T) copy));
			List<T> others = nonPlaceholders(origins.subList(at, origins.size()));
			at += others.size();
			others.stream() //
					.map(e -> copy(parent, (EObject) e)) //
					.forEach(copy -> copies.add((T) copy));
		}
	}

	private <T> Stream<EObject> flatImaginaries(EObject parent, List<T> placeholders) {
		return placeholders.stream() //
				.map(Placeholder.class::cast) //
				.map(p -> maybeImaginary(parent, p)) //
				.flatMap(Optional::stream) //
				.flatMap(List::stream);
	}

	private <T> List<T> placeholders(Collection<T> objects) {
		return objects.stream() //
				.takeWhile(Placeholder.class::isInstance) //
				.toList();
	}

	private <T> List<T> nonPlaceholders(Collection<T> objects) {
		return objects.stream() //
				.takeWhile(Predicate.not(Placeholder.class::isInstance)) //
				.toList();
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void copyContainment(EReference reference, EObject origin, EObject copy) {
		if (reference.isMany()) {
			copy.eSet(reference, copyAll(copy, (List<EObject>) origin.eGet(reference)));
		} else {
			copy.eSet(reference, copy(copy, (EObject) origin.eGet(reference)));
		}
	}

	@Override
	public EObject copy(EObject element) {
		return copy(parent, element);
	}

	private EObject copy(EObject parent, EObject element) {
		if (Objects.isNull(element)) {
			return null;
		}
		return switch (element) {
		case ImaginaryNode imaginary -> imaginary;
		case Wildcard wildcard -> expand(parent, wildcard);
		case Anchor anchor -> copyAnchor(anchor);
		default -> maybeImaginary(parent, element).map(this::wrap) //
				.orElseGet(() -> copyNonImaginary(parent, element));
		};
	}

	private EObject copyNonImaginary(EObject parent, EObject element) {
		imaginaries.cut(parent);
		return super.copy(element);
	}

	private EObject expand(EObject parent, Wildcard repeat) {
		return wrap(new ReplacedWildcard(state, element -> copy(parent, element)).expand(repeat));
	}

	private EObject copyAnchor(Anchor anchor) {
		Anchor copied = (Anchor) super.copy(anchor);
		state.context().putAnchor(copied);
		return copied;
	}

	@Override
	protected void copyAttribute(EAttribute attribute, EObject element, EObject copy) {
		if (element.eGet(attribute) instanceof String value) {
			new ReplaceAttribute(origin).of(copy, attribute, value);
			return;
		}
		super.copyAttribute(attribute, element, copy);
	}

	private EObject wrap(List<? extends MarkupNode> values) {
		return new WrappedNodes().lazy(values);
	}

	private Optional<List<ImaginaryNode>> maybeImaginary(EObject parent, EObject element) {
		return Optional.ofNullable(element) //
				.filter(Placeholder.class::isInstance) //
				.map(Placeholder.class::cast) //
				.flatMap(p -> maybeImaginary(parent, p));
	}

	private Optional<List<ImaginaryNode>> maybeImaginary(EObject parent, Placeholder placeholder) {
		return state.context().placeholderMatches(placeholder) //
				.map(matches -> placeholderImaginaries(parent, placeholder, matches));
	}

	private List<ImaginaryNode> placeholderImaginaries(EObject parent, //
			Placeholder placeholder, List<MarkupNode> targets) {
		return Optional.of(state) //
				.filter(ReplacingCopierState::inWildcard) //
				.map(list -> state.nextReplacement(placeholder)) //
				.filter(i -> i < targets.size()) //
				.map(targets::get) //
				.map(t -> imaginaries.create(parent, t)) //
				.map(List::of) //
				.orElseGet(() -> imaginaries.create(parent, targets));
	}

}