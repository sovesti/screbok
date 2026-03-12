package ru.mkn.sovesti.screbok.dsm.model.rules;

import java.util.Optional;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;

import ru.mkn.sovesti.screbok.dsm.model.api.Book;
import ru.mkn.sovesti.screbok.dsm.model.api.DocumentationEngine;
import ru.mkn.sovesti.screbok.dsm.model.api.DocumentationLanguage;
import ru.mkn.sovesti.screbok.dsm.model.api.Organization;
import ru.mkn.sovesti.screbok.dsm.model.api.Rule;

public final class InferPriority implements Consumer<Rule> {

	@Override
	public void accept(Rule rule) {
		Optional.ofNullable(rule.eContainer()) //
				.filter(c -> rule.getPriority() == 0) //
				.map(this::priority) //
				.ifPresent(rule::setPriority);
	}

	private int priority(EObject container) {
		return switch (container) {
		case DocumentationLanguage l -> 1;
		case DocumentationEngine e -> 2;
		case Organization o -> 3;
		case Book b -> 4;
		default -> 0;
		};
	}

}
