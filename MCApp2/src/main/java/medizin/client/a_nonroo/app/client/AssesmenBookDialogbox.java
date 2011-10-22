package medizin.client.a_nonroo.app.client;

import com.google.gwt.requestfactory.shared.EntityProxy;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import medizin.client.managed.request.QuestionProxy;
/**
 * dialog box shown for exporting an assesment book.
 * @author masterthesis
 *
 */
public interface AssesmenBookDialogbox extends IsWidget {
	public interface Delegate{
	    
	}

	VerticalPanel getExportPanel();


}
