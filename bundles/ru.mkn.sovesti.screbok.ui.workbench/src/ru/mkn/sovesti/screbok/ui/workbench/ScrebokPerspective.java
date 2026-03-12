package ru.mkn.sovesti.screbok.ui.workbench;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public final class ScrebokPerspective implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		String editor = layout.getEditorArea();
		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, 0.25f, editor);
		left.addView(IPageLayout.ID_PROJECT_EXPLORER);
		IFolderLayout bottom = layout.createFolder("bottomRight", IPageLayout.BOTTOM, 0.3f, editor);
		bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
		bottom.addView(IPageLayout.ID_PROGRESS_VIEW);
		IFolderLayout right = layout.createFolder("topRight", IPageLayout.RIGHT, 0.3f, editor);
		right.addView(IPageLayout.ID_PROP_SHEET);
	}

}
