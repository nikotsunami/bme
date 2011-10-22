package medizin.client.a_nonroo.app.activities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import medizin.client.a_nonroo.app.client.ui.QuestiontypesView;
import medizin.client.a_nonroo.app.client.ui.QuestiontypesViewImpl;
import medizin.client.a_nonroo.app.place.PlaceQuestiontypes;
import medizin.client.a_nonroo.app.place.PlaceQuestiontypesDetails;
import medizin.client.a_nonroo.app.place.PlaceUserDetails;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.QuestionTypeProxy;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.activity.shared.AbstractActivity;
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
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.Range;
import com.google.gwt.view.client.RangeChangeEvent;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.google.inject.Inject;

public class ActivityQuestiontypes extends AbstractActivityWrapper implements QuestiontypesView.Presenter, QuestiontypesView.Delegate {

	private PlaceQuestiontypes questiontypesPlace;

	private AcceptsOneWidget widget;
	private CellTable<QuestionTypeProxy> table;
	private ActivityManager activityManger;
	private ActivityQuestiontypesMapper activityQuestiontypesMapper;
	private QuestiontypesView view;
	private SingleSelectionModel<QuestionTypeProxy> selectionModel;
	private HandlerRegistration rangeChangeHandler;


	private McAppRequestFactory requests;
	private PlaceController placeController;

	@Inject	
	public ActivityQuestiontypes(PlaceQuestiontypes place,
			McAppRequestFactory requests, PlaceController placeController) {
		super(place, requests, placeController);
		this.questiontypesPlace = place;
        this.requests = requests;
        this.placeController = placeController;
		this.activityQuestiontypesMapper = new ActivityQuestiontypesMapper(requests, placeController);
		this.activityManger = new ActivityManager(activityQuestiontypesMapper,
				requests.getEventBus());
	}

	/**
	 * HashMaps where QuestionType-Objects and QuestionType-Ids are stored by the request
	 */
//	private final Map<EntityProxyId<QuestionTypeProxy>, Integer> idToRow = new HashMap<EntityProxyId<QuestionTypeProxy>, Integer>();
//	
//	private final Map<EntityProxyId<QuestionTypeProxy>, QuestionTypeProxy> idToProxy = new HashMap<EntityProxyId<QuestionTypeProxy>, QuestionTypeProxy>();
//	private Boolean pendingSelection;
	
	
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
		view.setDelegate(null);
		view = null;
		rangeChangeHandler.removeHandler();
		rangeChangeHandler = null;
	}
	private QuestionTypeProxy questionType;
		
//	public void  setTable(CellTable<QuestionTypeProxy> table){
//		this.table = table;
//	}
	
	@Override
	public void start(AcceptsOneWidget widget, EventBus eventBus) {
		super.start(widget, eventBus);

	}
	
	
	public void start2(AcceptsOneWidget widget, EventBus eventBus) {
		QuestiontypesView questiontypesView = new QuestiontypesViewImpl();
		questiontypesView.setPresenter(this);
		this.widget = widget;
		this.view = questiontypesView;
        widget.setWidget(questiontypesView.asWidget());
        this.table = view.getTable();
//        setTable(view.getTable());
        
		eventBus.addHandler(PlaceChangeEvent.TYPE,
				new PlaceChangeEvent.Handler() {
					public void onPlaceChange(PlaceChangeEvent event) {

						Place place = event.getNewPlace();
						if(place instanceof PlaceQuestiontypesDetails){
							init();
						}
						

						// updateSelection(event.getNewPlace());
						// TODO implement
					}
				});
		init();
        
		activityManger.setDisplay(view.getDetailsPanel());
		
		/**
		 * Wiring selectionModel with CellTable
		 */
		// Inherit the view's key provider
		ProvidesKey<QuestionTypeProxy> keyProvider = ((AbstractHasData<QuestionTypeProxy>) table).getKeyProvider();
		selectionModel = new SingleSelectionModel<QuestionTypeProxy>(keyProvider);
		table.setSelectionModel(selectionModel);

		selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {


			public void onSelectionChange(SelectionChangeEvent event) {
				QuestionTypeProxy selectedObject = selectionModel.getSelectedObject();
				if (selectedObject != null) {
					Log.debug(selectedObject.getQuestionTypeName() + " selected!");
					questionType = selectedObject;
					showDetails(selectedObject);
				}
			}
		});
		
		
		view.setDelegate(this);
        
        
	}//End start()
	
	

	@Override
	public void goTo(Place place) {
		  placeController.goTo(place);
	}
	
	/**
	 * Range-Requests for fetching QueryType-Objects and Counting all QueryType-Objects in Database
	 */
	
//	 protected Request<java.util.List<medizin.client.managed.request.QuestionTypeProxy>> createRangeRequest(Range range) {
//	        return requests.questionTypeRequest().findQuestionTypeEntries(range.getStart(), range.getLength());
//	    }

//	    protected void fireCountRequest(Receiver<Long> callback) {
//	    	requests.questionTypeRequest().countQuestionTypes().fire(callback);
//	    }
		private void init() {
			requests.questionTypeRequest().countQuestionTypes().fire(new Receiver<Long>() {
				@Override
				public void onSuccess(Long response) {
					if (view == null) {
						// This activity is dead
						return;
					}
					Log.debug("Geholte QuestionTypes (Fragetypen) aus der Datenbank: " + response);
					view.getTable().setRowCount(response.intValue(), true);
					onRangeChanged();
				}
			});
			
			
			if(rangeChangeHandler!=null){
				rangeChangeHandler.removeHandler();
				rangeChangeHandler = null;
			}
			
			rangeChangeHandler = table
			.addRangeChangeHandler(new RangeChangeEvent.Handler() {
				public void onRangeChange(RangeChangeEvent event) {
					ActivityQuestiontypes.this.onRangeChanged();
				}
			});
			
			
			
		}//End init()
	
		

		
//		public CellTable<QuestionTypeProxy> getTable(){
//			return table;
//		}

		
		/**
		 * @author adrian.alioski
		 * @param table
		 */
		protected void onRangeChanged() {
			final Range range = table.getVisibleRange();

//			final Receiver<List<QuestionTypeProxy>> callback = new Receiver<List<QuestionTypeProxy>>() {
//				@Override
//				public void onSuccess(List<QuestionTypeProxy> values) {
//					if (view == null) {
//						// This activity is dead
//						Log.debug("view ist null");
//						return;
//					}
//					idToRow.clear();
//					idToProxy.clear();
//					for (int i = 0, row = range.getStart(); i < values.size(); i++, row++) {
//						QuestionTypeProxy questionType = values.get(i);
//						Log.debug("FrageTypen mit ID und Namen: " + questionType.getId() + " " + questionType.getQuestionTypeName());
//						@SuppressWarnings("unchecked")
//						// Why is this cast needed?
//						EntityProxyId<QuestionTypeProxy> proxyId = (EntityProxyId<QuestionTypeProxy>) questionType.stableId();
//						idToRow.put(proxyId, row);
//						idToProxy.put(proxyId, questionType);
//					}
//					table.setRowData(range.getStart(), values);
//				
//					finishPendingSelection();
//				if (widget != null) {
//			          widget.setWidget(view.asWidget());
//					}
//				}
//			};
//
//			fireRangeRequest(range, callback);
			
			requests.questionTypeRequest().findQuestionTypeEntries(range.getStart(), range.getLength()).with(view.getPaths()).fire(new Receiver<List<QuestionTypeProxy>>() {
				@Override
				public void onSuccess(List<QuestionTypeProxy> values) {
					if (view == null) {
						// This activity is dead
						Log.debug("view ist null");
						return;
					}
					table.setRowData(range.getStart(), values);
				
				
				if (widget != null) {
			          widget.setWidget(view.asWidget());
					}
				}
			});
			
		}//End onRangeChanged
		
//		private void fireRangeRequest(final Range range,
//	            final Receiver<List<QuestionTypeProxy>> callback) {
//				createRangeRequest(range).with(view.getPaths()).fire(callback);
//				// TODO what makes getPaths?
//			//	Log.debug(((String[])view.getPaths().toArray()).toString());
//				}

		
		protected void showDetails(QuestionTypeProxy questiontype) {
			Log.debug("Questiontype Stable id: " + questiontype.stableId() + " "
					+ PlaceQuestiontypesDetails.Operation.DETAILS);
			placeController.goTo(
					new PlaceQuestiontypesDetails(questiontype.stableId()));
		}
		
		


		@Override
		public void newClicked() {

					Log.debug("New Clicked in Acitivity Qeustiontype");
					placeController.goTo(new PlaceQuestiontypesDetails(PlaceQuestiontypesDetails.Operation.CREATE));
				
		}
	
		






//		@Override
//		public void deleteClicked() {
//			requests.questionTypeRequest().remove().using(questionType).fire(new Receiver<Void>() {
//
//	            public void onSuccess(Void ignore) {
//	            	Log.debug("Sucessfull deleted");
//	            	init();
//	            	
//	            }
//	            @Override
//				public void onFailure(ServerFailure error) {
//						Log.warn(McAppConstant.ERROR_WHILE_DELETE + " in Institution -" + error.getMessage());
//						if(error.getMessage().contains("ConstraintViolationException")){
//							Log.debug("Fehlen beim erstellen: Doppelter name");
//							mcAppFactory.getErrorPanel().setErrorMessage(McAppConstant.INSTITUTION_IS_REFERENCED);
//						}
//					
//				}
//				@Override
//				public void onViolation(Set<Violation> errors) {
//					Iterator<Violation> iter = errors.iterator();
//					String message = "";
//					while(iter.hasNext()){
//						message += iter.next().getMessage() + "<br>";
//					}
//					Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION + " in Institution -" + message);
//					
//					mcAppFactory.getErrorPanel().setErrorMessage(message);
//
//					
//				}
//	            
//	        });
//			
//		}


}
