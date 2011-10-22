package medizin.client.a_nonroo.app.activities;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import medizin.client.a_nonroo.app.client.ErrorPanel;
import medizin.client.a_nonroo.app.client.SlidingPanel;
import medizin.client.a_nonroo.app.client.McAppConstant;

import medizin.client.a_nonroo.app.client.ui.EventView;
import medizin.client.a_nonroo.app.client.ui.EventViewImpl;
import medizin.client.a_nonroo.app.client.ui.user.EventAccessDialogbox;
import medizin.client.a_nonroo.app.client.ui.user.EventAccessDialogboxImpl;
import medizin.client.a_nonroo.app.client.ui.user.EventAccessView;
import medizin.client.a_nonroo.app.client.ui.user.EventAccessViewImpl;
import medizin.client.a_nonroo.app.client.ui.user.QuestionAccessDialogbox;
import medizin.client.a_nonroo.app.client.ui.user.QuestionAccessDialogboxImpl;
import medizin.client.a_nonroo.app.client.ui.user.QuestionAccessView;
import medizin.client.a_nonroo.app.client.ui.user.UserDetailsView;
import medizin.client.a_nonroo.app.client.ui.user.UserDetailsViewImpl;






import medizin.client.a_nonroo.app.place.PlaceInstitutionEvent;
import medizin.client.a_nonroo.app.place.PlaceUser;
import medizin.client.a_nonroo.app.place.PlaceUserDetails;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import medizin.client.managed.request.InstitutionProxy;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.PersonRequest;
import medizin.client.managed.request.QuestionAccessProxy;
import medizin.client.managed.request.QuestionAccessRequest;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.QuestionProxy;

import medizin.client.managed.request.QuestionEventRequest;
import medizin.client.shared.AccessRights;



import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.ServerFailure;
import com.google.gwt.requestfactory.shared.Violation;
import com.google.gwt.user.cellview.client.AbstractHasData;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.Range;
import com.google.gwt.view.client.RangeChangeEvent;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.google.inject.Inject;
/**
 * Activity for Handling UserDetailsViews.
 * @author masterthesis
 *
 */
public class ActivityUserDetails extends AbstractActivityWrapper implements UserDetailsView.Presenter, UserDetailsView.Delegate,
		EventAccessView.Presenter, EventAccessView.Delegate, QuestionAccessView.Presenter, QuestionAccessView.Delegate,
		 EventAccessDialogbox.Presenter, EventAccessDialogbox.Delegate,  QuestionAccessDialogbox.Presenter, QuestionAccessDialogbox.Delegate{

	private PlaceUserDetails userPlace;

	private AcceptsOneWidget widget;
	private UserDetailsView view;

	private HandlerRegistration rangeChangeHandler;
	
	private PersonProxy person;
	

	private McAppRequestFactory requests;
	private PlaceController placeController;

//	private ActivityUserDetailsMapper activityUserDetailsMapper;

	private ActivityManager activityManger;

	@Inject
	public ActivityUserDetails(PlaceUserDetails place,
			McAppRequestFactory requests, PlaceController placeController) {
		super(place, requests, placeController);
		this.userPlace = place;
        this.requests = requests;
        this.placeController = placeController;
        
//		this.activityUserDetailsMapper = new ActivityUserDetailsMapper(requests, placeController);
//		this.activityManger = new ActivityManager(activityUserDetailsMapper,
//				requests.getEventBus());
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
	
	private UserDetailsView userDetailsView;



	/**
	 * Function is called from GWT-ActivityManager
	 * the View for user Details will be created an tables are filled with data
	 * calls @see medizin.client.a_nonroo.app.activities.ActivityUserDetails#init(PersonProxy) , 
	 * Overriden funtion from @see com.google.gwt.activity.shared.Activity
	 */
	
	@Override
	public void start(AcceptsOneWidget widget, EventBus eventBus) {
		super.start(widget, eventBus);

	}
	
	@Override
	public void start2(AcceptsOneWidget widget, EventBus eventBus) {
		userDetailsView = new UserDetailsViewImpl();
		userDetailsView.setName("hallo");
		userDetailsView.setPresenter(this);
		this.widget = widget;
		this.view = userDetailsView;
        widget.setWidget(userDetailsView.asWidget());
		//setTable(view.getTable());
        
		eventBus.addHandler(PlaceChangeEvent.TYPE, new PlaceChangeEvent.Handler() {
			public void onPlaceChange(PlaceChangeEvent event) {
				//updateSelection(event.getNewPlace());
				// TODO implement
			}
		});
		//init();
		
		view.setDelegate(this);
		
		requests.find(userPlace.getProxyId()).fire(new Receiver<Object>() {

			public void onFailure(ServerFailure error){
				Log.error(error.getMessage());
			}
			@Override
			public void onSuccess(Object response) {
				if(response instanceof PersonProxy){
					Log.info(((PersonProxy) response).getEmail());
					init((PersonProxy) response);
				}

				
			}
		    });

	}


	@Override
	public void goTo(Place place) {
		  placeController.goTo(place);
	}
    
	/**
	 * 
	 * @param PersonProxy person
	 */
	private void init(PersonProxy person) {

		this.person = person;
		Log.debug("Details für: "+person.getEmail());
		view.setValue(person);

		initEventAccess();
		initQuestionAccess();
		
	}
	
	private EventAccessView eventAccessView;

	private SingleSelectionModel<QuestionEventProxy> selectionModelEventAccess;

	private HandlerRegistration rangeEventAccessChangeHandler;
	
	
	private void initEventAccess() {
		this.eventAccessView = userDetailsView.getEventAccessView();
		this.questionEventTable = eventAccessView.getTable();
		eventAccessView.setPresenter(this);
		eventAccessView.setDelegate(this);
		
		if(rangeEventAccessChangeHandler!=null){
			rangeEventAccessChangeHandler.removeHandler();
			rangeEventAccessChangeHandler = null;
		}

		fireEventAccessCountRequest(new Receiver<Long>() {
			@Override
			public void onSuccess(Long response) {
				if (view == null) {
					// This activity is dead
					return;
				}
				Log.debug("Geholte Events aus der Datenbank: " + response);
				questionEventTable.setRowCount(response.intValue(), true);

				onRangeEventAccessChanged();
			}
		});
		
		
		
		rangeEventAccessChangeHandler = questionEventTable.addRangeChangeHandler(new RangeChangeEvent.Handler() {
			public void onRangeChange(RangeChangeEvent event) {
				ActivityUserDetails.this.onRangeEventAccessChanged();
			}
		});
	}
	
	protected void onRangeEventAccessChanged() {
		
		Log.debug("Im QuestionEvent.onRangeEventAccessChanged");
		final Range range = questionEventTable.getVisibleRange();

		final Receiver<List<QuestionAccessProxy>> callback = new Receiver<List<QuestionAccessProxy>>() {
			@Override
			public void onSuccess(List<QuestionAccessProxy> values) {
				if (view == null) {
					// This activity is dead
					return;
				}
//				idToRow.clear();
//				idToProxy.clear();
//				for (int i = 0, row = range.getStart(); i < values.size(); i++, row++) {
//					QuestionEventProxy questionEvent = values.get(i);
//					@SuppressWarnings("unchecked")
//					// Why is this cast needed?
//					EntityProxyId<QuestionEventProxy> proxyId = (EntityProxyId<QuestionEventProxy>) questionEvent.stableId();
//					idToRow.put(proxyId, row);
//					idToProxy.put(proxyId, questionEvent);
//				}
//				Log.debug("Im ActivityInsitutionEvent.onRangeChanged-before Table");
				questionEventTable.setRowData(range.getStart(), values);
//				Log.debug("Im ActivityInsitutionEvent.onRangeChanged-after Table");
				
//				finishPendingSelection();
//			if (widget != null) {
//		          widget.setWidget(view.asWidget());
//				}
			}
	           @Override
				public void onFailure(ServerFailure error) {
						Log.warn(McAppConstant.ERROR_WHILE_DELETE + " in Institution:Event -" + error.getMessage());
						if(error.getMessage().contains("ConstraintViolationException")){
							Log.debug("Fehlen beim erstellen: Doppelter name");
							// TODO mcAppFactory.getErrorPanel().setErrorMessage(McAppConstant.EVENT_IS_REFERENCED);
						}
						
					
				}
				@Override
				public void onViolation(Set<Violation> errors) {
					Iterator<Violation> iter = errors.iterator();
					String message = "";
					while(iter.hasNext()){
						message += iter.next().getMessage() + "<br>";
					}
					Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION + " in Event -" + message);
					
					ErrorPanel erorPanel = new ErrorPanel();
			        	  erorPanel.setWarnMessage(message);

					
				}
		};

		fireEventAccessRangeRequest(range, callback, null, null);
		
	}
	
	private void fireEventAccessRangeRequest(final Range range,
            final Receiver<List<QuestionAccessProxy>> callback, String proxyId, String eventName) {
			if(proxyId!=null){
				
				requests.find(requests.getProxyId(proxyId)).fire(new Receiver<Object>() {

					public void onFailure(ServerFailure error){
						Log.error(error.getMessage());
					}
					@Override
					public void onSuccess(Object response) {
						if(response instanceof InstitutionProxy){
							Log.info(((InstitutionProxy) response).getInstitutionName());
							
						}

						
					}
				    });
				
			}
			else{
				createEventAccessRangeRequest(range).fire(callback);
			}
			
}
    protected Request<java.util.List<medizin.client.managed.request.QuestionAccessProxy>> createEventAccessRangeRequest(Range range) {
        return requests.questionAccessRequestNonRoo().findQuestionEventAccessByPersonNonRooNonRoo(person.getId(), range.getStart(), range.getLength()).with("questionEvent");
    }

    protected void fireEventAccessCountRequest(Receiver<java.lang.Long> callback) {
    	requests.questionAccessRequestNonRoo().countQuestionEventAccessByPersonNonRoo(person.getId()).fire(callback);
    }

	private QuestionAccessView questionAccessView;

	private SingleSelectionModel<QuestionProxy> selectionModelQuestionAccess;

	private HandlerRegistration rangeQuestionAccessChangeHandler;

	private CellTable<QuestionAccessProxy> questionTable;
	
	private void initQuestionAccess() {
		this.questionAccessView = userDetailsView.getQuestionAccessView();
		this.questionTable = questionAccessView.getTable();
		questionAccessView.setPresenter(this);
		questionAccessView.setDelegate(this);
		
		if(rangeQuestionAccessChangeHandler!=null){
			rangeQuestionAccessChangeHandler.removeHandler();
			rangeQuestionAccessChangeHandler = null;
		}

		fireQuestionAccessCountRequest(new Receiver<Long>() {
			@Override
			public void onSuccess(Long response) {
				if (view == null) {
					// This activity is dead
					return;
				}
				Log.debug("Geholte Questions aus der Datenbank: " + response);
				questionTable.setRowCount(response.intValue(), true);

				onRangeQuestionAccessChanged();
			}
		});
		
		
		
		rangeQuestionAccessChangeHandler = questionTable.addRangeChangeHandler(new RangeChangeEvent.Handler() {
			public void onRangeChange(RangeChangeEvent event) {
				ActivityUserDetails.this.onRangeQuestionAccessChanged();
			}
		});
		
	}
	
	///////
	protected void onRangeQuestionAccessChanged() {
		
		final Range range = questionTable.getVisibleRange();

		final Receiver<List<QuestionAccessProxy>> callback = new Receiver<List<QuestionAccessProxy>>() {
			@Override
			public void onSuccess(List<QuestionAccessProxy> values) {
				if (view == null) {
					// This activity is dead
					return;
				}
				questionTable.setRowData(range.getStart(), values);

			}
	           @Override
				public void onFailure(ServerFailure error) {
						Log.warn(McAppConstant.ERROR_WHILE_DELETE + " in Institution:Event -" + error.getMessage());
						if(error.getMessage().contains("ConstraintViolationException")){
							Log.debug("Fehlen beim erstellen: Doppelter name");
							// TODO mcAppFactory.getErrorPanel().setErrorMessage(McAppConstant.EVENT_IS_REFERENCED);
						}
					
				}
				@Override
				public void onViolation(Set<Violation> errors) {
					Iterator<Violation> iter = errors.iterator();
					String message = "";
					while(iter.hasNext()){
						message += iter.next().getMessage() + "<br>";
					}
					Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION + " in Event -" + message);
					
					ErrorPanel erorPanel = new ErrorPanel();
			        	  erorPanel.setWarnMessage(message);

					
				}
		};

		fireQuestionAccessRangeRequest(range, callback);
		
	}
	
	private void fireQuestionAccessRangeRequest(final Range range,
            final Receiver<List<QuestionAccessProxy>> callback) {
			createQuestionAccessRangeRequest(range).fire(callback);
}
    protected Request<java.util.List<medizin.client.managed.request.QuestionAccessProxy>> createQuestionAccessRangeRequest(Range range) {
        return requests.questionAccessRequestNonRoo().findQuestionAccessQuestionByPersonNonRoo(person.getId(), range.getStart(), range.getLength()).with("question");
    }

    protected void fireQuestionAccessCountRequest(Receiver<java.lang.Long> callback) {
    	requests.questionAccessRequestNonRoo().countQuestionAccessQuestionByPersonNonRoo(person.getId()).fire(callback);
    }
    //////

	/**
	 * CellTable for EntitiesProxis of Type @see medizin.client.a_nonroo.app.request.QuestionAccessProxy
	 * This table is designed for showing acceses to questions oven question events
	 */
	private CellTable<QuestionAccessProxy> questionEventTable;







	/**
	 * Action when Button delete in @see medizin.client.a_nonroo.app.client.ui.user.UserDetailsViewImpl was clicked
	 * The selected person will be deleted, if isn't refenced by an other entity
	 * @see medizin.client.a_nonroo.app.client.ui.user.UserDetailsView.Delegate#deleteClicked()
	 */
	@Override
	public void deleteClicked() {

		requests.personRequest().remove().using(person).fire(new Receiver<Void>() {

            public void onSuccess(Void ignore) {
            	Log.debug("Sucessfull deleted");
            	placeController.goTo(new PlaceUser("PlaceUser!DELETED"));
            	
            }
            @Override
			public void onFailure(ServerFailure error) {
					Log.warn(McAppConstant.ERROR_WHILE_DELETE + " in Institution:Event -" + error.getMessage());
					if(error.getMessage().contains("ConstraintViolationException")){
						Log.debug("Fehlen beim erstellen: Doppelter name");
						//TODO mcAppFactory.getErrorPanel().setErrorMessage(McAppConstant.EVENT_IS_REFERENCED);
					}
				
			}
			@Override
			public void onViolation(Set<Violation> errors) {
				Iterator<Violation> iter = errors.iterator();
				String message = "";
				while(iter.hasNext()){
					message += iter.next().getMessage() + "<br>";
				}
				Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION + " in Event -" + message);
				
				//TODO mcAppFactory.getErrorPanel().setErrorMessage(message);

				
			}
            
        });
		
	}

	/**
	 * This method is fired when the user click the edit button in @see medizin.client.a_nonroo.app.client.ui.user.UserDetailsViewImpl
	 * The Person is edite in a new place @see medizin.client.a_nonroo.app.client.ui.user.UserEditViewImpl
	 * 
	 * Functionality implemented from @see medizin.client.a_nonroo.app.client.ui.user.UserDetailsView.Delegate#editClicked()
	 */
	@Override
	public void editClicked() {
		placeController.goTo(new PlaceUserDetails(person.stableId(), PlaceUserDetails.Operation.EDIT));
		
	}

	@Override
	public void newClicked(String institutionName) {
		placeController.goTo(new PlaceUserDetails(person.stableId(), PlaceUserDetails.Operation.CREATE));
		
	}

	@Override
	public void deleteEventAccessClicked(QuestionAccessProxy questionAccess) {
		
		requests.questionAccessRequest().remove()
		.using(questionAccess).fire(new Receiver<Void>() {

			public void onSuccess(Void ignore) {
				Log.debug("Sucessfull deleted");
				initEventAccess();
			}

			@Override
			public void onFailure(ServerFailure error) {
				Log.warn(McAppConstant.ERROR_WHILE_DELETE
						+ " in Institution -" + error.getMessage());
				if (error.getMessage().contains(
						"ConstraintViolationException")) {
					Log.debug("Fehlen beim erstellen: Doppelter name");
					//TODO mcAppFactory.getErrorPanel().setErrorMessage(cAppConstant.INSTITUTION_IS_REFERENCED);
				}

			}

			@Override
			public void onViolation(Set<Violation> errors) {
				Iterator<Violation> iter = errors.iterator();
				String message = "";
				while (iter.hasNext()) {
					message += iter.next().getMessage() + "<br>";
				}
				Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION
						+ " in Institution -" + message);
				
				//TODO mcAppFactory.getErrorPanel().setErrorMessage(message);

			}

		});
		
	}

	EventAccessDialogbox dialogBoxEvent;
	QuestionAccessDialogbox dialogBoxQuestion;
	
	ListBox institutionListbox;

	private CellTable<QuestionEventProxy> eventAccessTable;

	/**
	 * Range change Handler for the Question Accesses
	 */
	private HandlerRegistration rangeQuestionAccessAllChangeHandler;

	private QuestionEventProxy eventFilter;
	
	
	/* (non-Javadoc)
	 * @see medizin.client.a_nonroo.app.client.ui.user.EventAccessView.Delegate#addNewEventAccessClicked()
	 */
	@Override
	public void addNewEventAccessClicked() {
		institutionFilter=null;
		eventNameFilter="";
		dialogBoxEvent = new EventAccessDialogboxImpl();
		dialogBoxEvent.display();
		Log.info("addNewEventClicked");
		
		this.eventAccessTable = dialogBoxEvent.getTable();
		dialogBoxEvent.setPresenter(this);
		dialogBoxEvent.setDelegate(this);
		
		institutionListbox = dialogBoxEvent.getSearchInstitution();
		
		// Fill the Institution Box
		final Receiver<List<InstitutionProxy>> callback2 = new Receiver<List<InstitutionProxy>>() {
			@Override
			public void onSuccess(List<InstitutionProxy> values) {
				if (view == null) {
					// This activity is dead
					return;
				}
				
				Iterator<InstitutionProxy> iter = values.iterator();
				institutionListbox.addItem("", "");
				while(iter.hasNext()){
					InstitutionProxy institution = iter.next();
					institutionListbox.addItem(institution.getInstitutionName(), institution.stableId().toString());
				}
				
				//eventAccessTable.setRowData( values);

			}
	           @Override
				public void onFailure(ServerFailure error) {
						Log.warn(McAppConstant.ERROR_WHILE_DELETE + " in Institution:Event -" + error.getMessage());
						if(error.getMessage().contains("ConstraintViolationException")){
							Log.debug("Fehlen beim erstellen: Doppelter name");
							// TODO mcAppFactory.getErrorPanel().setErrorMessage(McAppConstant.EVENT_IS_REFERENCED);
						}
					
				}
				@Override
				public void onViolation(Set<Violation> errors) {
					Iterator<Violation> iter = errors.iterator();
					String message = "";
					while(iter.hasNext()){
						message += iter.next().getMessage() + "<br>";
					}
					Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION + " in Event -" + message);
					
					ErrorPanel erorPanel = new ErrorPanel();
			        	  erorPanel.setWarnMessage(message);

					
				}
		};

		fireRequestAllInstitution( callback2);

		initEventAccessDialogbox();
		rangeQuestionAccessAllChangeHandler = eventAccessTable.addRangeChangeHandler(new RangeChangeEvent.Handler() {
			public void onRangeChange(RangeChangeEvent event) {
				ActivityUserDetails.this.onRangeEventAccessByInstitutionOrEventnameChanged();
			}
		});
		
	}
	
	private void initEventAccessDialogbox() {
		fireQuestionAccessCountByInstitutionOrEventnameRequest(new Receiver<Long>() {
			@Override
			public void onSuccess(Long response) {
				if (view == null) {
					// This activity is dead
					return;
				}
				Log.debug("Geholte Events aus der Datenbank: " + response);
				eventAccessTable.setRowCount(response.intValue(), true);

				onRangeEventAccessByInstitutionOrEventnameChanged();
			}
		});
		
	
		
	}
	private Boolean filterQuestionText = true;
	private Boolean filterKeywords = false;
	
    protected void fireQuestionAccessCountByInstitutionOrEventOrQuestionNameOrKeywordRequest(Receiver<java.lang.Long> callback) {
    	
    	requests.questionRequestNonRoo().countQuestionByInstitutionOrEventOrQuestionNameOrKeyword(
    			institutionFilter==null? null:institutionFilter.getId(), eventFilter==null? null:eventFilter.getId(), 
    					questiuonStringFilter, filterQuestionText, filterKeywords).fire(callback);
    }
    
    protected void  fireQuestionAccessByInstitutionOrEventOrQuestionNameOrKeywordRequest(Range range, Receiver<List<QuestionProxy>> callback){
    	requests.questionRequestNonRoo().findQuestionByInstitutionOrEventOrQuestionNameOrKeyword(
    			institutionFilter==null? null:institutionFilter.getId(), eventFilter==null? null:eventFilter.getId(), 
    					questiuonStringFilter, filterQuestionText, filterKeywords, range.getStart(), range.getLength()).fire(callback);
    }
	
	private void initQuestionAccessDialogbox() {
		fireQuestionAccessCountByInstitutionOrEventOrQuestionNameOrKeywordRequest(new Receiver<Long>() {
			@Override
			public void onSuccess(Long response) {
				if (view == null) {
					// This activity is dead
					return;
				}
				Log.debug("Geholte Events aus der Datenbank: " + response);
				questionAccessTable.setRowCount(response.intValue(), true);

				onRangeQuestionAccessCountByInstitutionOrEventOrQuestionNameOrKeywordRequest();
			}
		});
		
	
		
	}
	
	protected void onRangeQuestionAccessCountByInstitutionOrEventOrQuestionNameOrKeywordRequest() {
		
		final Range range = questionAccessTable.getVisibleRange();

		final Receiver<List<QuestionProxy>> callback = new Receiver<List<QuestionProxy>>() {
			@Override
			public void onSuccess(List<QuestionProxy> values) {
				if (view == null) {
					// This activity is dead
					return;
				}
				questionAccessTable.setRowData(range.getStart(), values);

			}
	           @Override
				public void onFailure(ServerFailure error) {
						Log.warn(McAppConstant.ERROR_WHILE_DELETE + " in Institution:Event -" + error.getMessage());
						if(error.getMessage().contains("ConstraintViolationException")){
							Log.debug("Fehlen beim erstellen: Doppelter name");
							// TODO mcAppFactory.getErrorPanel().setErrorMessage(McAppConstant.EVENT_IS_REFERENCED);
						}
					
				}
				@Override
				public void onViolation(Set<Violation> errors) {
					Iterator<Violation> iter = errors.iterator();
					String message = "";
					while(iter.hasNext()){
						message += iter.next().getMessage() + "<br>";
					}
					Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION + " in Event -" + message);
					
					ErrorPanel erorPanel = new ErrorPanel();
			        	  erorPanel.setWarnMessage(message);

					
				}
		};

		fireQuestionAccessByInstitutionOrEventOrQuestionNameOrKeywordRequest(range, callback);
		
	}

	///////
	protected void onRangeEventAccessByInstitutionOrEventnameChanged() {
		
		final Range range = eventAccessTable.getVisibleRange();

		final Receiver<List<QuestionEventProxy>> callback = new Receiver<List<QuestionEventProxy>>() {
			@Override
			public void onSuccess(List<QuestionEventProxy> values) {
				if (view == null) {
					// This activity is dead
					return;
				}
				eventAccessTable.setRowData(range.getStart(), values);

			}
	           @Override
				public void onFailure(ServerFailure error) {
						Log.warn(McAppConstant.ERROR_WHILE_DELETE + " in Institution:Event -" + error.getMessage());
						if(error.getMessage().contains("ConstraintViolationException")){
							Log.debug("Fehlen beim erstellen: Doppelter name");
							// TODO mcAppFactory.getErrorPanel().setErrorMessage(McAppConstant.EVENT_IS_REFERENCED);
						}
					
				}
				@Override
				public void onViolation(Set<Violation> errors) {
					Iterator<Violation> iter = errors.iterator();
					String message = "";
					while(iter.hasNext()){
						message += iter.next().getMessage() + "<br>";
					}
					Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION + " in Event -" + message);
					
					ErrorPanel erorPanel = new ErrorPanel();
			        	  erorPanel.setWarnMessage(message);

					
				}
		};

		fireEventAccessByInstitutionOrEventnameRangeRequest(range, callback);
		
	}
	
	private void fireEventAccessByInstitutionOrEventnameRangeRequest(final Range range,
            final Receiver<List<QuestionEventProxy>> callback) {
			createEventAccessByInstitutionOrEventnameRangeRequest(range).fire(callback);
	}
    protected Request<java.util.List<medizin.client.managed.request.QuestionEventProxy>> createEventAccessByInstitutionOrEventnameRangeRequest(Range range) {
        return requests.questionEventRequestNonRoo().findQuestionEventsByInstitutionOrEvent( institutionFilter==null? null:institutionFilter.getId(), eventNameFilter, range.getStart(), range.getLength());
    }
    
    /**
     * Function for create a Request over all Instituions, is used for fill the ListBox for Filtering question event access
     * @return Request<List<InstitutionProxy>>
     */
    protected Request<java.util.List<medizin.client.managed.request.InstitutionProxy>> createRequestAllInstitutions() {
        return requests.institutionRequest().findAllInstitutions();
    }
    
    /**
     * Function for create a Request over all Eventss, is used for fill the ListBox for Filtering question event access
     * @return Request<List<InstitutionProxy>>
     */
    protected Request<java.util.List<medizin.client.managed.request.QuestionEventProxy>> createRequestAllEvents() {
        return requests.questionEventRequest().findAllQuestionEvents();
    }

    
	/**
	 * Function for fire a Request over all Instituions, is used for fill the ListBox for Filtering question event access
	 * @param final Receiver<List<InstitutionProxy>> callback
	 */
	private void fireRequestAllInstitution( final Receiver<List<InstitutionProxy>> callback) {
		createRequestAllInstitutions().fire(callback);
	}
	
	/**
	 * Function for fire a Request over all Events, is used for fill the ListBox for Filtering question access
	 * @param final Receiver<List<QuestionEventProxy>> callback
	 */
	private void fireRequestAllEvent( final Receiver<List<QuestionEventProxy>> callback) {
		createRequestAllEvents().fire(callback);
	}
	
	private String eventNameFilter = "";

	private String questiuonStringFilter;

	private ListBox eventListbox;

	private CellTable<QuestionProxy> questionAccessTable;
    protected void fireQuestionAccessCountByInstitutionOrEventnameRequest(Receiver<java.lang.Long> callback) {
    	
    	requests.questionEventRequestNonRoo().countQuestionEventsByInstitutionOrEvent(institutionFilter==null? null:institutionFilter.getId(), eventNameFilter).fire(callback);
    }
    //////

	@Override
	public void deleteQuestionAccessClicked(QuestionAccessProxy questionAccess) {
		requests.questionAccessRequest().remove()
		.using(questionAccess).fire(new Receiver<Void>() {

			public void onSuccess(Void ignore) {
				Log.debug("Sucessfull deleted");
				initQuestionAccess();
			}

			@Override
			public void onFailure(ServerFailure error) {
				Log.warn(McAppConstant.ERROR_WHILE_DELETE
						+ " in Institution -" + error.getMessage());
				if (error.getMessage().contains(
						"ConstraintViolationException")) {
					Log.debug("Fehlen beim erstellen: Doppelter name");
					//TODO mcAppFactory.getErrorPanel().setErrorMessage(cAppConstant.INSTITUTION_IS_REFERENCED);
				}

			}

			@Override
			public void onViolation(Set<Violation> errors) {
				Iterator<Violation> iter = errors.iterator();
				String message = "";
				while (iter.hasNext()) {
					message += iter.next().getMessage() + "<br>";
				}
				Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION
						+ " in Institution -" + message);
				
				//TODO mcAppFactory.getErrorPanel().setErrorMessage(message);

			}

		});
		
	
		
	}

	@Override
	public void addNewQuestionAccessClicked() {
		institutionFilter=null;
		questiuonStringFilter="";
		dialogBoxQuestion = new QuestionAccessDialogboxImpl();
		dialogBoxQuestion.display();
		Log.info("addNewQuestionClicked");
		
		this.questionAccessTable = dialogBoxQuestion.getTable();
		dialogBoxQuestion.setPresenter(this);
		dialogBoxQuestion.setDelegate(this);
		
		institutionListbox = dialogBoxQuestion.getSearchInstitution();
		eventListbox = dialogBoxQuestion.getSearchEvent();
		
		// Fill the Institution Box
		final Receiver<List<InstitutionProxy>> callback2 = new Receiver<List<InstitutionProxy>>() {
			@Override
			public void onSuccess(List<InstitutionProxy> values) {
				if (view == null) {
					// This activity is dead
					return;
				}
				
				Iterator<InstitutionProxy> iter = values.iterator();
				institutionListbox.addItem("", "");
				while(iter.hasNext()){
					InstitutionProxy institution = iter.next();
					institutionListbox.addItem(institution.getInstitutionName(), institution.stableId().toString());
				}
				
				//eventAccessTable.setRowData( values);

			}
	           @Override
				public void onFailure(ServerFailure error) {
						Log.warn(McAppConstant.ERROR_WHILE_DELETE + " in Institution:Event -" + error.getMessage());
						if(error.getMessage().contains("ConstraintViolationException")){
							Log.debug("Fehlen beim erstellen: Doppelter name");
							// TODO mcAppFactory.getErrorPanel().setErrorMessage(McAppConstant.EVENT_IS_REFERENCED);
						}
					
				}
				@Override
				public void onViolation(Set<Violation> errors) {
					Iterator<Violation> iter = errors.iterator();
					String message = "";
					while(iter.hasNext()){
						message += iter.next().getMessage() + "<br>";
					}
					Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION + " in Event -" + message);
					
					ErrorPanel erorPanel = new ErrorPanel();
			        	  erorPanel.setWarnMessage(message);

					
				}
		};

		fireRequestAllInstitution( callback2);
		
		// Fill the Event Box
		final Receiver<List<QuestionEventProxy>> callback3 = new Receiver<List<QuestionEventProxy>>() {
			@Override
			public void onSuccess(List<QuestionEventProxy> values) {
				if (view == null) {
					// This activity is dead
					return;
				}
				
				Iterator<QuestionEventProxy> iter = values.iterator();
				eventListbox.addItem("", "");
				while(iter.hasNext()){
					QuestionEventProxy questionEvent = iter.next();
					eventListbox.addItem(questionEvent.getEventName(), questionEvent.stableId().toString());
				}
				
				//eventAccessTable.setRowData( values);

			}
	           @Override
				public void onFailure(ServerFailure error) {
						Log.warn(McAppConstant.ERROR_WHILE_DELETE + " in Institution:Event -" + error.getMessage());
						if(error.getMessage().contains("ConstraintViolationException")){
							Log.debug("Fehlen beim erstellen: Doppelter name");
							// TODO mcAppFactory.getErrorPanel().setErrorMessage(McAppConstant.EVENT_IS_REFERENCED);
						}
					
				}
				@Override
				public void onViolation(Set<Violation> errors) {
					Iterator<Violation> iter = errors.iterator();
					String message = "";
					while(iter.hasNext()){
						message += iter.next().getMessage() + "<br>";
					}
					Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION + " in Event -" + message);
					
					ErrorPanel erorPanel = new ErrorPanel();
			        	  erorPanel.setWarnMessage(message);

					
				}
		};

		fireRequestAllEvent( callback3);

		initQuestionAccessDialogbox();
		rangeQuestionAccessAllChangeHandler = questionAccessTable.addRangeChangeHandler(new RangeChangeEvent.Handler() {
			public void onRangeChange(RangeChangeEvent event) {
				ActivityUserDetails.this.onRangeQuestionAccessCountByInstitutionOrEventOrQuestionNameOrKeywordRequest();
			}
		});
		
	}

	@Override
	public void addClicked(AccessRights rights, QuestionEventProxy questionEvent) {
		QuestionAccessRequest request = requests.questionAccessRequest();
		QuestionAccessProxy eventAccess = request.create(QuestionAccessProxy.class);

		request.persist().using(eventAccess);

		eventAccess.setAccRights(rights);
		eventAccess.setPerson(person);
		eventAccess.setQuestionEvent(questionEvent);
		eventAccess.setVersion(0);
		
		request.fire(new Receiver<Void>() {
			
	          @Override
	          public void onSuccess(Void response) {
	        	  Log.info("PersonSucesfullSaved");
	        	  
	        		initEventAccess();
	          //	goTo(new PlaceUser(person.stableId()));
	          }
	          
	          public void onFailure(ServerFailure error){
					Log.error(error.getMessage());
				}
	      }); 
		
		
	}

	private InstitutionProxy institutionFilter=null;
//	private InstitutionProxy institutionQuestionFilter=null;


	@Override
	public void filterInstitutionChanged(String value) {
		Log.info(value);
		if (value!=null&&!value.equals(""))
		{
			requests.find(requests.getProxyId(value)).fire(new Receiver<Object>() {
	
				
				public void onFailure(ServerFailure error){
					Log.error(error.getMessage());
				}
				@Override
				public void onSuccess(Object response) {
					if(response instanceof InstitutionProxy){
						Log.info(((InstitutionProxy) response).getInstitutionName());
						institutionFilter=(InstitutionProxy)response;
						initEventAccessDialogbox();
					}
	
					
				}
			    });
		}
		else {
			this.institutionFilter=null;
			initEventAccessDialogbox();
			
		}
	}
	
	@Override
	public void filterEventChanged(String value) {
		
		
		
		if (value!=null&&!value.equals(""))
		{
			Log.debug(value);
			this.eventNameFilter=value;
//			requests.find(requests.getProxyId(value)).fire(new Receiver<Object>() {
//	
//				
//				public void onFailure(ServerFailure error){
//					Log.error(error.getMessage());
//				}
//				@Override
//				public void onSuccess(Object response) {
//					if(response instanceof QuestionEventProxy){
//						Log.info(((QuestionEventProxy) response).getEventName());
//						eventFilter=(QuestionEventProxy)response;
//						initEventAccessDialogbox();
//					}
//	
//					
//				}
//			    });
		}
		else {
			this.eventNameFilter="";
			
			initEventAccessDialogbox();
			
		}
		
		initEventAccessDialogbox();
			
	
}
		
		@Override
		public void filterEventQuestionChanged(String value) {
			
			Log.debug(value);
			
			if (value!=null&&!value.equals(""))
			{
				requests.find(requests.getProxyId(value)).fire(new Receiver<Object>() {
		
					
					public void onFailure(ServerFailure error){
						Log.error(error.getMessage());
					}
					@Override
					public void onSuccess(Object response) {
						if(response instanceof QuestionEventProxy){
							Log.info(((QuestionEventProxy) response).getEventName());
							eventFilter=(QuestionEventProxy)response;
							initQuestionAccessDialogbox();
						}
		
						
					}
				    });
			}
			else {
				this.eventFilter=null;
				initQuestionAccessDialogbox();
				
			}
			
			initQuestionAccessDialogbox();
				
		
	}

		@Override
		public void addClicked(AccessRights rights, QuestionProxy question) {
			Log.debug("im add clicked");
			QuestionAccessRequest request = requests.questionAccessRequest();
			QuestionAccessProxy eventAccess = request.create(QuestionAccessProxy.class);

			request.persist().using(eventAccess);

			eventAccess.setAccRights(rights);
			eventAccess.setPerson(person);
			eventAccess.setQuestion(question);
			eventAccess.setVersion(0);
			
			request.fire(new Receiver<Void>() {
				
		          @Override
		          public void onSuccess(Void response) {
		        	  Log.info("eventAccessnSucesfullSaved");
		        	  
		        		initQuestionAccess();
		          //	goTo(new PlaceUser(person.stableId()));
		          }
		          
		          public void onFailure(ServerFailure error){
						Log.error(error.getMessage());
					}
		      }); 
		}
			public void filterQuestionChanged(String text) {
			questiuonStringFilter=text;
			initQuestionAccessDialogbox();
			
		}
			

		@Override
		public void filterInstitutionQuestionChanged(String value) {
			if (value!=null&&!value.equals(""))
			{
				requests.find(requests.getProxyId(value)).fire(new Receiver<Object>() {
		
					
					public void onFailure(ServerFailure error){
						Log.error(error.getMessage());
					}
					@Override
					public void onSuccess(Object response) {
						if(response instanceof InstitutionProxy){
							Log.info(((InstitutionProxy) response).getInstitutionName());
							institutionFilter=(InstitutionProxy)response;
							initQuestionAccessDialogbox();
						}
		
						
					}
				    });
			}
			else {
				this.institutionFilter=null;
				initQuestionAccessDialogbox();
				
			}
			
			initQuestionAccessDialogbox();
			
		}

		@Override
		public void filterSearchTextChanged(boolean value) {
			filterQuestionText=value;
			initQuestionAccessDialogbox();
			
		}

		@Override
		public void filterSearchKeywordChanged(boolean value) {
			filterKeywords=value;
			initQuestionAccessDialogbox();
			
		}






}
