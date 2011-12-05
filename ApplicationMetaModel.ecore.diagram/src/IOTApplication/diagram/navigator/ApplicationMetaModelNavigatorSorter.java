package IOTApplication.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ApplicationMetaModelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorItem) {
			IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorItem item = (IOTApplication.diagram.navigator.ApplicationMetaModelNavigatorItem) element;
			return IOTApplication.diagram.part.ApplicationMetaModelVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
