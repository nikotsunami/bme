package medizin.client.a_nonroo.app.activities;

import java.util.Iterator;
import java.util.List;

import medizin.client.a_nonroo.app.client.SlidingPanel;
import medizin.client.a_nonroo.app.client.ui.SystemOverviewView;
import medizin.client.a_nonroo.app.client.ui.SystemOverviewViewImpl;

import medizin.client.a_nonroo.app.place.PlaceSystemOverview;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.McProxy;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.inject.Inject;

public class ActivitySystemOverview extends AbstractActivityWrapper implements SystemOverviewView.Presenter, SystemOverviewView.Delegate {

	private PlaceSystemOverview overviewPlace;

	private AcceptsOneWidget widget;


	private McAppRequestFactory requests;
	private PlaceController placeController;


	@Inject
	public ActivitySystemOverview(PlaceSystemOverview place,
			McAppRequestFactory requests, PlaceController placeController) {
		super(place, requests, placeController);
		Log.debug("ActivitySystemOverview.Konstruktor");
		this.overviewPlace = place;
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
	
//		((SimplePanel)widget).clear();

	}
	
	@Override
	public void start(AcceptsOneWidget widget, EventBus eventBus) {
		super.start(widget, eventBus);

	}

	@Override
	public void start2(AcceptsOneWidget widget, EventBus eventBus) {
		Log.debug("ActivitySystemOverview.Start");
		SystemOverviewView systemOverview = new SystemOverviewViewImpl();
        systemOverview.setName("hallo");
        systemOverview.setPresenter(this);
        systemOverview.setDelegate(this);
        this.widget = widget;
        widget.setWidget(systemOverview.asWidget());
		Log.debug("ActivitySystemOverview.Started");

	}

	@Override
	public void goTo(Place place) {
		 placeController.goTo(place);

		
	}

	@Override
	public void buttonClicked() {
		requests.systemOverviewRequestNonRoo().getAllMcs().fire(new Receiver<List<McProxy>>(){

			@Override
			public void onSuccess(List<McProxy> response) {
				Iterator<McProxy> iter = response.iterator();
				while(iter.hasNext()){
					Log.info(iter.next().getMcName());
				}
				
			}
			
		});
		
	}

}
