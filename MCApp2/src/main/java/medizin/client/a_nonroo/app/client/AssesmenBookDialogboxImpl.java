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
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.RichTextArea;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
/**
 * dialog box shown for exporting an assesment book.
 * @author masterthesis
 *
 */
public class AssesmenBookDialogboxImpl extends DialogBox implements AssesmenBookDialogbox {

	private static AssesmenBookDialogboxImplUiBinder uiBinder = GWT
			.create(AssesmenBookDialogboxImplUiBinder.class);

	interface AssesmenBookDialogboxImplUiBinder extends
			UiBinder<Widget, AssesmenBookDialogboxImpl> {
	}

	private Delegate delegate;

	

	public void setDelegate(Delegate delegate){
		this.delegate = delegate;
	}

	public AssesmenBookDialogboxImpl() {
		
		
		setWidget(uiBinder.createAndBindUi(this));
		//this.delegate = delegate;
	   // setGlassEnabled(true);
	    //setAnimationEnabled(true);
	    setWidth("1000px");
	    setPopupPosition(10, 10);
	    
	    setText("Prüfungsheft exportien");
        
	     center();
		
		//setModal(true);
		show();
		
		//Window.print();
	}



@UiField
Button closeButton;
@UiField
VerticalPanel exportPanel;

@Override
public VerticalPanel getExportPanel(){
	return exportPanel;
}

@UiHandler ("closeButton")
void closeButtonClicked (ClickEvent event){
	
	hide();
}




}
