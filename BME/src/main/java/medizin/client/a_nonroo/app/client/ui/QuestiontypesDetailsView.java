package medizin.client.a_nonroo.app.client.ui;

import medizin.client.managed.request.QuestionTypeProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;


public interface QuestiontypesDetailsView extends IsWidget {
    void setName(String helloName);

    void setPresenter(Presenter activityAcceptAnswer);
    void setDelegate(Delegate delegate);
    void setValue(QuestionTypeProxy proxy);

    public interface Presenter {
        void goTo(Place place);
    }
    
	interface Delegate {
		void deleteClicked();

		void editClicked();
		

		void newClicked(String institutionName);

		void newClicked();
	}
}
