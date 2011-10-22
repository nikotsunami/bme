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

import medizin.client.a_nonroo.app.client.ui.assesment.AssesmentDetailsView;
import medizin.client.a_nonroo.app.client.ui.assesment.AssesmentDetailsViewImpl;
import medizin.client.a_nonroo.app.client.ui.assesment.AssesmentEditViewImpl;
import medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonDialogbox;
import medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonDialogboxImpl;
import medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonView;
import medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonViewImpl;
import medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountAddDialogbox;
import medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountAddDialogboxImpl;
import medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountView;
import medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountViewImpl;
import medizin.client.a_nonroo.app.client.ui.user.EventAccessDialogboxImpl;






import medizin.client.a_nonroo.app.place.PlaceInstitutionEvent;
import medizin.client.a_nonroo.app.place.PlaceAssesment;
import medizin.client.a_nonroo.app.place.PlaceAssesmentDetails;
import medizin.client.a_nonroo.app.place.PlaceUser;
import medizin.client.a_nonroo.app.place.PlaceUserDetails;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import medizin.client.managed.request.InstitutionProxy;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.AssesmentRequest;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionAccessProxy;
import medizin.client.managed.request.QuestionAccessRequest;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.managed.request.QuestionSumPerPersonProxy;
import medizin.client.managed.request.QuestionSumPerPersonRequest;
import medizin.client.managed.request.QuestionTypeCountPerExamProxy;
import medizin.client.managed.request.QuestionTypeCountPerExamRequest;
import medizin.client.managed.request.QuestionTypeProxy;

import medizin.client.managed.request.QuestionEventRequest;
import medizin.client.shared.AccessRights;
import medizin.shared.scaffold.QuestionTypeCountPerExamRequestNonRoo;



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
import com.google.gwt.requestfactory.client.RequestFactoryEditorDriver;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.ServerFailure;
import com.google.gwt.requestfactory.shared.Violation;

import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.Range;
import com.google.gwt.view.client.RangeChangeEvent;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.google.inject.Inject;
/**
 * Activity for Handling AssesementDetailsViews
 * @author masterthesis
 *
 */
public class ActivityAssesmentDetails extends AbstractActivityWrapper implements 
	AssesmentDetailsView.Presenter, AssesmentDetailsView.Delegate, 
	QuestionTypeCountView.Presenter, QuestionTypeCountView.Delegate,
	QuestionTypeCountAddDialogbox.Presenter, QuestionTypeCountAddDialogbox.Delegate,
	QuestionSumPerPersonView.Presenter, QuestionSumPerPersonView.Delegate,
	QuestionSumPerPersonDialogbox.Presenter, QuestionSumPerPersonDialogbox.Delegate{

	private PlaceAssesmentDetails assesmentPlace;

	private AcceptsOneWidget widget;
	private AssesmentDetailsView view;

	private HandlerRegistration rangeChangeHandler;
	
	private AssesmentProxy assesment;
	

	private McAppRequestFactory requests;
	private PlaceController placeController;



	@Inject
	public ActivityAssesmentDetails(PlaceAssesmentDetails place,
			McAppRequestFactory requests, PlaceController placeController) {
		super(place, requests, placeController);
		this.assesmentPlace = place;
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
	
	private AssesmentDetailsView assesmentDetailsView;

	/**
	 * Function is called from GWT-ActivityManager
	 * the View for assesment Details will be created an tables are filled with data
	 * calls @see medizin.client.a_nonroo.app.activities.ActivityAssesmentDetails#init(AssesmentProxy) , 
	 * Overriden funtion from @see com.google.gwt.activity.shared.Activity
	 */
	@Override
	public void start(AcceptsOneWidget widget, EventBus eventBus) {
		super.start(widget, eventBus);

	}
	


	@Override
	public void start2(AcceptsOneWidget widget, EventBus eventBus) {
		assesmentDetailsView = new AssesmentDetailsViewImpl();
		assesmentDetailsView.setName("hallo");
		assesmentDetailsView.setPresenter(this);
		this.widget = widget;
		this.view = assesmentDetailsView;
        widget.setWidget(assesmentDetailsView.asWidget());
		//setTable(view.getTable());
        
		eventBus.addHandler(PlaceChangeEvent.TYPE, new PlaceChangeEvent.Handler() {
			public void onPlaceChange(PlaceChangeEvent event) {
				//updateSelection(event.getNewPlace());
				// TODO implement
			}
		});
		//init();
		
		view.setDelegate(this);
		
		requests.find(assesmentPlace.getProxyId()).with("repeFor","mc").fire(new Receiver<Object>() {

			public void onFailure(ServerFailure error){
				Log.error(error.getMessage());
			}
			@Override
			public void onSuccess(Object response) {
				if(response instanceof AssesmentProxy){
					Log.info(((AssesmentProxy) response).getName());
					init((AssesmentProxy) response);
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
	 * @param AssesmentProxy assesment
	 */
	private void init(AssesmentProxy assesment) {

		this.assesment = assesment;
		Log.debug("Details für: "+assesment.getName());
		view.setValue(assesment);

		initQuestionTypeCount();
		initQuestionSumPerPerson();
		
	}

	private QuestionTypeCountView questionTypeCountView;

	private CellTable<QuestionTypeCountPerExamProxy> questionTypeCountTable;

	private HandlerRegistration rangeQuestionTypeCountChangeHandler;

	private QuestionSumPerPersonView questionSumPerPersonView;

	private CellTable<QuestionSumPerPersonProxy> questionSumPerPersonTable;

	private void initQuestionTypeCount() {
		questionTypeCountView = assesmentDetailsView.getQuestionTypeCountViewImpl();
		Log.debug("getTable");
		this.questionTypeCountTable = questionTypeCountView.getTable();
		Log.debug("setPresenter");
		questionTypeCountView.setPresenter(this);
		questionTypeCountView.setDelegate(this);
		Log.debug("request");
		fireQuestionTypeCountCountRequest(new Receiver<Long>() {
			@Override
			public void onSuccess(Long response) {
				if (view == null) {
					// This activity is dead
					return;
				}
				Log.debug("Geholte QuestionTypeCount aus der Datenbank: " + response);
				questionTypeCountTable.setRowCount(response.intValue(), true);

				onQuestionTypeCountChanged();
			}

			
		});
		
		
		
		
		
		rangeQuestionTypeCountChangeHandler = questionTypeCountTable.addRangeChangeHandler(new RangeChangeEvent.Handler() {
			public void onRangeChange(RangeChangeEvent event) {
				ActivityAssesmentDetails.this.onQuestionTypeCountChanged();
			}
		});
	}
	
	private void initQuestionSumPerPerson() {
		questionSumPerPersonView = assesmentDetailsView.getQuestionSumPerPersonViewImpl();
		
		this.questionSumPerPersonTable = questionSumPerPersonView.getTable();
		Log.debug("setPresenter");
		questionSumPerPersonView.setPresenter(this);
		questionSumPerPersonView.setDelegate(this);
		
		fireQuestionSumPerPersonCountRequest(new Receiver<Long>() {
			@Override
			public void onSuccess(Long response) {
				if (view == null) {
					// This activity is dead
					return;
				}
				Log.debug("Geholte QuestionSumPerPerson aus der Datenbank: " + response);
				questionSumPerPersonTable.setRowCount(response.intValue(), true);

				onQuestionSumPerPersonChanged();
			}

			
		});
		

		questionTypeCountTable.addRangeChangeHandler(new RangeChangeEvent.Handler() {
			public void onRangeChange(RangeChangeEvent event) {
				ActivityAssesmentDetails.this.onQuestionSumPerPersonChanged();
			}
		});
	}
	
    protected void fireQuestionTypeCountCountRequest(Receiver<java.lang.Long> callback) {
    	requests.questionTypeCountPerExamRequestNonRoo().countQuestionTypeCountByAssesmentNonRoo(assesment.getId()).fire(callback);
    }
    
    protected void 	fireQuestionSumPerPersonCountRequest(Receiver<java.lang.Long> callback) {
    	requests.questionSumPerPersonRequestNonRoo().countQuestionSumPerPersonByAssesmentNonRoo(assesment.getId()).fire(callback);
    }
    
    private int sort_order;
    
    private void onQuestionTypeCountChanged() {
		final Range range = questionTypeCountTable.getVisibleRange();

		final Receiver<List<QuestionTypeCountPerExamProxy>> callback = new Receiver<List<QuestionTypeCountPerExamProxy>>() {
			
			@Override
			public void onSuccess(List<QuestionTypeCountPerExamProxy> values) {
				if (view == null) {
					// This activity is dead
					return;
				}

				sort_order = values.size()+1;
				questionTypeCountTable.setRowData(range.getStart(), values);

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

		fireQuestionTypeCountRangeRequest(range, callback);
		
	}
    
    private void onQuestionSumPerPersonChanged() {
		final Range range = questionSumPerPersonTable.getVisibleRange();

		final Receiver<List<QuestionSumPerPersonProxy>> callback = new Receiver<List<QuestionSumPerPersonProxy>>() {
			
			@Override
			public void onSuccess(List<QuestionSumPerPersonProxy> values) {
				if (view == null) {
					// This activity is dead
					return;
				}

				sort_orderQuestSum = values.size()+1;
				questionSumPerPersonTable.setRowData(range.getStart(), values);

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

		fireQuestionSumPerPersonRangeRequest(range, callback);
		
	}

	private void fireQuestionTypeCountRangeRequest(Range range, Receiver<List<QuestionTypeCountPerExamProxy>> callback) {
				createQuestionTypeCountRangeRequest(range).fire(callback);
		
	}

	private Request<List<QuestionTypeCountPerExamProxy>> createQuestionTypeCountRangeRequest(Range range) {
        return requests.questionTypeCountPerExamRequestNonRoo().findQuestionTypeCountByAssesmentNonRoo(assesment.getId(), range.getStart(), range.getLength()).with("questionTypesAssigned");

	}
	
	private void fireQuestionSumPerPersonRangeRequest(Range range, Receiver<List<QuestionSumPerPersonProxy>> callback) {
		createQuestionSumPerPersonRangeRequest(range).fire(callback);

}

private Request<List<QuestionSumPerPersonProxy>> createQuestionSumPerPersonRangeRequest(Range range) {
return requests.questionSumPerPersonRequestNonRoo().findQuestionSumPerPersonByAssesmentNonRoo(assesment.getId(), range.getStart(), range.getLength()).with("responsiblePerson", "questionEvent");

}

	@Override
	public void deleteClicked() {
		requests.assesmentRequest().remove().using(assesment).fire(new Receiver<Void>() {

            public void onSuccess(Void ignore) {
            	Log.debug("Sucessfull deleted");
            	placeController.goTo(new PlaceAssesment("PlaceAssesment!DELETED"));
            	
            }
            @Override
			public void onFailure(ServerFailure error) {
					Log.warn(McAppConstant.ERROR_WHILE_DELETE + " in Assesment -" + error.getMessage());
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

	@Override
	public void editClicked() {
		placeController.goTo(new PlaceAssesmentDetails(assesment.stableId(), PlaceAssesmentDetails.Operation.EDIT));

		
	}

	@Override
	public void newClicked(String institutionName) {
		placeController.goTo(new PlaceAssesmentDetails(PlaceAssesmentDetails.Operation.CREATE));

		
	}
	@Override
	public void moveDown(final QuestionTypeCountPerExamProxy questionTypeCount) {
		requests.questionTypeCountPerExamRequestNonRoo().findQuestionTypeCountByAssesmentAndOrderNonRoo(assesment.getId(), questionTypeCount.getSort_order()-1)
		.fire(new Receiver<QuestionTypeCountPerExamProxy>() {

			@Override
			public void onSuccess(QuestionTypeCountPerExamProxy response) {
				moveUpRequest(response);
				moveDownRequest(questionTypeCount);
				//initQuestionTypeCount();
			}
            @Override
			public void onFailure(ServerFailure error) {
					Log.warn(McAppConstant.ERROR_WHILE_DELETE + " in Assesment -" + error.getMessage());
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
	
	private int bothPersists =0;
	
	private void moveDownRequest(QuestionTypeCountPerExamProxy questionTypeCount){
		QuestionTypeCountPerExamRequest req = requests.questionTypeCountPerExamRequest();
		QuestionTypeCountPerExamProxy questionTypeCountEditable = req.edit(questionTypeCount);
		questionTypeCountEditable.setSort_order(questionTypeCountEditable.getSort_order()-1);
		req.persist().using(questionTypeCount).fire(new Receiver<Void>() {

			@Override
			public void onSuccess(Void response) {
				bothPersists++;
				if(bothPersists>1){
					initQuestionTypeCount();
					bothPersists=0;
				}
				
				
			}
            @Override
			public void onFailure(ServerFailure error) {
					Log.warn(McAppConstant.ERROR_WHILE_DELETE + " in Assesment -" + error.getMessage());
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

	@Override
	public void moveUp(final QuestionTypeCountPerExamProxy questionTypeCount) {
		requests.questionTypeCountPerExamRequestNonRoo().findQuestionTypeCountByAssesmentAndOrderNonRoo(assesment.getId(), questionTypeCount.getSort_order()+1)
		.fire(new Receiver<QuestionTypeCountPerExamProxy>() {

			@Override
			public void onSuccess(QuestionTypeCountPerExamProxy response) {
				moveUpRequest(questionTypeCount);
				moveDownRequest(response);
				//initQuestionTypeCount();
			}
            @Override
			public void onFailure(ServerFailure error) {
					Log.warn("Error get Upper" + error.getMessage());
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
	
	public void moveUpRequest(QuestionTypeCountPerExamProxy questionTypeCount){
		QuestionTypeCountPerExamRequest req = requests.questionTypeCountPerExamRequest();
		QuestionTypeCountPerExamProxy questionTypeCountEditable = req.edit(questionTypeCount);
		questionTypeCountEditable.setSort_order(questionTypeCountEditable.getSort_order()+1);
		req.persist().using(questionTypeCountEditable).fire(new Receiver<Void>() {

			@Override
			public void onSuccess(Void response) {
				
				bothPersists++;
				if(bothPersists>1){
					initQuestionTypeCount();
					bothPersists=0;
				}
			}
            @Override
			public void onFailure(ServerFailure error) {
					Log.warn("Could not persist" + error.toString());
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

	@Override
	public void deleteQuestionTypeCountClicked(
			QuestionTypeCountPerExamProxy questionTypeCountPerExam) {
		requests.questionTypeCountPerExamRequest().remove().using(questionTypeCountPerExam).fire(new Receiver<Void>() {

			@Override
			public void onSuccess(Void response) {
				
				initQuestionTypeCount();
			}
            @Override
			public void onFailure(ServerFailure error) {
					Log.warn(McAppConstant.ERROR_WHILE_DELETE + " in Assesment -" + error.getMessage());
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
	
	private QuestionTypeCountAddDialogbox questionTypeCountAddDialogbox;
	private  RequestFactoryEditorDriver<QuestionTypeCountPerExamProxy,QuestionTypeCountAddDialogboxImpl> driver;

	private QuestionTypeCountPerExamProxy questionTypeCountPerExamProxy;

	@Override
	public void addNewQuestionTypeCountClicked() {
		
		questionTypeCountAddDialogbox = new QuestionTypeCountAddDialogboxImpl();
		questionTypeCountAddDialogbox.display();
		driver = questionTypeCountAddDialogbox.createEditorDriver();
		QuestionTypeCountPerExamRequest request = requests.questionTypeCountPerExamRequest();
		
		questionTypeCountAddDialogbox.setPresenter(this);
		questionTypeCountAddDialogbox.setDelegate(this);
		
			this.questionTypeCountPerExamProxy = request.create(QuestionTypeCountPerExamProxy.class);


	        request.persist().using(questionTypeCountPerExamProxy);
	        driver.edit(questionTypeCountPerExamProxy, request);
	        questionTypeCountPerExamProxy.setAssesment(assesment);
	        questionTypeCountPerExamProxy.setSort_order(sort_order);
	        driver.flush();

		
		requests.questionTypeRequest().findAllQuestionTypes().fire(new Receiver<List<QuestionTypeProxy>>(){

			@Override
			public void onSuccess(List<QuestionTypeProxy> response) {
				questionTypeCountAddDialogbox.setQuestionTypesAssignedPickerValues(response);
				
			}
			
		});
		
		
		
		

		
	}

	@Override
	public void addClicked() {
		driver.flush().fire(new Receiver<Void>() {
			
	          @Override
	          public void onSuccess(Void response) {
	        	  Log.info("fullSaved");
	        	  
	        		initQuestionTypeCount();
	          //	goTo(new PlaceAssesment(person.stableId()));
	          }
	          
	          public void onFailure(ServerFailure error){
					Log.error(error.getMessage());
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
	public void cancelClicked() {
		
		
	}

	@Override
	public void deleteQuestionSumPerPersonClicked(QuestionSumPerPersonProxy questionSumPerPerson) {
		
			requests.questionSumPerPersonRequest().remove().using(questionSumPerPerson).fire(new Receiver<Void>() {

				@Override
				public void onSuccess(Void response) {
					
					initQuestionSumPerPerson();
				}
	            @Override
				public void onFailure(ServerFailure error) {
						Log.warn(McAppConstant.ERROR_WHILE_DELETE + " in Assesment -" + error.getMessage());
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

	private QuestionSumPerPersonDialogbox questionSumPerPersonDialogbox;

	private RequestFactoryEditorDriver<QuestionSumPerPersonProxy, QuestionSumPerPersonDialogboxImpl> driverQuestSum;

	private QuestionSumPerPersonProxy questionSumPerPersonProxy;

	private Integer sort_orderQuestSum;
	
	
	@Override
	public void addNewQuestionSumPerPersonClicked() {
		questionSumPerPersonDialogbox = new QuestionSumPerPersonDialogboxImpl();
		questionSumPerPersonDialogbox.display();
		driverQuestSum = questionSumPerPersonDialogbox.createEditorDriver();
		QuestionSumPerPersonRequest request = requests.questionSumPerPersonRequest();
		
		questionSumPerPersonDialogbox.setPresenter(this);
		questionSumPerPersonDialogbox.setDelegate(this);
		
			this.questionSumPerPersonProxy = request.create(QuestionSumPerPersonProxy.class);


	        request.persist().using(questionSumPerPersonProxy);
	        driverQuestSum.edit(questionSumPerPersonProxy, request);
	        questionSumPerPersonProxy.setAssesment(assesment);
	        questionSumPerPersonProxy.setSort_order(sort_orderQuestSum);
	        driverQuestSum.flush();

		
		requests.personRequest().findAllPeople().fire(new Receiver<List<PersonProxy>>(){
			

			@Override
			public void onSuccess(List<PersonProxy> response) {
				questionSumPerPersonDialogbox.setResponsiblePersonPickerValues(response);
				
			}
			
		});
		
		requests.questionEventRequest().findAllQuestionEvents().fire(new Receiver<List<QuestionEventProxy>>(){
			

			@Override
			public void onSuccess(List<QuestionEventProxy> response) {
				questionSumPerPersonDialogbox.setQuestionEventPickerValues(response);
				
			}
			
		});
		
	}
	
	@Override
	public void addQuestionSumPerPersonClicked() {
		driverQuestSum.flush().fire(new Receiver<Void>() {
			
	          @Override
	          public void onSuccess(Void response) {
	        	  Log.info("fullSaved");
	        	  
	        		initQuestionSumPerPerson();
	          //	goTo(new PlaceAssesment(person.stableId()));
	          }
	          
	          public void onFailure(ServerFailure error){
					Log.error(error.getMessage());
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
	public void cancelQuestionSumPerPersonClicked() {
		
		
	}


	@Override
	public void moveQuestionSumPerPersonDown(QuestionSumPerPersonProxy questionSumPerPerson) {
		requests.questionSumPerPersonRequestNonRoo().moveDown().using(questionSumPerPerson).fire(new Receiver<Void>() {
			
	          @Override
	          public void onSuccess(Void response) {
	        	  Log.info("movedDownp");
	        	  
	        		initQuestionSumPerPerson();
	          //	goTo(new PlaceAssesment(person.stableId()));
	          }
	          
	          public void onFailure(ServerFailure error){
					Log.error(error.getMessage());
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
	public void moveQuestionSumPerPersonUp(QuestionSumPerPersonProxy questionSumPerPerson) {
		requests.questionSumPerPersonRequestNonRoo().moveUp().using(questionSumPerPerson).fire(new Receiver<Void>() {
			
	          @Override
	          public void onSuccess(Void response) {
	        	  Log.info("movedUp");
	        	  
	        		initQuestionSumPerPerson();
	          //	goTo(new PlaceAssesment(person.stableId()));
	          }
	          
	          public void onFailure(ServerFailure error){
					Log.error(error.getMessage());
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



	

	
	






}
