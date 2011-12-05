package IOTApplication.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class ApplicationMetaModelNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	public ApplicationMetaModelNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						for (Iterator it = myEditingDomain.getResourceSet()
								.getResources().iterator(); it.hasNext();) {
							Resource nextResource = (Resource) it.next();
							nextResource.unload();
						}
						if (myViewer != null) {
							myViewer.getControl().getDisplay().asyncExec(
									myViewerRefreshRunnable);
						}
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						for (Iterator it = myEditingDomain.getResourceSet()
								.getResources().iterator(); it.hasNext();) {
							Resource nextResource = (Resource) it.next();
							nextResource.unload();
						}
						if (myViewer != null) {
							myViewer.getControl().getDisplay().asyncExec(
									myViewerRefreshRunnable);
						}
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						for (Iterator it = myEditingDomain.getResourceSet()
								.getResources().iterator(); it.hasNext();) {
							Resource nextResource = (Resource) it.next();
							nextResource.unload();
						}
						if (myViewer != null) {
							myViewer.getControl().getDisplay().asyncExec(
									myViewerRefreshRunnable);
						}
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		for (Iterator it = myEditingDomain.getResourceSet().getResources()
				.iterator(); it.hasNext();) {
			Resource resource = (Resource) it.next();
			resource.unload();
		}
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			Collection result = new ArrayList();
			result
					.addAll(createNavigatorItems(
							selectViewsByType(
									resource.getContents(),
									IOTApplication.diagram.edit.parts.AppSystemEditPart.MODEL_ID),
							file, false));
			return result.toArray();
		}

		if (parentElement instanceof IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup) {
			IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup group = (IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorItem) {
			IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorItem navigatorItem = (IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
				.getVisualID(view)) {

		case IOTApplication.diagram.edit.parts.AppSystemEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup links = new IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup(
					IOTApplication.diagram.part.Messages.NavigatorGroupName_AppSystem_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
							.getType(IOTApplication.diagram.edit.parts.PersonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
							.getType(IOTApplication.diagram.edit.parts.ThingEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
							.getType(IOTApplication.diagram.edit.parts.RoomEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
							.getType(IOTApplication.diagram.edit.parts.PersonLocateEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
							.getType(IOTApplication.diagram.edit.parts.ThingLocationEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
							.getType(IOTApplication.diagram.edit.parts.ThingOwnerEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case IOTApplication.diagram.edit.parts.PersonEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup outgoinglinks = new IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup(
					IOTApplication.diagram.part.Messages.NavigatorGroupName_Person_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup incominglinks = new IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup(
					IOTApplication.diagram.part.Messages.NavigatorGroupName_Person_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
							.getType(IOTApplication.diagram.edit.parts.PersonLocateEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
							.getType(IOTApplication.diagram.edit.parts.ThingOwnerEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case IOTApplication.diagram.edit.parts.ThingEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup outgoinglinks = new IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup(
					IOTApplication.diagram.part.Messages.NavigatorGroupName_Thing_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
							.getType(IOTApplication.diagram.edit.parts.ThingLocationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
							.getType(IOTApplication.diagram.edit.parts.ThingOwnerEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case IOTApplication.diagram.edit.parts.RoomEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup incominglinks = new IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup(
					IOTApplication.diagram.part.Messages.NavigatorGroupName_Room_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
							.getType(IOTApplication.diagram.edit.parts.PersonLocateEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
							.getType(IOTApplication.diagram.edit.parts.ThingLocationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case IOTApplication.diagram.edit.parts.PersonLocateEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup target = new IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup(
					IOTApplication.diagram.part.Messages.NavigatorGroupName_PersonLocate_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup source = new IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup(
					IOTApplication.diagram.part.Messages.NavigatorGroupName_PersonLocate_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(
					Collections.singleton(view),
					IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
							.getType(IOTApplication.diagram.edit.parts.RoomEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(view),
					IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
							.getType(IOTApplication.diagram.edit.parts.PersonEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case IOTApplication.diagram.edit.parts.ThingLocationEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup target = new IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup(
					IOTApplication.diagram.part.Messages.NavigatorGroupName_ThingLocation_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup source = new IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup(
					IOTApplication.diagram.part.Messages.NavigatorGroupName_ThingLocation_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(
					Collections.singleton(view),
					IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
							.getType(IOTApplication.diagram.edit.parts.RoomEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(view),
					IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
							.getType(IOTApplication.diagram.edit.parts.ThingEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case IOTApplication.diagram.edit.parts.ThingOwnerEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup target = new IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup(
					IOTApplication.diagram.part.Messages.NavigatorGroupName_ThingOwner_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup source = new IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorGroup(
					IOTApplication.diagram.part.Messages.NavigatorGroupName_ThingOwner_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(
					Collections.singleton(view),
					IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
							.getType(IOTApplication.diagram.edit.parts.PersonEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(view),
					IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
							.getType(IOTApplication.diagram.edit.parts.ThingEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection getLinksSourceByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getLinksTargetByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getOutgoingLinksByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getIncomingLinksByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getChildrenByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getDiagramLinksByType(Collection diagrams, String type) {
		Collection result = new ArrayList();
		for (Iterator it = diagrams.iterator(); it.hasNext();) {
			Diagram nextDiagram = (Diagram) it.next();
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection selectViewsByType(Collection views, String type) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return IOTApplication.diagram.edit.parts.AppSystemEditPart.MODEL_ID
				.equals(IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection createNavigatorItems(Collection views, Object parent,
			boolean isLeafs) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			result
					.add(new IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorItem(
							(View) it.next(), parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof IOTApplication.diagram.navigator.ApplicationMetaModelAbstractNavigatorItem) {
			IOTApplication.diagram.navigator.ApplicationMetaModelAbstractNavigatorItem abstractNavigatorItem = (IOTApplication.diagram.navigator.ApplicationMetaModelAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
