package medizin.client.a_nonroo.app.client.ui.question;

import medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonViewImpl;
import medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountViewImpl;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface QuestionDetailsView extends IsWidget {
    void setName(String helloName);

    void setPresenter(Presenter activityQuestionDetails);
    void setDelegate(Delegate delegate);
    void setValue(QuestionProxy proxy);
   // public EventAccessViewImpl getEventAccessView();


    public interface Presenter {
        void goTo(Place place);
    }
    
	interface Delegate {
		void deleteClicked();

		void editClicked();
		

		void newClicked();
	}

	AnswerListViewImpl getAnswerListViewImpl();

	

}
