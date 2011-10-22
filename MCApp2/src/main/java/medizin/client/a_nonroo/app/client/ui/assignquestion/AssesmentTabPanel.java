package medizin.client.a_nonroo.app.client.ui.assignquestion;

import medizin.client.a_nonroo.app.client.ui.assesment.AssesmentDetailsView.Delegate;
import medizin.client.a_nonroo.app.client.ui.assesment.AssesmentDetailsView.Presenter;
import medizin.client.managed.request.AssesmentProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface AssesmentTabPanel extends IsWidget {
	
    void setDelegate(Delegate delegate);
    void addAssementTab(AssesmentProxy assesment);
 
    
	interface Delegate {

		void tabClicked(AssesmentProxy assesment);
	}


	AssesmentProxy getActiveTab();
	void setSelectedTab(int i);


}
