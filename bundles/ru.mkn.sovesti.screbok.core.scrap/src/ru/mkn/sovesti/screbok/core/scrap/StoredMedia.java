package ru.mkn.sovesti.screbok.core.scrap;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import ru.mkn.sovesti.screbok.mlm.model.api.SiteMedia;

public record StoredMedia(String reference, SiteMedia model, File file) {

	public void copyTo(File other) throws IOException {
		File where = other.toPath().resolve(reference).toFile();
		where.mkdirs();
		Files.copy(file.toPath(), where.toPath(), StandardCopyOption.REPLACE_EXISTING);
	}
}
