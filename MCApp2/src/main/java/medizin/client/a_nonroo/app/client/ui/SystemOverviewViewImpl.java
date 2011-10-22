package medizin.client.a_nonroo.app.client.ui;

import medizin.client.a_nonroo.app.client.ui.SystemOverviewView.Delegate;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class SystemOverviewViewImpl extends Composite implements  SystemOverviewView  {

	private static SystemOverviewViewImplUiBinder uiBinder = GWT
			.create(SystemOverviewViewImplUiBinder.class);

	interface SystemOverviewViewImplUiBinder extends
			UiBinder<Widget, SystemOverviewViewImpl> {
	}

	private Presenter presenter;

	@UiField
	Button myButton;

	private Delegate delegate;
	
	@UiHandler(value = { "myButton" })
	void buttonClicked(ClickEvent event){
		delegate.buttonClicked();
	}

	public SystemOverviewViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));

	}


	@Override
	public void setName(String helloName) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
		
	}
	

	@Override
	public void setDelegate(Delegate delegate) {
		this.delegate = delegate;
		
	}


}
