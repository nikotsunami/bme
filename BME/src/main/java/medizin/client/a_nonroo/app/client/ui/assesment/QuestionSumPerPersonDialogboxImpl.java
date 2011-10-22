package medizin.client.a_nonroo.app.client.ui.assesment;

import java.util.Collection;

import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.QuestionSumPerPersonProxy;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.requestfactory.client.RequestFactoryEditorDriver;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.Widget;


public class QuestionSumPerPersonDialogboxImpl extends DialogBox implements QuestionSumPerPersonDialogbox, Editor<QuestionSumPerPersonProxy> {

	private static EventAccessDialogboxImplUiBinder uiBinder = GWT
			.create(EventAccessDialogboxImplUiBinder.class);

	interface EventAccessDialogboxImplUiBinder extends
			UiBinder<Widget, QuestionSumPerPersonDialogboxImpl> {
	}

	private Presenter presenter;
	
	@UiField
	Button closeButton;
	
	@UiHandler ("closeButton")
	public void onCloseButtonClick(ClickEvent event) {
            hide();
            
          }

	interface EditorDriver extends RequestFactoryEditorDriver<QuestionSumPerPersonProxy, QuestionSumPerPersonDialogboxImpl> {}
	// private final EditorDriver editorDriver = GWT.create(EditorDriver.class);
	
    @Override
    public RequestFactoryEditorDriver<QuestionSumPerPersonProxy,QuestionSumPerPersonDialogboxImpl> createEditorDriver() {
        RequestFactoryEditorDriver<QuestionSumPerPersonProxy, QuestionSumPerPersonDialogboxImpl> driver = GWT.create(EditorDriver.class);
        driver.initialize(this);
        return driver;
    }
	

	public QuestionSumPerPersonDialogboxImpl() {
		setWidget(uiBinder.createAndBindUi(this));
	    setGlassEnabled(true);
	    setAnimationEnabled(true);
	    setTitle("Anzahl Fragentypen pro Prüfung hinzufügen");
	    setText("Anzahl Fragentypen pro Prüfung hinzufügen");

	}


	@Override
	public void setPresenter(Presenter presenter) {
	this.presenter = presenter;
		
	}
	
	
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
    ValueListBox<PersonProxy> responsiblePerson = new ValueListBox<PersonProxy>(medizin.client.managed.ui.PersonProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<medizin.client.managed.request.PersonProxy>());

    @UiField(provided = true)
    ValueListBox<QuestionEventProxy> questionEvent = new ValueListBox<QuestionEventProxy>(medizin.client.managed.ui.QuestionEventProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<medizin.client.managed.request.QuestionEventProxy>());


    @UiField
    IntegerBox questionSum;


    @Override
    public void setQuestionEventPickerValues(Collection<QuestionEventProxy> values) {
        questionEvent.setAcceptableValues(values);
    }
    @Override
    public void setResponsiblePersonPickerValues(Collection<PersonProxy> values) {
        responsiblePerson.setAcceptableValues(values);
    }



  
    @UiField
    Button save;
    
    @UiHandler("save")
    void onSave(ClickEvent event) {
        delegate.addQuestionSumPerPersonClicked();
        hide();
    }



}
