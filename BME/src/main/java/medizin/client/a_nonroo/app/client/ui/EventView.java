package medizin.client.a_nonroo.app.client.ui;

import medizin.client.managed.request.QuestionEventProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.IsWidget;

public interface EventView extends IsWidget {
    void setName(String helloName);

    void setPresenter(Presenter activityEvent);

    public interface Presenter {
        void goTo(Place place);
    }
	/**
	 * Implemented by the owner of the view.
	 */
	interface Delegate {
		void deleteClicked(QuestionEventProxy event);

		void editClicked();
		

		void newClicked(String eventName);
	}

    CellTable<QuestionEventProxy> getTable();
    String[] getPaths();
    
    void setDelegate(Delegate delegate);
    


}
