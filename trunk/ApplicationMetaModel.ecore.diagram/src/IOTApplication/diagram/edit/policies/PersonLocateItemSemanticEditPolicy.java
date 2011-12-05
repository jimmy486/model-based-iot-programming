package IOTApplication.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class PersonLocateItemSemanticEditPolicy
		extends
		IOTApplication.diagram.edit.policies.ApplicationMetaModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PersonLocateItemSemanticEditPolicy() {
		super(
				IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.PersonLocate_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
