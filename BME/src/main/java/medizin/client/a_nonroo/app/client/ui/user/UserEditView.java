package medizin.client.a_nonroo.app.client.ui.user;

import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.PersonProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.requestfactory.client.RequestFactoryEditorDriver;
import com.google.gwt.user.client.ui.IsWidget;

public interface UserEditView extends IsWidget {

    void setDelegate(Delegate delegate);
    void setEditTitle(boolean edit);


    public interface Presenter {
        void goTo(Place place);
    }
    
	interface Delegate {
		void cancelClicked();

		void saveClicked();
		
	}

	RequestFactoryEditorDriver<PersonProxy, UserEditViewImpl> createEditorDriver();
}
