package medizin.client.a_nonroo.app.client.ui.assignquestion;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

import medizin.client.managed.request.AssesmentQuestionProxy;
import medizin.client.managed.request.QuestionProxy;



public interface AssesmentQuestionView extends IsWidget {
	
	   
	AssesmentQuestionProxy getProxy();
	   
		/**
		 * Implemented by the owner of the view.
		 */
		interface Delegate {
			void twistieOpenAssQuestionClicked(AssesmentQuestionView questionView, boolean isInAssement);
			void addAssQuestionClicked();
		}

	    void setDelegate(Delegate delegate);
	    
	    void addAnswer(AnswerView answer);
	    void removeAnswer(AnswerView answer);
		Widget getDragControler();


		void setProxy(AssesmentQuestionProxy assesmentQuestion,
				boolean dellOrAdd);

		void setOpen();

}
