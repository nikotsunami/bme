package medizin.client.a_nonroo.app.client.ui.assignquestion;

import medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentQuestionPanel.Delegate;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class AssesmentQuestionPanelImpl extends Composite implements AssesmentQuestionPanel {

	private static AssesmentQuestionPanelImplUiBinder uiBinder = GWT
			.create(AssesmentQuestionPanelImplUiBinder.class);

	interface AssesmentQuestionPanelImplUiBinder extends
			UiBinder<Widget, AssesmentQuestionPanelImpl> {
	}

	private Delegate delegate;
	
	@UiField
	VerticalPanel assesmentQuestionDisplayPanel;

	public AssesmentQuestionPanelImpl() {
		initWidget(uiBinder.createAndBindUi(this));
//		assesmentQuestionDisplayPanel.setBorderWidth(1);
//		assesmentQuestionDisplayPanel.setHeight("100px");
//		assesmentQuestionDisplayPanel.setWidth("100px");
		assesmentQuestionDisplayPanel.setSpacing(5);
		
		 
		
	}

	@Override
	public void setDelegate(Delegate delegate) {
		this.delegate = delegate;
		
	}

	@Override
	public void addAssesmentQuestion(AssesmentQuestionView question) {
		assesmentQuestionDisplayPanel.add(question);		
	}
	


	@Override
	public void removeAll() {
		assesmentQuestionDisplayPanel.clear();		
	}

	@Override
	public VerticalPanel getAssesmentQuestionDisplayPanel() {
		
		return assesmentQuestionDisplayPanel;
	}

}
