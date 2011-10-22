package medizin.client.a_nonroo.app.client.ui;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface OpenDemandView extends IsWidget {
    void setName(String helloName);

    void setPresenter(Presenter activityOpenDemand);

    public interface Presenter {
        void goTo(Place place);
    }

}
