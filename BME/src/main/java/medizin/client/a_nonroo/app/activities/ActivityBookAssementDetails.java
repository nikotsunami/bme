package medizin.client.a_nonroo.app.activities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import medizin.client.a_nonroo.app.client.AssesmenBookDialogbox;
import medizin.client.a_nonroo.app.client.AssesmenBookDialogboxImpl;
import medizin.client.a_nonroo.app.client.ErrorPanel;
import medizin.client.a_nonroo.app.client.McAppConstant;
import medizin.client.a_nonroo.app.client.dnd3.ui.AnswerView;
import medizin.client.a_nonroo.app.client.dnd3.ui.AnswerViewImpl;
import medizin.client.a_nonroo.app.client.dnd3.ui.EventViewImpl;
import medizin.client.a_nonroo.app.client.dnd3.ui.LoadingPopUp;
import medizin.client.a_nonroo.app.client.dnd3.ui.QuestionTypeDNDView;
import medizin.client.a_nonroo.app.client.dnd3.ui.QuestionTypeDNDViewImpl;
import medizin.client.a_nonroo.app.client.dnd3.ui.QuestionViewImpl;
import medizin.client.a_nonroo.app.client.ui.BookAssesmentDetailsView;
import medizin.client.a_nonroo.app.client.ui.BookAssesmentDetailsViewImpl;
import medizin.client.a_nonroo.app.place.PlaceBookAssesmentDetails;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.AnswerToAssQuestionRequest;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.AssesmentQuestionRequest;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.AnswerToAssQuestionProxy;
import medizin.client.managed.request.QuestionSumPerPersonProxy;
import medizin.client.managed.request.QuestionSumPerPersonRequest;
import medizin.client.managed.request.QuestionTypeCountPerExamProxy;
import medizin.client.managed.request.QuestionTypeProxy;
import medizin.client.managed.request.AssesmentQuestionProxy;

import com.allen_sauer.gwt.dnd.client.DragEndEvent;
import com.allen_sauer.gwt.dnd.client.DragHandler;
import com.allen_sauer.gwt.dnd.client.DragStartEvent;
import com.allen_sauer.gwt.dnd.client.PickupDragController;
import com.allen_sauer.gwt.dnd.client.VetoDragException;
import com.allen_sauer.gwt.dnd.client.drop.VerticalPanelDropController;
import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.ServerFailure;
import com.google.gwt.requestfactory.shared.Violation;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
/**
 * Provides Activity for BookAssemsentDetailsView, makes extensive use of  gwt-dnd ( <a href="http://code.google.com/p/gwt-dnd">Drag-and-drop Library for Google-Web-toolkit</a>). Allows to
 * sort elements of an assesment-book. All the design elemnts of draggable Elements (questiontype counts(Fragetypen), question events(Themengebiete),questions and answers are excluded in view-classes. 
 * @author masterthesis
 *
 */

public class ActivityBookAssementDetails extends AbstractActivityWrapper implements DragHandler, AssesmenBookDialogbox.Delegate, BookAssesmentDetailsView.Presenter, BookAssesmentDetailsView.Delegate, AnswerView.Delegate, QuestionTypeDNDView.Delegate {

	private PlaceBookAssesmentDetails bookAssmentPlace;
	private AcceptsOneWidget widget;
	private BookAssesmentDetailsView view;
	private McAppRequestFactory requests;
	private PlaceController placeController;

	@Inject
	public ActivityBookAssementDetails(PlaceBookAssesmentDetails place,
			McAppRequestFactory requests, PlaceController placeController) {
		super(place, requests, placeController);
		this.bookAssmentPlace = place;
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



	}
	
	private AssesmentProxy assesment;
	private BookAssesmentDetailsView bookAssesmentViewDetails;
	private LoadingPopUp loadingPopup = new LoadingPopUp();
	
	@Override
	public void start(AcceptsOneWidget widget, EventBus eventBus) {
		super.start(widget, eventBus);

	}
	
	/**
	 * Starts up activity.
	 */
	@Override
	public void start2(AcceptsOneWidget widget, EventBus eventBus) {
	
		/**
		 * Shows pop-up with animated gif during startup.
		 */
		loadingPopup.show();
		Log.debug("Inside ActivityBookAssementDetails ");
		bookAssesmentViewDetails = new BookAssesmentDetailsViewImpl(requests, placeController);
		bookAssesmentViewDetails.setPresenter(this);
		bookAssesmentViewDetails.setDelegate(this);
		this.widget = widget;
		this.view = bookAssesmentViewDetails;
        widget.setWidget(bookAssesmentViewDetails.asWidget());
        DOM.setElementAttribute(bookAssesmentViewDetails.getScrollContainer().getElement(), "style", "position: absolute; overflow: auto; left: 0px; top: 25px; right: 50px; bottom: 0px;width: 820px");
        
        eventBus.addHandler(PlaceChangeEvent.TYPE, new PlaceChangeEvent.Handler() {
			public void onPlaceChange(PlaceChangeEvent event) {

			}
		});
        /**
         * Requests AssesmentProxy for this assesment-book.
         */
		requests.find(bookAssmentPlace.getProxyId()).fire(new Receiver<Object>() {

			
			public void onFailure(ServerFailure error){
				Log.error(error.getMessage());
			}
			@Override
			public void onSuccess(Object response) {
				if(response instanceof AssesmentProxy){
					Log.info(((AssesmentProxy) response).getName());
					assesment = (AssesmentProxy) response;
					init();
				}

				
			}
		    });

		
	}//End public void start
		
		

	@Override
	public void goTo(Place place) {
		 placeController.goTo(place);
	}
	
		/**
		 * Load all elements for assesementProxy.
		 */
		protected void init() {
			 bookAssesmentViewDetails.getWorkingArea().clear();

			 requests.questionTypeCountPerExamRequestNonRoo().findQuestionTypesCountSortedByAssesmentNonRoo(assesment.getId() )
			 .with("questionTypesAssigned").fire(new Receiver<List<QuestionTypeCountPerExamProxy>>() {
			@Override
			public void onSuccess(List<QuestionTypeCountPerExamProxy> values) {
				if (view == null) {
					// This activity is dead
					Log.debug("view ist null");
					return;
				}
				Log.debug("Liste QuestionTYpeCountPerExamproxy-Size: "+ values.size());
				Iterator<QuestionTypeCountPerExamProxy> iterQuestionTypeCount = values.iterator();
				while(iterQuestionTypeCount.hasNext()){
					QuestionTypeCountPerExamProxy questionTypeCount = iterQuestionTypeCount.next();
					Set<QuestionTypeProxy> questionTypesAssigned = questionTypeCount.getQuestionTypesAssigned();
					Log.debug("Set QuestionTypeProxy Gr�sse: "+questionTypesAssigned.size());
					/**
					 * For each questionTypeCount-object fill design elements.
					 */
					fillQuestiontype(questionTypeCount);
					
				}
				
				
			if (widget != null) {
		          widget.setWidget(view.asWidget());
				}
			}
		});
		/**
		 * Load all questionTypeCountRequest-objects for this assesment sorted by the attribute sort_order.
		 */
		
	
	}//End init

		

/**
 * Change sort_order of an questionTypeCountPerExamRequest-object.
 * @param questionTypeCount
 */
public void moveQuestionTypeCountPerExamRequestDown(QuestionTypeCountPerExamProxy questionTypeCount) {
	requests.questionTypeCountPerExamRequestNonRoo().moveUp().using(questionTypeCount).fire(new Receiver<Void>() {
		
          @Override
          public void onSuccess(Void response) {
        	  Log.info("movedDown");
 
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

				
			}
      });
	
}

/**
 * Change sort_order of an questionTypeCountPerExamRequest-object.
 * @param questionTypeCount
 */
public void moveQuestionTypeCountPerExamRequestUp(QuestionTypeCountPerExamProxy questionTypeCount) {
	requests.questionTypeCountPerExamRequestNonRoo().moveDown().using(questionTypeCount).fire(new Receiver<Void>() {
		
          @Override
          public void onSuccess(Void response) {
        	  Log.info("movedUp");
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
				
			}
      });
	
}

	
	/**
	 * Insert design-elements for questionTypeCountPerExamProxy
	 * 
	 */
	protected void fillQuestiontype(QuestionTypeCountPerExamProxy questionTypeCountProxy){
		
		
		QuestionTypeCountPerExamProxy questionTypeCountProxyTemp = questionTypeCountProxy;
		/**
		 * Top level panel.
		 */
		final AbsolutePanel workingArea = bookAssesmentViewDetails.getWorkingArea();

		
		/**
		 * New QuestionTypeDNDViewImpl is used as container for question-types
		 */

		final QuestionTypeDNDView questionTypeContainer = new QuestionTypeDNDViewImpl();
		questionTypeContainer.setDelegate(this);
		questionTypeContainer.setProxy(questionTypeCountProxy);
				
		/**
		 * Set up container for question events (Themengruppen)
		 */
		final VerticalPanel eventsContainer = questionTypeContainer.getEventsContainer();
		/**
		 * Set up pickupDragController for QuestionTypeContent-panel.
		 */
		final PickupDragController eventDragController = new PickupDragController(questionTypeContainer.getQuestionTypeContent(),false);


		/**
		 * Set with question types corresponding to a questionTypeCount-object.
		 */
		Set <QuestionTypeProxy> questionTypeProxySet = questionTypeCountProxyTemp.getQuestionTypesAssigned();
		Iterator<QuestionTypeProxy> itr = questionTypeProxySet.iterator();
		final List<Long> questionTypesId = new ArrayList<Long>() ;
		while(itr.hasNext()){
			
			questionTypesId.add(itr.next().getId());
			
		}
		//final	QuestionTypeProxy questionTypeProxyTemp = (QuestionTypeProxy)itr.next();
		/**
		 * Request all question Events for each questionTypeProxy
		 */
		requests.questionEventRequestNonRoo().findAllQuestionEventsByQuestionTypeAndAssesmentID(assesment.getId(), questionTypesId  ).fire(new Receiver <java.util.List<medizin.client.managed.request.QuestionEventProxy>>(){

			@Override
			public void onSuccess(List<QuestionEventProxy> response) {
				Iterator<QuestionEventProxy> iterQuestionEventProxy = response.iterator();
				while(iterQuestionEventProxy.hasNext()){
					QuestionEventProxy questionEventProxy = iterQuestionEventProxy.next();
				
					/**
					 * For each questionEvent in callback setup event-area
					 */
					insertQuestionEvents(questionEventProxy,  eventsContainer, eventDragController, questionTypesId);
					
					
				}
				
			}
			
		}
		);
		
		/**
		 * Add container for question types (Fragetypen) to main panel.
		 */
		workingArea.add(questionTypeContainer);
		}//End fillQuestion	

	

	
	/**
	 * Add QuestionEvent to the eventsContainer of Questiontype.
	 */
	protected void insertQuestionEvents(QuestionEventProxy questionEvent, VerticalPanel eventsContainer, PickupDragController eventDragController, List<Long> questionTypesId){
		//final QuestionTypeProxy questionTypeProxy= questionTypesId;
		/**
		 * New DropController that allows dropping eventsContainer inside eventsContainer.
		 */
		VerticalPanelDropController eventsDropController = new VerticalPanelDropController(eventsContainer);
		
		eventDragController.registerDropController(eventsDropController);
		eventDragController.addDragHandler(this);
		/**
		 * New EventViewImpl for QuestionEvent-object.
		 */
		final EventViewImpl eventVertical = new EventViewImpl();
		final AbsolutePanel questionEventContent = eventVertical.getQuestionEventContent();
		final VerticalPanel questionsContainer = eventVertical.getQuestionsContainer();
		eventVertical.setEventProxy(questionEvent);
		eventDragController.makeDraggable(eventVertical, eventVertical.getHeaderNamelbl());
		eventsContainer.add(eventVertical);
		Log.debug("eventsContain.add(eventVertical) ausgef�llt");
		
		final PickupDragController questionDragController = new PickupDragController(eventVertical.getQuestionEventContent(),false);
		VerticalPanelDropController questionsDropController = new VerticalPanelDropController(questionsContainer);
		questionDragController.registerDropController(questionsDropController);
		questionDragController.addDragHandler(this);
		/**
		 * request all Assesmentquestions by QuestinEvent, Assesment and QuestionType
		 */
		
		requests.assesmentQuestionRequestNonRoo().findAssesmentQuestionsByQuestionEventAssIdQuestType(questionEvent.getId(), assesment.getId(), questionTypesId).with("question").fire(new Receiver <java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>>(){

			public void onFailure(ServerFailure error){
			Log.error(error.getMessage());
			}
			
			@Override
			public void onSuccess(List<AssesmentQuestionProxy> response) {
				
				if (view == null) {
					// This activity is dead
					Log.debug("view ist null");
					return;
				}
				Iterator<AssesmentQuestionProxy> iterAssQuestionProxy = response.iterator();
				
				/**
				 * For each assessment-question create new QuestionViewImpl.
				 */
				while(iterAssQuestionProxy.hasNext()){
					
					AssesmentQuestionProxy assQuestionProxy = iterAssQuestionProxy.next();
					
					final QuestionViewImpl questionVert = new QuestionViewImpl();
					questionVert.setQuestionProxy(assQuestionProxy);
				    questionDragController.makeDraggable(questionVert, questionVert.getQuestionTextLbl());
				    questionsContainer.add(questionVert);
				    

		

				    // initialize our widget drag controller
				    final PickupDragController widgetDragController = new PickupDragController(questionEventContent, false);
				    widgetDragController.setBehaviorMultipleSelection(false);
				    widgetDragController.addDragHandler(ActivityBookAssementDetails.this);
				      VerticalPanelDropController widgetDropController = new VerticalPanelDropController(
				    		  questionVert);
				      widgetDragController.registerDropController(widgetDropController);
    
		      
				   
				      final Receiver<List<AnswerToAssQuestionProxy>> callbackanswerToAssQuest = new Receiver<List<AnswerToAssQuestionProxy>>() {
				      
				 
				      

						@Override
						public void onSuccess(
								List<AnswerToAssQuestionProxy> values) {
							Iterator<AnswerToAssQuestionProxy> iterAssQuest = values.iterator();
							/**
							 * For each AssesmentQuestionProxy get answer and implement view. 
							 */
							while (iterAssQuest.hasNext()){
								
								AnswerToAssQuestionProxy answerToAssQuest = iterAssQuest.next();
								AnswerProxy answerProxy = answerToAssQuest.getAnswers();	
								AnswerView answerUi = new AnswerViewImpl();
								answerUi.setProxy(answerProxy);
								answerUi.setAnswerToAssQueston(answerToAssQuest);
							    answerUi.setDelegate(ActivityBookAssementDetails.this);						 
							    questionVert.add(answerUi.asWidget());
							    widgetDragController.makeDraggable(answerUi.asWidget(), answerUi.getLblAnswerText());
							}
							/**
							 * Hide Answers at first.
							 */
							Integer widgetCount = questionVert.getWidgetCount();
							for (int i = 1; i < widgetCount; i++){
							questionVert.getWidget(i).setVisible(false);
							}
							loadingPopup.hide();
						}
						
				    	  
				      };

				      fireGetAnswerToAssQuest(callbackanswerToAssQuest, assQuestionProxy);
				
		
				      
				      
				      
				}//End Iteration of Ass Question Proxys
		        if (widget != null) {
		          widget.setWidget(view.asWidget());
				}
				
				
			}
			
		});


		
	}//End InsertQuestionEvents
	
	
	

	//Part of Request for answerToAssQuestions	
	private void fireGetAnswerToAssQuest( final Receiver<List<AnswerToAssQuestionProxy>> callbackanswerToAssQuest, AssesmentQuestionProxy assesmentQuestionproxy) {
		createfireGetAnswerToAssQuest(assesmentQuestionproxy).fire(callbackanswerToAssQuest);
			}
	
	
	protected Request<java.util.List<medizin.client.managed.request.AnswerToAssQuestionProxy>> createfireGetAnswerToAssQuest(AssesmentQuestionProxy assesmentQuestionproxy) {
        return requests.answerToAssQuestionRequestNonRoo().findAnswerToAssQuestionByAssesmentQuestion(assesmentQuestionproxy.getId()).with("answers");
    }
	//End Request for answerToAssQuestions
	

		


	public void answerDropped(EntityProxyId<?> answerId) {
		requests.find(answerId).fire(new Receiver<Object>() {

			
			public void onFailure(ServerFailure error){
				Log.error(error.getMessage());
			}
			@Override
			public void onSuccess(Object response) {
				if(response instanceof AnswerProxy){
					AnswerProxy answer = (AnswerProxy) response;
					Log.info("Answer text: "+answer.getAnswerText());

				
				}

				
			}
		    });
		
	}
	
	/**
	 * Hash Maps are used to store objects in sorted order.
	 */
	  private Map<EntityProxyId<?>, Integer> proxyMap = new HashMap<EntityProxyId<?>, Integer>();
	  
	  private Map<EntityProxyId<?>, Integer> questionProxyMap = new HashMap<EntityProxyId<?>, Integer>();
	  
	  private Map<EntityProxyId<?>, Integer> eventProxyMap = new HashMap<EntityProxyId<?>, Integer>();

	  
	  private AnswerToAssQuestionProxy answerToAssQuest;



	  /**
	   * Log the drag end event and loop through all children of drop target(in this case alway a vertical panel) and store them in a hash map. The objects are dropped in a vertical panel.
	   * After the object is dropped, the vertical panel (e.g. eventsContainer)contains the new sort order. every child object of the vertical panel is saved to a hash map in the new sort order.
	   * 
	   *
	   * @param event the event to log
	   */
	  @Override
	  public void onDragEnd(DragEndEvent event) {
	    Log.debug("onDragEnd: " + event);
	    
	    Log.info(event.getSource().getClass().toString());
	    if (event.getSource() instanceof AnswerViewImpl){
	    	AnswerViewImpl answerView = (AnswerViewImpl) event.getSource();
	    	Log.info("Hier: " +answerView.getAnswer().stableId().toString());
	    	answerView.answerDropped(answerView.getAnswer().stableId());
	    }
	    
	    if(event.getSource() instanceof QuestionViewImpl){
	    	QuestionViewImpl questionView = (QuestionViewImpl)event.getSource();
	    	Log.info("ProxyID der gedraggten Frage: "+questionView.getQuestionProxy().getId());
	    }
	    if(event.getSource() instanceof EventViewImpl){
	    	EventViewImpl eventView =(EventViewImpl)event.getSource();
	    	Log.info("ProxyID des gedraggten Events: "+eventView.getEventProxy().getId());
	    }
	    if (event.getContext().finalDropController != null) {
	    	Log.info(event.getContext().finalDropController.getDropTarget().getClass().getName());
	    	VerticalPanel myPanel = (VerticalPanel) event.getContext().finalDropController.getDropTarget();
	    	Iterator<Widget> iter = myPanel.iterator();
	    	int i=0;
	    	int j=0;
	    	int k=0;
	    	while(iter.hasNext()) {
	    		Widget myWidget = iter.next();

	    		if (myWidget instanceof AnswerView){
	    			AnswerViewImpl answView = (AnswerViewImpl) myWidget;
	    			Log.warn(answView.getAnswer().stableId().toString());

	    			proxyMap.put(answView.getAnswerToAssQueston().stableId(), i);
	    			Log.debug("Proxy in proxyMap f�r AnswersView abgelegt: "+i);
	    			i++;
	    			
	    		}
	    		if (myWidget instanceof QuestionViewImpl){
	    			QuestionViewImpl questView = (QuestionViewImpl) myWidget;
	    			questionProxyMap.put(questView.getQuestionProxy().stableId(), k);
	    			Log.debug("Proxy in questionProxyMap abgelegt: "+k);
	    			k++;
	    			
	    			
	    		}
	    		if (myWidget instanceof EventViewImpl){
	    			EventViewImpl eventView =(EventViewImpl) myWidget;
	    			eventProxyMap.put(eventView.getEventProxy().stableId(), j);
	    			Log.debug("Proxy in eventProxyMap abgelegt:"+j);
	    			j++;
	    		}
	    		
	    	}
	    	processMap();
	    	processQuestionsMap();
	    	processEventMap();
	    }


	  }


	  
	  /**
	   * Process HashMap with answers. For each answer in HashMap Request answerProxy, set new sort order and persist object to database.
	   */
	  private void processMap() {
		 Set<Entry<EntityProxyId<?>, Integer>> proxyIds = proxyMap.entrySet();
		 Iterator<Entry<EntityProxyId<?>, Integer>> iter = proxyIds.iterator();
		 while(iter.hasNext()){
			 Entry<EntityProxyId<?>, Integer> entry = iter.next();
			 Log.info("inside process Map iterator!");
			 Log.info("entry.getKey().toString(): "+entry.getKey().toString());
			 Log.info(entry.getValue().toString());
				requests.find(entry.getKey()).fire(new Receiver<Object>() {

					
					public void onFailure(ServerFailure error){
						Log.error(error.getMessage());
					}
					@Override
					public void onSuccess(Object response) {
						if(response instanceof  AnswerToAssQuestionProxy ){
							final int k =proxyMap.get((( AnswerToAssQuestionProxy ) response).stableId());
							AnswerToAssQuestionProxy  answerToAssQuest = (( AnswerToAssQuestionProxy ) response);

							Log.info("answerToAssQuestionRequestNonRoo wird gleich ausgef�hrt");

							requests.answerToAssQuestionRequestNonRoo().findAnswerToAssQuestion(answerToAssQuest.getId()).fire(new Receiver<Object>(){

								
								public void onFailure(ServerFailure error){
									Log.error(error.getMessage());
								}

								@Override
								public void onSuccess(
										Object response) {
						

									AnswerToAssQuestionProxy answerToAssQuest = (AnswerToAssQuestionProxy)response;
									Log.debug("Call successfull! "+answerToAssQuest.getId() );
									Log.debug("old sort order: "+answerToAssQuest.getSortOrder());
									
									AnswerToAssQuestionRequest request = requests.answerToAssQuestionRequest();
									
									
									answerToAssQuest = request.edit(answerToAssQuest);
									answerToAssQuest.setSortOrder(k);
			
									
									request.persist().using(answerToAssQuest).fire(new Receiver<Void>() {
								
										public void onSuccess(Void ignore) {
											Log.debug("SortOrder Sucessfull saved");
										}

										@Override
										public void onFailure(ServerFailure error) {
											Log.warn(McAppConstant.ERROR_WHILE_CREATE + " in Questiontype -"
													+ error.getMessage());
											if (error.getMessage().contains("ConstraintViolationException")) {
												Log.debug("Fehler ConstraintViolationException");
											}
										}

										@Override
										public void onViolation(Set<Violation> errors) {
											Log.debug("Fehlen beim erstellen, volation: "
													+ errors.toString());
											Iterator<Violation> iter = errors.iterator();
											String message = "";
											while (iter.hasNext()) {
												message += iter.next().getMessage() + "<br>";
											}
											Log.warn(McAppConstant.ERROR_WHILE_CREATE_VIOLATION
													+ " in Institution -" + message);

										}

									});
								
								}

						
						});

						
					}
					}			
					});
				
				
		 }//End Iterator proxyMap
		 
		 
	}//End of processMap()
	  
	  /**
	   * Process HashMap with questions. For each question in HashMap Request answerProxy, set new sort order and persist object to database.
	   */
	 private void processQuestionsMap(){
		 Set<Entry<EntityProxyId<?>, Integer>> questionProxyIds = questionProxyMap.entrySet();
		 Iterator<Entry<EntityProxyId<?>, Integer>> iterQ = questionProxyIds.iterator();
		 while(iterQ.hasNext()){
			 Entry<EntityProxyId<?>, Integer> questionEntry = iterQ.next();
			 Log.debug("inside process questionsMap iterator!");
			 Log.debug("questionEntry().toString(): "+questionEntry.getKey().toString());
			 Log.debug(questionEntry.getValue().toString());
			 

			 
			 requests.find(questionEntry.getKey()).fire(new Receiver<Object>() {

					public void onFailure(ServerFailure error){
						Log.error(error.getMessage());
					}

					@Override
					public void onSuccess(Object response) {

						final int l = questionProxyMap.get(((AssesmentQuestionProxy) response).stableId());
						AssesmentQuestionProxy assQuestion = ((AssesmentQuestionProxy) response);
						AssesmentQuestionRequest assQuestionRequest = requests.assesmentQuestionRequest();
						assQuestion = assQuestionRequest.edit(assQuestion);
						assQuestion.setOrderAversion(l);
						assQuestionRequest.persist().using(assQuestion).fire(new Receiver<Void>() {
							
							public void onSuccess(Void ignore) {
								Log.debug("SortOrder of Questions sucessfully saved");
							}

							@Override
							public void onFailure(ServerFailure error) {
								Log.warn(McAppConstant.ERROR_WHILE_CREATE + " in Questiontype -"
										+ error.getMessage());
								if (error.getMessage().contains("ConstraintViolationException")) {
									Log.debug("Fehler ConstraintViolationException");
								}
							}

							@Override
							public void onViolation(Set<Violation> errors) {
								Log.debug("Fehlen beim erstellen, volation: "
										+ errors.toString());
								Iterator<Violation> iter = errors.iterator();
								String message = "";
								while (iter.hasNext()) {
									message += iter.next().getMessage() + "<br>";
								}
								Log.warn(McAppConstant.ERROR_WHILE_CREATE_VIOLATION
										+ " in  -" + message);

							}

						});
						
					}
			    });
			 
		 }//End Iteration of questionProxyIds
		  
	  } //End processQuestionMap()
	 
	  /**
	   * Process HashMap with question events(Themengruppen). For each question event in HashMap Request questionEventProxy, set new sort order and persist object to database.
	   */
	 private void processEventMap(){
		 Set<Entry<EntityProxyId<?>, Integer>> eventProxyIds = eventProxyMap.entrySet();
		 Iterator<Entry<EntityProxyId<?>, Integer>> iterE = eventProxyIds.iterator();
		 while(iterE.hasNext()){
			 Entry<EntityProxyId<?>, Integer> eventEntry = iterE.next();
			 Log.info("inside process eventProxyIds iterator!");
			 Log.info("eventEntry().toString(): "+eventEntry.getKey().toString());
			 Log.info(eventEntry.getValue().toString());
			 requests.find(eventEntry.getKey()).fire(new Receiver<Object>() {
			
					
					public void onFailure(ServerFailure error){
						Log.error(error.getMessage());
					}

					@Override
					public void onSuccess(Object response) {
						
						final int m = eventProxyMap.get(((QuestionEventProxy) response).stableId());
						QuestionEventProxy questionEvent = ((QuestionEventProxy) response);
						


						requests.questionSumPerPersonRequestNonRoo().findQuestionSumPerPersonByEventNonRoo(questionEvent.getId()).fire(new Receiver<Object>(){

							public void onFailure(ServerFailure error){
								Log.error("questionSumPerPersonRequestNonRoo()"+error.getMessage());
							}
							
							@Override
							public void onSuccess(Object response) {

								QuestionSumPerPersonProxy questionSumProxy = ((QuestionSumPerPersonProxy)response);
								Log.debug("QuestionSumPerPerson ausgelesen: "+questionSumProxy.stableId());
								QuestionSumPerPersonRequest questionSumRequest = requests.questionSumPerPersonRequest();
								questionSumProxy = questionSumRequest.edit(questionSumProxy);
								questionSumProxy.setSort_order(m);
								questionSumRequest.persist().using(questionSumProxy).fire(new Receiver<Void>() {
									public void onFailure(ServerFailure error){
										Log.error("persist Sortorder QuestionSumProxy"+error.getMessage());
									}
									
									
									@Override
									public void onSuccess(Void response) {
										Log.debug("SortOrder of Event sucessfully saved");
										
									}
									
								});
							}
							
						});
						

						
					}
			    });
			 
		 }//End Iteration of questionProxyIds
		  
	  } //End processQuestionMap()
	  
	/**
	   * Log the drag start event.
	   * 
	   * @param event the event to log
	   */
	 @Override
	  public void onDragStart(DragStartEvent event) {
		  Log.debug("onDragStart: " + event);
	  }

	  /**
	   * Log the preview drag end event.
	   * 
	   * @param event the event to log
	   * @throws VetoDragException exception which may be thrown by any drag handler
	   */
	  @Override
	  public void onPreviewDragEnd(DragEndEvent event) throws VetoDragException {
		  Log.debug("<br>onPreviewDragEnd: " + event);
	  }

	  /**
	   * Log the preview drag start event.
	   * 
	   * @param event the event to log
	   * @throws VetoDragException exception which may be thrown by any drag handler
	   */
	  @Override
	  public void onPreviewDragStart(DragStartEvent event) throws VetoDragException {
	   
	    Log.debug("onPreviewDragStart: " + event);
	  }

	@Override
	public void createAssementBook(boolean createAVesion) {
		AssesmenBookDialogbox assementDialog=new AssesmenBookDialogboxImpl();
		final VerticalPanel panel = assementDialog.getExportPanel();
		Integer questionNumber = 1;
		
		SimplePanel panelToAdd = new SimplePanel();
		panelToAdd.setTitle("hallo");
		panel.add(panelToAdd);
		Iterator<Widget> questionTypeIter = bookAssesmentViewDetails.getWorkingArea().iterator();
		
		while (questionTypeIter.hasNext()) {
			Widget widget = (Widget) questionTypeIter.next();
			if (widget instanceof QuestionTypeDNDViewImpl) {
				QuestionTypeDNDViewImpl questionTypeContainer = (QuestionTypeDNDViewImpl) widget;

				QuestionTypeCountPerExamProxy questionType = questionTypeContainer.getProxy();
				Log.debug(questionType.getQuestionTypesAssigned().toString());
						
				Iterator<Widget> iterEvents = questionTypeContainer.getEventsContainer().iterator();
				while (iterEvents.hasNext()) {
					Widget widget2 = (Widget) iterEvents.next();
					if(widget2 instanceof EventViewImpl){
						EventViewImpl eventview = (EventViewImpl) widget2;
						Log.debug(eventview.getEventProxy().getEventName());
						
						Iterator<Widget> iterQuestion = eventview.getQuestionsContainer().iterator();
						while (iterQuestion.hasNext()) {
							Widget widget3 = (Widget) iterQuestion.next();
							if(widget3 instanceof QuestionViewImpl){
								QuestionViewImpl questionView = (QuestionViewImpl)widget3;
								Log.debug(questionView.getQuestionProxy().getQuestion().getQuestionText());
								panel.add(new HTML(questionNumber + ". " +questionView.getQuestionProxy().getQuestion().getQuestionText()));
								questionNumber ++;
								Integer answerCount = 1;
								String htmlString = "<ol  style=\"list-style-type:upper-alpha;\">";
								Iterator<Widget> iterAnswer = questionView.iterator();
								while (iterAnswer.hasNext()) {
									Widget widget4 = (Widget) iterAnswer.next();
									Log.info(widget4.getClass().getName());
									if(widget4 instanceof AnswerViewImpl){
										
										//if(answerCount==1) htmlString+="";
										AnswerViewImpl answer = (AnswerViewImpl) widget4;
										Log.debug(answer.getAnswer().getAnswerText());
										htmlString += "<li>"+answer.getAnswer().getAnswerText()+"</li>";
									}
								}
								if(answerCount==1) htmlString+="</ol>";
								panel.add(new HTML(htmlString));
								
								
								
							}
							
						}
						
						
					}
					
				}
			}
			
		}
		//		requests.assesmentQuestionRequestNonRoo().findAssementQuestionForAssementBook(assesment.getId()).fire(new Receiver<List<AssesmentQuestionProxy>>() {
//			
//	          @Override
//	          public void onSuccess(List<AssesmentQuestionProxy> response) {
//	        	  Log.info("create Assesment");
//	       
//	          }
//	          
//	          public void onFailure(ServerFailure error){
//	        	  ErrorPanel erorPanel = new ErrorPanel();
//	        	  erorPanel.setErrorMessage(error.getMessage());
//					Log.error(error.getMessage());
//				}
//	          @Override
//				public void onViolation(Set<Violation> errors) {
//					Iterator<Violation> iter = errors.iterator();
//					String message = "";
//					while(iter.hasNext()){
//						message += iter.next().getMessage() + "<br>";
//					}
//					Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION + " in Antworten auflisten -" + message);
//					
//		        	  ErrorPanel erorPanel = new ErrorPanel();
//		        	  erorPanel.setErrorMessage(message);
//
//				}
//		})
;
		
	}
	  
	  /**
	   * Moves a QuestionTypeCountPerExamProxy <b>up</b> one place in sort order.
	   * @param proxy
	   */
		@Override
		public void onUpInOrderClicked(QuestionTypeCountPerExamProxy proxy) {
			QuestionTypeCountPerExamProxy questionTypeCount = (QuestionTypeCountPerExamProxy)proxy;
			moveQuestionTypeCountPerExamRequestUp(questionTypeCount);
			view.reload(assesment);
			Log.debug("upInOrderClicked in Activity");
		} 
		  /**
		   * Moves a QuestionTypeCountPerExamProxy <b>down</b> one place in sort order.
		   * @param proxy
		   */
		
	@Override
	public void downInOrderClicked(QuestionTypeCountPerExamProxy proxy) {
		QuestionTypeCountPerExamProxy questionTypeCount = (QuestionTypeCountPerExamProxy)proxy;
		Log.debug("moveQuestionTypeCountPerExamRequestDown aus Activity proxy: "+questionTypeCount.stableId());
		moveQuestionTypeCountPerExamRequestDown(questionTypeCount);
		view.reload(assesment);
	}



	




}
