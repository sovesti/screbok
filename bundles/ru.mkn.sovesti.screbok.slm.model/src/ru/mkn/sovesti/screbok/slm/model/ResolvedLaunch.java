package ru.mkn.sovesti.screbok.slm.model;

import org.eclipse.core.resources.IProject;

import ru.mkn.sovesti.screbok.slm.model.api.Launch;

public record ResolvedLaunch(Launch launch, IProject project) {
}
