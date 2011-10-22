package medizin.client.scaffold.mainnav;

import medizin.client.managed.request.QuestionProxy;
import medizin.client.scaffold.ScaffoldApp;
import medizin.client.scaffold.ioc.ScaffoldInjector;
import medizin.client.scaffold.place.ManageQuestionsPlace_nonroo;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class MainNav extends Composite implements HasText {

	private static MainNanUiBinder uiBinder = GWT.create(MainNanUiBinder.class);

	interface MainNanUiBinder extends UiBinder<Widget, MainNav> {
	}

	public MainNav() {
		initWidget(uiBinder.createAndBindUi(this));
		
	}

	@UiField
	Button button;
	@UiField
	Anchor fragenVerwalten;
	private PlaceController presenter;

	public MainNav(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		button.setText(firstName);
	}

	@UiHandler("button")
	void onClick(ClickEvent e) {
		Window.alert("Hello!");
	}
	@UiHandler("fragenVerwalten")
	void onClickFragenVerwalten(ClickEvent e) {
		GWT.log("loggingTest");
		Window.alert(presenter.getWhere().toString());
		presenter.goTo(new ManageQuestionsPlace_nonroo(QuestionProxy.class));
	}
	public void setText(String text) {
		button.setText(text);
	}

	public String getText() {
		return button.getText();
	}
	
	public void setPresenter(PlaceController placeController) {
		this.presenter = placeController;
		
	}



}
