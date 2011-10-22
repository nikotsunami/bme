package medizin.client.a_nonroo.app.client.dnd3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import medizin.client.a_nonroo.app.client.McAppConstant;
import medizin.client.a_nonroo.app.client.dnd3.ui.AnswerViewImpl;
import medizin.client.a_nonroo.app.client.dnd3.ui.EventViewImpl;
import medizin.client.a_nonroo.app.client.dnd3.ui.QuestionViewImpl;
import medizin.client.a_nonroo.app.place.PlaceQuestiontypes;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.AnswerToAssQuestionProxy;
import medizin.client.managed.request.AnswerToAssQuestionRequest;
import medizin.client.managed.request.AssesmentQuestionProxy;
import medizin.client.managed.request.AssesmentQuestionRequest;
import medizin.client.managed.request.QuestionSumPerPersonRequest;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.managed.request.QuestionRequest;
import medizin.client.managed.request.QuestionSumPerPersonProxy;
import medizin.client.managed.request.QuestionTypeCountPerExamProxy;
import medizin.client.managed.request.QuestionTypeProxy;
import medizin.client.managed.request.QuestionEventProxy;

import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.ServerFailure;
import com.google.gwt.requestfactory.shared.Violation;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import com.allen_sauer.gwt.dnd.client.DragEndEvent;
import com.allen_sauer.gwt.dnd.client.DragHandler;
import com.allen_sauer.gwt.dnd.client.DragStartEvent;
import com.allen_sauer.gwt.dnd.client.VetoDragException;
import com.allen_sauer.gwt.dnd.client.drop.DropController;
import com.allen_sauer.gwt.log.client.Log;

/**
 * @deprecated
 * Shared drag handler which display events as they are received by the various drag controllers.
 */
public final class DemoDragHandler implements DragHandler {

  /**
   * CSS blue.
   */
  private static final String BLUE = "#4444BB";

  /**
   * CSS green.
   */
  private static final String GREEN = "#44BB44";

  /**
   * CSS red.
   */
  private static final String RED = "#BB4444";

private McAppRequestFactory requests;

  private Map<EntityProxyId<?>, Integer> proxyMap = new HashMap<EntityProxyId<?>, Integer>();
  
  private Map<EntityProxyId<?>, Integer> questionProxyMap = new HashMap<EntityProxyId<?>, Integer>();
  
  private Map<EntityProxyId<?>, Integer> eventProxyMap = new HashMap<EntityProxyId<?>, Integer>();

  
  private AnswerToAssQuestionProxy answerToAssQuest;

  public DemoDragHandler(McAppRequestFactory requests) {
   this.requests = requests;
  }

  /**
   * Log the drag end event.
   * 
   * @param event the event to log
   */
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
    	Log.info("ProxyID des gedraggten Events: "+eventView.getEventProxy().stableId());
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
    		if (myWidget instanceof AnswerViewImpl){
    			AnswerViewImpl answView = (AnswerViewImpl) myWidget;
    			Log.warn(answView.getAnswer().stableId().toString());
    			proxyMap.put(answView.getAnswer().stableId(), i);
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


  
  
  private void processMap() {
	 Set<Entry<EntityProxyId<?>, Integer>> proxyIds = proxyMap.entrySet();
	 //proxyMap.clear();
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
					if(response instanceof AnswerProxy){
						final int k =proxyMap.get(((AnswerProxy) response).stableId());
						AnswerProxy answer = ((AnswerProxy) response);

						Log.info("answerToAssQuestionRequestNonRoo wird gleich ausgef�hrt");
						requests.answerToAssQuestionRequestNonRoo().findAnswerToAssQuestionByAnswer(answer.getId()).fire(new Receiver<List<AnswerToAssQuestionProxy>>(){
				

							
							public void onFailure(ServerFailure error){
								Log.error(error.getMessage());
							}

							@Override
							public void onSuccess(
									List<AnswerToAssQuestionProxy> response) {
					
								//final AnswerToAssQuestionProxy answerToAssQuest = response.get(0);
								answerToAssQuest = response.get(0);
								
								
								Log.info("Call hat funktioniert! "+response.size() );
								Log.info("SortOrder vor dem Speichern: "+answerToAssQuest.getSortOrder());
								
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
  

 private void processQuestionsMap(){
	 Set<Entry<EntityProxyId<?>, Integer>> questionProxyIds = questionProxyMap.entrySet();
	 Iterator<Entry<EntityProxyId<?>, Integer>> iterQ = questionProxyIds.iterator();
	 while(iterQ.hasNext()){
		 Entry<EntityProxyId<?>, Integer> questionEntry = iterQ.next();
		 Log.info("inside process questionsMap iterator!");
		 Log.info("questionEntry().toString(): "+questionEntry.getKey().toString());
		 Log.info(questionEntry.getValue().toString());
		 
		 //Long questionId = Long.valueOf(questionEntry.getKey().toString());
		// Request<QuestionProxy> questionProxy = requests.questionRequest().findQuestion(questionId);
		 
		 requests.find(questionEntry.getKey()).fire(new Receiver<Object>() {

				
				public void onFailure(ServerFailure error){
					Log.error(error.getMessage());
				}

				@Override
				public void onSuccess(Object response) {
					// TODO Auto-generated method stub
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
					
					//TODO Anhand Event question_typecount_per_exam auslesen

					requests.questionSumPerPersonRequestNonRoo().findQuestionSumPerPersonByEventNonRoo(questionEvent.getId()).fire(new Receiver<Object>(){

						public void onFailure(ServerFailure error){
							Log.error("questionSumPerPersonRequestNonRoo()"+error.getMessage());
						}
						
						@Override
						public void onSuccess(Object response) {
							// TODO Sortorder in question_typecount_per_exam speichern
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
  public void onDragStart(DragStartEvent event) {
	  Log.debug("onDragStart: " + event);
  }

  /**
   * Log the preview drag end event.
   * 
   * @param event the event to log
   * @throws VetoDragException exception which may be thrown by any drag handler
   */
  public void onPreviewDragEnd(DragEndEvent event) throws VetoDragException {
	  Log.debug("<br>onPreviewDragEnd: " + event);
  }

  /**
   * Log the preview drag start event.
   * 
   * @param event the event to log
   * @throws VetoDragException exception which may be thrown by any drag handler
   */
  public void onPreviewDragStart(DragStartEvent event) throws VetoDragException {
   
    Log.debug("onPreviewDragStart: " + event);
  }

  private void clear() {
   
  }

  private void log(String text, String color) {
//    eventTextArea.setHTML(eventTextArea.getHTML()
//        + (eventTextArea.getHTML().length() == 0 ? "" : "<br>") + "<span style='color: " + color
//        + "'>" + text + "</span>");
  }
}