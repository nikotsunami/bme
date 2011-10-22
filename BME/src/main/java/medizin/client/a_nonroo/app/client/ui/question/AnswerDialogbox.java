package medizin.client.a_nonroo.app.client.ui.question;

import java.util.Collection;

import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionAccessProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.shared.Validity;

import com.google.gwt.place.shared.Place;
import com.google.gwt.requestfactory.client.RequestFactoryEditorDriver;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SimplePanel;

public interface AnswerDialogbox extends IsWidget {
 


    void display();

    public interface Presenter {
        void goTo(Place place);
    }
	/**
	 * Implemented by the owner of the view.
	 */
	interface Delegate {
		void addAnswerClicked();
		void cancelAnswerClicked();
	}

 
    
    void setDelegate(Delegate delegate);

	RequestFactoryEditorDriver<AnswerProxy, AnswerDialogboxImpl> createEditorDriver();
	void setRewiewerPickerValues(Collection<PersonProxy> values);

	void setValidityPickerValues(Collection<Validity> values);

	void close();

	void setRichPanelHTML(String html);

	String getRichtTextHTML();
	

    

}
