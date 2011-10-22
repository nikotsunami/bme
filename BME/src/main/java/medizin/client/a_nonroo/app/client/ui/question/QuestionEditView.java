package medizin.client.a_nonroo.app.client.ui.question;

import java.util.Collection;


import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.KeywordProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.managed.request.McProxy;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionTypeProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.requestfactory.client.RequestFactoryEditorDriver;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;

public interface QuestionEditView extends IsWidget {
    void setName(String helloName);

    void setPresenter(Presenter activityQuestionEdit);
    void setDelegate(Delegate delegate);


    public interface Presenter {
        void goTo(Place place);
    }
    
	interface Delegate {
		void cancelClicked();



		void saveClicked(boolean generateNewQuestion);
		
	}

	RequestFactoryEditorDriver<QuestionProxy, QuestionEditViewImpl> createEditorDriver();

	void setRewiewerPickerValues(Collection<PersonProxy> values);

	void setQuestEventPickerValues(Collection<QuestionEventProxy> values);

	void setAutorPickerValues(Collection<PersonProxy> values);

	void setQuestionTypePickerValues(Collection<QuestionTypeProxy> values);



	void setMcsPickerValues(Collection<McProxy> values);



	void setRichPanelHTML(String html);

	

	String getRichtTextHTML();

	void setEditTitle(boolean edit);




}
