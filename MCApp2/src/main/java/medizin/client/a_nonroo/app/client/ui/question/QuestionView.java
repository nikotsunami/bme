package medizin.client.a_nonroo.app.client.ui.question;

import medizin.client.managed.request.QuestionProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;

public interface QuestionView extends IsWidget {
    void setName(String helloName);

    void setPresenter(Presenter activityQuestion);

    public interface Presenter {
        void goTo(Place place);
    }
    
    /**
	 * Implemented by the owner of the view.
	 */
	interface Delegate {
		void newClicked();
	}
    
    //Table for Assesments (Pr�fungshefter)
    CellTable<QuestionProxy> getTable();
    
    String[] getPaths();
    
    void setDelegate(Delegate delegate);
    
	SimplePanel getDetailsPanel();

}
