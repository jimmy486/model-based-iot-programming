package IOTApplication.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ApplicationMetaModelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "ApplicationMetaModel.ecore.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (IOTApplication.diagram.edit.parts.AppSystemEditPart.MODEL_ID
					.equals(view.getType())) {
				return IOTApplication.diagram.edit.parts.AppSystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				IOTApplication.diagram.part.ApplicationMetaModelDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (IOTApplication.IOTApplicationPackage.eINSTANCE.getAppSystem()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((IOTApplication.AppSystem) domainElement)) {
			return IOTApplication.diagram.edit.parts.AppSystemEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
				.getModelID(containerView);
		if (!IOTApplication.diagram.edit.parts.AppSystemEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (IOTApplication.diagram.edit.parts.AppSystemEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = IOTApplication.diagram.edit.parts.AppSystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case IOTApplication.diagram.edit.parts.AppSystemEditPart.VISUAL_ID:
			if (IOTApplication.IOTApplicationPackage.eINSTANCE.getPerson()
					.isSuperTypeOf(domainElement.eClass())) {
				return IOTApplication.diagram.edit.parts.PersonEditPart.VISUAL_ID;
			}
			if (IOTApplication.IOTApplicationPackage.eINSTANCE.getThing()
					.isSuperTypeOf(domainElement.eClass())) {
				return IOTApplication.diagram.edit.parts.ThingEditPart.VISUAL_ID;
			}
			if (IOTApplication.IOTApplicationPackage.eINSTANCE.getRoom()
					.isSuperTypeOf(domainElement.eClass())) {
				return IOTApplication.diagram.edit.parts.RoomEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
				.getModelID(containerView);
		if (!IOTApplication.diagram.edit.parts.AppSystemEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (IOTApplication.diagram.edit.parts.AppSystemEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = IOTApplication.diagram.edit.parts.AppSystemEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case IOTApplication.diagram.edit.parts.PersonEditPart.VISUAL_ID:
			if (IOTApplication.diagram.edit.parts.PersonNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IOTApplication.diagram.edit.parts.PersonPidEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IOTApplication.diagram.edit.parts.PersonGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IOTApplication.diagram.edit.parts.PersonOfficeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IOTApplication.diagram.edit.parts.PersonGenderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IOTApplication.diagram.edit.parts.ThingEditPart.VISUAL_ID:
			if (IOTApplication.diagram.edit.parts.ThingNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IOTApplication.diagram.edit.parts.ThingTidEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IOTApplication.diagram.edit.parts.RoomEditPart.VISUAL_ID:
			if (IOTApplication.diagram.edit.parts.RoomHidEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IOTApplication.diagram.edit.parts.RoomTemperatureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IOTApplication.diagram.edit.parts.RoomBrightnessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IOTApplication.diagram.edit.parts.AppSystemEditPart.VISUAL_ID:
			if (IOTApplication.diagram.edit.parts.PersonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IOTApplication.diagram.edit.parts.ThingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IOTApplication.diagram.edit.parts.RoomEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(IOTApplication.AppSystem element) {
		return true;
	}

}
