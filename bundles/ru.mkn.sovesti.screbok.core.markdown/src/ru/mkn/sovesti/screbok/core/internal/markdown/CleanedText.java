package ru.mkn.sovesti.screbok.core.internal.markdown;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

final class CleanedText implements Function<String, String> {

	@Override
	public String apply(String rendered) {
		for (Entry<String, String> special : specialSequences().entrySet()) {
			rendered = rendered.replaceAll(special.getKey(), special.getValue());
		}
		return rendered;
	}

	private Map<String, String> specialSequences() {
		return Map.of("&#9;", "\t", "&#32;", " ");
	}
}
