package ru.mkn.sovesti.screbok.slm.model;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

final class ResourceSuffix implements Supplier<String> {

	@Override
	public String get() {
		return "_" + ZonedDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-hh-mm-ss"));
	}

}
