package ru.mkn.sovesti.screbok.cli;

import java.util.Objects;
import java.util.Optional;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.eclipse.equinox.app.IApplicationContext;

import ru.mkn.sovesti.screbok.common.eclipse.ReportChannel;
import ru.mkn.sovesti.screbok.common.emf.LoadedResource;
import ru.mkn.sovesti.screbok.common.emf.StandaloneResource;
import ru.mkn.sovesti.screbok.slm.model.ResolvedLaunch;
import ru.mkn.sovesti.screbok.slm.model.api.Launch;

final class ScrebokArguments {

	private final IApplicationContext context;

	ScrebokArguments(IApplicationContext context) {
		this.context = Objects.requireNonNull(context);
	}

	Optional<ResolvedLaunch> launch() {
		if (!ScrebokCli.launch.equals(args()[0])) {
			return Optional.empty();
		}
		return Optional.ofNullable(args()[1]) //
				.filter(String.class::isInstance) //
				.map(String.class::cast) //
				.flatMap(this::loadLaunch);
	}

	private Optional<ResolvedLaunch> loadLaunch(String path) {
		try {
			IProject project = new OpenProject().around(new Path(path).removeLastSegments(1));
			return new LoadedResource( //
					new StandaloneResource(path).create(), //
					new ReportChannel.PlatformLog(getClass())).root(Launch.class) //
					.map(launch -> new ResolvedLaunch(launch, project));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private String[] args() {
		return (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
	}
}
