package IOTApplication.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ThingOwnerItemSemanticEditPolicy
		extends
		IOTApplication.diagram.edit.policies.ApplicationMetaModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ThingOwnerItemSemanticEditPolicy() {
		super(
				IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.ThingOwner_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
