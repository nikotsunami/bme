package medizin.client.a_nonroo.app.client.dnd3.ui;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.VerticalPanel;

import medizin.client.a_nonroo.app.client.dnd3.ui.AnswerView.Delegate;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.AssesmentQuestionProxy;
import medizin.client.managed.request.QuestionProxy;
/**
 * Interface for a draggable question
 * @author masterthesis
 *
 */
public interface QuestionView extends IsWidget {
	

	
	public interface Delegate{

		public void questionDropped(EntityProxyId<?> questionId);

		public void twistieOpenQuestionClicked(ClickHandler clickHandler);
		
	}

	VerticalPanel getPanel();
	Integer getOrderAversion();
	

	void setDelegate(Delegate delegate);
	void setVerticalPanel(VerticalPanel vertPanel);
	void setOrderAversion(Integer orderAversion);
	void setQuestionProxy(AssesmentQuestionProxy questionProxy);
	AssesmentQuestionProxy getQuestionProxy();
	

}
