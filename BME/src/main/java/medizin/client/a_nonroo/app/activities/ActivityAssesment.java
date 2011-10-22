package medizin.client.a_nonroo.app.activities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import medizin.client.a_nonroo.app.client.SlidingPanel;
import medizin.client.a_nonroo.app.client.ui.AcceptPersonView;
import medizin.client.a_nonroo.app.client.ui.AcceptPersonViewImpl;
import medizin.client.a_nonroo.app.client.ui.SystemOverviewView;
import medizin.client.a_nonroo.app.client.ui.SystemOverviewViewImpl;
import medizin.client.a_nonroo.app.client.ui.assesment.AssesmentView;
import medizin.client.a_nonroo.app.client.ui.assesment.AssesmentViewImpl;

import medizin.client.a_nonroo.app.place.PlaceAcceptPerson;
import medizin.client.a_nonroo.app.place.PlaceAssesment;
import medizin.client.a_nonroo.app.place.PlaceAssesmentDetails;
import medizin.client.a_nonroo.app.place.PlaceSystemOverview;
import medizin.client.a_nonroo.app.place.PlaceUserDetails;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.PersonProxy;


import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.user.cellview.client.AbstractHasData;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.Range;
import com.google.gwt.view.client.RangeChangeEvent;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.google.inject.Inject;

public class ActivityAssesment extends AbstractActivityWrapper implements AssesmentView.Presenter, AssesmentView.Delegate {

	private PlaceAssesment assesmentPlace;

	private AcceptsOneWidget widget;
	private AssesmentView view;

//	/**
//	 * HashMap where the AssementProxies are stored after request 
//	 */
//	private final Map<EntityProxyId<AssesmentProxy>, Integer> idToRow = new HashMap<EntityProxyId<AssesmentProxy>, Integer>();
//	
//	/**
//	 * HashMapt where the Assessment IDs are stored, that are returned by the request
//	 */
//	private final Map<EntityProxyId<AssesmentProxy>, AssesmentProxy> idToProxy = new HashMap<EntityProxyId<AssesmentProxy>, AssesmentProxy>();
//	private Boolean pendingSelection;
//	
	

	private McAppRequestFactory requests;
	private PlaceController placeController;

	private CellTable<AssesmentProxy> table;
	private ActivityManager activityManger;
	private ActivityAssesmentMapper activityAssesmentMapper;
	private SingleSelectionModel<AssesmentProxy> selectionModel;
	private HandlerRegistration rangeChangeHandler;

	@Inject
	public ActivityAssesment(PlaceAssesment place,
			McAppRequestFactory requests, PlaceController placeController) {
		super((Place)place, requests, placeController);
		this.assesmentPlace = place;
        this.requests = requests;
        this.placeController = placeController;
        
		this.activityAssesmentMapper = new ActivityAssesmentMapper(requests, placeController);
		this.activityManger = new ActivityManager(activityAssesmentMapper,
				requests.getEventBus());
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
	public void start2(AcceptsOneWidget panel, EventBus eventBus) {
		AssesmentView assesmentView = new AssesmentViewImpl();
		assesmentView.setName("hallo");
		assesmentView.setPresenter(this);
		this.widget = panel;
		this.view = assesmentView;
        widget.setWidget(assesmentView.asWidget());
        table=view.getTable();

        
        eventBus.addHandler(PlaceChangeEvent.TYPE, new PlaceChangeEvent.Handler() {
			public void onPlaceChange(PlaceChangeEvent event) {

				Place place = event.getNewPlace();
				if(place instanceof PlaceAssesmentDetails){
					init();
				}
			}
		});
		init();
		
		activityManger.setDisplay(view.getDetailsPanel());

		// Inherit the view's key provider
		ProvidesKey<AssesmentProxy> keyProvider = ((AbstractHasData<AssesmentProxy>) table)
				.getKeyProvider();
		selectionModel = new SingleSelectionModel<AssesmentProxy>(keyProvider);
		table.setSelectionModel(selectionModel);

		selectionModel
				.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
					public void onSelectionChange(SelectionChangeEvent event) {
						AssesmentProxy selectedObject = selectionModel
								.getSelectedObject();
						if (selectedObject != null) {
							Log.debug(selectedObject.getName()
									+ " selected!");
							showDetails(selectedObject);
						}
					}
				});

		view.setDelegate(this);
		
	}

	@Override
	public void goTo(Place place) {
		  placeController.goTo(place);
	}
	
	//Request fetching Assesment-objects
	 protected Request<java.util.List<medizin.client.managed.request.AssesmentProxy>> createRangeRequest(Range range) {
	        return requests.assesmentRequest().findAssesmentEntries(range.getStart(), range.getLength());
	    }

	    protected void fireCountRequest(Receiver<Long> callback) {
	    	requests.assesmentRequest().countAssesments().fire(callback);
	    }
	
	    
		private void init() {
			fireCountRequest(new Receiver<Long>() {
				@Override
				public void onSuccess(Long response) {
					if (view == null) {
						// This activity is dead
						return;
					}
					Log.debug("Geholte Assesments (Pr�fungen) aus der Datenbank: " + response);
					view.getTable().setRowCount(response.intValue(), true);
					onRangeChanged();
				}
			});
			
			rangeChangeHandler = table
			.addRangeChangeHandler(new RangeChangeEvent.Handler() {
				public void onRangeChange(RangeChangeEvent event) {
					ActivityAssesment.this.onRangeChanged();
				}
			});
		}   
	
		protected void onRangeChanged() {
			final Range range = table.getVisibleRange();

			final Receiver<List<AssesmentProxy>> callback = new Receiver<List<AssesmentProxy>>() {
				@Override
				public void onSuccess(List<AssesmentProxy> values) {
					if (view == null) {
						// This activity is dead
						Log.debug("view ist null");
						return;
					}
//					idToRow.clear();
//					idToProxy.clear();
//					for (int i = 0, row = range.getStart(); i < values.size(); i++, row++) {
//						AssesmentProxy assesment = values.get(i);
//						Log.debug("Pruefungen mit der ID und namen: " + assesment.getId() + " " + assesment.getName());
//						@SuppressWarnings("unchecked")
//						// Why is this cast needed?
//						EntityProxyId<AssesmentProxy> proxyId = (EntityProxyId<AssesmentProxy>) assesment.stableId();
////						idToRow.put(proxyId, row);
////						idToProxy.put(proxyId, assesment);
//					}
					table.setRowData(range.getStart(), values);
//					finishPendingSelection();
				if (widget != null) {
			          widget.setWidget(view.asWidget());
					}
				}
			};

			fireRangeRequest(range, callback);
			
		}
		private void fireRangeRequest(final Range range,
	            final Receiver<List<AssesmentProxy>> callback) {
				createRangeRequest(range).with(view.getPaths()).fire(callback);
				
				}
		
		protected void showDetails(AssesmentProxy assesement) {
			Log.debug("Assesement Stable id: " + assesement.stableId() + " "
					+ PlaceAssesmentDetails.Operation.DETAILS);
			placeController.goTo(
					new PlaceAssesmentDetails(assesement.stableId()));
		}

		@Override
		public void detailsClicked(PersonProxy person) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void newClicked() {
			placeController.goTo(new PlaceAssesmentDetails(PlaceAssesmentDetails.Operation.CREATE));
			
		}


		
//		/**
//		 * Finish selecting a proxy that hadn't yet arrived when
//		 * {@link #select(EntityProxyId)} was called.
//		 */
//		private void finishPendingSelection() {
//			if (pendingSelection != null) {
//				AssesmentProxy selectMe = idToProxy.get(pendingSelection);
//				pendingSelection = null;
//				if (selectMe != null) {
//					// TODO  make selection Model
//					//selectionModel.setSelected(selectMe, true);
//				}
//			}
//		}
}
