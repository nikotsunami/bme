package medizin.client.a_nonroo.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class AcceptPersonViewImpl extends Composite implements AcceptPersonView  {

	private static AcceptPersonViewImplUiBinder uiBinder = GWT
			.create(AcceptPersonViewImplUiBinder.class);

	interface AcceptPersonViewImplUiBinder extends
			UiBinder<Widget, AcceptPersonViewImpl> {
	}

	private Presenter presenter;


	public AcceptPersonViewImpl() {
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


}
