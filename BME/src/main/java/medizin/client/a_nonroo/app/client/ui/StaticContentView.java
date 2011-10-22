package medizin.client.a_nonroo.app.client.ui;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface StaticContentView extends IsWidget {
    void setName(String helloName);

    void setPresenter(Presenter activityStaticContent);

    public interface Presenter {
        void goTo(Place place);
    }

}
