package medizin.client.a_nonroo.app.client.ui.assesment;

import java.util.Collection;

import medizin.client.a_nonroo.app.place.PlaceUserDetails;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.McProxy;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.PersonRequest;
import medizin.client.managed.ui.AnswerEditView;
import medizin.client.managed.ui.QuestionAccessSetEditor;


import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.requestfactory.client.RequestFactoryEditorDriver;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.ServerFailure;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;

public class AssesmentEditViewImpl extends Composite implements AssesmentEditView, Editor<AssesmentProxy>  {

	private static AssesmentEditViewImplUiBinder uiBinder = GWT
			.create(AssesmentEditViewImplUiBinder.class);

	interface AssesmentEditViewImplUiBinder extends
			UiBinder<Widget, AssesmentEditViewImpl> {
	}
	
	interface EditorDriver extends RequestFactoryEditorDriver<AssesmentProxy, AssesmentEditViewImpl> {}
	// private final EditorDriver editorDriver = GWT.create(EditorDriver.class);
	
    @Override
    public RequestFactoryEditorDriver<AssesmentProxy,AssesmentEditViewImpl> createEditorDriver() {
        RequestFactoryEditorDriver<AssesmentProxy, AssesmentEditViewImpl> driver = GWT.create(EditorDriver.class);
        driver.initialize(this);
        return driver;
    }

	private Presenter presenter;

	
    @UiField
    Button cancel;

    @UiField
    Button save;

    private Delegate delegate;
	
    @UiField
    TextBox name;
    
    @UiField
    TextBox logo;

    @UiField
    DateBox dateOfAssesment;

    @UiField
    DateBox dateOpen;

    @UiField
    DateBox dateClosed;

    @UiField
    TextBox place;



    @UiField(provided = true)
    CheckBox isClosed = new CheckBox() {

        public void setValue(Boolean value) {
            super.setValue(value == null ? Boolean.FALSE : value);
        }
    };



    @UiField(provided = true)
    ValueListBox<McProxy> mc = new ValueListBox<McProxy>(medizin.client.managed.ui.McProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<medizin.client.managed.request.McProxy>());

    @UiField(provided = true)
    ValueListBox<AssesmentProxy> repeFor = new ValueListBox<AssesmentProxy>(medizin.client.managed.ui.AssesmentProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<medizin.client.managed.request.AssesmentProxy>());

    @UiField
    IntegerBox percentSameQuestion;
    
    @Override
    public void setRepeForPickerValues(Collection<AssesmentProxy> values) {
        repeFor.setAcceptableValues(values);
    }

    @Override
    public void setMcPickerValues(Collection<McProxy> values) {
        mc.setAcceptableValues(values);
    }
    
	private AssesmentProxy proxy;

	private McAppRequestFactory requests;


    @UiHandler("cancel")
    void onCancel(ClickEvent event) {
        delegate.cancelClicked();
    }

    @UiHandler("save")
    void onSave(ClickEvent event) {

    	
        delegate.saveClicked();
    }


//    @UiField
//    SpanElement displayRenderer;



	public AssesmentEditViewImpl() {
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

	@Override
	public void setDelegate(Delegate delegate) {
		this.delegate = delegate;
		
	}

	@UiField
	Element  editTitle;
	@UiField
	Element  createTitle;

	@Override
	public void setEditTitle(boolean edit) {
	      if (edit) {
	            editTitle.getStyle().clearDisplay();
	            createTitle.getStyle().setDisplay(Display.NONE);
	        } else {

	            editTitle.getStyle().setDisplay(Display.NONE);
	            createTitle.getStyle().clearDisplay();
	        }
		
	}



}
