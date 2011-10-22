package medizin.client.a_nonroo.app.client.dnd3.ui;

import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.VerticalPanel;


import medizin.client.managed.request.QuestionTypeCountPerExamProxy;
/**
 * Interface for draggable QuestionTypePerExam (Kombination von Fragetypen)
 * @author masterthesis
 *
 */
public interface QuestionTypeDNDView extends IsWidget {
	
	 void setDelegate(Delegate delegate);
	
	 public interface Delegate{

		 public void downInOrderClicked(QuestionTypeCountPerExamProxy proxy);

		 public void onUpInOrderClicked(QuestionTypeCountPerExamProxy proxyUp);

		

		
	}

	void setProxy(QuestionTypeCountPerExamProxy proxy);

	AbsolutePanel getQuestionsContainer();

	VerticalPanel getEventsContainer();

	AbsolutePanel getQuestionTypeContent();
	

	

}
