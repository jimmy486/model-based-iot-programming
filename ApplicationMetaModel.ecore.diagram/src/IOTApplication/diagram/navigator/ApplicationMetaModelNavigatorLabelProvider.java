package IOTApplication.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class ApplicationMetaModelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		IOTApplication.diagram.part.ApplicationMetaModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		IOTApplication.diagram.part.ApplicationMetaModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorItem
				&& !isOwnView(((IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup) {
			IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup group = (IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup) element;
			return IOTApplication.diagram.part.ApplicationMetaModelDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorItem) {
			IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorItem navigatorItem = (IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
				.getVisualID(view)) {
		case IOTApplication.diagram.edit.parts.AppSystemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://sei.pku.edu.cn/iot/application/old?AppSystem", IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.AppSystem_1000); //$NON-NLS-1$
		case IOTApplication.diagram.edit.parts.PersonEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://sei.pku.edu.cn/iot/application/old?Person", IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.Person_2003); //$NON-NLS-1$
		case IOTApplication.diagram.edit.parts.ThingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://sei.pku.edu.cn/iot/application/old?Thing", IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.Thing_2002); //$NON-NLS-1$
		case IOTApplication.diagram.edit.parts.RoomEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://sei.pku.edu.cn/iot/application/old?Room", IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.Room_2005); //$NON-NLS-1$
		case IOTApplication.diagram.edit.parts.PersonLocateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://sei.pku.edu.cn/iot/application/old?Person?locate", IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.PersonLocate_4004); //$NON-NLS-1$
		case IOTApplication.diagram.edit.parts.ThingLocationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://sei.pku.edu.cn/iot/application/old?Thing?location", IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.ThingLocation_4003); //$NON-NLS-1$
		case IOTApplication.diagram.edit.parts.ThingOwnerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://sei.pku.edu.cn/iot/application/old?Thing?owner", IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.ThingOwner_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = IOTApplication.diagram.part.ApplicationMetaModelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& IOTApplication.diagram.providers.ApplicationMetaModelElementTypes
						.isKnownElementType(elementType)) {
			image = IOTApplication.diagram.providers.ApplicationMetaModelElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup) {
			IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup group = (IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorItem) {
			IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorItem navigatorItem = (IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
				.getVisualID(view)) {
		case IOTApplication.diagram.edit.parts.AppSystemEditPart.VISUAL_ID:
			return getAppSystem_1000Text(view);
		case IOTApplication.diagram.edit.parts.PersonEditPart.VISUAL_ID:
			return getPerson_2003Text(view);
		case IOTApplication.diagram.edit.parts.ThingEditPart.VISUAL_ID:
			return getThing_2002Text(view);
		case IOTApplication.diagram.edit.parts.RoomEditPart.VISUAL_ID:
			return getRoom_2005Text(view);
		case IOTApplication.diagram.edit.parts.PersonLocateEditPart.VISUAL_ID:
			return getPersonLocate_4004Text(view);
		case IOTApplication.diagram.edit.parts.ThingLocationEditPart.VISUAL_ID:
			return getThingLocation_4003Text(view);
		case IOTApplication.diagram.edit.parts.ThingOwnerEditPart.VISUAL_ID:
			return getThingOwner_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getAppSystem_1000Text(View view) {
		IOTApplication.AppSystem domainModelElement = (IOTApplication.AppSystem) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			IOTApplication.diagram.part.ApplicationMetaModelDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPerson_2003Text(View view) {
		IParser parser = IOTApplication.diagram.providers.ApplicationMetaModelParserProvider
				.getParser(
						IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.Person_2003,
						view.getElement() != null ? view.getElement() : view,
						IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
								.getType(IOTApplication.diagram.edit.parts.PersonNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IOTApplication.diagram.part.ApplicationMetaModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThing_2002Text(View view) {
		IParser parser = IOTApplication.diagram.providers.ApplicationMetaModelParserProvider
				.getParser(
						IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.Thing_2002,
						view.getElement() != null ? view.getElement() : view,
						IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
								.getType(IOTApplication.diagram.edit.parts.ThingNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IOTApplication.diagram.part.ApplicationMetaModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRoom_2005Text(View view) {
		IParser parser = IOTApplication.diagram.providers.ApplicationMetaModelParserProvider
				.getParser(
						IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.Room_2005,
						view.getElement() != null ? view.getElement() : view,
						IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
								.getType(IOTApplication.diagram.edit.parts.RoomHidEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IOTApplication.diagram.part.ApplicationMetaModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPersonLocate_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getThingLocation_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getThingOwner_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return IOTApplication.diagram.edit.parts.AppSystemEditPart.MODEL_ID
				.equals(IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
						.getModelID(view));
	}

}
