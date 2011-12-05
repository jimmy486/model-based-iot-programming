package IOTApplication.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class ApplicationMetaModelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
					.getVisualID(view)) {

			case IOTApplication.diagram.edit.parts.AppSystemEditPart.VISUAL_ID:
				return new IOTApplication.diagram.edit.parts.AppSystemEditPart(
						view);

			case IOTApplication.diagram.edit.parts.PersonEditPart.VISUAL_ID:
				return new IOTApplication.diagram.edit.parts.PersonEditPart(
						view);

			case IOTApplication.diagram.edit.parts.PersonNameEditPart.VISUAL_ID:
				return new IOTApplication.diagram.edit.parts.PersonNameEditPart(
						view);

			case IOTApplication.diagram.edit.parts.PersonPidEditPart.VISUAL_ID:
				return new IOTApplication.diagram.edit.parts.PersonPidEditPart(
						view);

			case IOTApplication.diagram.edit.parts.PersonGroupEditPart.VISUAL_ID:
				return new IOTApplication.diagram.edit.parts.PersonGroupEditPart(
						view);

			case IOTApplication.diagram.edit.parts.PersonOfficeEditPart.VISUAL_ID:
				return new IOTApplication.diagram.edit.parts.PersonOfficeEditPart(
						view);

			case IOTApplication.diagram.edit.parts.PersonGenderEditPart.VISUAL_ID:
				return new IOTApplication.diagram.edit.parts.PersonGenderEditPart(
						view);

			case IOTApplication.diagram.edit.parts.ThingEditPart.VISUAL_ID:
				return new IOTApplication.diagram.edit.parts.ThingEditPart(view);

			case IOTApplication.diagram.edit.parts.ThingNameEditPart.VISUAL_ID:
				return new IOTApplication.diagram.edit.parts.ThingNameEditPart(
						view);

			case IOTApplication.diagram.edit.parts.ThingTidEditPart.VISUAL_ID:
				return new IOTApplication.diagram.edit.parts.ThingTidEditPart(
						view);

			case IOTApplication.diagram.edit.parts.RoomEditPart.VISUAL_ID:
				return new IOTApplication.diagram.edit.parts.RoomEditPart(view);

			case IOTApplication.diagram.edit.parts.RoomHidEditPart.VISUAL_ID:
				return new IOTApplication.diagram.edit.parts.RoomHidEditPart(
						view);

			case IOTApplication.diagram.edit.parts.RoomTemperatureEditPart.VISUAL_ID:
				return new IOTApplication.diagram.edit.parts.RoomTemperatureEditPart(
						view);

			case IOTApplication.diagram.edit.parts.RoomBrightnessEditPart.VISUAL_ID:
				return new IOTApplication.diagram.edit.parts.RoomBrightnessEditPart(
						view);

			case IOTApplication.diagram.edit.parts.PersonLocateEditPart.VISUAL_ID:
				return new IOTApplication.diagram.edit.parts.PersonLocateEditPart(
						view);

			case IOTApplication.diagram.edit.parts.ThingLocationEditPart.VISUAL_ID:
				return new IOTApplication.diagram.edit.parts.ThingLocationEditPart(
						view);

			case IOTApplication.diagram.edit.parts.ThingOwnerEditPart.VISUAL_ID:
				return new IOTApplication.diagram.edit.parts.ThingOwnerEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapOn()
					&& getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
