package IOTApplication.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		IOTApplication.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		IOTApplication.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		IOTApplication.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		IOTApplication.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		IOTApplication.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return IOTApplication.diagram.part.ApplicationMetaModelDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
