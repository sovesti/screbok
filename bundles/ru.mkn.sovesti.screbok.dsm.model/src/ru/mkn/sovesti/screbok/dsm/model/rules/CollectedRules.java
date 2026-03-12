package ru.mkn.sovesti.screbok.dsm.model.rules;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ru.mkn.sovesti.screbok.dsm.model.api.Book;
import ru.mkn.sovesti.screbok.dsm.model.api.Library;
import ru.mkn.sovesti.screbok.dsm.model.api.Rule;
import ru.mkn.sovesti.screbok.dsm.model.api.Rules;

public final class CollectedRules {

	public Set<Rule> fromLibraries(List<Library> libraries) {
		return inferredPriorities(stream(libraries));
	}

	public Set<Rule> fromBook(Book book) {
		return inferredPriorities(rulesFor(book));
	}

	private Set<Rule> inferredPriorities(Stream<Rule> raw) {
		Set<Rule> collected = raw.collect(Collectors.toSet());
		collected.forEach(new InferPriority());
		return collected;
	}

	private Stream<Rule> stream(List<Library> libraries) {
		return libraries.stream() //
				.map(Library::getRules) //
				.flatMap(List::stream) //
				.flatMap(this::rulesFor);
	}

	private Stream<Rule> rulesFor(Rules storage) {
		return Stream.concat( //
				storage.getRules().stream(), //
				Stream.of(storage) //
						.filter(Book.class::isInstance) //
						.map(Book.class::cast) //
						.flatMap(this::rulesFor));
	}

	private Stream<Rule> rulesFor(Book book) {
		return Stream.of(book.getLanguage(), book.getEngine(), book.getOrganization()) //
				.filter(Objects::nonNull) //
				.flatMap(this::rulesFor);
	}
}
