package medizin.client.a_nonroo.app.activities;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import medizin.client.a_nonroo.app.client.SlidingPanel;
import medizin.client.a_nonroo.app.client.ui.AcceptPersonView;
import medizin.client.a_nonroo.app.client.ui.AcceptPersonViewImpl;
import medizin.client.a_nonroo.app.client.ui.BookAssesmentView;
import medizin.client.a_nonroo.app.client.ui.BookAssesmentViewImpl;
import medizin.client.a_nonroo.app.client.ui.SystemOverviewView;
import medizin.client.a_nonroo.app.client.ui.SystemOverviewViewImpl;

import medizin.client.a_nonroo.app.place.PlaceAcceptPerson;
import medizin.client.a_nonroo.app.place.PlaceBookAssesment;
import medizin.client.a_nonroo.app.place.PlaceInstitution;
import medizin.client.a_nonroo.app.place.PlaceSystemOverview;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.AssesmentProxy;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.view.client.Range;
import com.google.inject.Inject;

public class ActivityBookAssesment extends AbstractActivityWrapper implements BookAssesmentView.Presenter {

	private PlaceBookAssesment bookAssesmentPlace;
	private AcceptsOneWidget widget;
	private BookAssesmentView view;

	//HashmMap for AssesmentProx
	private final Map<EntityProxyId<AssesmentProxy>, Integer> idToRow = new HashMap<EntityProxyId<AssesmentProxy>, Integer>();
	
	private final Map<EntityProxyId<AssesmentProxy>, AssesmentProxy> idToProxy = new HashMap<EntityProxyId<AssesmentProxy>, AssesmentProxy>();
	
	private Boolean pendingSelection;
	
	private ActivityManager activityManger;	
	private ActivityBookAssesmentMapper activityBookAssesmentMapper;
	private McAppRequestFactory requests;
	private PlaceController placeController;


	@Inject
	public ActivityBookAssesment(PlaceBookAssesment place,
			McAppRequestFactory requests, PlaceController placeController) {
		super(place, requests, placeController);
		this.bookAssesmentPlace = place;
        this.requests = requests;
        this.placeController = placeController;
		this.activityBookAssesmentMapper = new ActivityBookAssesmentMapper(requests,  placeController);
		this.activityManger = new ActivityManager(
				activityBookAssesmentMapper, requests.getEventBus());
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

		activityManger.setDisplay(null);
	}
	
	@Override
	public void start(AcceptsOneWidget widget, EventBus eventBus) {
		super.start(widget, eventBus);

	}

	@Override
	public void start2(AcceptsOneWidget widget, EventBus eventBus) {
		BookAssesmentView bookAssesmentView = new BookAssesmentViewImpl();
		bookAssesmentView.setPresenter(this);
		this.widget = widget;
		this.view = bookAssesmentView;
        widget.setWidget(bookAssesmentView.asWidget());
        
        
        eventBus.addHandler(PlaceChangeEvent.TYPE, new PlaceChangeEvent.Handler() {
			public void onPlaceChange(PlaceChangeEvent event) {
				//updateSelection(event.getNewPlace());
				// TODO implement
			}
		});
        /*
         * Start Loading tabs for Assements
         */
        activityManger.setDisplay(view.getDetailsPanel());
        init();
	}

	@Override
	public void goTo(Place place) {
		  placeController.goTo(place);
	}
	
	
		//Request fetching Assesment-objects
		protected Request<java.util.List<medizin.client.managed.request.AssesmentProxy>> createRangeRequest() {
	        return requests.assesmentRequestNonRoo().findActiveAssesments();
	    }

	    protected void fireCountRequest(Receiver<Long> callback) {
	    	requests.assesmentRequest().countAssesments().fire(callback);
	    }
	    
	    /**
	     * Init fires fireCountRequest @author adrian.alioski
	     * Returns number of Assesments(Pr�fungen) in database 
	     */
	    
		private void init() {
			onRangeChanged();
		}
		

		protected void onRangeChanged() {
			

			final Receiver<List<AssesmentProxy>> callback = new Receiver<List<AssesmentProxy>>() {
				@Override
				public void onSuccess(List<AssesmentProxy> values) {
					if (view == null) {
						// This activity is dead
						Log.debug("view ist null");
						return;
					}
					Iterator<AssesmentProxy> iterAssProxy = values.iterator();
					while(iterAssProxy.hasNext()){
						AssesmentProxy assProxy = iterAssProxy.next();
						view.createTab(assProxy.getName(), assProxy.stableId());
					}
					
					
				if (widget != null) {
			          widget.setWidget(view.asWidget());
					}
				}
			};

			fireGetRequest(callback);
			
		}
		/**End onRange Changed**/
		
		private void fireGetRequest( final Receiver<List<AssesmentProxy>> callback) {
				createRangeRequest().fire(callback);

				}
	
		
		/**
		 * Finish selecting a proxy that hadn't yet arrived when
		 * {@link #select(EntityProxyId)} was called.
		 */
		private void finishPendingSelection() {
			if (pendingSelection != null) {
				AssesmentProxy selectMe = idToProxy.get(pendingSelection);
				pendingSelection = null;
				if (selectMe != null) {
					// TODO  make selection Model
					//selectionModel.setSelected(selectMe, true);
				}
			}
		}
}
