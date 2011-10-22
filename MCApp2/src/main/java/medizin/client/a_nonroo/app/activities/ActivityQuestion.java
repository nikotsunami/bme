package medizin.client.a_nonroo.app.activities;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import medizin.client.a_nonroo.app.client.ErrorPanel;
import medizin.client.a_nonroo.app.client.McAppConstant;
import medizin.client.a_nonroo.app.client.SlidingPanel;
import medizin.client.a_nonroo.app.client.TopPanel;
import medizin.client.a_nonroo.app.client.ui.AcceptPersonView;
import medizin.client.a_nonroo.app.client.ui.AcceptPersonViewImpl;
import medizin.client.a_nonroo.app.client.ui.SystemOverviewView;
import medizin.client.a_nonroo.app.client.ui.SystemOverviewViewImpl;
import medizin.client.a_nonroo.app.client.ui.question.QuestionView;
import medizin.client.a_nonroo.app.client.ui.question.QuestionViewImpl;

import medizin.client.a_nonroo.app.place.PlaceAcceptPerson;
import medizin.client.a_nonroo.app.place.PlaceQuestionDetails;
import medizin.client.a_nonroo.app.place.PlaceQuestion;
import medizin.client.a_nonroo.app.place.PlaceQuestionDetails;
import medizin.client.a_nonroo.app.place.PlaceSystemOverview;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.InstitutionProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionProxy;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.dom.client.Document;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.ServerFailure;
import com.google.gwt.requestfactory.shared.Violation;
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

public class ActivityQuestion extends AbstractActivityWrapper implements 
QuestionView.Presenter, QuestionView.Delegate {

	private PlaceQuestion questionPlace;

	private AcceptsOneWidget widget;
	private QuestionView view;

	private McAppRequestFactory requests;
	private PlaceController placeController;
	
	private ActivityManager activityManger;
	private ActivityQuestionMapper activityQuestionMapper;
	private SingleSelectionModel<QuestionProxy> selectionModel;

	private CellTable<QuestionProxy> table;

	private HandlerRegistration rangeChangeHandler;

	private PersonProxy userLoggedIn;

	private InstitutionProxy institutionActive;



	@Inject
	public ActivityQuestion(PlaceQuestion place, McAppRequestFactory requests,
			PlaceController placeController) {
		super(place, requests, placeController);
		this.questionPlace = place;
        this.requests = requests;
        this.placeController = placeController;
        
        
		this.activityQuestionMapper = new ActivityQuestionMapper(requests, placeController);
		this.activityManger = new ActivityManager(activityQuestionMapper,
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
	public void start2(AcceptsOneWidget widget, EventBus eventBus) {
		//TopPanel topPanel = TopPanel.instance(requests, placeController);
		
//		if(topPanel.getLoggedUser().getValue()==null){
//			onStop();
//			return;		
//		}
//		if(!topPanel.getLoggedUser().getValue().equals("")){
//			this.userLoggedIn = topPanel.getLoggedUser().getValue();
//		}
//		else{
//			onStop();
//			return;
//		}
//		if(topPanel.getInstitutionListBox().getValue()==null){
//			onStop();
//			return;		
//		}
//		if(!topPanel.getInstitutionListBox().getValue().equals("")){
//			this.institutionActive = topPanel.getInstitutionListBox().getValue();
//		}
//		else{
//			onStop();
//			return;
//		}
		

		
		Log.debug("start()");
		QuestionView questionView = new QuestionViewImpl();
		Log.debug("start()");
		//questionView.setName("hallo");
		questionView.setPresenter(this);
		this.widget = widget;
		Log.debug("start()");
		this.view = questionView;
		Log.debug("start()");
        widget.setWidget(questionView.asWidget());
        
        table=view.getTable();

		Log.debug("start2()");
        eventBus.addHandler(PlaceChangeEvent.TYPE, new PlaceChangeEvent.Handler() {
			public void onPlaceChange(PlaceChangeEvent event) {

				Place place = event.getNewPlace();
				if(place instanceof PlaceQuestionDetails){
					init();
				}
			}
		});
	
		
		activityManger.setDisplay(view.getDetailsPanel());

		requests.personRequestNonRoo().myGetLoggedPerson()
		.fire(new Receiver<PersonProxy>() {

			@Override
			public void onSuccess(PersonProxy response) {
				userLoggedIn = response;
				init();

			}

			public void onFailure(ServerFailure error) {
				ErrorPanel erorPanel = new ErrorPanel();
				erorPanel.setErrorMessage(error.getMessage());
				Log.error(error.getMessage());
				//onStop();
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
				//onStop();

			}

		});
		requests.institutionRequestNonRoo().myGetInstitutionToWorkWith()
		.fire(new Receiver<InstitutionProxy>() {

			@Override
			public void onSuccess(InstitutionProxy response) {
				institutionActive = response;
				init();

			}

			public void onFailure(ServerFailure error) {
				ErrorPanel erorPanel = new ErrorPanel();
				erorPanel.setErrorMessage(error.getMessage());
				Log.error(error.getMessage());
				//onStop();
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
				//onStop();
				

			}

		});
		// Inherit the view's key provider
		ProvidesKey<QuestionProxy> keyProvider = ((AbstractHasData<QuestionProxy>) table)
				.getKeyProvider();
		selectionModel = new SingleSelectionModel<QuestionProxy>(keyProvider);
		table.setSelectionModel(selectionModel);

		selectionModel
				.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
					public void onSelectionChange(SelectionChangeEvent event) {
						QuestionProxy selectedObject = selectionModel
								.getSelectedObject();
						if (selectedObject != null) {
							Log.debug(selectedObject.getQuestionText()
									+ " selected!");
							showDetails(selectedObject);
						}
					}
				});

		view.setDelegate(this);

	}
	
	protected void showDetails(QuestionProxy question) {
		Log.debug("Question Stable id: " + question.stableId() + " "
				+ PlaceQuestionDetails.Operation.DETAILS);
		placeController.goTo(
				new PlaceQuestionDetails(question.stableId()));
	}

	@Override
	public void goTo(Place place) {
		  placeController.goTo(place);
	}

	private void init() {
		
		if(institutionActive == null || userLoggedIn == null){
			//onStop();
			return;
		}
		else
		{
			Document.get().getElementById("userLoggedIn").setInnerHTML("Eingeloggt als: " + userLoggedIn.getName() + " " + userLoggedIn.getPrename());
			Document.get().getElementById("institutionActive").setInnerHTML("Institution: " + institutionActive.getInstitutionName());
	         
		}
		
		if (rangeChangeHandler!=null){
			rangeChangeHandler.removeHandler();
			rangeChangeHandler=null;
		}
		
		
		
			requests.questionRequestNonRoo().countQuestionsByPerson(this.userLoggedIn.getShidId(), this.institutionActive.getId()).fire(new Receiver<Long>() {
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
				ActivityQuestion.this.onRangeChanged();
			}
		});
	}   

	protected void onRangeChanged() {
		final Range range = table.getVisibleRange();

		requests.questionRequestNonRoo().findQuestionEntriesByPerson(this.userLoggedIn.getShidId(), this.institutionActive.getId(), range.getStart(), range.getLength()).with(view.getPaths()).fire(new Receiver<List<QuestionProxy>>() {
			@Override
			public void onSuccess(List<QuestionProxy> values) {
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

		
		
	}



	@Override
	public void newClicked() {
		placeController.goTo(new PlaceQuestionDetails(PlaceQuestionDetails.Operation.CREATE));

		
	}

}
