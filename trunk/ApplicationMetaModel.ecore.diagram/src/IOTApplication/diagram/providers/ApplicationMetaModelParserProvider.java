package IOTApplication.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ApplicationMetaModelParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser personName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getPersonName_5004Parser() {
		if (personName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { IOTApplication.IOTApplicationPackage.eINSTANCE
					.getPerson_Name() };
			IOTApplication.diagram.parsers.MessageFormatParser parser = new IOTApplication.diagram.parsers.MessageFormatParser(
					features);
			personName_5004Parser = parser;
		}
		return personName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser personGroup_5008Parser;

	/**
	 * @generated
	 */
	private IParser getPersonGroup_5008Parser() {
		if (personGroup_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { IOTApplication.IOTApplicationPackage.eINSTANCE
					.getPerson_Group() };
			IOTApplication.diagram.parsers.MessageFormatParser parser = new IOTApplication.diagram.parsers.MessageFormatParser(
					features);
			personGroup_5008Parser = parser;
		}
		return personGroup_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser personOffice_5009Parser;

	/**
	 * @generated
	 */
	private IParser getPersonOffice_5009Parser() {
		if (personOffice_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { IOTApplication.IOTApplicationPackage.eINSTANCE
					.getPerson_Office() };
			IOTApplication.diagram.parsers.MessageFormatParser parser = new IOTApplication.diagram.parsers.MessageFormatParser(
					features);
			personOffice_5009Parser = parser;
		}
		return personOffice_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser personPid_5010Parser;

	/**
	 * @generated
	 */
	private IParser getPersonPid_5010Parser() {
		if (personPid_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { IOTApplication.IOTApplicationPackage.eINSTANCE
					.getPerson_Pid() };
			IOTApplication.diagram.parsers.MessageFormatParser parser = new IOTApplication.diagram.parsers.MessageFormatParser(
					features);
			personPid_5010Parser = parser;
		}
		return personPid_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser personGender_5011Parser;

	/**
	 * @generated
	 */
	private IParser getPersonGender_5011Parser() {
		if (personGender_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { IOTApplication.IOTApplicationPackage.eINSTANCE
					.getPerson_Gender() };
			IOTApplication.diagram.parsers.MessageFormatParser parser = new IOTApplication.diagram.parsers.MessageFormatParser(
					features);
			personGender_5011Parser = parser;
		}
		return personGender_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser thingName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getThingName_5002Parser() {
		if (thingName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { IOTApplication.IOTApplicationPackage.eINSTANCE
					.getThing_Name() };
			IOTApplication.diagram.parsers.MessageFormatParser parser = new IOTApplication.diagram.parsers.MessageFormatParser(
					features);
			thingName_5002Parser = parser;
		}
		return thingName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser thingTid_5012Parser;

	/**
	 * @generated
	 */
	private IParser getThingTid_5012Parser() {
		if (thingTid_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { IOTApplication.IOTApplicationPackage.eINSTANCE
					.getThing_Tid() };
			IOTApplication.diagram.parsers.MessageFormatParser parser = new IOTApplication.diagram.parsers.MessageFormatParser(
					features);
			thingTid_5012Parser = parser;
		}
		return thingTid_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser roomHid_5005Parser;

	/**
	 * @generated
	 */
	private IParser getRoomHid_5005Parser() {
		if (roomHid_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { IOTApplication.IOTApplicationPackage.eINSTANCE
					.getRoom_Hid() };
			IOTApplication.diagram.parsers.MessageFormatParser parser = new IOTApplication.diagram.parsers.MessageFormatParser(
					features);
			roomHid_5005Parser = parser;
		}
		return roomHid_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser roomTemperature_5006Parser;

	/**
	 * @generated
	 */
	private IParser getRoomTemperature_5006Parser() {
		if (roomTemperature_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { IOTApplication.IOTApplicationPackage.eINSTANCE
					.getRoom_Temperature() };
			IOTApplication.diagram.parsers.MessageFormatParser parser = new IOTApplication.diagram.parsers.MessageFormatParser(
					features);
			roomTemperature_5006Parser = parser;
		}
		return roomTemperature_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser roomBrightness_5007Parser;

	/**
	 * @generated
	 */
	private IParser getRoomBrightness_5007Parser() {
		if (roomBrightness_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { IOTApplication.IOTApplicationPackage.eINSTANCE
					.getRoom_Brightness() };
			IOTApplication.diagram.parsers.MessageFormatParser parser = new IOTApplication.diagram.parsers.MessageFormatParser(
					features);
			roomBrightness_5007Parser = parser;
		}
		return roomBrightness_5007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case IOTApplication.diagram.edit.parts.PersonNameEditPart.VISUAL_ID:
			return getPersonName_5004Parser();
		case IOTApplication.diagram.edit.parts.PersonPidEditPart.VISUAL_ID:
			return getPersonGroup_5008Parser();
		case IOTApplication.diagram.edit.parts.PersonGroupEditPart.VISUAL_ID:
			return getPersonOffice_5009Parser();
		case IOTApplication.diagram.edit.parts.PersonOfficeEditPart.VISUAL_ID:
			return getPersonPid_5010Parser();
		case IOTApplication.diagram.edit.parts.PersonGenderEditPart.VISUAL_ID:
			return getPersonGender_5011Parser();
		case IOTApplication.diagram.edit.parts.ThingNameEditPart.VISUAL_ID:
			return getThingName_5002Parser();
		case IOTApplication.diagram.edit.parts.ThingTidEditPart.VISUAL_ID:
			return getThingTid_5012Parser();
		case IOTApplication.diagram.edit.parts.RoomHidEditPart.VISUAL_ID:
			return getRoomHid_5005Parser();
		case IOTApplication.diagram.edit.parts.RoomTemperatureEditPart.VISUAL_ID:
			return getRoomTemperature_5006Parser();
		case IOTApplication.diagram.edit.parts.RoomBrightnessEditPart.VISUAL_ID:
			return getRoomBrightness_5007Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (IOTApplication.diagram.providers.ApplicationMetaModelElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
