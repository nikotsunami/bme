package medizin.client.a_nonroo.app.client.ui.assesment;

import java.util.Collection;

import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.McProxy;
import medizin.client.managed.request.PersonProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.requestfactory.client.RequestFactoryEditorDriver;
import com.google.gwt.user.client.ui.IsWidget;

public interface AssesmentEditView extends IsWidget {
    void setName(String helloName);

    void setPresenter(Presenter activityAcceptAnswer);
    void setDelegate(Delegate delegate);


    public interface Presenter {
        void goTo(Place place);
    }
    
	interface Delegate {
		void cancelClicked();

		void saveClicked();
		
	}

	RequestFactoryEditorDriver<AssesmentProxy, AssesmentEditViewImpl> createEditorDriver();

	void setRepeForPickerValues(Collection<AssesmentProxy> values);

	void setMcPickerValues(Collection<McProxy> values);

	void setEditTitle(boolean edit);
}
