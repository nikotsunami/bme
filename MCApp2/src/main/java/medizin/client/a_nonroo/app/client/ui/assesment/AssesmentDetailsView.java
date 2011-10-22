package medizin.client.a_nonroo.app.client.ui.assesment;

import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.PersonProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface AssesmentDetailsView extends IsWidget {
    void setName(String helloName);

    void setPresenter(Presenter activityAcceptAnswer);
    void setDelegate(Delegate delegate);
    void setValue(AssesmentProxy proxy);
   // public EventAccessViewImpl getEventAccessView();


    public interface Presenter {
        void goTo(Place place);
    }
    
	interface Delegate {
		void deleteClicked();

		void editClicked();
		

		void newClicked(String institutionName);
	}

	QuestionTypeCountViewImpl getQuestionTypeCountViewImpl();

	QuestionSumPerPersonViewImpl getQuestionSumPerPersonViewImpl();

	//QuestionAccessViewImpl getQuestionAccessView();
}
