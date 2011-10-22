package medizin.client.a_nonroo.app.client.ui.user;

import medizin.client.managed.request.PersonProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;

public interface UserView extends IsWidget {
 

    void setPresenter(Presenter activityInstitution);

    public interface Presenter {
        void goTo(Place place);
    }
	/**
	 * Implemented by the owner of the view.
	 */
	interface Delegate {
		
		void newClicked();
	}

    CellTable<PersonProxy> getTable();
    String[] getPaths();
    
    void setDelegate(Delegate delegate);
    
	SimplePanel getDetailsPanel();
	SplitLayoutPanel getSplitLayoutPanel();

}
