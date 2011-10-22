package medizin.client.a_nonroo.app.client.dnd3.ui;



import medizin.client.managed.request.QuestionEventProxy;

import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.VerticalPanel;
/**
 * Inteface for a draggable event.
 * @author masterthesis
 *
 */
public interface EventView extends IsWidget {
	
	
	
	public interface Delegate{

		public void questionDropped(EntityProxyId<?> questionId);
		
	}

	
	void setDelegate(Delegate delegate);
	void setVerticalPanel(VerticalPanel vertPanel);
	void setEventProxy(QuestionEventProxy eventProxy);


}
