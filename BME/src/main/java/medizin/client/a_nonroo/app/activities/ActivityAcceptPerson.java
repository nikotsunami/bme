package medizin.client.a_nonroo.app.activities;

import medizin.client.a_nonroo.app.client.SlidingPanel;
import medizin.client.a_nonroo.app.client.ui.AcceptPersonView;
import medizin.client.a_nonroo.app.client.ui.AcceptPersonViewImpl;
import medizin.client.a_nonroo.app.client.ui.SystemOverviewView;
import medizin.client.a_nonroo.app.client.ui.SystemOverviewViewImpl;

import medizin.client.a_nonroo.app.place.PlaceAcceptPerson;
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

public class ActivityAcceptPerson extends AbstractActivityWrapper implements AcceptPersonView.Presenter {

	private PlaceAcceptPerson personPlace;
	private McAppRequestFactory requests;
	private PlaceController placeController;
	private AcceptsOneWidget widget;
	private AcceptPersonView view;


	@Inject
	public ActivityAcceptPerson(PlaceAcceptPerson place,
			McAppRequestFactory requests, PlaceController placeController) {
		super(place, requests, placeController);
		this.personPlace = place;
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
		AcceptPersonView acceptPersonOverview = new AcceptPersonViewImpl();
		acceptPersonOverview.setName("hallo");
		acceptPersonOverview.setPresenter(this);
		this.widget = widget;
		this.view = acceptPersonOverview;
        widget.setWidget(acceptPersonOverview.asWidget());

	}

	@Override
	public void goTo(Place place) {
		  placeController.goTo(place);

		
	}

}
