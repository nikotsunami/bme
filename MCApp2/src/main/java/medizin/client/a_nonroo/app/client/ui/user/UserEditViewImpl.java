package medizin.client.a_nonroo.app.client.ui.user;

import medizin.client.a_nonroo.app.place.PlaceUserDetails;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.AnswerProxy;
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
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class UserEditViewImpl extends Composite implements UserEditView, Editor<PersonProxy>  {

	private static UserEditViewImplUiBinder uiBinder = GWT
			.create(UserEditViewImplUiBinder.class);

	interface UserEditViewImplUiBinder extends
			UiBinder<Widget, UserEditViewImpl> {
	}
	
	interface EditorDriver extends RequestFactoryEditorDriver<PersonProxy, UserEditViewImpl> {}
	// private final EditorDriver editorDriver = GWT.create(EditorDriver.class);
	
    @Override
    public RequestFactoryEditorDriver<PersonProxy,UserEditViewImpl> createEditorDriver() {
        RequestFactoryEditorDriver<PersonProxy, UserEditViewImpl> driver = GWT.create(EditorDriver.class);
        driver.initialize(this);
        return driver;
    }

	private Presenter presenter;
	@UiField
	Element  editTitle;
	@UiField
	Element  createTitle;
	
    @UiField
    Button cancel;

    @UiField
    Button save;

    private Delegate delegate;
	
    @UiField
    TextBox name;

    @UiField
    TextBox prename;

    @UiField
    TextBox email;

    @UiField
    TextBox alternativEmail;

    @UiField
    TextBox phoneNumber;

    @UiField(provided = true)
    CheckBox isAdmin = new CheckBox() {

        public void setValue(Boolean value) {
            super.setValue(value == null ? Boolean.FALSE : value);
        }
    };
    



    @UiField(provided = true)
    CheckBox isAccepted = new CheckBox() {

        public void setValue(Boolean value) {
            super.setValue(value == null ? Boolean.FALSE : value);
        }
    };
	private PersonProxy proxy;

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



	public UserEditViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));


	}



	@Override
	public void setDelegate(Delegate delegate) {
		this.delegate = delegate;
		
	}

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
