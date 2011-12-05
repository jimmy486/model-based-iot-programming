package cn.edu.pku.iot.ui.action;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.jface.dialogs.MessageDialog;

import cn.edu.pku.sei.ra.util.ECoreRelatedUtil;
import cn.edu.pku.smart.qvsa.AdaptionExecutor;
import cn.edu.pku.smart.qvsa.QueryExecutor;

import RFID.RFIDFactory;
import RFID.RFIDSystem;
import ac.jp.u_tokyo.QVTWrapper.QVTTransformation;

/**
 * Our sample action implements workbench action delegate.
 * The action proxy will be created by the workbench and
 * shown in the UI. When the user tries to use the action,
 * this delegate will be created and execution will be 
 * delegated to it.
 * @see IWorkbenchWindowActionDelegate
 */
public class IOTRegisAppMeta implements IWorkbenchWindowActionDelegate {
	private IWorkbenchWindow window;
	public static final String RESOURCE_HEAD="platform:/resource";
	/**
	 * The constructor.
	 */
	public IOTRegisAppMeta() {
	}
	
	

	/**
	 * The action has been activated. The argument of the
	 * method represents the 'real' action sitting
	 * in the workbench UI.
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	public void run(IAction action) {
		IProject project=ResourcesPlugin.getWorkspace().getRoot().getProject("iot");
		try{
			ECoreRelatedUtil util=ECoreRelatedUtil.eINSTANCE;
			
			
			//2. get App Meta-model and model
			EPackage appPack=util.getEPackage(
					URI.createURI(RESOURCE_HEAD+"/iot/meta-model/ApplicationMetaModel.ecore")
			);			
			util.getResourceSet().getPackageRegistry().put(appPack.getNsURI(), appPack);
			EPackage.Registry.INSTANCE.put(appPack.getNsURI(), appPack);
			Resource appRes=util.getResourceSet().getResource(
					URI.createURI(RESOURCE_HEAD+"/iot/App.xmi"),true
				);

		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		MessageDialog.openInformation(
			window.getShell(),
			"Iot_ui",
			"Hello, Eclipse world");
	}

	/**
	 * Selection in the workbench has been changed. We 
	 * can change the state of the 'real' action here
	 * if we want, but this can only happen after 
	 * the delegate has been created.
	 * @see IWorkbenchWindowActionDelegate#selectionChanged
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

	/**
	 * We can use this method to dispose of any system
	 * resources we previously allocated.
	 * @see IWorkbenchWindowActionDelegate#dispose
	 */
	public void dispose() {
	}

	/**
	 * We will cache window object in order to
	 * be able to provide parent shell for the message dialog.
	 * @see IWorkbenchWindowActionDelegate#init
	 */
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}
}