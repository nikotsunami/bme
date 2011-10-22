package medizin.client.a_nonroo.app.client.ui.assignquestion;

import com.google.gwt.user.client.ui.IsWidget;

import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.AnswerToAssQuestionProxy;



public interface AnswerView extends IsWidget {


	   AnswerProxy getProxy();
	   
		/**
		 * Implemented by the owner of the view.
		 */
		interface Delegate {
			void twistieOpenClicked(AnswerView answerView);
			void addClicked();
		}

	    void setDelegate(Delegate delegate);
		//void setProxy(AnswerToAssQuestionProxy answerToAssQuestionProxy);
		void setProxy(AnswerToAssQuestionProxy answerToAssQuestionProxy, boolean addCheck);
		void setProxy(AnswerProxy answer, boolean addCheck);
		boolean getChecked();
		
	    
}
