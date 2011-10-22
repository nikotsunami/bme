package medizin.client.a_nonroo.app.activities;

import medizin.client.a_nonroo.app.client.SlidingPanel;
import medizin.client.a_nonroo.app.client.ui.AcceptPersonView;
import medizin.client.a_nonroo.app.client.ui.AcceptPersonViewImpl;
import medizin.client.a_nonroo.app.client.ui.StaticContentView;
import medizin.client.a_nonroo.app.client.ui.StaticContentViewImpl;
import medizin.client.a_nonroo.app.client.ui.SystemOverviewView;
import medizin.client.a_nonroo.app.client.ui.SystemOverviewViewImpl;

import medizin.client.a_nonroo.app.place.PlaceAcceptPerson;
import medizin.client.a_nonroo.app.place.PlaceStaticContent;
import medizin.client.a_nonroo.app.place.PlaceSystemOverview;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;

public class ActivityStaticContent extends AbstractActivityWrapper implements StaticContentView.Presenter {

	private PlaceStaticContent staticContentPlace;

	private AcceptsOneWidget widget;
	private StaticContentView view;


	private McAppRequestFactory requests;
	private PlaceController placeController;

	@Inject
	public ActivityStaticContent(PlaceStaticContent place,
			McAppRequestFactory requests, PlaceController placeController) {
		super(place, requests, placeController);
		this.staticContentPlace = place;
        this.requests = requests;
        this.placeController = placeController;
	}

	@Override
	public String mayStop() {
		
		return null;
	}

	@Override
	public void onCancel() {
		onStop();

	}

	@Override
	public void onStop() {
//		((SlidingPanel)widget).remove(view.asWidget());


	}
	
	@Override
	public void start(AcceptsOneWidget widget, EventBus eventBus) {
		super.start(widget, eventBus);

	}

	@Override
	public void start2(AcceptsOneWidget widget, EventBus eventBus) {
		StaticContentView staticContentView = new StaticContentViewImpl();
		staticContentView.setName("hallo");
		staticContentView.setPresenter(this);
		this.widget = widget;
		this.view = staticContentView;
        widget.setWidget(staticContentView.asWidget());

	}

	@Override
	public void goTo(Place place) {
		  placeController.goTo(place);
	}

}
