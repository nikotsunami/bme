package medizin.client.a_nonroo.app.client.ui.question;

import java.util.Collection;

import medizin.client.a_nonroo.app.client.richtext.RichTextToolbar;
import medizin.client.a_nonroo.app.client.ui.question.QuestionEditView;
import medizin.client.a_nonroo.app.client.ui.question.QuestionEditView.Delegate;
import medizin.client.a_nonroo.app.client.ui.question.QuestionEditView.Presenter;
import medizin.client.a_nonroo.app.place.PlaceUserDetails;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.CommentProxy;
import medizin.client.managed.request.KeywordProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.managed.request.McProxy;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.PersonRequest;
import medizin.client.managed.request.QuestionTypeProxy;
import medizin.client.managed.ui.AnswerEditView;
import medizin.client.managed.ui.AnswerSetEditor;
import medizin.client.managed.ui.KeywordSetEditor;
import medizin.client.managed.ui.McSetEditor;
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
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DoubleBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.RichTextArea;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;

public class QuestionEditViewImpl extends Composite implements QuestionEditView, Editor<QuestionProxy>  {

	private static QuestionEditViewImplUiBinder uiBinder = GWT
			.create(QuestionEditViewImplUiBinder.class);

	interface QuestionEditViewImplUiBinder extends
			UiBinder<Widget, QuestionEditViewImpl> {
	}
	
	interface EditorDriver extends RequestFactoryEditorDriver<QuestionProxy, QuestionEditViewImpl> {}
	// private final EditorDriver editorDriver = GWT.create(EditorDriver.class);
	
    @Override
    public RequestFactoryEditorDriver<QuestionProxy,QuestionEditViewImpl> createEditorDriver() {
        RequestFactoryEditorDriver<QuestionProxy, QuestionEditViewImpl> driver = GWT.create(EditorDriver.class);
        driver.initialize(this);
        return driver;
    }

	private Presenter presenter;

	
    @UiField
    Button cancel;

    @UiField
    Button save;

    private Delegate delegate;
	
   

   
    

	private QuestionProxy proxy;

	private McAppRequestFactory requests;


    @UiHandler("cancel")
    void onCancel(ClickEvent event) {
        delegate.cancelClicked();
    }

    @UiHandler("save")
    void onSave(ClickEvent event) {
    	if(!edit){
    		delegate.saveClicked(false);
    	} else {
    		ConfirmQuestionChangesPopup confirm = new ConfirmQuestionChangesPopup(delegate);
    	}
		
    	
        //delegate.saveClicked(false);
    }


//    @UiField
//    SpanElement displayRenderer;


    

@UiField 
SimplePanel toolbarPanel;

	public QuestionEditViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		RichTextToolbar toolbar=new RichTextToolbar(questionTextArea);
		
		toolbarPanel.add(toolbar);


		

	}
	
	@Override
	public void setRichPanelHTML(String html){
		Log.error(html);
		questionTextArea.setHTML(html);
	}

	@Override
	public String getRichtTextHTML(){
//		Log.info(questionTextArea.getHTML());
//		Log.info(questionTextArea.getText());
		return questionTextArea.getHTML();
//		return new String("<b>hallo</b>");
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

//	  @UiField
//	    DateBox dateAdded;
//
//	    @UiField
//	    DateBox dateChanged;

	    @UiField(provided = true)
	    ValueListBox<PersonProxy> rewiewer = new ValueListBox<PersonProxy>(medizin.client.managed.ui.PersonProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<medizin.client.managed.request.PersonProxy>());

	    @UiField(provided = true)
	    ValueListBox<PersonProxy> autor = new ValueListBox<PersonProxy>(medizin.client.managed.ui.PersonProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<medizin.client.managed.request.PersonProxy>());
//
//	    @UiField  
//	    RichTextArea questionText;

	    @UiField  
	    RichTextArea questionTextArea;


	    @UiField(provided = true)
	    ValueListBox<QuestionEventProxy> questEvent = new ValueListBox<QuestionEventProxy>(medizin.client.managed.ui.QuestionEventProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<medizin.client.managed.request.QuestionEventProxy>());


	    @UiField(provided = true)
	    ValueListBox<QuestionTypeProxy> questionType = new ValueListBox<QuestionTypeProxy>(medizin.client.managed.ui.QuestionTypeProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<medizin.client.managed.request.QuestionTypeProxy>());

	    @UiField
	    McSetEditor mcs;






	    
	    @Override
	    public void setRewiewerPickerValues(Collection<PersonProxy> values) {
	        rewiewer.setAcceptableValues(values);
	    }
	    @Override
	    public void setQuestEventPickerValues(Collection<QuestionEventProxy> values) {
	        questEvent.setAcceptableValues(values);
	    }
	    @Override
	    public void setAutorPickerValues(Collection<PersonProxy> values) {
	        autor.setAcceptableValues(values);
	    }
	    
	    
	    @Override
	    public void setQuestionTypePickerValues(Collection<QuestionTypeProxy> values) {
	        questionType.setAcceptableValues(values);
	    }

	    @Override
	    public void setMcsPickerValues(Collection<McProxy> values) {
	        mcs.setAcceptableValues(values);
	    }
		@UiField
		Element  editTitle;
		@UiField
		Element  createTitle;


		private boolean edit;
		
		
	    
		@Override
		public void setEditTitle(boolean edit) {
			this.edit = edit;
		      if (edit) {
		            editTitle.getStyle().clearDisplay();
		            createTitle.getStyle().setDisplay(Display.NONE);
		        } else {
		        	
		            editTitle.getStyle().setDisplay(Display.NONE);
		            createTitle.getStyle().clearDisplay();
		        }
			
		}
		





}
