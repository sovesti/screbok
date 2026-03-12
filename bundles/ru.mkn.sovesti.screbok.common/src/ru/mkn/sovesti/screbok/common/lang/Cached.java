package ru.mkn.sovesti.screbok.common.lang;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

public final class Cached<T> implements Supplier<T> {

	private Optional<T> calculated;
	private final Supplier<T> calculation;

	public Cached(Supplier<T> calculation) {
		this.calculation = Objects.requireNonNull(calculation);
		calculated = Optional.empty();
	}

	@Override
	public T get() {
		if (calculated.isEmpty()) {
			calculated = Optional.of(calculation.get());
		}
		return calculated.get();
	}

}
