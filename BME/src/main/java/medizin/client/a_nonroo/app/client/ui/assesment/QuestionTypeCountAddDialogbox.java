package medizin.client.a_nonroo.app.client.ui.assesment;

import java.util.Collection;

import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionAccessProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.QuestionTypeCountPerExamProxy;
import medizin.client.managed.request.QuestionTypeProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.requestfactory.client.RequestFactoryEditorDriver;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SimplePanel;

public interface QuestionTypeCountAddDialogbox extends IsWidget {
 

    void setPresenter(Presenter activityInstitution);
    void display();

    public interface Presenter {
        void goTo(Place place);
    }
	/**
	 * Implemented by the owner of the view.
	 */
	interface Delegate {
		void addClicked();
		void cancelClicked();
	}

 
    
    void setDelegate(Delegate delegate);
	void setQuestionTypesAssignedPickerValues(Collection<QuestionTypeProxy> values);
	RequestFactoryEditorDriver<QuestionTypeCountPerExamProxy, QuestionTypeCountAddDialogboxImpl> createEditorDriver();

    

}
