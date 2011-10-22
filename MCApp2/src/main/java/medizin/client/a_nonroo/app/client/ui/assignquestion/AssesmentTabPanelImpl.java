package medizin.client.a_nonroo.app.client.ui.assignquestion;

import java.util.HashMap;
import java.util.Map;

import medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentTabPanel.Delegate;
import medizin.client.managed.request.AssesmentProxy;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TabBar;
import com.google.gwt.user.client.ui.Widget;

public class AssesmentTabPanelImpl extends TabBar implements AssesmentTabPanel {

	private static AssesmentTabPanelImplUiBinder uiBinder = GWT
			.create(AssesmentTabPanelImplUiBinder.class);

	interface AssesmentTabPanelImplUiBinder extends
			UiBinder<Widget, AssesmentTabPanelImpl> {
	}
	
	Map<Integer, AssesmentProxy> proxyMap = new HashMap<Integer, AssesmentProxy>();
	private Delegate delegate;

	public AssesmentTabPanelImpl() {
		//initWidget(uiBinder.createAndBindUi(this));
		addSelectionHandler(new SelectionHandler<Integer>() {
			@Override
			public void onSelection(SelectionEvent<Integer> event) {
				delegate.tabClicked(proxyMap.get(event.getSelectedItem()));
				
			}
		});
	}

	@Override
	public void setDelegate(Delegate delegate) {
		this.delegate=delegate;
		
	}

	@Override
	public void addAssementTab(AssesmentProxy assesment) {
		proxyMap.put(getTabCount(), assesment);
		addTab(assesment.getName());
		if (getTabCount()==1) selectTab(0);
		
	}

	@Override
	public AssesmentProxy getActiveTab() {
		
		return proxyMap.get(getSelectedTab());
	}

	@Override
	public void setSelectedTab(int i) {
		selectTab(i);
		
	}

}
