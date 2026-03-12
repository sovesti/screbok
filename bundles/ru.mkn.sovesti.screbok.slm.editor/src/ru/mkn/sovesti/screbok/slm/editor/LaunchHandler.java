package ru.mkn.sovesti.screbok.slm.editor;

import java.util.List;
import java.util.Optional;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.handlers.HandlerUtil;

import ru.mkn.sovesti.screbok.slm.model.ProjectGuess;
import ru.mkn.sovesti.screbok.slm.model.ScrebokRun;
import ru.mkn.sovesti.screbok.slm.model.api.Launch;

public final class LaunchHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		List<?> list = HandlerUtil.getCurrentStructuredSelection(event).toList();
		for (Launch launch : runs(list)) {
			execute(launch);
		}
		return null;
	}

	private List<Launch> runs(List<?> list) {
		return list.stream() //
				.filter(Launch.class::isInstance) //
				.map(Launch.class::cast) //
				.toList();
	}

	private void execute(Launch launch) throws ExecutionException {
		try {
			Optional<ScrebokRun> run = new ProjectGuess(launch).maybeRun();
			if (run.isPresent()) {
				run.get().run(new NullProgressMonitor());
			}
		} catch (CoreException e) {
			throw new ExecutionException(e.getMessage(), e);
		}
	}

}
