package medizin.client.a_nonroo.app.client.ui.assignquestion;

import medizin.client.managed.request.QuestionProxy;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class QuestionViewImpl extends Composite implements QuestionView {

	private Delegate delegate;
	private QuestionProxy question;
	

	private static QuestionViewImplUiBinder uiBinder = GWT
	.create(QuestionViewImplUiBinder.class);

	interface QuestionViewImplUiBinder extends
		UiBinder<Widget, QuestionViewImpl> {
	}

	@UiField
	Label header;
	
	@UiField
	VerticalPanel answers;
	@UiField
	Label twistieOpen;
	@UiField
	Label twistieClose;
	@UiField
	Label addToAssesment;
	
	  @UiField
	    SpanElement rewiewer;

	    @UiField
	    SpanElement autor;

	    @UiField
	    SpanElement keywords;

	    @UiField
	    SpanElement questEvent;

	    @UiField
	    SpanElement comment;

	    @UiField
	    SpanElement questionType;
	    
	    @UiField
	    HTMLPanel detailsTablePanel;
	    
	
	boolean answersVisible=false;
	boolean answersLoaded=false;
	
	@UiHandler(value = { "twistieOpen", "twistieClose" })
	void twistieClicked(ClickEvent event) {
		if(answersVisible==false){
			if(answersLoaded==false){
				delegate.twistieOpenQuestionClicked(this);
				answersLoaded=true;
			}
			twistieOpen.setVisible(false);
			answers.setVisible(true);
			twistieClose.setVisible(true);
			detailsTablePanel.setVisible(true);
			answersVisible=true;
		}
		else {
			twistieOpen.setVisible(true);
			answers.setVisible(false);
			twistieClose.setVisible(false);	
			detailsTablePanel.setVisible(false);
			answersVisible=false;
		}
		
	}
	
	public QuestionViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		twistieClose.setVisible(false);
		answers.setVisible(false);
	}

	@Override
	public void setProxy(QuestionProxy question) {
		this.question = question;
		header.setText(question.getQuestionText());
		
        rewiewer.setInnerText(question.getRewiewer() == null ? "" : medizin.client.managed.ui.PersonProxyRenderer.instance().render(question.getRewiewer()));
        autor.setInnerText(question.getAutor() == null ? "" : medizin.client.managed.ui.PersonProxyRenderer.instance().render(question.getAutor()));
        keywords.setInnerText(question.getKeywords() == null ? "" : medizin.client.scaffold.place.CollectionRenderer.of(medizin.client.managed.ui.KeywordProxyRenderer.instance()).render(question.getKeywords()));
        questEvent.setInnerText(question.getQuestEvent() == null ? "" : medizin.client.managed.ui.QuestionEventProxyRenderer.instance().render(question.getQuestEvent()));
        comment.setInnerText(question.getComment() == null ? "" : medizin.client.managed.ui.CommentProxyRenderer.instance().render(question.getComment()));
        questionType.setInnerText(question.getQuestionType() == null ? "" : medizin.client.managed.ui.QuestionTypeProxyRenderer.instance().render(question.getQuestionType()));
        
		
	}

	@Override
	public QuestionProxy getProxy() {
		
		return question;
	}

	@Override
	public void setDelegate(Delegate delegate) {
		this.delegate=delegate;
		
	}

	@Override
	public void addAnswer(AnswerView answer) {
		answers.add(answer);
		
	}

	@Override
	public void removeAnswer(AnswerView answer) {
		answers.remove(answer);
		
	}

	@Override
	public Widget getDragControler() {
		return header;
	}

	@Override
	public VerticalPanel getAnswerPanel() {
		return answers;
		
	}

}
