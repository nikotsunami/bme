package medizin.client.a_nonroo.app.client.ui.assignquestion;

import medizin.client.a_nonroo.app.client.ui.assesment.AssesmentDetailsView.Delegate;
import medizin.client.a_nonroo.app.client.ui.assesment.AssesmentDetailsView.Presenter;
import medizin.client.managed.request.AssesmentProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface AddQuestionsTabPanel extends IsWidget {
	
    void setDelegate(Delegate delegate);
 
    
	interface Delegate {

		void tabQuestionClicked(int index);
	}


	int getActiveTab();


}
