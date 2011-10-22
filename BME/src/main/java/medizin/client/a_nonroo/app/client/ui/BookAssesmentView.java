package medizin.client.a_nonroo.app.client.ui;

import com.google.gwt.place.shared.Place;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;

public interface BookAssesmentView extends IsWidget {
    void setName(String helloName);
    void setPresenter(Presenter activityBookAssesment);

    public interface Presenter {
        void goTo(Place place);
    }


	public void createTab(String name, EntityProxyId<?> stableId);
	public AcceptsOneWidget getDetailsPanel();
    
}
