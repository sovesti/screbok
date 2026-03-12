package ru.mkn.sovesti.screbok.slm.model;

import java.util.Objects;
import java.util.Optional;

import ru.mkn.sovesti.screbok.common.eclipse.ResolvedProject;
import ru.mkn.sovesti.screbok.slm.model.api.Launch;

public final class ProjectGuess {

	private final Launch launch;

	public ProjectGuess(Launch launch) {
		this.launch = Objects.requireNonNull(launch);
	}

	public Optional<ScrebokRun> maybeRun() {
		return new ResolvedProject(launch).maybeGet() //
				.map(project -> new ResolvedLaunch(launch, project)) //
				.map(ScrebokRun::new);
	}
}
