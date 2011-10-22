package medizin.client.a_nonroo.app.activities;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import medizin.client.a_nonroo.app.client.DeclineEmailPopupDelagate;
import medizin.client.a_nonroo.app.client.ErrorPanel;
import medizin.client.a_nonroo.app.client.McAppConstant;
import medizin.client.a_nonroo.app.client.SlidingPanel;
import medizin.client.a_nonroo.app.client.ui.AcceptQuestionView;
import medizin.client.a_nonroo.app.client.ui.AcceptQuestionViewImpl;

import medizin.client.a_nonroo.app.place.PlaceAcceptPerson;
import medizin.client.a_nonroo.app.place.PlaceAcceptQuestion;
import medizin.client.a_nonroo.app.place.PlaceQuestionDetails;
import medizin.client.a_nonroo.app.place.PlaceSystemOverview;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.managed.request.QuestionRequest;
import medizin.shared.scaffold.QuestionRequestNonRoo;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.EntityProxy;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.ServerFailure;
import com.google.gwt.requestfactory.shared.Violation;
import com.google.gwt.user.cellview.client.AbstractHasData;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.Range;
import com.google.gwt.view.client.RangeChangeEvent;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.google.inject.Inject;

public class ActivityAcceptQuestion extends AbstractActivityWrapper implements AcceptQuestionView.Presenter, DeclineEmailPopupDelagate {

	private PlaceAcceptQuestion questionPlace;

	private AcceptsOneWidget widget;
	private AcceptQuestionView view;


	private McAppRequestFactory requests;
	private PlaceController placeController;

	protected PersonProxy loggedUser;

	//private SingleSelectionModel<QuestionProxy> selectionModel;


	@Inject
	public ActivityAcceptQuestion(PlaceAcceptQuestion place,
			McAppRequestFactory requests, PlaceController placeController) {
		super(place, requests, placeController);
		this.questionPlace = place;	
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
		AcceptQuestionView acceptQuestionView = new AcceptQuestionViewImpl();
		
		acceptQuestionView.setPresenter(this);
		acceptQuestionView.setDelegate(this);
		this.widget = widget;
		this.view = acceptQuestionView;
        widget.setWidget(acceptQuestionView.asWidget());
        
        table=view.getTable();
        
//        ProvidesKey<QuestionProxy> keyProvider = ((AbstractHasData<QuestionProxy>) table)
//		.getKeyProvider();
//selectionModel = new SingleSelectionModel<QuestionProxy>(keyProvider);
//table.setSelectionModel(selectionModel);
//
//selectionModel
//		.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
//			public void onSelectionChange(SelectionChangeEvent event) {
//				QuestionProxy selectedObject = selectionModel
//						.getSelectedObject();
//				if (selectedObject != null) {
//					Log.debug(selectedObject.getQuestionText()
//							+ " selected!");
//					showDetails(selectedObject);
//				}
//			}
//		});

    	requests.personRequestNonRoo().myGetLoggedPerson()
		.fire(new Receiver<PersonProxy>() {

			@Override
			public void onSuccess(PersonProxy response) {
				loggedUser = response;
				init();

			}

			public void onFailure(ServerFailure error) {
				ErrorPanel erorPanel = new ErrorPanel();
				erorPanel.setErrorMessage(error.getMessage());
				Log.error(error.getMessage());
				onStop();
			}

			@Override
			public void onViolation(Set<Violation> errors) {
				Iterator<Violation> iter = errors.iterator();
				String message = "";
				while (iter.hasNext()) {
					message += iter.next().getMessage() + "<br>";
				}
				Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION
						+ " in Antwort löschen -" + message);

				ErrorPanel erorPanel = new ErrorPanel();
				erorPanel.setErrorMessage(message);
				onStop();

			}

		});


	}

//	protected void showDetails(QuestionProxy question) {
//		Log.debug("Question Stable id: " + question.stableId() + " "
//				+ PlaceQuestionDetails.Operation.DETAILS);
//		
//	}

	@Override
	public void goTo(Place place) {
		  placeController.goTo(place);
	}
	
	AbstractHasData<QuestionProxy> table;

	private HandlerRegistration rangeChangeHandler;

	private void init() {
		
		if (rangeChangeHandler!=null){
			rangeChangeHandler.removeHandler();
			rangeChangeHandler=null;
		}
		
		requests.questionRequestNonRoo().countQuestionsNonAcceptedAdmin().fire(new Receiver<Long>() {
			@Override
			public void onSuccess(Long response) {
				if (view == null) {
					// This activity is dead
					return;
				}
				Log.debug("Geholte Questions (Pr�fungen) aus der Datenbank: " + response);
				view.getTable().setRowCount(response.intValue(), true);
				onRangeChanged();
			}
		});
		
		
		rangeChangeHandler = table.addRangeChangeHandler(new RangeChangeEvent.Handler() {
			public void onRangeChange(RangeChangeEvent event) {
				ActivityAcceptQuestion.this.onRangeChanged();
			}
		});
	}   

	protected void onRangeChanged() {
		final Range range = table.getVisibleRange();

		requests.questionRequestNonRoo().findQuestionsEntriesNonAcceptedAdmin(range.getStart(), range.getLength()).with(view.getPaths()).fire(new Receiver<List<QuestionProxy>>() {
			@Override
			public void onSuccess(List<QuestionProxy> values) {
				if (view == null) {
					Log.debug("view ist null");
					return;
				}

				table.setRowData(range.getStart(), values);
				

			if (widget != null) {
		          widget.setWidget(view.asWidget());
				}
			}
		});

		
		
	}


	@Override
	public void acceptClicked(EntityProxy entityProxy) {
		Log.debug("acceptClicked" + entityProxy.toString());
		if(entityProxy instanceof QuestionProxy){
			Log.debug("is QUestionProxy");
			QuestionRequestNonRoo req = requests.questionRequestNonRoo();
			QuestionProxy questionProxy =  req.edit((QuestionProxy)entityProxy);
			if(loggedUser.getIsAdmin()){
				questionProxy.setIsAcceptedAdmin(true);
			} else {
				questionProxy.setIsAcceptedRewiever(true);
			}
			
			questionProxy.setIsActive(true);
			req.persistAndSetPreviousInactive().using(questionProxy).fire(new Receiver<Void>(){

				@Override
				public void onSuccess(Void arg0) {
					init();
					
				}
		          public void onFailure(ServerFailure error){
		        	  ErrorPanel erorPanel = new ErrorPanel();
		        	  erorPanel.setErrorMessage(error.getMessage());
						Log.error(error.getMessage());
					}
		          @Override
					public void onViolation(Set<Violation> errors) {
						Iterator<Violation> iter = errors.iterator();
						String message = "";
						while(iter.hasNext()){
							message += iter.next().getMessage() + "<br>";
						}
						Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION + " in Antwort löschen -" + message);
						
			        	  ErrorPanel erorPanel = new ErrorPanel();
			        	  erorPanel.setErrorMessage(message);
						

						
					}
			});
		}
		
	}

	@Override
	public void rejectClicked(EntityProxy entityProxy, String message) {
		if(entityProxy instanceof QuestionProxy){
			Log.debug("is QUestionProxy");
			QuestionRequest req = requests.questionRequest();
			QuestionProxy questionProxy =  (QuestionProxy)entityProxy;
			
			req.remove().using(questionProxy).fire(new Receiver<Void>(){

				@Override
				public void onSuccess(Void arg0) {
					init();
					
				}
		          public void onFailure(ServerFailure error){
		        	  ErrorPanel erorPanel = new ErrorPanel();
		        	  erorPanel.setErrorMessage(error.getMessage());
						Log.error(error.getMessage());
					}
		          @Override
					public void onViolation(Set<Violation> errors) {
						Iterator<Violation> iter = errors.iterator();
						String message = "";
						while(iter.hasNext()){
							message += iter.next().getMessage() + "<br>";
						}
						Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION + " in Antwort löschen -" + message);
						
			        	  ErrorPanel erorPanel = new ErrorPanel();
			        	  erorPanel.setErrorMessage(message);
						

						
					}
			});
		}
		
	}

}
