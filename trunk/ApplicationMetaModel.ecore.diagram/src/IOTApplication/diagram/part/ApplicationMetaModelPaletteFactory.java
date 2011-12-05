package IOTApplication.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class ApplicationMetaModelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createIOTApplication1Group());
	}

	/**
	 * Creates "IOTApplication" palette tool group
	 * @generated
	 */
	private PaletteContainer createIOTApplication1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				IOTApplication.diagram.part.Messages.IOTApplication1Group_title);
		paletteContainer.setId("createIOTApplication1Group"); //$NON-NLS-1$
		paletteContainer.add(createRoom1CreationTool());
		paletteContainer.add(createPerson2CreationTool());
		paletteContainer.add(createPersonLocate3CreationTool());
		paletteContainer.add(createThing4CreationTool());
		paletteContainer.add(createThingLocation5CreationTool());
		paletteContainer.add(createThingOwner6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoom1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.Room_2005);
		NodeToolEntry entry = new NodeToolEntry(
				IOTApplication.diagram.part.Messages.Room1CreationTool_title,
				IOTApplication.diagram.part.Messages.Room1CreationTool_desc,
				types);
		entry.setId("createRoom1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes
						.getImageDescriptor(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.Room_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPerson2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.Person_2003);
		NodeToolEntry entry = new NodeToolEntry(
				IOTApplication.diagram.part.Messages.Person2CreationTool_title,
				IOTApplication.diagram.part.Messages.Person2CreationTool_desc,
				types);
		entry.setId("createPerson2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes
						.getImageDescriptor(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.Person_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPersonLocate3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.PersonLocate_4004);
		LinkToolEntry entry = new LinkToolEntry(
				IOTApplication.diagram.part.Messages.PersonLocate3CreationTool_title,
				IOTApplication.diagram.part.Messages.PersonLocate3CreationTool_desc,
				types);
		entry.setId("createPersonLocate3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes
						.getImageDescriptor(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.PersonLocate_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createThing4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.Thing_2002);
		NodeToolEntry entry = new NodeToolEntry(
				IOTApplication.diagram.part.Messages.Thing4CreationTool_title,
				IOTApplication.diagram.part.Messages.Thing4CreationTool_desc,
				types);
		entry.setId("createThing4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes
						.getImageDescriptor(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.Thing_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createThingLocation5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.ThingLocation_4003);
		LinkToolEntry entry = new LinkToolEntry(
				IOTApplication.diagram.part.Messages.ThingLocation5CreationTool_title,
				IOTApplication.diagram.part.Messages.ThingLocation5CreationTool_desc,
				types);
		entry.setId("createThingLocation5CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes
						.getImageDescriptor(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.ThingLocation_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createThingOwner6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.ThingOwner_4001);
		LinkToolEntry entry = new LinkToolEntry(
				IOTApplication.diagram.part.Messages.ThingOwner6CreationTool_title,
				IOTApplication.diagram.part.Messages.ThingOwner6CreationTool_desc,
				types);
		entry.setId("createThingOwner6CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes
						.getImageDescriptor(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.ThingOwner_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
