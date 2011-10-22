package medizin.client.a_nonroo.app.client.dnd3.ui;

import medizin.client.a_nonroo.app.client.dnd3.ui.EventView;
import medizin.client.a_nonroo.app.client.dnd3.ui.AnswerView.Delegate;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.QuestionProxy;

import com.allen_sauer.gwt.dnd.client.PickupDragController;
import com.allen_sauer.gwt.dnd.client.drop.VerticalPanelDropController;
import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * A draggable event with a QuestionEventProxy.
 * @author masterthesis
 *
 */

public class EventViewImpl extends VerticalPanel implements EventView {


	private QuestionEventProxy eventProxy; 
	private Label headerNamelbl = new Label();
	private VerticalPanel questionsContainer = new VerticalPanel();
	
	private AbsolutePanel questionEventContent = new AbsolutePanel();
	
	
	
	//Getters and Setters
	
	
	
	public AbsolutePanel getQuestionEventContent() {
		return questionEventContent;
	}

	public VerticalPanel getQuestionsContainer() {
		return questionsContainer;
	}

	public void setQuestionsContainer(VerticalPanel questionsContainer) {
		this.questionsContainer = questionsContainer;
	}

	public void setQuestionEventContent(AbsolutePanel questionEventContent) {
		this.questionEventContent = questionEventContent;
	}

	public Label getHeaderNamelbl() {
		return headerNamelbl;
	}

	public void setHeaderNamelbl(Label headerNamelbl) {
		this.headerNamelbl = headerNamelbl;
	}
	private VerticalPanel verticalPanel;
	private Integer orderAversion;

	public EventViewImpl() {

		
	}

	public QuestionEventProxy getEventProxy() {
		return eventProxy;
	}

	@Override
	public void  setEventProxy(QuestionEventProxy eventProxy)
	 {
		this.eventProxy = eventProxy;
		/**
		 * Sets up all design elements after proxy is set.
		 */
		init();
	}



	public void questionDropped(EntityProxyId<?> questionId) {
		delegate.questionDropped(questionId);
		
	}
	private Delegate delegate;
	
	
	@Override
	public void setDelegate(Delegate delegate) {
	
		
	}
	@Override
	public void setVerticalPanel(VerticalPanel vertPanel){
		this.verticalPanel = vertPanel;
	}

	public void init(){
		

		/**
		 *Set up buttons and clickable labels
		 */
		questionEventContent.setStyleName("questionEventContent");
		
		final Label twistieOpenQuestionEvent = new Label();
		twistieOpenQuestionEvent.addStyleName("ui-icon ui-icon-triangle-1-e");

		final Label twistieCloseQuestionEvent = new Label();
		twistieCloseQuestionEvent.addStyleName("ui-icon ui-icon-triangle-1-s");

		
		
		final Label tagLabelQuestionEvent = new Label();
		tagLabelQuestionEvent.addStyleName("ui-icon ui-icon-tag");
		
		
		AbsolutePanel eventHeader = new AbsolutePanel();

		eventHeader.setPixelSize(760, 25);
		eventHeader.setStyleName("eventHeader");
		
		headerNamelbl.setText(eventProxy.getEventName());
		headerNamelbl.setWidth("730px");
		
		eventHeader.add(twistieOpenQuestionEvent, 2,3);
		twistieCloseQuestionEvent.setVisible(false);
		eventHeader.add(twistieCloseQuestionEvent,2,3);
		
		eventHeader.add(headerNamelbl,19,3);
		
		eventHeader.add(tagLabelQuestionEvent,740,3);
		
		questionEventContent.setVisible(false);
		
		

		this.add(eventHeader);
		this.add(questionEventContent);
		questionEventContent.add(questionsContainer);

		twistieOpenQuestionEvent.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				Log.debug("Twistie Themenblock anzeigen geklickt!");
				twistieOpenQuestionEvent.setVisible(false);
				twistieCloseQuestionEvent.setVisible(true);

				tagLabelQuestionEvent.setVisible(false);
				questionEventContent.setVisible(true);
			}

		});

		twistieCloseQuestionEvent.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				Log.debug("Twistie Themenblock schliessen geklickt!");
				twistieOpenQuestionEvent.setVisible(true);
				twistieCloseQuestionEvent.setVisible(false);
				tagLabelQuestionEvent.setVisible(true);
				questionEventContent.setVisible(false);
			}

		});
	}


}
