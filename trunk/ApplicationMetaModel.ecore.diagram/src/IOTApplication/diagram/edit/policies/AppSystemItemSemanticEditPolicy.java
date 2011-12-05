package IOTApplication.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class AppSystemItemSemanticEditPolicy
		extends
		IOTApplication.diagram.edit.policies.ApplicationMetaModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AppSystemItemSemanticEditPolicy() {
		super(
				IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.AppSystem_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.Person_2003 == req
				.getElementType()) {
			return getGEFWrapper(new IOTApplication.diagram.edit.commands.PersonCreateCommand(
					req));
		}
		if (IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.Thing_2002 == req
				.getElementType()) {
			return getGEFWrapper(new IOTApplication.diagram.edit.commands.ThingCreateCommand(
					req));
		}
		if (IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.Room_2005 == req
				.getElementType()) {
			return getGEFWrapper(new IOTApplication.diagram.edit.commands.RoomCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
