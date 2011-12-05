package IOTApplication.diagram.part;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramActionBarContributor;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;

/**
 * @generated
 */
public class ApplicationMetaModelDiagramActionBarContributor extends
		DiagramActionBarContributor {

	/**
	 * @generated
	 */
	protected Class getEditorClass() {
		return IOTApplication.diagram.part.ApplicationMetaModelDiagramEditor.class;
	}

	/**
	 * @generated
	 */
	protected String getEditorId() {
		return IOTApplication.diagram.part.ApplicationMetaModelDiagramEditor.ID;
	}

	/**
	 * @generated
	 */
	public void init(IActionBars bars, IWorkbenchPage page) {
		super.init(bars, page);
		// print preview
		IMenuManager fileMenu = bars.getMenuManager().findMenuUsingPath(
				IWorkbenchActionConstants.M_FILE);
		assert fileMenu != null;
		fileMenu.remove("pageSetupAction"); //$NON-NLS-1$
	}
}
