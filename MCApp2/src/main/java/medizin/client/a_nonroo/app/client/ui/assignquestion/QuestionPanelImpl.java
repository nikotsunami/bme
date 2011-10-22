package medizin.client.a_nonroo.app.client.ui.assignquestion;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class QuestionPanelImpl extends Composite implements QuestionPanel {

	private static QuestionPanelImplUiBinder uiBinder = GWT
			.create(QuestionPanelImplUiBinder.class);

	interface QuestionPanelImplUiBinder extends
			UiBinder<Widget, QuestionPanelImpl> {
	}

	private Delegate delegate;
	@UiField
	VerticalPanel questionPanel;

	public QuestionPanelImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		questionPanel.setSpacing(5);
		
	}

	@Override
	public void setDelegate(Delegate delegate) {
		this.delegate = delegate;
		
	}

	@Override
	public void addQuestion(QuestionView question) {
		questionPanel.add(question);
		
	}

	@Override
	public void addAssesmentQuestion(AssesmentQuestionView question) {
		questionPanel.add(question);
		
	}
	
	@Override
	public void removeAll() {
		questionPanel.clear();
		
	}

	@Override
	public VerticalPanel getQuestionDisplayPanel() {
		
		return questionPanel;
	}

}
