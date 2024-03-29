package IOTApplication.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RoomItemSemanticEditPolicy
		extends
		IOTApplication.diagram.edit.policies.ApplicationMetaModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RoomItemSemanticEditPolicy() {
		super(
				IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.Room_2005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
					.getVisualID(incomingLink) == IOTApplication.diagram.edit.parts.PersonLocateEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
					.getVisualID(incomingLink) == IOTApplication.diagram.edit.parts.ThingLocationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.PersonLocate_4004 == req
				.getElementType()) {
			return null;
		}
		if (IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.ThingLocation_4003 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.PersonLocate_4004 == req
				.getElementType()) {
			return getGEFWrapper(new IOTApplication.diagram.edit.commands.PersonLocateCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.ThingLocation_4003 == req
				.getElementType()) {
			return getGEFWrapper(new IOTApplication.diagram.edit.commands.ThingLocationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case IOTApplication.diagram.edit.parts.PersonLocateEditPart.VISUAL_ID:
			return getGEFWrapper(new IOTApplication.diagram.edit.commands.PersonLocateReorientCommand(
					req));
		case IOTApplication.diagram.edit.parts.ThingLocationEditPart.VISUAL_ID:
			return getGEFWrapper(new IOTApplication.diagram.edit.commands.ThingLocationReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
