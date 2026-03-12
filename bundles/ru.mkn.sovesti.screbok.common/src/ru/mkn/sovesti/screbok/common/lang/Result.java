package ru.mkn.sovesti.screbok.common.lang;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public sealed interface Result<T, E> {

	T unwrap();

	E unwrapErr();

	boolean isOk();

	boolean isErr();

	<U> Result<U, E> map(Function<T, U> mapping);

	Optional<T> unwrapOr(Consumer<E> report);

	record Ok<T, E>(T ok) implements Result<T, E> {

		@Override
		public T unwrap() {
			return ok;
		}

		@Override
		public E unwrapErr() {
			throw new RuntimeException("Not an error: " + ok.toString());
		}

		@Override
		public boolean isOk() {
			return true;
		}

		@Override
		public boolean isErr() {
			return false;
		}

		@Override
		public <U> Result<U, E> map(Function<T, U> mapping) {
			return new Ok<>(mapping.apply(ok));
		}

		@Override
		public Optional<T> unwrapOr(Consumer<E> report) {
			return Optional.ofNullable(ok);
		}

	}

	record Err<T, E>(E err) implements Result<T, E> {

		@Override
		public T unwrap() {
			throw new RuntimeException("Not ok: " + err.toString());
		}

		@Override
		public E unwrapErr() {
			return err;
		}

		@Override
		public boolean isOk() {
			return false;
		}

		@Override
		public boolean isErr() {
			return true;
		}

		@Override
		public <U> Result<U, E> map(Function<T, U> mapping) {
			return new Err<>(err);
		}

		@Override
		public Optional<T> unwrapOr(Consumer<E> report) {
			report.accept(err);
			return Optional.empty();
		}

	}
}
