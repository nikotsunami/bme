package medizin.client.a_nonroo.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class AcceptAssQuestionViewImpl extends Composite implements AcceptAssQuestionView  {

	private static AcceptAssQuestionViewImplUiBinder uiBinder = GWT
			.create(AcceptAssQuestionViewImplUiBinder.class);

	interface AcceptAssQuestionViewImplUiBinder extends
			UiBinder<Widget, AcceptAssQuestionViewImpl> {
	}

	private Presenter presenter;


	public AcceptAssQuestionViewImpl() {
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
