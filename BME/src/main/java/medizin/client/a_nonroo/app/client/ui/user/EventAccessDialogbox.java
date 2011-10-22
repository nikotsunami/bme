package medizin.client.a_nonroo.app.client.ui.user;

import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionAccessProxy;
import medizin.client.managed.request.QuestionEventProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SimplePanel;

public interface EventAccessDialogbox extends IsWidget {
 

    void setPresenter(Presenter activityInstitution);
    void display();

    public interface Presenter {
        void goTo(Place place);
    }
	/**
	 * Implemented by the owner of the view.
	 */
	interface Delegate {
		void addClicked(medizin.client.shared.AccessRights rights, QuestionEventProxy questionEvent);

		void filterInstitutionChanged(String value);
		void filterEventChanged(String value);


	}

    CellTable<QuestionEventProxy> getTable();
    String[] getPaths();
    
    void setDelegate(Delegate delegate);
	ListBox getSearchInstitution();
    

}
