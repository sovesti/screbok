package ru.mkn.sovesti.screbok.common.lang;

import java.util.Objects;
import java.util.function.Predicate;

public final class NonEmpty implements Predicate<String> {

	@Override
	public boolean test(String value) {
		return Objects.nonNull(value) && !value.isBlank();
	}

}
