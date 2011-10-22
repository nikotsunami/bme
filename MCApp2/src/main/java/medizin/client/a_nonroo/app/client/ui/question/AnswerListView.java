package medizin.client.a_nonroo.app.client.ui.question;

import medizin.client.managed.request.QuestionAccessProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.managed.request.AnswerProxy;


import com.google.gwt.place.shared.Place;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.IsWidget;

public interface AnswerListView extends IsWidget {

    public interface Presenter {
        void goTo(Place place);
    }
	/**
	 * Implemented by the owner of the view.
	 */
	interface Delegate {
		void deleteAnswerClicked(AnswerProxy Answer);
		//void editAnswerClicked();
		void addNewAnswerClicked();

	}

    CellTable<AnswerProxy> getTable();
    String[] getPaths();
    
    void setDelegate(Delegate delegate);
    


}
