package medizin.client.a_nonroo.app.client.ui.user;

import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.PersonProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface UserDetailsView extends IsWidget {
    void setName(String helloName);

    void setPresenter(Presenter activityAcceptAnswer);
    void setDelegate(Delegate delegate);
    void setValue(PersonProxy proxy);
    public EventAccessViewImpl getEventAccessView();


    public interface Presenter {
        void goTo(Place place);
    }
    
	interface Delegate {
		void deleteClicked();

		void editClicked();
		

		void newClicked(String institutionName);
	}

	QuestionAccessViewImpl getQuestionAccessView();
}
