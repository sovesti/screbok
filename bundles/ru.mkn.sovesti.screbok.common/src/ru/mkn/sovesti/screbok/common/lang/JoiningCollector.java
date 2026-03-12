package ru.mkn.sovesti.screbok.common.lang;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public record JoiningCollector<T>(Supplier<T> barrier) implements Collector<T, List<T>, List<T>> {

	@Override
	public Supplier<List<T>> supplier() {
		return LinkedList::new;
	}

	@Override
	public BiConsumer<List<T>, T> accumulator() {
		return this::append;
	}

	private void append(List<T> list, T value) {
		if (!list.isEmpty()) {
			list.add(barrier.get());
		}
		list.add(value);
	}

	@Override
	public BinaryOperator<List<T>> combiner() {
		return this::combine;
	}

	private List<T> combine(List<T> left, List<T> right) {
		return Stream.of(left.stream(), right.stream()) //
				.collect(new JoiningCollector<>(this::streamBarrier)).stream() //
				.reduce(Stream::concat) //
				.map(Stream::toList) //
				.orElseGet(List::of);
	}

	private Stream<T> streamBarrier() {
		return Stream.of(barrier.get());
	}

	@Override
	public Function<List<T>, List<T>> finisher() {
		return Function.identity();
	}

	@Override
	public Set<Characteristics> characteristics() {
		return Set.of(Characteristics.IDENTITY_FINISH);
	}

}