package medizin.client.a_nonroo.app.client;



import medizin.client.a_nonroo.app.client.richtext.RichTextToolbar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.requestfactory.shared.EntityProxy;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.RichTextArea;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
/**
 * Pop up that is displayed for declining a users contribution.
 * @author masterthesis
 *
 */
public class DeclineEmailPopup extends DialogBox {

	private static DeclineEmailPopupUiBinder uiBinder = GWT
			.create(DeclineEmailPopupUiBinder.class);

	interface DeclineEmailPopupUiBinder extends
			UiBinder<Widget, DeclineEmailPopup> {
	}

	private DeclineEmailPopupDelagate delegate;
	private EntityProxy entityProxy;
	

	public void setDelegate(DeclineEmailPopupDelagate delegate){
		this.delegate = delegate;
	}

	public DeclineEmailPopup(EntityProxy proxy) {
		this.entityProxy = proxy;
		
		setWidget(uiBinder.createAndBindUi(this));
		//this.delegate = delegate;
	    setGlassEnabled(true);
	    setAnimationEnabled(true);
	    setTitle("Begleitnachricht für das Ablehnen eingeben");
	    setText("Begleitnachricht für das Ablehnen eingeben");
         setWidth("800px");
	     center();
		
		setModal(true);
		show();
RichTextToolbar toolbar=new RichTextToolbar(questionTextArea);
		
		toolbarPanel.add(toolbar);

	}


@UiField
Button sendMail;
@UiField
Button abbortButton;
@UiField
SimplePanel toolbarPanel;
@UiField
RichTextArea questionTextArea;


@UiHandler ("sendMail")
void saveNewClicked (ClickEvent event){
	delegate.rejectClicked(entityProxy, questionTextArea.getHTML());
	super.hide();
}

@UiHandler ("abbortButton")
void saveChangesClicked (ClickEvent event){
	//delegate.saveClicked(false);
	super.hide();
}


}
