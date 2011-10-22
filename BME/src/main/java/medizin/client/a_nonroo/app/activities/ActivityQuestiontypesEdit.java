//package medizin.client.a_nonroo.app.activities;
//
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//import medizin.client.a_nonroo.app.client.SlidingPanel;
//import medizin.client.a_nonroo.app.client.McAppConstant;
//
//import medizin.client.a_nonroo.app.client.ui.EventView;
//import medizin.client.a_nonroo.app.client.ui.EventViewImpl;
//import medizin.client.a_nonroo.app.client.ui.QuestiontypesEditView;
//import medizin.client.a_nonroo.app.client.ui.QuestiontypesEditViewImpl;
//import medizin.client.a_nonroo.app.client.ui.user.UserEditView;
//
//import medizin.client.a_nonroo.app.place.PlaceQuestiontypes;
//import medizin.client.a_nonroo.app.place.PlaceQuestiontypesDetails;
//
//import medizin.client.a_nonroo.app.place.PlaceUserDetails;
//import medizin.client.a_nonroo.app.place.PlaceUserDetails.Operation;
//import medizin.client.a_nonroo.app.request.McAppRequestFactory;
//
//
//
//
//import medizin.client.managed.request.InstitutionRequest;
//import medizin.client.managed.request.QuestionTypeProxy;
//import medizin.client.managed.request.QuestionTypeRequest;
//
//import medizin.client.managed.request.QuestionEventRequest;
//
//
//
//import com.allen_sauer.gwt.log.client.Log;
//import com.google.gwt.activity.shared.AbstractActivity;
//import com.google.gwt.activity.shared.Activity;
//import com.google.gwt.activity.shared.ActivityManager;
//import com.google.gwt.activity.shared.ActivityMapper;
//import com.google.gwt.event.shared.EventBus;
//import com.google.gwt.event.shared.HandlerRegistration;
//import com.google.gwt.place.shared.Place;
//import com.google.gwt.place.shared.PlaceChangeEvent;
//import com.google.gwt.place.shared.PlaceController;
//import com.google.gwt.requestfactory.shared.EntityProxyId;
//import com.google.gwt.requestfactory.shared.Receiver;
//import com.google.gwt.requestfactory.shared.Request;
//import com.google.gwt.requestfactory.shared.RequestContext;
//import com.google.gwt.requestfactory.shared.ServerFailure;
//import com.google.gwt.requestfactory.shared.Violation;
//import com.google.gwt.user.cellview.client.AbstractHasData;
//import com.google.gwt.user.cellview.client.CellTable;
//import com.google.gwt.user.client.Window;
//import com.google.gwt.user.client.ui.AcceptsOneWidget;
//import com.google.gwt.view.client.HasData;
//import com.google.gwt.view.client.ProvidesKey;
//import com.google.gwt.view.client.Range;
//import com.google.gwt.view.client.RangeChangeEvent;
//import com.google.gwt.view.client.SelectionChangeEvent;
//import com.google.gwt.view.client.SingleSelectionModel;
//import com.google.inject.Inject;
//
//public class ActivityQuestiontypesEdit extends AbstractActivity implements QuestiontypesEditView.Presenter, QuestiontypesEditView.Delegate {
//
//	private PlaceQuestiontypesDetails questiontypePlace;
//
//	private AcceptsOneWidget widget;
//	private QuestiontypesEditView view;
//	
//	private PlaceUserDetails userPlace;
//
//	private Operation operation;
//
//
//
//
//	private HandlerRegistration rangeChangeHandler;
//	
//	private QuestionTypeProxy questionType;
//	
//
//	private McAppRequestFactory requests;
//	private PlaceController placeController;
//
////	@Inject
////	public ActivityQuestiontypesEdit(PlaceQuestiontypesEdit place,
////			McAppRequestFactory requests, PlaceController placeController) {
////		this.questiontypePlace = place;
////        this.requests = requests;
////        this.placeController = placeController;
////	}
//	
//
//	@Inject
//	public ActivityQuestiontypesEdit(PlaceQuestiontypesDetails place,
//			McAppRequestFactory requests, PlaceController placeController) {
//		this.questiontypePlace = place;
//      this.requests = requests;
//      this.placeController = placeController;
//	}
//
//	@Override
//	public String mayStop() {
//
//		return null;
//	}
//
//	@Override
//	public void onCancel() {
//		onStop();
//
//	}
//
//	@Override
//	public void onStop() {
////		((SlidingPanel)widget).remove(view.asWidget());
//
//
//	}
//
//	@Override
//	public void start(AcceptsOneWidget widget, EventBus eventBus) {
//		QuestiontypesEditView questionTypeDetailsView = new QuestiontypesEditViewImpl();
//		questionTypeDetailsView.setName("hallo");
//		questionTypeDetailsView.setPresenter(this);
//		this.widget = widget;
//		this.view = questionTypeDetailsView;
//        widget.setWidget(questionTypeDetailsView.asWidget());
//		//setTable(view.getTable());
//        
//		eventBus.addHandler(PlaceChangeEvent.TYPE, new PlaceChangeEvent.Handler() {
//			public void onPlaceChange(PlaceChangeEvent event) {
//				//updateSelection(event.getNewPlace());
//				// TODO implement
//			}
//		});
//		//init();
//		
//		view.setDelegate(this);
//		
//		requests.find(questiontypePlace.getProxyId()).fire(new Receiver<Object>() {
//
//			public void onFailure(ServerFailure error){
//				Log.error(error.getMessage());
//			}
//			@Override
//			public void onSuccess(Object response) {
//				if(response instanceof QuestionTypeProxy){
//					Log.info(((QuestionTypeProxy) response).getQuestionTypeName());
//					init((QuestionTypeProxy) response);
//				}
//
//				
//			}
//		    });
//
//
//		//Log.warn(requests.getProxyId(eventPlace.getProxyId().toString()));
//		
//		// Inherit the view's key provider
//		
//		//view.setDelegate(this);
//		//updateSelection(placeController.getWhere());
//
//	}
//	
////	protected void showDetails(QuestionEventProxy questionEvent) {
////	//	Log.debug("QuestionEvent Stable id: " + questionEvent.stableId() + " " +  PlaceInstitutionEvent.Operation.DETAILS); 
////	//	placeController.goTo(new PlaceInstitutionEvent(questionEvent.stableId(), PlaceInstitutionEvent.Operation.DETAILS));
////	}
//
//	@Override
//	public void goTo(Place place) {
//		  placeController.goTo(place);
//	}
//	
////    protected Request<java.util.List<medizin.client.managed.request.QuestionEventProxy>> createRangeRequest(Range range) {
////        return requests.questionEventRequestNonRoo().findQuestionEventsByInstitutionNonRoo(institution.getId(), range.getStart(), range.getLength());
////    }
////
////    protected void fireCountRequest(Receiver<java.lang.Long> callback) {
////    	requests.questionEventRequestNonRoo().countQuestionEventsNonRoo(institution.getId()).fire(callback);
////    }
//    
//	private void init(QuestionTypeProxy questionType) {
//
//		this.questionType = questionType;
//		Log.debug("Details für: "+questionType.getQuestionTypeName());
//		view.setValue(questionType);
//		
//		
////		fireCountRequest(new Receiver<Long>() {
////			@Override
////			public void onSuccess(Long response) {
////				if (view == null) {
////					// This activity is dead
////					return;
////				}
////				Log.debug("Geholte Personen aus der Datenbank: " + response);
////				//view.getTable().setRowCount(response.intValue(), true);
////
////				setPersonDetails();
////			}
////		});
//		
//	}
//	
////	private CellTable<QuestionEventProxy> table;
////	
////	public CellTable<QuestionEventProxy> getTable(){
////		return table;
////	}
////	public void  setTable(CellTable<QuestionEventProxy> table){
////		this.table = table;
////	}
//
//
//
//
//
////	@Override
////	public void deleteClicked() {
////
////		requests.personRequest().remove().using(person).fire(new Receiver<Void>() {
////
////            public void onSuccess(Void ignore) {
////            	Log.debug("Sucessfull deleted");
////            	placeController.goTo(new PlaceUser("PlaceUser"));
////            	
////            }
////            @Override
////			public void onFailure(ServerFailure error) {
////					Log.warn(McAppConstant.ERROR_WHILE_DELETE + " in Institution:Event -" + error.getMessage());
////					if(error.getMessage().contains("ConstraintViolationException")){
////						Log.debug("Fehlen beim erstellen: Doppelter name");
////						mcAppFactory.getErrorPanel().setErrorMessage(McAppConstant.EVENT_IS_REFERENCED);
////					}
////				
////			}
////			@Override
////			public void onViolation(Set<Violation> errors) {
////				Iterator<Violation> iter = errors.iterator();
////				String message = "";
////				while(iter.hasNext()){
////					message += iter.next().getMessage() + "<br>";
////				}
////				Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION + " in Event -" + message);
////				
////				mcAppFactory.getErrorPanel().setErrorMessage(message);
////
////				
////			}
////            
////        });
////		
////	}
//
//
//
//	@Override
//	public void cancelClicked() {
//		
//		Log.debug("Edit Questiontype cancelled");
//		goTo(new PlaceQuestiontypes("PlaceQuestiontypes"));
//	
//	}
//
//	@Override
//	public void saveClicked () {
//		QuestionTypeRequest request = requests
//		.questionTypeRequest();
//		
////		questionType =	request.edit(questionType);
////		
////		// 
////		questionType.setQuestionTypeName(questionTypeName);
////		questionType.setIsWeil(isWeil);
////		questionType.setTrueAnswers(trueAnswers);
////		questionType.setFalseAnswers(falseAnswers);
////		questionType.setSumAnswers(sumAnswers);
////		questionType.setMaxLetters(maxLetters);
////		//Every Time questionType is edited, Version is altered.
////		Integer version = questionType.getVersion();
////		version++;
////		questionType.setVersion(version);
////		
////		Log.debug("�nderungen speichern geklickt");
////		
////
////		questionType.setFalseAnswers(falseAnswers);
////		
//		
//		
//		
//		
//		
//		
//		
//		
//		request.persist().using(questionType).fire(new Receiver<Void>() {
//
//			public void onSuccess(Void ignore) {
//				Log.debug("Sucessfull saved");
//				goTo(new PlaceQuestiontypes("PlaceQuestiontypes"));
//				//getLastPage();
//
//			}
//
//			@Override
//			public void onFailure(ServerFailure error) {
//				Log.warn(McAppConstant.ERROR_WHILE_CREATE + " in Questiontype -"
//						+ error.getMessage());
//				if (error.getMessage().contains("ConstraintViolationException")) {
//					Log.debug("Fehlen beim erstellen: Doppelter name");
//					//TODO mcAppFactory.getErrorPanel().setErrorMessage(McAppConstant.CONTENT_NOT_UNIQUE);
//				}
//
//			}
//
//			@Override
//			public void onViolation(Set<Violation> errors) {
//				Log.debug("Fehlen beim erstellen, volation: "
//						+ errors.toString());
//				Iterator<Violation> iter = errors.iterator();
//				String message = "";
//				while (iter.hasNext()) {
//					message += iter.next().getMessage() + "<br>";
//				}
//				Log.warn(McAppConstant.ERROR_WHILE_CREATE_VIOLATION
//						+ " in Institution -" + message);
//
//				//TODO mcAppFactory.getErrorPanel().setErrorMessage(message);
//
//			}
//
//		});
//		
//		
//	}
//
//
//
//
//
//
//
//
//}
