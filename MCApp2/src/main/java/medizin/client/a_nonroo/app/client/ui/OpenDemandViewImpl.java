package medizin.client.a_nonroo.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class OpenDemandViewImpl extends Composite implements OpenDemandView  {

	private static OpenDemandViewImplUiBinder uiBinder = GWT
			.create(OpenDemandViewImplUiBinder.class);

	interface OpenDemandViewImplUiBinder extends
			UiBinder<Widget, OpenDemandViewImpl> {
	}

	private Presenter presenter;


	public OpenDemandViewImpl() {
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
