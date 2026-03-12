package ru.mkn.sovesti.screbok.common.eclipse;

import java.util.Objects;
import java.util.function.Supplier;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;

public final class IntoCoreException implements Supplier<CoreException> {

	private final Exception source;

	public IntoCoreException(Exception source) {
		this.source = Objects.requireNonNull(source);
	}

	@Override
	public CoreException get() {
		return new CoreException(Status.error(source.getMessage(), source));
	}

}
