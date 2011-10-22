package medizin.client.a_nonroo.app.client.ui.assignquestion;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import medizin.client.managed.request.QuestionProxy;



public interface QuestionView extends IsWidget {
	
	   void setProxy(QuestionProxy question);
	   QuestionProxy getProxy();
	   
		/**
		 * Implemented by the owner of the view.
		 */
		interface Delegate {
			void twistieOpenQuestionClicked(QuestionView questionView);
			void addQuestionClicked();
		}

	    void setDelegate(Delegate delegate);
	    
	    void addAnswer(AnswerView answer);
	    void removeAnswer(AnswerView answer);
		Widget getDragControler();
		VerticalPanel getAnswerPanel();

}
