package medizin.client.a_nonroo.app.client.ui.assignquestion;

import medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionViewImpl.QuestionViewImplUiBinder;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.AnswerToAssQuestionProxy;
import medizin.client.shared.Validity;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class AnswerViewImpl extends Composite implements AnswerView {

	private Delegate delegate;
	private AnswerProxy answer;
	
	private static AnswerViewImplUiBinder uiBinder = GWT
	.create(AnswerViewImplUiBinder.class);

	interface AnswerViewImplUiBinder extends
		UiBinder<Widget, AnswerViewImpl> {
	}
	
	
	
	public AnswerViewImpl(){
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField
	   Label lblAnswerText;
	@UiField
	   Label lblIcon;
//	   Validity validity ;
	
	@UiField
	   Label lblCheck;
	@UiField
	   Label lblDel;
	
	@UiField
	HTMLPanel answerPanel;
	
	private boolean checked=false;
	private boolean isInAssesment;
	
	@Override
	public boolean getChecked(){
		return checked;
	}
	
	@UiHandler(value = { "lblCheck", "lblDel", "lblIcon" , "lblAnswerText"})
	void lblCheckClicked(ClickEvent event) {
		if(isInAssesment){
			if(checked==false){
				checked = true;
				lblCheck.setVisible(false);
				lblDel.setVisible(true);
				DOM.setElementAttribute(answerPanel.getElement(), "style", "background-color: #AAD1C3; border: 1px solid #87B2A0; cursor: pointer;");
			}
			else{
				checked = false;
				lblCheck.setVisible(true);
				lblDel.setVisible(false);		
				DOM.setElementAttribute(answerPanel.getElement(), "style", "background-color: #E89EA2; border: 1px solid #CF7074; cursor: pointer;");
			}
		}

	}

	@Override
	public void setProxy(AnswerProxy answer, boolean addCheck) {
		this.answer = answer;
	

		 init(addCheck);
		
	}
	

	@Override
	public AnswerProxy getProxy() {
		
		return answer;
	}

	@Override
	public void setDelegate(Delegate delegate) {
		this.delegate=delegate;
		
	}
	
	public void init(boolean addCheck){
		this.isInAssesment= addCheck;
		//this.add(lblIcon);
		//this.setStyleName("answerDND");	
		//this.add(lblAnswerText);
		lblAnswerText.setText(answer.getAnswerText());
		if(addCheck) {
			lblCheck.setVisible(true);
			DOM.setElementAttribute(answerPanel.getElement(), "style", "cursor: pointer;");
			
		}
		else {
			lblCheck.setVisible(false);
			DOM.setElementAttribute(answerPanel.getElement(), "style", "background-color: #AAD1C3; border: 1px solid #87B2A0; ");
		}
	
		//lblAnswerText.setWidth("100%");
		
		switch (answer.getValidity()) {
		case Wahr: ; lblIcon.addStyleName("ui-icon-plus");	
				     break;
				
		case Falsch: lblIcon.addStyleName("ui-icon-minus");
				     break;
				     
		case Weil:	lblIcon.addStyleName("ui-icon-refresh");
					break;
				     
		default:	 lblIcon.addStyleName("ui-icon-help");
				     break;
		}
		

	}

	@Override
	public void setProxy(AnswerToAssQuestionProxy answerToAssQuestionProxy, boolean addCheck) {
		this.answer=answerToAssQuestionProxy.getAnswers();
		 init(addCheck);
	}


}
