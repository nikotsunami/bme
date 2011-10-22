package medizin.client.a_nonroo.app.client.dnd3.ui;

import java.util.Iterator;
import java.util.Set;

import medizin.client.a_nonroo.app.client.dnd3.ui.QuestionTypeDNDView;

import medizin.client.managed.request.QuestionTypeCountPerExamProxy;
import medizin.client.managed.request.QuestionTypeProxy;

import com.allen_sauer.gwt.log.client.Log;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

import com.google.gwt.user.client.ui.AbsolutePanel;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * View to display a QuestionTypeCountPerExam with corresponding QuestionTypes in the drag and drop area of the AssesmentBookDetailsView.
 * @author masterthesis
 *
 */
public class QuestionTypeDNDViewImpl extends VerticalPanel implements
		QuestionTypeDNDView {
	private  QuestionTypeCountPerExamProxy proxy;
	private AbsolutePanel questionTypeContent = new AbsolutePanel();
	private AbsolutePanel typeHeader = new AbsolutePanel();
	private VerticalPanel eventsContainer = new VerticalPanel();
	private Label questionTypeNamelbl = new Label();
	private  AbsolutePanel questionsContainer = new AbsolutePanel();
	private Label twistieOpen = new Label();
	private Label twistieClose = new Label();
	private Label upInOrder = new Label();
	private Label downInOrder = new Label();
	private Label tagLabel = new Label();
	private Delegate delegate;
	
	//Getters and setters
	
	@Override
	public AbsolutePanel getQuestionTypeContent() {
		return questionTypeContent;
	}
	public QuestionTypeCountPerExamProxy getProxy() {
		return proxy;
	}
	@Override
	public void setProxy(QuestionTypeCountPerExamProxy proxy) {
		this.proxy = proxy;
		init();
	}
	public void setQuestionTypeContent(AbsolutePanel questionTypeContent) {
		this.questionTypeContent = questionTypeContent;
	}
	public AbsolutePanel getTypeHeader() {
		return typeHeader;
	}
	public void setTypeHeader(AbsolutePanel typeHeader) {
		this.typeHeader = typeHeader;
	}
	public Label getQuestionTypeNamelbl() {
		return questionTypeNamelbl;
	}
	public void setQuestionTypeNamelbl(Label questionTypeNamelbl) {
		this.questionTypeNamelbl = questionTypeNamelbl;
	}
	@Override
	public AbsolutePanel getQuestionsContainer() {
		return questionsContainer;
	}
	public void setQuestionsContainer(AbsolutePanel questionsContainer) {
		this.questionsContainer = questionsContainer;
	}
	public Label getTwistieOpen() {
		return twistieOpen;
	}
	public void setTwistieOpen(Label twistieOpen) {
		this.twistieOpen = twistieOpen;
	}
	public Label getTwistieClose() {
		return twistieClose;
	}
	public void setTwistieClose(Label twistieClose) {
		this.twistieClose = twistieClose;
	}
	public Label getUpInOrder() {
		return upInOrder;
	}
	public void setUpInOrder(Label upInOrder) {
		this.upInOrder = upInOrder;
	}
	public Label getDownInOrder() {
		return downInOrder;
	}
	public void setDownInOrder(Label downInOrder) {
		this.downInOrder = downInOrder;
	}
	public Label getTagLabel() {
		return tagLabel;
	}
	public void setTagLabel(Label tagLabel) {
		this.tagLabel = tagLabel;
	}

	@Override
	public void setDelegate(Delegate delegate) {
		this.delegate = delegate;
		
	}

	//End getters and setters
	
	@Override
	public VerticalPanel getEventsContainer() {
		return eventsContainer;
	}
	public void setEventsContainer(VerticalPanel eventsContainer) {
		this.eventsContainer = eventsContainer;
	}
	public QuestionTypeDNDViewImpl(){
		
	}
	
	/**
	 * Sets up view for QuestionType
	 */
	public void init(){
		
		twistieOpen.addStyleName("ui-icon ui-icon-triangle-1-e");
		twistieClose.addStyleName("ui-icon ui-icon-triangle-1-s");
		twistieClose.setVisible(false);
		upInOrder.addStyleName("ui-icon ui-icon-carat-1-n");
		downInOrder.addStyleName("ui-icon ui-icon-carat-1-s");
		tagLabel.addStyleName("ui-icon ui-icon-tag");
		this.add(typeHeader);
		this.add(questionTypeContent);
		typeHeader.setPixelSize(820, 25);
		typeHeader.setStyleName("questionTypeHeader");
		typeHeader.add(twistieClose, 1, 3);
		typeHeader.add(twistieOpen, 1, 3);
		typeHeader.add(questionTypeNamelbl, 19, 3);
		typeHeader.add(upInOrder,740,3);
		typeHeader.add(downInOrder,760,3);
		typeHeader.add(tagLabel,780,3);
		
		
		questionTypeContent.setVisible(false);
		questionTypeContent.setStyleName("questionTypeContent");
		questionTypeContent.add(eventsContainer);
		twistieOpen.addClickHandler(new ClickHandler() {
			/**
			 *Clickhandler for opening and closing questiontype 
			 */
			@Override
			public void onClick(ClickEvent event) {
				Log.debug("Twistie Inhalte Fragetype anzeigen geklickt!");
				twistieOpen.setVisible(false);
				twistieClose.setVisible(true);
				upInOrder.setVisible(false);
				downInOrder.setVisible(false);
				tagLabel.setVisible(false);
				questionTypeContent.setVisible(true);

			}

		});
		/**
		 *Clickhandler for opening and closing questiontype 
		 */
		twistieClose.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				Log.debug("Twistie Inhalte Fragetype schliessen geklickt!");
				twistieClose.setVisible(false);
				
				questionTypeContent.setVisible(false);
				twistieOpen.setVisible(true);		
				upInOrder.setVisible(true);
				downInOrder.setVisible(true);
				tagLabel.setVisible(true);
			}

		});

		/**
		 * For all Questiontypes in QuestionTypeCountPerExamProxy concat question types to questionTypeText and set setText of Label in header. 
		 */
		String questionTypeText = "";
		Set <QuestionTypeProxy> questionTypeProxySet = proxy.getQuestionTypesAssigned();
		Iterator<QuestionTypeProxy> itr = questionTypeProxySet.iterator();
		int i = 0;
		while(itr.hasNext()){
			
			QuestionTypeProxy questionTypeProxyTemp = (QuestionTypeProxy)itr.next();
			
			if (i>0){
			questionTypeText = questionTypeText+", "+questionTypeProxyTemp.getQuestionTypeName();
			}else{
				questionTypeText = questionTypeProxyTemp.getQuestionTypeName();
			}
			i++;
		}
		questionTypeNamelbl.setText(questionTypeText);
	
		/**
		 * Clickhandler delegates, when sort order is changed by clicking labels.
		 */
		upInOrder.addClickHandler(new ClickHandler(){
			
			@Override
			public void onClick(ClickEvent event) {
				Log.debug("upInOrder clicked in View");
				delegate.onUpInOrderClicked(proxy);
			}
			
		});
		/**
		 * Clickhandler delegates, when sort order is changed by clicking labels.
		 */
		downInOrder.addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				Log.debug("downInOrder clicked");
				delegate.downInOrderClicked(proxy);
			}
		});
	}//End init
	
	

	
	
	
}
