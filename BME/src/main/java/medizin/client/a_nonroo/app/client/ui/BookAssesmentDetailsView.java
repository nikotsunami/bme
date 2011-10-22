package medizin.client.a_nonroo.app.client.ui;

import medizin.client.a_nonroo.app.client.ui.BookAssesmentDetailsView.Delegate;
import medizin.client.managed.request.AssesmentProxy;

import com.google.gwt.place.shared.Place;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public interface BookAssesmentDetailsView extends IsWidget {
    
	
	public interface Delegate {

		void createAssementBook(boolean createAVesion);

	}


	void setName(String helloName);

    void setPresenter(Presenter activityBookAssesment);

    public interface Presenter {
        void goTo(Place place);
    }

	AbsolutePanel getWorkingArea();

	void reload(AssesmentProxy assesmentProxy);

	ScrollPanel getScrollContainer();

	void setDelegate(Delegate delegate);
	
	
    
}
