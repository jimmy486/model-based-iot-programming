package IOTApplication.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ApplicationMetaModelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
				.getVisualID(view)) {
		case IOTApplication.diagram.edit.parts.AppSystemEditPart.VISUAL_ID:
			return getAppSystem_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAppSystem_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		IOTApplication.AppSystem modelElement = (IOTApplication.AppSystem) view
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getPerson().iterator(); it.hasNext();) {
			IOTApplication.Person childElement = (IOTApplication.Person) it
					.next();
			int visualID = IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == IOTApplication.diagram.edit.parts.PersonEditPart.VISUAL_ID) {
				result
						.add(new IOTApplication.diagram.part.ApplicationMetaModelNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getThing().iterator(); it.hasNext();) {
			IOTApplication.Thing childElement = (IOTApplication.Thing) it
					.next();
			int visualID = IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == IOTApplication.diagram.edit.parts.ThingEditPart.VISUAL_ID) {
				result
						.add(new IOTApplication.diagram.part.ApplicationMetaModelNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getRoom().iterator(); it.hasNext();) {
			IOTApplication.Room childElement = (IOTApplication.Room) it.next();
			int visualID = IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == IOTApplication.diagram.edit.parts.RoomEditPart.VISUAL_ID) {
				result
						.add(new IOTApplication.diagram.part.ApplicationMetaModelNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
				.getVisualID(view)) {
		case IOTApplication.diagram.edit.parts.AppSystemEditPart.VISUAL_ID:
			return getAppSystem_1000ContainedLinks(view);
		case IOTApplication.diagram.edit.parts.PersonEditPart.VISUAL_ID:
			return getPerson_2003ContainedLinks(view);
		case IOTApplication.diagram.edit.parts.ThingEditPart.VISUAL_ID:
			return getThing_2002ContainedLinks(view);
		case IOTApplication.diagram.edit.parts.RoomEditPart.VISUAL_ID:
			return getRoom_2005ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
				.getVisualID(view)) {
		case IOTApplication.diagram.edit.parts.PersonEditPart.VISUAL_ID:
			return getPerson_2003IncomingLinks(view);
		case IOTApplication.diagram.edit.parts.ThingEditPart.VISUAL_ID:
			return getThing_2002IncomingLinks(view);
		case IOTApplication.diagram.edit.parts.RoomEditPart.VISUAL_ID:
			return getRoom_2005IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
				.getVisualID(view)) {
		case IOTApplication.diagram.edit.parts.PersonEditPart.VISUAL_ID:
			return getPerson_2003OutgoingLinks(view);
		case IOTApplication.diagram.edit.parts.ThingEditPart.VISUAL_ID:
			return getThing_2002OutgoingLinks(view);
		case IOTApplication.diagram.edit.parts.RoomEditPart.VISUAL_ID:
			return getRoom_2005OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAppSystem_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerson_2003ContainedLinks(View view) {
		IOTApplication.Person modelElement = (IOTApplication.Person) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Person_Locate_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getThing_2002ContainedLinks(View view) {
		IOTApplication.Thing modelElement = (IOTApplication.Thing) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Thing_Location_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Thing_Owner_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRoom_2005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerson_2003IncomingLinks(View view) {
		IOTApplication.Person modelElement = (IOTApplication.Person) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Thing_Owner_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getThing_2002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRoom_2005IncomingLinks(View view) {
		IOTApplication.Room modelElement = (IOTApplication.Room) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Person_Locate_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Thing_Location_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerson_2003OutgoingLinks(View view) {
		IOTApplication.Person modelElement = (IOTApplication.Person) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Person_Locate_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getThing_2002OutgoingLinks(View view) {
		IOTApplication.Thing modelElement = (IOTApplication.Thing) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Thing_Location_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Thing_Owner_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRoom_2005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Person_Locate_4004(
			IOTApplication.Room target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == IOTApplication.IOTApplicationPackage.eINSTANCE
					.getPerson_Locate()) {
				result
						.add(new IOTApplication.diagram.part.ApplicationMetaModelLinkDescriptor(
								setting.getEObject(),
								target,
								IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.PersonLocate_4004,
								IOTApplication.diagram.edit.parts.PersonLocateEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Thing_Location_4003(
			IOTApplication.Room target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == IOTApplication.IOTApplicationPackage.eINSTANCE
					.getThing_Location()) {
				result
						.add(new IOTApplication.diagram.part.ApplicationMetaModelLinkDescriptor(
								setting.getEObject(),
								target,
								IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.ThingLocation_4003,
								IOTApplication.diagram.edit.parts.ThingLocationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Thing_Owner_4001(
			IOTApplication.Person target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == IOTApplication.IOTApplicationPackage.eINSTANCE
					.getThing_Owner()) {
				result
						.add(new IOTApplication.diagram.part.ApplicationMetaModelLinkDescriptor(
								setting.getEObject(),
								target,
								IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.ThingOwner_4001,
								IOTApplication.diagram.edit.parts.ThingOwnerEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Person_Locate_4004(
			IOTApplication.Person source) {
		Collection result = new LinkedList();
		IOTApplication.Room destination = source.getLocate();
		if (destination == null) {
			return result;
		}
		result
				.add(new IOTApplication.diagram.part.ApplicationMetaModelLinkDescriptor(
						source,
						destination,
						IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.PersonLocate_4004,
						IOTApplication.diagram.edit.parts.PersonLocateEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Thing_Location_4003(
			IOTApplication.Thing source) {
		Collection result = new LinkedList();
		IOTApplication.Room destination = source.getLocation();
		if (destination == null) {
			return result;
		}
		result
				.add(new IOTApplication.diagram.part.ApplicationMetaModelLinkDescriptor(
						source,
						destination,
						IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.ThingLocation_4003,
						IOTApplication.diagram.edit.parts.ThingLocationEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Thing_Owner_4001(
			IOTApplication.Thing source) {
		Collection result = new LinkedList();
		IOTApplication.Person destination = source.getOwner();
		if (destination == null) {
			return result;
		}
		result
				.add(new IOTApplication.diagram.part.ApplicationMetaModelLinkDescriptor(
						source,
						destination,
						IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.ThingOwner_4001,
						IOTApplication.diagram.edit.parts.ThingOwnerEditPart.VISUAL_ID));
		return result;
	}

}
