package medizin.client.a_nonroo.app.client.ui.assesment;

import java.util.Collection;

import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionAccessProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.QuestionSumPerPersonProxy;
import medizin.client.managed.request.QuestionSumPerPersonProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.requestfactory.client.RequestFactoryEditorDriver;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SimplePanel;

public interface QuestionSumPerPersonDialogbox extends IsWidget {
 

    void setPresenter(Presenter activityInstitution);
    void display();

    public interface Presenter {
        void goTo(Place place);
    }
	/**
	 * Implemented by the owner of the view.
	 */
	interface Delegate {
		void addQuestionSumPerPersonClicked();
		void cancelQuestionSumPerPersonClicked();
	}

 
    
    void setDelegate(Delegate delegate);

	RequestFactoryEditorDriver<QuestionSumPerPersonProxy, QuestionSumPerPersonDialogboxImpl> createEditorDriver();
	void setQuestionEventPickerValues(Collection<QuestionEventProxy> values);
	void setResponsiblePersonPickerValues(Collection<PersonProxy> values);

    

}
