package medizin.client.a_nonroo.app.client.dnd3.ui;

import medizin.client.a_nonroo.app.client.dnd3.ui.QuestionView;
import medizin.client.a_nonroo.app.client.dnd3.ui.QuestionViewImpl;

import medizin.client.a_nonroo.app.client.dnd3.ui.AnswerView.Delegate;
import medizin.client.managed.request.AssesmentQuestionProxy;
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
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Draggable question.
 * @author masterthesis
 *
 */
public class QuestionViewImpl extends VerticalPanel implements QuestionView {
	private static QuestionViewImplUiBinder uiBinder = GWT
			.create(QuestionViewImplUiBinder.class);

	interface QuestionViewImplUiBinder extends
			UiBinder<Widget, QuestionViewImpl> {
	}



	public QuestionViewImpl() {
		//initWidget(uiBinder.createAndBindUi(this));
		
	}

	private AssesmentQuestionProxy questionProxy;
	private VerticalPanel verticalPanel;
	private Integer orderAversion;
	private Label questionTextLbl = new Label();

	
	
	
	
	//Getters n setters
	
	
	public Label getQuestionTextLbl() {
		return questionTextLbl;
	}

	public void setQuestionTextLbl(Label questionTextLbl) {
		this.questionTextLbl = questionTextLbl;
	}
	
	@Override
	public AssesmentQuestionProxy getQuestionProxy() {
		return questionProxy;
	}
	@Override
	public void setQuestionProxy(AssesmentQuestionProxy questionProxy) {
		this.questionProxy = questionProxy;
		init();
	}
	@Override
	public VerticalPanel getPanel() {
		
		return verticalPanel;
	}



	public void questionDropped(EntityProxyId<?> questionId) {
		delegate.questionDropped(questionId);
		
	}
	private Delegate delegate;
	
	
	@Override
	public void setDelegate(Delegate delegate) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setVerticalPanel(VerticalPanel vertPanel){
		this.verticalPanel = vertPanel;
	}
	@Override
	public void setOrderAversion(Integer orderAversion) {
		this.orderAversion = orderAversion;
		
		
	}
	@Override
	public Integer getOrderAversion() {
		
		return orderAversion;
	}
	/**
	 * Sets up question header and container for answers.
	 */
	public void init(){
		
		this.setOrderAversion(questionProxy.getOrderAversion());
		this.addStyleName("questionVert");

	    
	  
		//set up labels
		questionTextLbl.setText(questionProxy.getQuestion().getQuestionText());
		questionTextLbl.setHeight("auto");
		questionTextLbl.setWidth("650px");
	    
	   	final Label twistieOpenQuestion = new Label();
		twistieOpenQuestion.addStyleName("ui-icon ui-icon-triangle-1-e");
		
		final Label twistieCloseQuestion = new Label();
		twistieCloseQuestion.addStyleName("ui-icon ui-icon-triangle-1-s");
		
		HorizontalPanel headerPanel = new HorizontalPanel();
		headerPanel.add(twistieOpenQuestion);
		headerPanel.add(twistieCloseQuestion);
		twistieCloseQuestion.setVisible(false);
		headerPanel.add(questionTextLbl);
		headerPanel.setStyleName("questionHeader");
		headerPanel.setHeight("auto");
		
	    this.add(headerPanel);
	   

		twistieOpenQuestion.addClickHandler(new ClickHandler() {

		/**
		 * Twisties for opening and closing questions
		 */
		public	void onClick(ClickEvent event) {
				Log.debug("Twistie Frage anzeigen geklickt!");
				twistieOpenQuestion.setVisible(false);
				twistieCloseQuestion.setVisible(true);
				showQuestions();
			}

		});
		
		twistieCloseQuestion.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				Log.debug("Twistie Frage schliessen geklickt!");
				twistieOpenQuestion.setVisible(true);
				twistieCloseQuestion.setVisible(false);
				hideQuestions();

			}

		});
		
		
		
		
		
		
	}//End init

	public void showQuestions(){
		Integer widgetCount = this.getWidgetCount();
			for (int i = 1; i < widgetCount; i++){
			this.getWidget(i).setVisible(true);
		}
	}//End showQuestions
	
	public void hideQuestions(){
	Integer widgetCount = this.getWidgetCount();
		for (int i = 1; i < widgetCount; i++){
			this.getWidget(i).setVisible(false);
		}
	}//End hideQuestions
}
