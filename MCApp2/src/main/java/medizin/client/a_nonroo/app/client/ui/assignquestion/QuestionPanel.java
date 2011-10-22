package medizin.client.a_nonroo.app.client.ui.assignquestion;

import medizin.client.a_nonroo.app.client.ui.assesment.AssesmentDetailsView.Delegate;
import medizin.client.a_nonroo.app.client.ui.assesment.AssesmentDetailsView.Presenter;
import medizin.client.managed.request.AssesmentProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.VerticalPanel;

public interface QuestionPanel extends IsWidget {
	
    void setDelegate(Delegate delegate);
 
    
	interface Delegate {
		
	}

	void addQuestion(QuestionView question);

	void removeAll();

	VerticalPanel getQuestionDisplayPanel();

	void addAssesmentQuestion(AssesmentQuestionView assesmentQuestion);
}
