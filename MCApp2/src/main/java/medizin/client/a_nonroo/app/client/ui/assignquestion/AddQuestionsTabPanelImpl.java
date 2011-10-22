package medizin.client.a_nonroo.app.client.ui.assignquestion;

import medizin.client.a_nonroo.app.client.McAppConstant;
import medizin.client.a_nonroo.app.client.ui.assesment.AssesmentDetailsView.Presenter;
import medizin.client.a_nonroo.app.client.ui.assignquestion.AddQuestionsTabPanel.Delegate;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SourcesTabEvents;
import com.google.gwt.user.client.ui.TabBar;
import com.google.gwt.user.client.ui.TabListener;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.Widget;

public class AddQuestionsTabPanelImpl extends TabBar implements  AddQuestionsTabPanel {

	private static AddQuestionsTabPanelImplUiBinder uiBinder = GWT
			.create(AddQuestionsTabPanelImplUiBinder.class);

	interface AddQuestionsTabPanelImplUiBinder extends
			UiBinder<Widget, AddQuestionsTabPanelImpl> {
	}

	private Delegate delegate;
	



	public AddQuestionsTabPanelImpl() {
		//initWidget(uiBinder.createAndBindUi(this));
		init();
	}

	private void init() {
		addTab(McAppConstant.QUESTION_TAB_PROPOSAL);
		
		addTab(McAppConstant.QUESTION_TAB_ASSEMENTQUESTION);
		addTab(McAppConstant.QUESTION_TAB_NEWQUESTION);
		
		selectTab(0);
		
		addSelectionHandler(new SelectionHandler<Integer>() {
			@Override
			public void onSelection(SelectionEvent<Integer> event) {
				delegate.tabQuestionClicked(event.getSelectedItem());
				
			}
		});
		
	
		
		
	}
	

	@Override
	public void setDelegate(Delegate delegate) {
		this.delegate= delegate;
		
	}

	@Override
	public int getActiveTab() {
		return getSelectedTab();
	}





}
