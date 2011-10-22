package medizin.client.a_nonroo.app.client.ui;

import medizin.client.a_nonroo.app.client.ui.question.QuestionEditViewImpl;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.managed.request.QuestionTypeProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.requestfactory.client.RequestFactoryEditorDriver;
import com.google.gwt.user.client.ui.IsWidget;

public interface QuestiontypesEditView extends IsWidget {

    void setPresenter(Presenter activityAcceptAnswer);
    void setDelegate(Delegate delegate);
    void setValue(QuestionTypeProxy proxy);

    public interface Presenter {
        void goTo(Place place);
    }
    
	interface Delegate {
		void cancelClicked();

	//	void saveClicked(String questionTypeName, Boolean isWeil, Integer trueAnswers, Integer falseAnswers, Integer sumAnswers, Integer maxLetters);

		void saveClicked();


		
	}

	RequestFactoryEditorDriver<QuestionTypeProxy, QuestiontypesEditViewImpl> createEditorDriver();
	void setEditTitle(boolean edit);
}
