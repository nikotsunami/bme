package medizin.client.a_nonroo.app.client.ui.user;

import medizin.client.managed.request.QuestionAccessProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.QuestionProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.IsWidget;

public interface QuestionAccessView extends IsWidget {
    void setName(String helloName);

    void setPresenter(Presenter activityEvent);

    public interface Presenter {
        void goTo(Place place);
    }
	/**
	 * Implemented by the owner of the view.
	 */
	interface Delegate {
		void deleteQuestionAccessClicked(QuestionAccessProxy questionAccess);

		void addNewQuestionAccessClicked();
	}

    CellTable<QuestionAccessProxy> getTable();
    String[] getPaths();
    
    void setDelegate(Delegate delegate);
    


}
