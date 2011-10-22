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






import medizin.client.a_nonroo.app.place.PlaceInstitutionEvent;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import medizin.client.managed.request.InstitutionProxy;
import medizin.client.managed.request.QuestionEventProxy;

import medizin.client.managed.request.QuestionEventRequest;



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
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.Range;
import com.google.gwt.view.client.RangeChangeEvent;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.google.inject.Inject;

public class ActivityInstitutionEvent extends AbstractActivityWrapper implements EventView.Presenter, EventView.Delegate {

	private PlaceInstitutionEvent eventPlace;

	private AcceptsOneWidget widget;
	private EventView view;
	
	private SingleSelectionModel<QuestionEventProxy> selectionModel;


	private HandlerRegistration rangeChangeHandler;
	
	private final Map<EntityProxyId<QuestionEventProxy>, Integer> idToRow = new HashMap<EntityProxyId<QuestionEventProxy>, Integer>();
	private final Map<EntityProxyId<QuestionEventProxy>, QuestionEventProxy> idToProxy = new HashMap<EntityProxyId<QuestionEventProxy>, QuestionEventProxy>();
	private Boolean pendingSelection;
	private InstitutionProxy institution;
	

	private McAppRequestFactory requests;
	private PlaceController placeController;

	@Inject
	public ActivityInstitutionEvent(PlaceInstitutionEvent place,
			McAppRequestFactory requests, PlaceController placeController) {
		super(place, requests, placeController);
		this.eventPlace = place;
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
		EventView eventView = new EventViewImpl();
		eventView.setName("hallo");
		eventView.setPresenter(this);
		this.widget = widget;
		this.view = eventView;
        widget.setWidget(eventView.asWidget());
		setTable(view.getTable());
        
		eventBus.addHandler(PlaceChangeEvent.TYPE, new PlaceChangeEvent.Handler() {
			public void onPlaceChange(PlaceChangeEvent event) {
				//updateSelection(event.getNewPlace());
				// TODO implement
			}
		});
		//init();
		
		requests.find(eventPlace.getProxyId()).fire(new Receiver<Object>() {

			public void onFailure(ServerFailure error){
				Log.error(error.getMessage());
			}
			@Override
			public void onSuccess(Object response) {
				if(response instanceof InstitutionProxy){
					Log.info(((InstitutionProxy) response).getInstitutionName());
					init((InstitutionProxy) response);
				}

				
			}
		    });


		//Log.warn(mcAppFactory.getRequestFactory().getProxyId(eventPlace.getProxyId().toString()));
		
		// Inherit the view's key provider
		ProvidesKey<QuestionEventProxy> keyProvider = ((AbstractHasData<QuestionEventProxy>) table).getKeyProvider();
		selectionModel = new SingleSelectionModel<QuestionEventProxy>(keyProvider);
		table.setSelectionModel(selectionModel);

		selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
			public void onSelectionChange(SelectionChangeEvent event) {
				QuestionEventProxy selectedObject = selectionModel.getSelectedObject();
				if (selectedObject != null) {
					Log.debug(selectedObject.getEventName() + " selected!");
					showDetails(selectedObject);
				}
			}
		});
		
		view.setDelegate(this);
		//updateSelection(mcAppFactory.getPlaceController().getWhere());

	}
	
	protected void showDetails(QuestionEventProxy questionEvent) {
	//	Log.debug("QuestionEvent Stable id: " + questionEvent.stableId() + " " +  PlaceInstitutionEvent.Operation.DETAILS); 
	//	mcAppFactory.getPlaceController().goTo(new PlaceInstitutionEvent(questionEvent.stableId(), PlaceInstitutionEvent.Operation.DETAILS));
	}

	@Override
	public void goTo(Place place) {
		  placeController.goTo(place);
	}
	
    protected Request<java.util.List<medizin.client.managed.request.QuestionEventProxy>> createRangeRequest(Range range) {
        return requests.questionEventRequestNonRoo().findQuestionEventsByInstitutionNonRoo(institution.getId(), range.getStart(), range.getLength());
    }

    protected void fireCountRequest(Receiver<java.lang.Long> callback) {
    	requests.questionEventRequestNonRoo().countQuestionEventsByInstitutionNonRoo(institution.getId()).fire(callback);
    }
    
	private void init(InstitutionProxy institution) {

		this.institution = institution;
		
		fireCountRequest(new Receiver<Long>() {
			@Override
			public void onSuccess(Long response) {
				if (view == null) {
					// This activity is dead
					return;
				}
				Log.debug("Geholte Events aus der Datenbank: " + response);
				view.getTable().setRowCount(response.intValue(), true);

				onRangeChanged();
			}
		});
		
		
		
		rangeChangeHandler = table.addRangeChangeHandler(new RangeChangeEvent.Handler() {
			public void onRangeChange(RangeChangeEvent event) {
				ActivityInstitutionEvent.this.onRangeChanged();
			}
		});
	}
	
	private CellTable<QuestionEventProxy> table;
	
	public CellTable<QuestionEventProxy> getTable(){
		return table;
	}
	public void  setTable(CellTable<QuestionEventProxy> table){
		this.table = table;
	}

	protected void onRangeChanged() {
		
		Log.debug("Im ActivityInsitutionEvent.onRangeChanged");
		final Range range = table.getVisibleRange();

		final Receiver<List<QuestionEventProxy>> callback = new Receiver<List<QuestionEventProxy>>() {
			@Override
			public void onSuccess(List<QuestionEventProxy> values) {
				if (view == null) {
					// This activity is dead
					return;
				}
				idToRow.clear();
				idToProxy.clear();
				for (int i = 0, row = range.getStart(); i < values.size(); i++, row++) {
					QuestionEventProxy questionEvent = values.get(i);
					@SuppressWarnings("unchecked")
					// Why is this cast needed?
					EntityProxyId<QuestionEventProxy> proxyId = (EntityProxyId<QuestionEventProxy>) questionEvent.stableId();
					idToRow.put(proxyId, row);
					idToProxy.put(proxyId, questionEvent);
				}
				Log.debug("Im ActivityInsitutionEvent.onRangeChanged-before Table");
				table.setRowData(range.getStart(), values);
				Log.debug("Im ActivityInsitutionEvent.onRangeChanged-after Table");
				
				finishPendingSelection();
			if (widget != null) {
		          widget.setWidget(view.asWidget());
				}
			}
		};

		fireRangeRequest(range, callback);
		
	}
	
	private void getLastPage() {
		fireCountRequest(new Receiver<Long>() {
			@Override
			public void onSuccess(Long response) {
				if (view == null) {
					// This activity is dead
					return;
				}
				int rows = response.intValue();
				table.setRowCount(rows, true);
				if (rows > 0) {
					int pageSize = table.getVisibleRange().getLength();
					int remnant = rows % pageSize;
					if (remnant == 0) {
						table.setVisibleRange(rows - pageSize, pageSize);
					} else {
						table.setVisibleRange(rows - remnant, pageSize);
					}
				}
				onRangeChanged();
			}
		});
	}
	private void fireRangeRequest(final Range range,
            final Receiver<List<QuestionEventProxy>> callback) {
			createRangeRequest(range).with(view.getPaths()).fire(callback);
}
	
	/**
	 * Finish selecting a proxy that hadn't yet arrived when
	 * {@link #select(EntityProxyId)} was called.
	 */
	private void finishPendingSelection() {
		if (pendingSelection != null) {
			QuestionEventProxy selectMe = idToProxy.get(pendingSelection);
			pendingSelection = null;
			if (selectMe != null) {
				// TODO  make selection Model
				selectionModel.setSelected(selectMe, true);
			}
		}
	}

	@Override
	public void deleteClicked(QuestionEventProxy questionEvent) {
/*        if (!view.confirm("Really delete this entry? You cannot undo this change.")) {
            return;
        }
        requests.answerRequest().remove().using(view.getValue()).fire(new Receiver<Void>() {

            public void onSuccess(Void ignore) {
                if (display == null) {
                    return;
                }
                placeController.goTo(getBackButtonPlace());
            }
        });*/
		requests.questionEventRequest().remove().using(questionEvent).fire(new Receiver<Void>() {

            public void onSuccess(Void ignore) {
            	Log.debug("Sucessfull deleted");
            	init(institution);
            	
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
            
        });
		
	}

	@Override
	public void editClicked() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newClicked(String eventName) {
		Log.debug("new QuestionEvent Clicked: " + eventName);
		QuestionEventRequest request = requests.questionEventRequest();
		QuestionEventProxy questionEvent = request.create(QuestionEventProxy.class);
		questionEvent.setEventName(eventName);
		questionEvent.setInstitution(institution);
		questionEvent.setVersion(0);

		request.persist().using(questionEvent).fire(new Receiver<Void>() {

            public void onSuccess(Void ignore) {
            	Log.debug("Sucessfull created");
            	getLastPage();
            
            	
            }
			@Override
			public void onFailure(ServerFailure error) {
					Log.warn(McAppConstant.ERROR_WHILE_CREATE + " in QuestionEvent -" + error.getMessage());
					if(error.getMessage().contains("ConstraintViolationException")){
						Log.debug("Fehlen beim erstellen: Doppelter name");
						// TODO mcAppFactory.getErrorPanel().setErrorMessage(McAppConstant.CONTENT_NOT_UNIQUE);
					}
				
			}
			@Override
			public void onViolation(Set<Violation> errors) {
				Log.debug("Fehlen beim erstellen, volation: " + errors.toString());
				Iterator<Violation> iter = errors.iterator();
				String message = "";
				while(iter.hasNext()){
					message += iter.next().getMessage() + "<br>";
				}
				Log.warn(McAppConstant.ERROR_WHILE_CREATE_VIOLATION + " in QuestionEvent -" + message);
				
				ErrorPanel erorPanel = new ErrorPanel();
			        	  erorPanel.setWarnMessage(message);

				
			}
            
        });
	}
}
