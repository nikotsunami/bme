package medizin.client.a_nonroo.app.client.ui.assignquestion;

import medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionPanel.Delegate;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.VerticalPanel;

public interface AssesmentQuestionPanel extends IsWidget {
    void setDelegate(Delegate delegate);
 
    
	interface Delegate {
		
	}

	void addAssesmentQuestion(AssesmentQuestionView question);

	void removeAll();

	VerticalPanel getAssesmentQuestionDisplayPanel();
}
