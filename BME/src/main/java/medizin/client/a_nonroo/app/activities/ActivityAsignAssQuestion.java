package medizin.client.a_nonroo.app.activities;

import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import medizin.client.a_nonroo.app.client.ErrorPanel;
import medizin.client.a_nonroo.app.client.McAppConstant;
import medizin.client.a_nonroo.app.client.ui.AcceptPersonViewImpl;
import medizin.client.a_nonroo.app.client.ui.SystemOverviewView;
import medizin.client.a_nonroo.app.client.ui.SystemOverviewViewImpl;
import medizin.client.a_nonroo.app.client.ui.assignquestion.AddQuestionsTabPanel;
import medizin.client.a_nonroo.app.client.ui.assignquestion.AddQuestionsTabPanelImpl;
import medizin.client.a_nonroo.app.client.ui.assignquestion.AnswerView;
import medizin.client.a_nonroo.app.client.ui.assignquestion.AnswerViewImpl;
import medizin.client.a_nonroo.app.client.ui.assignquestion.AsignAssQuestionView;
import medizin.client.a_nonroo.app.client.ui.assignquestion.AsignAssQuestionViewImpl;
import medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentQuestionPanel;
import medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentQuestionPanelImpl;
import medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentQuestionView;
import medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentQuestionViewImpl;
import medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentTabPanel;
import medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentTabPanelImpl;
import medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionPanel;
import medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionPanelImpl;
import medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionView;
import medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionViewImpl;

import medizin.client.a_nonroo.app.place.PlaceAcceptPerson;
import medizin.client.a_nonroo.app.place.PlaceAsignAssQuestion;
import medizin.client.a_nonroo.app.place.PlaceSystemOverview;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.AnswerToAssQuestionProxy;
import medizin.client.managed.request.AnswerToAssQuestionRequest;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.AssesmentQuestionProxy;
import medizin.client.managed.request.AssesmentQuestionRequest;
import medizin.client.managed.request.QuestionProxy;
import medizin.server.domain.Answer;
import medizin.server.domain.AnswerToAssQuestion;

import com.allen_sauer.gwt.dnd.client.DragEndEvent;
import com.allen_sauer.gwt.dnd.client.DragHandler;
import com.allen_sauer.gwt.dnd.client.DragStartEvent;
import com.allen_sauer.gwt.dnd.client.PickupDragController;
import com.allen_sauer.gwt.dnd.client.VetoDragException;
import com.allen_sauer.gwt.dnd.client.drop.VerticalPanelDropController;
import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.ServerFailure;
import com.google.gwt.requestfactory.shared.Violation;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class ActivityAsignAssQuestion extends AbstractActivityWrapper implements DragHandler, AsignAssQuestionView.Presenter,
AddQuestionsTabPanel.Delegate, QuestionPanel.Delegate, QuestionView.Delegate, AssesmentQuestionView.Delegate, AssesmentTabPanel.Delegate {

	private PlaceAsignAssQuestion asignAssQuestionPlace;
	private AcceptsOneWidget widget;
	private AsignAssQuestionView view;


	private McAppRequestFactory requests;
	private PlaceController placeController;
	private AddQuestionsTabPanel addQuestionsTabPanel;
	private AssesmentQuestionPanel assementQuestionPanel;
	private AssesmentTabPanel assesmentTabPanel;
	private QuestionPanel questionPanel;


	@Inject
	public ActivityAsignAssQuestion(PlaceAsignAssQuestion place,
			McAppRequestFactory requests, PlaceController placeController) {
		super(place, requests, placeController);
		this.asignAssQuestionPlace = place;
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
	
	PickupDragController dragController;
	private VerticalPanelDropController assesmentQuestionPanelDropController;
	
	@Override
	public void start(AcceptsOneWidget widget, EventBus eventBus) {
		super.start(widget, eventBus);

	}

	@Override
	public void start2(AcceptsOneWidget widget, EventBus eventBus) {
		AsignAssQuestionView asignAssQuestionView = new AsignAssQuestionViewImpl();
		asignAssQuestionView.setPresenter(this);
		this.widget = widget;
		this.view = asignAssQuestionView;
        widget.setWidget(asignAssQuestionView.asWidget());
        addQuestionsTabPanel = view.getAddQuestionsTabPanel();
        questionPanel = view.getQuestionPanel();
        assementQuestionPanel = view.getAssesmentQuestionPanel();
        assesmentTabPanel = view.getAssesmentTabPanel();
        assesmentTabPanel.setDelegate(this);
        
        //initialize the dragcontroler on the widget
        dragController = new PickupDragController(RootPanel.get(),false);
        dragController.addDragHandler(this);
        
		//questionPanelDropController = new VerticalPanelDropController(questionPanel.getQuestionDisplayPanel());
		//dragController.registerDropController(questionPanelDropController);
		assesmentQuestionPanelDropController = new VerticalPanelDropController(assementQuestionPanel.getAssesmentQuestionDisplayPanel());
		
		dragController.registerDropController(assesmentQuestionPanelDropController);
		
		
		
        initAssementTabPanel();
        initAddQuestionsTabPanel();

        

	}
	
	private void initAddQuestionsTabPanel() {
		
		addQuestionsTabPanel.setDelegate(this);
		
		
	}
	
	private void initAssementTabPanel() {
		requests.assesmentRequestNonRoo().findAssesmentsOpenBetween().with("mc").fire(new Receiver<List<AssesmentProxy>>(){

			@Override
			public void onSuccess(List<AssesmentProxy> response) {
				Log.debug("Geholte Assements: " + response.size());
				Iterator<AssesmentProxy> iter = response.iterator();
				while(iter.hasNext()){
					assesmentTabPanel.addAssementTab(iter.next());
					
				}
				//assesmentTabPanel.setSelectedTab(0);
		        //initAssementQuestionPanel();
		       
			}
			
		});
		
	}
	private VerticalPanelDropController questionPanelDropController;
	
	private void initQuestionPanel(int action, AssesmentProxy assesment) {

		Log.debug("Assesmet selected " + assesment.getName());
		

		if (action==0){
			requests.assesmentQuestionRequestNonRoo().findAssesmentQuestionsByMcProposal(assesment.getMc().getId()).with("question.rewiewer","question.autor","question.keywords","question.questEvent","question.comment","question.questionType").fire(new Receiver<List<AssesmentQuestionProxy>>() {

				@Override
				public void onSuccess(List<AssesmentQuestionProxy> response) {
					questionPanel.removeAll();
					Iterator<AssesmentQuestionProxy> iter = response.iterator();
					while(iter.hasNext()){
						AssesmentQuestionView assesmentQuestion = new AssesmentQuestionViewImpl();
						assesmentQuestion.setProxy(iter.next(), true);
						assesmentQuestion.setDelegate(ActivityAsignAssQuestion.this);
						dragController.makeDraggable(assesmentQuestion.asWidget(), assesmentQuestion.getDragControler());
						questionPanel.addAssesmentQuestion(assesmentQuestion);
					}
					
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
		else if (action == 1){
			requests.assesmentQuestionRequestNonRoo().findAssesmentQuestionsByMc(assesment.getMc().getId()).with("question.rewiewer","question.autor","question.keywords","question.questEvent","question.comment","question.questionType").fire(new Receiver<List<AssesmentQuestionProxy>>() {

				@Override
				public void onSuccess(List<AssesmentQuestionProxy> response) {
					questionPanel.removeAll();
					Iterator<AssesmentQuestionProxy> iter = response.iterator();
					while(iter.hasNext()){
						AssesmentQuestionView assesmentQuestion = new AssesmentQuestionViewImpl();
						assesmentQuestion.setProxy(iter.next(), true);
						assesmentQuestion.setDelegate(ActivityAsignAssQuestion.this);
						dragController.makeDraggable(assesmentQuestion.asWidget(), assesmentQuestion.getDragControler());
						questionPanel.addAssesmentQuestion(assesmentQuestion);
					}
					
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
		else if (action == 2){
			requests.questionRequestNonRoo().findQuestionsByMc(assesment.getMc().getId()).with("rewiewer", "questEvent", "autor", "questionType", "keywords").fire(new Receiver<List<QuestionProxy>>() {

				@Override
				public void onSuccess(List<QuestionProxy> response) {
					questionPanel.removeAll();
					Iterator<QuestionProxy> iter = response.iterator();
					while(iter.hasNext()){
						QuestionView question = new QuestionViewImpl();
						question.setProxy(iter.next());
						question.setDelegate(ActivityAsignAssQuestion.this);
						dragController.makeDraggable(question.asWidget(), question.getDragControler());
						questionPanel.addQuestion(question);
					}
					
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
		
	}



	private void initAssementQuestionPanel() {
		
		
		requests.assesmentQuestionRequestNonRoo().findAssesmentQuestionsByAssesment(assesmentTabPanel.getActiveTab().getId()).with("question.rewiewer","question.autor","question.keywords","question.questEvent","question.comment","question.questionType").fire(new Receiver<List<AssesmentQuestionProxy>>() {

			@Override
			public void onSuccess(List<AssesmentQuestionProxy> response) {
				assementQuestionPanel.removeAll();
				Iterator<AssesmentQuestionProxy> iter = response.iterator();
				while(iter.hasNext()){
					AssesmentQuestionView question = new AssesmentQuestionViewImpl();
					question.setProxy(iter.next(), false);
					question.setDelegate(ActivityAsignAssQuestion.this);
					//dragController.makeDraggable(question.asWidget(), question.getDragControler());
					assementQuestionPanel.addAssesmentQuestion(question);
				}
				
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
	public void goTo(Place place) {
		placeController.goTo(place);
	}

	@Override
	public void tabQuestionClicked(int index) {
		initQuestionPanel(index, assesmentTabPanel.getActiveTab());
		
	}

	@Override
	public void twistieOpenQuestionClicked(final QuestionView questionView) {
		
		requests.answerRequestNonRoo().findAnswersByQuestion(questionView.getProxy().getId()).fire(new Receiver<List<AnswerProxy>>() {

			@Override
			public void onSuccess(List<AnswerProxy> response) {

				Iterator<AnswerProxy> iter = response.iterator();

				while (iter.hasNext()) {
					AnswerProxy answerProxy = (AnswerProxy) iter.next();
					AnswerView answer = new AnswerViewImpl();
					answer.setProxy(answerProxy, true);
					questionView.addAnswer(answer);
					
				} 
			

				
			}
		});
	}

	@Override
	public void addAssQuestionClicked() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tabClicked(AssesmentProxy assesment) {
		 
		 initQuestionPanel(addQuestionsTabPanel.getActiveTab(), assesment);
		 initAssementQuestionPanel();
		
	}

	@Override
	public void onDragEnd( DragEndEvent event) {
		// TODO Auto-generated method stub
		   Log.debug("onDragEnd: " + event);
		   if (event.getContext().finalDropController != null) {
			   Log.info(event.getSource().getClass().toString());
			   if(event.getSource() instanceof AssesmentQuestionView)
			   {
				   final AssesmentQuestionView assesmentQuestionViewAktiv = ((AssesmentQuestionView)event.getSource());
				   Log.debug("Is AssesmentQuestionView");
				   requests.assesmentQuestionRequestNonRoo().copyAssesmentQuestion(assesmentQuestionViewAktiv.getProxy().getId(), assesmentTabPanel.getActiveTab().getId()).with("question.rewiewer","question.autor","question.keywords","question.questEvent","question.comment","question.questionType").fire(new Receiver<AssesmentQuestionProxy>() {

						@Override
						public void onSuccess(AssesmentQuestionProxy response) {
							 Log.debug("sucesfull copied");
							assesmentQuestionViewAktiv.setProxy(response, false);
							
							
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
			   else if (event.getSource() instanceof QuestionView){
				   Log.debug("Is QuestionView");
			   }
			   
		    
		    	Log.info("Droptarget-Target: " + event.getContext().finalDropController.getDropTarget().getParent().getClass().getName());
		    	Log.info("Droptarget-Parent: " + event.getContext().finalDropController.getDropTarget().getParent().getClass().getName());
		    	Log.info("Droptarget-Parent: " + event.getContext().finalDropController.getDropTarget().getParent().getParent().getClass().getName());
		    }
		
	}

	@Override
	public void onDragStart(DragStartEvent event) {
		// TODO Auto-generated method stub
		  Log.debug("onDragStart: " + event);
	}

	@Override
	public void onPreviewDragEnd(DragEndEvent event) throws VetoDragException {
		// TODO Auto-generated method stub
		if(event.getContext().finalDropController!=null){
			  Log.debug("onPreviewDragEnd: " + event);  
			   if(event.getSource() instanceof AssesmentQuestionView)
			   {
				   AssesmentQuestionView assesmentQuestionViewAktiv = ((AssesmentQuestionView)event.getSource());
				   Iterator<Widget> iter = assementQuestionPanel.getAssesmentQuestionDisplayPanel().iterator();
				   while (iter.hasNext()){
					   Widget wid = iter.next();
					   if (wid instanceof AssesmentQuestionView){
						   if (((AssesmentQuestionView) wid).getProxy().getQuestion().getId() == assesmentQuestionViewAktiv.getProxy().getQuestion().getId()){
							  // Log.error("Keine zwei gleichen Fragen!");
							   ErrorPanel erPan = new ErrorPanel();
							   erPan.setErrorMessage("Keine zwei gleichen Fragen pro Prüfung!");
							   throw new VetoDragException();
						   }
					   }
				   }
			   }
			   if(event.getSource() instanceof QuestionView)
			   {
				   final QuestionView questionViewAktiv = ((QuestionView)event.getSource());
				   Iterator<Widget> iter = assementQuestionPanel.getAssesmentQuestionDisplayPanel().iterator();
				   while (iter.hasNext()){
					   Widget wid = iter.next();
					   if (wid instanceof AssesmentQuestionView){
						   if (((AssesmentQuestionView) wid).getProxy().getQuestion().getId() == questionViewAktiv.getProxy().getId()){
							   //Log.error("Keine zwei gleichen Fragen!");
							   ErrorPanel erPan = new ErrorPanel();
							   erPan.setErrorMessage("Keine zwei gleichen Fragen pro Prüfung!");
							   throw new VetoDragException();
						   }
					   }
				   }
				   
				   AssesmentQuestionRequest assesmentQuestionRequest = requests.assesmentQuestionRequest();
				   //AnswerToAssQuestionRequest answerToAssQuestionRequest = requests.answerToAssQuestionRequest();
				   Iterator<Widget> answerPanelIterator = questionViewAktiv.getAnswerPanel().iterator();
				   
				   AssesmentQuestionProxy assQuestion = assesmentQuestionRequest.create(AssesmentQuestionProxy.class);
				   assQuestion.setAssesment(assesmentTabPanel.getActiveTab());
				   assQuestion.setDateAdded(new Date());
				   assQuestion.setIsAssQuestionAcceptedAdmin(false);
				   assQuestion.setIsAssQuestionAcceptedAutor(true); //If is Propolsal set false
				   assQuestion.setIsAssQuestionAcceptedRewiever(false);
				   assQuestion.setIsAssQuestionAdminProposal(false); //If is Propolsal set true
				   assQuestion.setQuestion(questionViewAktiv.getProxy());
				   assQuestion.setRewiewer(questionViewAktiv.getProxy().getRewiewer());
				   assQuestion.setAutor(questionViewAktiv.getProxy().getAutor()); //TODO Ändern auf aktuell eingeloggte Person
				   
				   Set<AnswerToAssQuestionProxy> answerToAssQuestionProxySet =  new HashSet<AnswerToAssQuestionProxy>();
				   
				   while (answerPanelIterator.hasNext()) {
					Widget widget = (Widget) answerPanelIterator.next();
					if (widget instanceof AnswerView){
						AnswerView answerView = (AnswerView) widget;
						if(answerView.getChecked()){
							AnswerToAssQuestionProxy answerToAssQuestionProxy = assesmentQuestionRequest.create(AnswerToAssQuestionProxy.class);
							answerToAssQuestionProxy.setAnswers(answerView.getProxy());
							answerToAssQuestionProxy.setAssesmentQuestion(assQuestion);
							answerToAssQuestionProxy.setSortOrder(1);
							Log.debug(answerToAssQuestionProxy.toString());
							//answerToAssQuestionRequest.persist().using(answerToAssQuestionProxy);
							answerToAssQuestionProxySet.add(answerToAssQuestionProxy);
						}
					  }
				   }
				   
				   
				   
				   assQuestion.setAnswersToAssQuestion(answerToAssQuestionProxySet);
			     assesmentQuestionRequest.persist().using(assQuestion).with("answersToAssQuestion").fire(new Receiver<Void>() {

						@Override
						public void onSuccess(Void ignore) {
							 Log.debug("sucesfull saved");
							
							 replaceQuestionThroughAssesmentQuestion(assesmentTabPanel.getActiveTab());
							 
							
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
		}
	}

	protected void replaceQuestionThroughAssesmentQuestion( final AssesmentProxy assesment) {
		Iterator<Widget> iter = assementQuestionPanel.getAssesmentQuestionDisplayPanel().iterator();
		
		while (iter.hasNext()) {
			Widget widget = (Widget) iter.next();
			   if (widget instanceof QuestionView){
				   final Integer index = new Integer( assementQuestionPanel.getAssesmentQuestionDisplayPanel().getWidgetIndex(widget));
				   
				   requests.assesmentQuestionRequestNonRoo()
				   			.findAssesmentQuestionByAssesmentAndQuestion(((QuestionView)widget)
						   .getProxy().getId(), assesment.getId()).with("question.rewiewer","question.autor","question.keywords","question.questEvent","question.comment","question.questionType").fire(new Receiver<AssesmentQuestionProxy>(){

							@Override
							public void onSuccess(AssesmentQuestionProxy responce) {
								if(responce==null) Log.warn("responce null ");
								//überprüfen ob reihenfolge nicht geändert hat zur sicherheit
								Widget wid = assementQuestionPanel.getAssesmentQuestionDisplayPanel().getWidget(index);
								if(wid instanceof QuestionView){
									 assementQuestionPanel.getAssesmentQuestionDisplayPanel().remove(wid);
									 AssesmentQuestionView assesmentQuestionView = new AssesmentQuestionViewImpl();
									 assesmentQuestionView.setProxy(responce, false);
									 assesmentQuestionView.setDelegate(ActivityAsignAssQuestion.this);
									
									 assementQuestionPanel.addAssesmentQuestion(assesmentQuestionView);
									 assesmentQuestionView.setOpen();
								}
								else {
									replaceQuestionThroughAssesmentQuestion(assesment);
								}

								
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
		}
		
//		

		
	}

	@Override
	public void onPreviewDragStart(DragStartEvent event)
			throws VetoDragException {
		// TODO Auto-generated method stub
		Log.debug("onPreviewDragStart: " + event);
		
	}

	@Override
	public void twistieOpenAssQuestionClicked(final AssesmentQuestionView questionView, final boolean isInAssement) {
		requests.answerToAssQuestionRequestNonRoo().findAnswerToAssQuestionByAssesmentQuestion(questionView.getProxy().getId()).with("answers").fire(new Receiver<List<AnswerToAssQuestionProxy>>() {

			@Override
			public void onSuccess(List<AnswerToAssQuestionProxy> response) {

				Iterator<AnswerToAssQuestionProxy> iter = response.iterator();

				while (iter.hasNext()) {
					AnswerToAssQuestionProxy answerToAssQuestionProxy = (AnswerToAssQuestionProxy) iter.next();
					AnswerView answer = new AnswerViewImpl();
					answer.setProxy(answerToAssQuestionProxy, false);
					questionView.addAnswer(answer);
					
				} 
			

				
			}
		});
		
	}

	@Override
	public void addQuestionClicked() {
		// TODO Auto-generated method stub
		
	}

}
