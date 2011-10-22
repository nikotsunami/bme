package medizin.client.a_nonroo.app.client.ui.question;

import medizin.client.a_nonroo.app.client.ui.question.QuestionEditView.Delegate;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.Widget;

public class ConfirmQuestionChangesPopup extends DialogBox {

	private static ConfirmQuestionChangesPopupUiBinder uiBinder = GWT
			.create(ConfirmQuestionChangesPopupUiBinder.class);

	interface ConfirmQuestionChangesPopupUiBinder extends
			UiBinder<Widget, ConfirmQuestionChangesPopup> {
	}

	private Delegate delegate;

	public ConfirmQuestionChangesPopup(Delegate delegate) {
		
		setWidget(uiBinder.createAndBindUi(this));
		this.delegate = delegate;
		setWidth("400px");
		center();
		setGlassEnabled(true);
		setModal(true);
		setTitle("Art des Speicherns bestätigen");
		setText("Art des Speicherns bestätigen");
	}


@UiField
Button saveChange;
@UiField
Button saveNew;


@UiHandler ("saveNew")
void saveNewClicked (ClickEvent event){
	delegate.saveClicked(true);
	super.hide();
}

@UiHandler ("saveChange")
void saveChangesClicked (ClickEvent event){
	delegate.saveClicked(false);
	super.hide();
}


}
