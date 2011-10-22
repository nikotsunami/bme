package medizin.client.a_nonroo.app.client.ui.assesment;

import medizin.client.a_nonroo.app.client.ui.user.UserView.Delegate;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.PersonProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;

public interface AssesmentView extends IsWidget {
    void setName(String helloName);

    void setPresenter(Presenter activityAssesment);

    public interface Presenter {
        void goTo(Place place);
    }
    
	/**
	 * Implemented by the owner of the view.
	 */
	interface Delegate {
		void detailsClicked(PersonProxy person);
		void newClicked();
	}
    
    //Table for Assesments (Pr�fungshefter)
    CellTable<AssesmentProxy> getTable();
    
    String[] getPaths();
    
    void setDelegate(Delegate delegate);
    
	SimplePanel getDetailsPanel();
}
