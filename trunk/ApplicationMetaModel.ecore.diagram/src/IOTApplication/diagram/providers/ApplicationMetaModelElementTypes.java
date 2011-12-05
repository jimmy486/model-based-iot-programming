package IOTApplication.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class ApplicationMetaModelElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private ApplicationMetaModelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType AppSystem_1000 = getElementType("ApplicationMetaModel.ecore.diagram.AppSystem_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Person_2003 = getElementType("ApplicationMetaModel.ecore.diagram.Person_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Thing_2002 = getElementType("ApplicationMetaModel.ecore.diagram.Thing_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Room_2005 = getElementType("ApplicationMetaModel.ecore.diagram.Room_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PersonLocate_4004 = getElementType("ApplicationMetaModel.ecore.diagram.PersonLocate_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ThingLocation_4003 = getElementType("ApplicationMetaModel.ecore.diagram.ThingLocation_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ThingOwner_4001 = getElementType("ApplicationMetaModel.ecore.diagram.ThingOwner_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return IOTApplication.diagram.part.ApplicationMetaModelDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(AppSystem_1000,
					IOTApplication.IOTApplicationPackage.eINSTANCE
							.getAppSystem());

			elements.put(Person_2003,
					IOTApplication.IOTApplicationPackage.eINSTANCE.getPerson());

			elements.put(Thing_2002,
					IOTApplication.IOTApplicationPackage.eINSTANCE.getThing());

			elements.put(Room_2005,
					IOTApplication.IOTApplicationPackage.eINSTANCE.getRoom());

			elements.put(PersonLocate_4004,
					IOTApplication.IOTApplicationPackage.eINSTANCE
							.getPerson_Locate());

			elements.put(ThingLocation_4003,
					IOTApplication.IOTApplicationPackage.eINSTANCE
							.getThing_Location());

			elements.put(ThingOwner_4001,
					IOTApplication.IOTApplicationPackage.eINSTANCE
							.getThing_Owner());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(AppSystem_1000);
			KNOWN_ELEMENT_TYPES.add(Person_2003);
			KNOWN_ELEMENT_TYPES.add(Thing_2002);
			KNOWN_ELEMENT_TYPES.add(Room_2005);
			KNOWN_ELEMENT_TYPES.add(PersonLocate_4004);
			KNOWN_ELEMENT_TYPES.add(ThingLocation_4003);
			KNOWN_ELEMENT_TYPES.add(ThingOwner_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case IOTApplication.diagram.edit.parts.AppSystemEditPart.VISUAL_ID:
			return AppSystem_1000;
		case IOTApplication.diagram.edit.parts.PersonEditPart.VISUAL_ID:
			return Person_2003;
		case IOTApplication.diagram.edit.parts.ThingEditPart.VISUAL_ID:
			return Thing_2002;
		case IOTApplication.diagram.edit.parts.RoomEditPart.VISUAL_ID:
			return Room_2005;
		case IOTApplication.diagram.edit.parts.PersonLocateEditPart.VISUAL_ID:
			return PersonLocate_4004;
		case IOTApplication.diagram.edit.parts.ThingLocationEditPart.VISUAL_ID:
			return ThingLocation_4003;
		case IOTApplication.diagram.edit.parts.ThingOwnerEditPart.VISUAL_ID:
			return ThingOwner_4001;
		}
		return null;
	}

}
