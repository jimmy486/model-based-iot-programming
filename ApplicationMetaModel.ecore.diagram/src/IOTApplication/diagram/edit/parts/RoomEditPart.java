package IOTApplication.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class RoomEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2005;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public RoomEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new IOTApplication.diagram.edit.policies.RoomItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		RoomFigure figure = new RoomFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public RoomFigure getPrimaryShape() {
		return (RoomFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof IOTApplication.diagram.edit.parts.RoomBrightnessEditPart) {
			((IOTApplication.diagram.edit.parts.RoomBrightnessEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureRoomBrightnessFigure());
			return true;
		}
		if (childEditPart instanceof IOTApplication.diagram.edit.parts.RoomHidEditPart) {
			((IOTApplication.diagram.edit.parts.RoomHidEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureRoomHidFigure());
			return true;
		}
		if (childEditPart instanceof IOTApplication.diagram.edit.parts.RoomTemperatureEditPart) {
			((IOTApplication.diagram.edit.parts.RoomTemperatureEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureRoomTemperatureFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof IOTApplication.diagram.edit.parts.RoomBrightnessEditPart) {
			return true;
		}
		if (childEditPart instanceof IOTApplication.diagram.edit.parts.RoomHidEditPart) {
			return true;
		}
		if (childEditPart instanceof IOTApplication.diagram.edit.parts.RoomTemperatureEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(60, 70);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
				.getType(IOTApplication.diagram.edit.parts.RoomHidEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types
				.add(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.PersonLocate_4004);
		types
				.add(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.ThingLocation_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.PersonLocate_4004) {
			types
					.add(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.Person_2003);
		}
		if (relationshipType == IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.ThingLocation_4003) {
			types
					.add(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.Thing_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class RoomFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureRoomHidFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRoomTemperatureFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRoomBrightnessFigure;

		/**
		 * @generated
		 */
		public RoomFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			this.setLineWidth(1);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(60),
					getMapMode().DPtoLP(70)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureRoomHidFigure = new WrappingLabel();
			fFigureRoomHidFigure.setText("<...>");

			this.add(fFigureRoomHidFigure);

			fFigureRoomTemperatureFigure = new WrappingLabel();
			fFigureRoomTemperatureFigure.setText("<...>");

			this.add(fFigureRoomTemperatureFigure);

			fFigureRoomBrightnessFigure = new WrappingLabel();
			fFigureRoomBrightnessFigure.setText("<...>");

			this.add(fFigureRoomBrightnessFigure);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRoomHidFigure() {
			return fFigureRoomHidFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRoomTemperatureFigure() {
			return fFigureRoomTemperatureFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRoomBrightnessFigure() {
			return fFigureRoomBrightnessFigure;
		}

	}

}
