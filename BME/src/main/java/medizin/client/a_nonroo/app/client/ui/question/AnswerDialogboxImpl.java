package medizin.client.a_nonroo.app.client.ui.question;

import java.util.Collection;

import medizin.client.a_nonroo.app.client.richtext.RichTextToolbar;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.shared.Validity;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.requestfactory.client.RequestFactoryEditorDriver;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.RichTextArea;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;


public class AnswerDialogboxImpl extends DialogBox implements AnswerDialogbox, Editor<AnswerProxy> {

	private static EventAccessDialogboxImplUiBinder uiBinder = GWT
			.create(EventAccessDialogboxImplUiBinder.class);

	interface EventAccessDialogboxImplUiBinder extends
			UiBinder<Widget, AnswerDialogboxImpl> {
	}

	private Presenter presenter;
	
	@UiField
	Button closeButton;
	
	@UiHandler ("closeButton")
	public void onCloseButtonClick(ClickEvent event) {
            hide();
            
          }

	interface EditorDriver extends RequestFactoryEditorDriver<AnswerProxy, AnswerDialogboxImpl> {}
	// private final EditorDriver editorDriver = GWT.create(EditorDriver.class);
	
    @Override
    public RequestFactoryEditorDriver<AnswerProxy,AnswerDialogboxImpl> createEditorDriver() {
        RequestFactoryEditorDriver<AnswerProxy, AnswerDialogboxImpl> driver = GWT.create(EditorDriver.class);
        driver.initialize(this);
        return driver;
    }
	
    
    @UiField 
    SimplePanel toolbarPanel;

	public AnswerDialogboxImpl() {
		setWidget(uiBinder.createAndBindUi(this));
	    setGlassEnabled(true);
	    setAnimationEnabled(true);
	    setTitle("Anzahl Fragentypen pro Prüfung hinzufügen");
	    setText("Anzahl Fragentypen pro Prüfung hinzufügen");
	    
RichTextToolbar toolbar=new RichTextToolbar(answerTextArea);
		
		toolbarPanel.add(toolbar);

	}

	@Override
	public void setRichPanelHTML(String html){
		//Log.error(html);
		answerTextArea.setHTML(html);
	}

	@Override
	public String getRichtTextHTML(){
//		Log.info(questionTextArea.getHTML());
//		Log.info(questionTextArea.getText());
		return answerTextArea.getHTML();
//		return new String("<b>hallo</b>");
	}
    @UiField  
    RichTextArea answerTextArea;
	
	private Delegate delegate;

	
	@Override
	public void setDelegate(Delegate delegate) {
		this.delegate= delegate;
		
	}

	@Override
	public void display() {
		center();
		show();
		
	}
	


	    @UiField(provided = true)
	    ValueListBox<PersonProxy> rewiewer = new ValueListBox<PersonProxy>(medizin.client.managed.ui.PersonProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<medizin.client.managed.request.PersonProxy>());





	    @UiField(provided = true)
	    ValueListBox<Validity> validity = new ValueListBox<Validity>(new AbstractRenderer<medizin.client.shared.Validity>() {

	        public String render(medizin.client.shared.Validity obj) {
	            return obj == null ? "" : String.valueOf(obj);
	        }
	    });



	    @Override
	    public void setRewiewerPickerValues(Collection<PersonProxy> values) {
	        rewiewer.setAcceptableValues(values);
	    }



	    @Override
	    public void setValidityPickerValues(Collection<Validity> values) {
	        validity.setAcceptableValues(values);
	    }



  
    @UiField
    Button save;
    
    @UiHandler("save")
    void onSave(ClickEvent event) {
        delegate.addAnswerClicked();
       // hide();
    }


	@Override
	public void close() {
		hide();
		
	}



}
