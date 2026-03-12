package ru.mkn.sovesti.screbok.slm.model;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;

import ru.mkn.sovesti.screbok.common.eclipse.ReportChannel;
import ru.mkn.sovesti.screbok.core.scrap.StoredMedia;
import ru.mkn.sovesti.screbok.mlm.model.api.SitePage;

public record LaunchContext(ReportChannel log, IProgressMonitor monitor, IProject project, //
		Map<String, SitePage> pages, Map<String, StoredMedia> media) {

	public LaunchContext(ReportChannel log, IProgressMonitor monitor, IProject project) {
		this(log, monitor, project, new HashMap<>(), new HashMap<>());
	}
}
