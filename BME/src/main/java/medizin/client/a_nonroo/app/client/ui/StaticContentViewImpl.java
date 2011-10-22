package medizin.client.a_nonroo.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class StaticContentViewImpl extends Composite implements StaticContentView  {

	private static StaticContentViewImplUiBinder uiBinder = GWT
			.create(StaticContentViewImplUiBinder.class);

	interface StaticContentViewImplUiBinder extends
			UiBinder<Widget, StaticContentViewImpl> {
	}

	private Presenter presenter;


	public StaticContentViewImpl() {
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
