package IOTApplication.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ThingLocationItemSemanticEditPolicy
		extends
		IOTApplication.diagram.edit.policies.ApplicationMetaModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ThingLocationItemSemanticEditPolicy() {
		super(
				IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.ThingLocation_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
