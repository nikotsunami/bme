package medizin.client.a_nonroo.app.client.ui.user;

import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionAccessProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.QuestionProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SimplePanel;

public interface QuestionAccessDialogbox extends IsWidget {
 

    void setPresenter(Presenter activityInstitution);
    void display();

    public interface Presenter {
        void goTo(Place place);
    }
	/**
	 * Implemented by the owner of the view.
	 */
	interface Delegate {
		void addClicked(medizin.client.shared.AccessRights rights, QuestionProxy questionEvent);

		void filterInstitutionQuestionChanged(String value);
		void filterEventQuestionChanged(String value);

		void filterQuestionChanged(String text);
		
		void filterSearchTextChanged(boolean value);
		void filterSearchKeywordChanged(boolean value);


	}

    CellTable<QuestionProxy> getTable();
    String[] getPaths();
    
    void setDelegate(Delegate delegate);
	ListBox getSearchInstitution();
	ListBox getSearchEvent();
    

}
