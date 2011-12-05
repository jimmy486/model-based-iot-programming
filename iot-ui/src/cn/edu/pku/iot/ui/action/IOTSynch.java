package cn.edu.pku.iot.ui.action;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import IOTApplication.Person;
import IOTApplication.Room;
import IOTApplication.impl.AppSystemImpl;
import IOTApplication.impl.PersonImpl;
import IOTApplication.impl.RoomImpl;
import RFID.RFIDFactory;
import RFID.RFIDSystem;
import RFID.impl.RFIDSystemImpl;
import RFID.impl.ReaderImpl;
import RFID.impl.TagImpl;
import ac.jp.u_tokyo.QVTWrapper.QVTTransformation;
import cn.edu.pku.sei.ra.util.ECoreRelatedUtil;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.ImagePool;

/**
 * Our sample action implements workbench action delegate.
 * The action proxy will be created by the workbench and
 * shown in the UI. When the user tries to use the action,
 * this delegate will be created and execution will be 
 * delegated to it.
 * @see IWorkbenchWindowActionDelegate
 */
public class IOTSynch implements IWorkbenchWindowActionDelegate {
	private IWorkbenchWindow window;
	public static final String RESOURCE_HEAD="platform:/resource";
	/**
	 * The constructor.
	 */
	public IOTSynch() {
	}
	
	

	/**
	 * The action has been activated. The argument of the
	 * method represents the 'real' action sitting
	 * in the workbench UI.
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	
	public class Task extends TimerTask
	{
		public void run()
		{
			IProject project=ResourcesPlugin.getWorkspace().getRoot().getProject("iot");
			try{
				{
				ECoreRelatedUtil util=ECoreRelatedUtil.eINSTANCE;
				ImagePool.reset();
				//1. Get System Meta-model and model
				//1.1 Get Dynamic System Meta-model
				EPackage rfidPack=EPackage.Registry.INSTANCE.getEPackage("http://sei.pku.edu.cn/iot/rfid");
				util.getResourceSet().getPackageRegistry().put(rfidPack.getNsURI(), rfidPack);
				
				//1.2 Create dynamic system model and save it as a byte array
				Resource sysRes=util.getResourceSet().createResource(URI.createURI("TempDynamic"));
				RFIDSystem root=RFIDFactory.eINSTANCE.createRFIDSystem();
				ECoreRelatedUtil.refreshEObject(root);			
				sysRes.getContents().add(root);			
				ByteArrayOutputStream out=new ByteArrayOutputStream();
				sysRes.save(out,Collections.EMPTY_MAP);
				
				//1.3 Get Static System meta-model
				rfidPack=util.getEPackage(
						URI.createURI("platform:plugin/iot-system/model/RFIDSystem.ecore")
				);
				util.getResourceSet().getPackageRegistry().put(rfidPack.getNsURI(), rfidPack);
				
				//1.4 get Static System model
				sysRes=util.getResourceSet().createResource(URI.createURI("TempStatic"));
				ByteArrayInputStream in=new ByteArrayInputStream(out.toByteArray());
				
				//sysRes.setURI(URI.createURI(RESOURCE_HEAD+"/iot/Res.rfid")); //delete
				sysRes.load(in,Collections.EMPTY_MAP);
				//sysRes.save(Collections.EMPTY_MAP);  //delete
				sysRes.save(System.out,Collections.EMPTY_MAP);
				
				//2. get App Meta-model and model
				EPackage appPack=EPackage.Registry.INSTANCE.getEPackage("http://sei.pku.edu.cn/iot/application/old");
				util.getResourceSet().getPackageRegistry().put(appPack.getNsURI(), appPack);
				EPackage.Registry.INSTANCE.put(appPack.getNsURI(), appPack);
				Resource appRes=util.getResourceSet().getResource(
						URI.createURI(RESOURCE_HEAD+"/iot/app.xmi"),true
					);

				//3. Launch QVT transformation
				IFile file=project.getFile("relation/App2Sys.qvt");
				File osFile=file.getLocation().toFile();
				Reader qvtReader=new BufferedReader(
						new FileReader(osFile)
					);
				ArrayList<EPackage> metas=new ArrayList<EPackage>();
				metas.add(rfidPack);
				metas.add(appPack);
				String traceFolder=project.getLocation().append("trace").toFile().getPath();
				QVTTransformation trans=new QVTTransformation(
						metas,
						System.out,
						qvtReader,
						traceFolder,
						"App2Sys",
						"sys",
						"app"
					);
				
				Resource result = trans.forward(sysRes,appRes);
				
				//Save Result
				result.setURI(URI.createURI(RESOURCE_HEAD+"/iot/Res.iotapplication"));
				result.save(Collections.EMPTY_MAP);   // maybe clear this sentence
				result.save(System.out,Collections.EMPTY_MAP);
				project.refreshLocal(2, null);
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	static boolean running = false;
	static Timer timer;
	
	public void run(IAction action) 
	{
		if(!running)
		{
			MessageDialog.openInformation(
					window.getShell(),
					"Iot_ui",
					"Start...");
			
			running = true;
			timer = new Timer();
			timer.schedule(new Task(), 0, 10000);
		}
		else
		{
			MessageDialog.openInformation(
					window.getShell(),
					"Iot_ui",
					"Stop...");
			
			running = false;
			timer.cancel();
		}
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
	
	void reader2RoomPerson(RFIDSystemImpl system, AppSystemImpl app)
	{
		for(int i = 0; i < system.getReader().size(); i++)
		{
			ReaderImpl reader = (ReaderImpl) system.getReader().get(i);
			RoomImpl room = null;
			for(int j = 0; j < app.getRoom().size(); j++)
			{
				room = (RoomImpl)app.getRoom().get(j);
				if(room.getHid() == reader.getRid())
					break;
			}
			
			int size1 = reader.getTag().size();
			int size2 = app.getPerson().size();
			// 需要根据size1和size2的大小决定查询的顺序，代码量翻倍
			// 二分查找加排序
			for(int j = 0; j < size1; j++)
			{
				TagImpl tag = (TagImpl)reader.getTag().get(j);
				for(int k = 0; k < size2; k++)
				{
					PersonImpl person = (PersonImpl) app.getPerson().get(k);
					if(person.getPid() == tag.getTid())
					{
						person.setLocate(room);
						EList<Person> personList = room.getPerson();
						personList.add(person);
						boolean find = true;
						
						for(Person p:personList)
						{
							if(p.getPid() == person.getPid())
							{
								find = true;
								break;
							}
						}
						if(!find)
						{
							room.getPerson().add(person);
							for(Room r:app.getRoom())
							{
								if(r == room)
									continue;
								EList<Person> list = r.getPerson();
								for(int m = 0; m < list.size(); m++)
								{
									Person p = list.get(m);
									if(p.getPid() == person.getPid())
									{
										list.remove(m);
										break;
									}
								}
							}
						}
						
					}
				}
			}
			
		}
	}
}