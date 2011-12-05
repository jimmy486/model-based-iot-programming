package IOTApplication.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class ApplicationMetaModelCreationWizard extends Wizard implements
		INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected IOTApplication.diagram.part.ApplicationMetaModelCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected IOTApplication.diagram.part.ApplicationMetaModelCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(IOTApplication.diagram.part.Messages.ApplicationMetaModelCreationWizardTitle);
		setDefaultPageImageDescriptor(IOTApplication.diagram.part.ApplicationMetaModelDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewIOTApplicationWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new IOTApplication.diagram.part.ApplicationMetaModelCreationWizardPage(
				"DiagramModelFile", getSelection(), "iotapplication_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(IOTApplication.diagram.part.Messages.ApplicationMetaModelCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(IOTApplication.diagram.part.Messages.ApplicationMetaModelCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new IOTApplication.diagram.part.ApplicationMetaModelCreationWizardPage(
				"DomainModelFile", getSelection(), "iotapplication") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".iotapplication_diagram".length()); //$NON-NLS-1$
					setFileName(IOTApplication.diagram.part.ApplicationMetaModelDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "iotapplication")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(IOTApplication.diagram.part.Messages.ApplicationMetaModelCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(IOTApplication.diagram.part.Messages.ApplicationMetaModelCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = IOTApplication.diagram.part.ApplicationMetaModelDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						IOTApplication.diagram.part.ApplicationMetaModelDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										IOTApplication.diagram.part.Messages.ApplicationMetaModelCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								IOTApplication.diagram.part.Messages.ApplicationMetaModelCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				IOTApplication.diagram.part.ApplicationMetaModelDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
