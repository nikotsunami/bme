package medizin.client.a_nonroo.app.client.dnd3.ui;

import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;

import medizin.client.a_nonroo.app.client.dnd3.ui.AnswerView.Delegate;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.AnswerToAssQuestionProxy;
import medizin.client.shared.Validity;
/**
 * Inteface for view for answers  used for the drag and drop features of assessment book.
 *
 * @author masterthesis
 *
 */
public interface AnswerView extends IsWidget {

	
	public interface Delegate{

		public void answerDropped(EntityProxyId<?> answerId);
		
	}

	public void setDelegate(Delegate delegate);
	public void setProxy(AnswerProxy answer);
	public Label getLblAnswerText();
	public AnswerToAssQuestionProxy getAnswerToAssQueston();
	public void setAnswerToAssQueston(AnswerToAssQuestionProxy answerToAssQueston);


}
