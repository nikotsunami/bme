package medizin.client.a_nonroo.app.client.ui;

import medizin.client.a_nonroo.app.client.ui.question.QuestionEditViewImpl;

import medizin.client.managed.request.QuestionProxy;
import medizin.client.managed.request.QuestionTypeProxy;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.dom.client.Style.Visibility;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.requestfactory.client.RequestFactoryEditorDriver;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class QuestiontypesEditViewImpl extends Composite implements QuestiontypesEditView, Editor<QuestionTypeProxy>  {

	private static UserEditViewImplUiBinder uiBinder = GWT
			.create(UserEditViewImplUiBinder.class);

	interface UserEditViewImplUiBinder extends
			UiBinder<Widget, QuestiontypesEditViewImpl> {
	}
	
	interface EditorDriver extends RequestFactoryEditorDriver<QuestionTypeProxy, QuestiontypesEditViewImpl> {}
	// private final EditorDriver editorDriver = GWT.create(EditorDriver.class);
	
    @Override
    public RequestFactoryEditorDriver<QuestionTypeProxy, QuestiontypesEditViewImpl> createEditorDriver() {
        RequestFactoryEditorDriver<QuestionTypeProxy, QuestiontypesEditViewImpl> driver = GWT.create(EditorDriver.class);
        driver.initialize(this);
        return driver;
    }


	private Presenter presenter;


    @UiField
    TextBox questionTypeName;

    @UiField
    CheckBox isWeil;

    @UiField
    IntegerBox trueAnswers;

    @UiField
    IntegerBox falseAnswers;

    @UiField
    IntegerBox sumAnswers;

    @UiField
    IntegerBox maxLetters;

    @UiHandler ("isWeil")
    public void onWeilSelected(ClickEvent event){
    	if(isWeil.getValue()){
    		Document.get().getElementById("trueAnswers").getStyle().setVisibility(Visibility.HIDDEN);
    		Document.get().getElementById("falseAnswers").getStyle().setVisibility(Visibility.HIDDEN);
    		Document.get().getElementById("sumAnswers").getStyle().setVisibility(Visibility.HIDDEN);
    		Document.get().getElementById("maxLetters").getStyle().setVisibility(Visibility.HIDDEN);
    	} else {
    		Document.get().getElementById("trueAnswers").getStyle().setVisibility(Visibility.VISIBLE);
    		Document.get().getElementById("falseAnswers").getStyle().setVisibility(Visibility.VISIBLE);
    		Document.get().getElementById("sumAnswers").getStyle().setVisibility(Visibility.VISIBLE);
    		Document.get().getElementById("maxLetters").getStyle().setVisibility(Visibility.VISIBLE);
    	}
    	
    }
    
//
//    @UiField
//    TextBox displayRenderer;
//	
	

    @UiField
    Button cancel;

    @UiField
    Button save;

    private Delegate delegate;
	

	private QuestionTypeProxy proxy;


    @UiHandler("cancel")
    void onCancel(ClickEvent event) {
        delegate.cancelClicked();
    }

    @UiHandler("save")
    void onSave(ClickEvent event) {
        //delegate.saveClicked(questionTypeName.getText(), isWeil.getValue(), trueAnswers.getValue(), falseAnswers.getValue(), sumAnswers.getValue(), maxLetters.getValue());
    
//    	
//    	String text = questionTypeName.getText();
//    	Boolean value = isWeil.getValue();
//    	Integer value2 = trueAnswers.getValue();
//    	Integer value3 = falseAnswers.getValue();
//    	Integer value4 = sumAnswers.getValue();
//    	Integer value5 = maxLetters.getValue(); 
//    	
    	
    	delegate.saveClicked();
    
    }


//    @UiField
//    SpanElement displayRenderer;

    public void setValue(QuestionTypeProxy proxy) {
        this.proxy = proxy;
        questionTypeName.setValue(proxy.getQuestionTypeName() == null ? "" : String.valueOf(proxy.getQuestionTypeName()));
        isWeil.setChecked(proxy.getIsWeil());
        trueAnswers.setValue(proxy.getTrueAnswers());
        falseAnswers.setValue(proxy.getFalseAnswers());
        sumAnswers.setValue(proxy.getSumAnswers());
        maxLetters.setValue(proxy.getMaxLetters());
        Log.info("Fragetyp: "+proxy.getQuestionTypeName()+" in QuestiontypeEditview ausgegeben.");
        
        
        //        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
//        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
//        questionTypeName.setInnerText(proxy.getQuestionTypeName() == null ? "" : String.valueOf(proxy.getQuestionTypeName()));
//        isWeil.setInnerText(proxy.getIsWeil() == null ? "" : String.valueOf(proxy.getIsWeil()));
//        trueAnswers.setInnerText(proxy.getTrueAnswers() == null ? "" : String.valueOf(proxy.getTrueAnswers()));
//        falseAnswers.setInnerText(proxy.getFalseAnswers() == null ? "" : String.valueOf(proxy.getFalseAnswers()));
//        sumAnswers.setInnerText(proxy.getSumAnswers() == null ? "" : String.valueOf(proxy.getSumAnswers()));
//        maxLetters.setInnerText(proxy.getMaxLetters() == null ? "" : String.valueOf(proxy.getMaxLetters()));
//        displayRenderer.setInnerText(medizin.client.managed.ui.QuestionTypeProxyRenderer.instance().render(proxy));
//        Log.info(proxy.getQuestionAccesses().toString());       
//        questionAccesses.setInnerText(proxy.getQuestionAccesses() == null ? "" : medizin.client.scaffold.place.CollectionRenderer.of(medizin.client.managed.ui.QuestionAccessProxyRenderer.instance()).render(proxy.getQuestionAccesses()));
//        displayRenderer.setInnerText(medizin.client.managed.ui.PersonProxyRenderer.instance().render(proxy));
    }

	public QuestiontypesEditViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));

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
