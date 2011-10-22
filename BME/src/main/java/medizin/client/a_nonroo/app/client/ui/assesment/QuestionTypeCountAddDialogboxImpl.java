package medizin.client.a_nonroo.app.client.ui.assesment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import medizin.client.a_nonroo.app.client.ui.assesment.AssesmentEditViewImpl.EditorDriver;
import medizin.client.a_nonroo.app.client.ui.user.EventAccessDialogbox;
import medizin.client.a_nonroo.app.client.ui.user.EventAccessDialogbox.Delegate;
import medizin.client.a_nonroo.app.client.ui.user.EventAccessDialogbox.Presenter;


import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.QuestionTypeCountPerExamProxy;
import medizin.client.managed.request.QuestionTypeProxy;
import medizin.client.managed.ui.QuestionTypeSetEditor;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.cell.client.AbstractEditableCell;
import com.google.gwt.cell.client.ActionCell;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.requestfactory.client.RequestFactoryEditorDriver;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.Widget;

public class QuestionTypeCountAddDialogboxImpl extends DialogBox implements QuestionTypeCountAddDialogbox, Editor<QuestionTypeCountPerExamProxy> {

	private static EventAccessDialogboxImplUiBinder uiBinder = GWT
			.create(EventAccessDialogboxImplUiBinder.class);

	interface EventAccessDialogboxImplUiBinder extends
			UiBinder<Widget, QuestionTypeCountAddDialogboxImpl> {
	}

	private Presenter presenter;
	
	@UiField
	Button closeButton;
	
	@UiHandler ("closeButton")
	public void onCloseButtonClick(ClickEvent event) {
            hide();
            
          }

	interface EditorDriver extends RequestFactoryEditorDriver<QuestionTypeCountPerExamProxy, QuestionTypeCountAddDialogboxImpl> {}
	// private final EditorDriver editorDriver = GWT.create(EditorDriver.class);
	
    @Override
    public RequestFactoryEditorDriver<QuestionTypeCountPerExamProxy,QuestionTypeCountAddDialogboxImpl> createEditorDriver() {
        RequestFactoryEditorDriver<QuestionTypeCountPerExamProxy, QuestionTypeCountAddDialogboxImpl> driver = GWT.create(EditorDriver.class);
        driver.initialize(this);
        return driver;
    }
	

	public QuestionTypeCountAddDialogboxImpl() {
		setWidget(uiBinder.createAndBindUi(this));
	    setGlassEnabled(true);
	    setAnimationEnabled(true);
	    setTitle("Anzahl Fragentypen pro Prüfung hinzufügen");
	    setText("Anzahl Fragentypen pro Prüfung hinzufügen");
	    
	    init();
	    
	}

	  private List<AbstractEditableCell<?, ?>> editableCells;
	  
	 protected Set<String> paths = new HashSet<String>();

	    public void init() {
	    	
	 
	        
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

    @UiField
    QuestionTypeSetEditor questionTypesAssigned;


    @UiField
    IntegerBox questionTypeCount;



    @Override
    public void setQuestionTypesAssignedPickerValues(Collection<QuestionTypeProxy> values) {
        questionTypesAssigned.setAcceptableValues(values);
    }
    @UiField
    Button save;
    
    @UiHandler("save")
    void onSave(ClickEvent event) {
        delegate.addClicked();
        hide();
    }



}
