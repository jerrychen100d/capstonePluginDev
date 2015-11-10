

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.internal.views.markers.ExtendedMarkersView;
import org.eclipse.ui.views.markers.MarkerSupportView;
import org.eclipse.ui.views.markers.internal.MarkerSupportRegistry;

public class ProblemMarkers{//extends MarkerSupportView {
	
	public IMarker[] markers;
	public int depth = IResource.DEPTH_INFINITE;
	public IWorkspaceRoot workspace = ResourcesPlugin.getWorkspace().getRoot(); 
	
	public ProblemMarkers(){
		//super(MarkerSupportRegistry.PROBLEMS_GENERATOR);
		
		try {
			markers = workspace.findMarkers(IMarker.PROBLEM, true, depth);
			System.out.println("found something...");
		} catch (CoreException e){
			e.printStackTrace();
			System.out.println("find markers FAIL");
		}
	}
}
