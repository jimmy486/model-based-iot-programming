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
public class PersonEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2003;

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
	public PersonEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new IOTApplication.diagram.edit.policies.PersonItemSemanticEditPolicy());
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
		PersonFigure figure = new PersonFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public PersonFigure getPrimaryShape() {
		return (PersonFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof IOTApplication.diagram.edit.parts.PersonNameEditPart) {
			((IOTApplication.diagram.edit.parts.PersonNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigurePersonNameFigure());
			return true;
		}
		if (childEditPart instanceof IOTApplication.diagram.edit.parts.PersonPidEditPart) {
			((IOTApplication.diagram.edit.parts.PersonPidEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigurePersonGroupFigure());
			return true;
		}
		if (childEditPart instanceof IOTApplication.diagram.edit.parts.PersonGroupEditPart) {
			((IOTApplication.diagram.edit.parts.PersonGroupEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigurePersonOfficeFigure());
			return true;
		}
		if (childEditPart instanceof IOTApplication.diagram.edit.parts.PersonOfficeEditPart) {
			((IOTApplication.diagram.edit.parts.PersonOfficeEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigurePersonPidFigure());
			return true;
		}
		if (childEditPart instanceof IOTApplication.diagram.edit.parts.PersonGenderEditPart) {
			((IOTApplication.diagram.edit.parts.PersonGenderEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigurePersonGenderFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof IOTApplication.diagram.edit.parts.PersonNameEditPart) {
			return true;
		}
		if (childEditPart instanceof IOTApplication.diagram.edit.parts.PersonPidEditPart) {
			return true;
		}
		if (childEditPart instanceof IOTApplication.diagram.edit.parts.PersonGroupEditPart) {
			return true;
		}
		if (childEditPart instanceof IOTApplication.diagram.edit.parts.PersonOfficeEditPart) {
			return true;
		}
		if (childEditPart instanceof IOTApplication.diagram.edit.parts.PersonGenderEditPart) {
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
				.getType(IOTApplication.diagram.edit.parts.PersonNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types
				.add(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.PersonLocate_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof IOTApplication.diagram.edit.parts.RoomEditPart) {
			types
					.add(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.PersonLocate_4004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.PersonLocate_4004) {
			types
					.add(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.Room_2005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types
				.add(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.ThingOwner_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.ThingOwner_4001) {
			types
					.add(IOTApplication.diagram.providers.ApplicationMetaModelElementTypes.Thing_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class PersonFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePersonPidFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePersonNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePersonGroupFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePersonOfficeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePersonGenderFigure;

		/**
		 * @generated
		 */
		public PersonFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			this.setLineWidth(1);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(40),
					getMapMode().DPtoLP(70)));
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(40),
					getMapMode().DPtoLP(70)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigurePersonNameFigure = new WrappingLabel();
			fFigurePersonNameFigure.setText("<...>");

			this.add(fFigurePersonNameFigure);

			fFigurePersonGroupFigure = new WrappingLabel();
			fFigurePersonGroupFigure.setText("<...>");

			this.add(fFigurePersonGroupFigure);

			fFigurePersonOfficeFigure = new WrappingLabel();
			fFigurePersonOfficeFigure.setText("<...>");

			this.add(fFigurePersonOfficeFigure);

			fFigurePersonPidFigure = new WrappingLabel();
			fFigurePersonPidFigure.setText("<...>");

			this.add(fFigurePersonPidFigure);

			fFigurePersonGenderFigure = new WrappingLabel();
			fFigurePersonGenderFigure.setText("<...>");

			this.add(fFigurePersonGenderFigure);

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
		public WrappingLabel getFigurePersonPidFigure() {
			return fFigurePersonPidFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePersonNameFigure() {
			return fFigurePersonNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePersonGroupFigure() {
			return fFigurePersonGroupFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePersonOfficeFigure() {
			return fFigurePersonOfficeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePersonGenderFigure() {
			return fFigurePersonGenderFigure;
		}

	}

}
