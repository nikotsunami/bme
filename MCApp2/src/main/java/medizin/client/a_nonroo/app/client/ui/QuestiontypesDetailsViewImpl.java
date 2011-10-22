package medizin.client.a_nonroo.app.client.ui;

import medizin.client.managed.request.QuestionTypeProxy;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class QuestiontypesDetailsViewImpl extends Composite implements QuestiontypesDetailsView  {

	private static UserDetailsViewImplUiBinder uiBinder = GWT
			.create(UserDetailsViewImplUiBinder.class);

	interface UserDetailsViewImplUiBinder extends
			UiBinder<Widget, QuestiontypesDetailsViewImpl> {
	}

	private Presenter presenter;

	private Delegate delegate;
	
    @UiField
    HasClickHandlers edit;	
//	
//	@UiField
//	    SpanElement id;
//
//	    @UiField
//	    SpanElement version;

	    @UiField
	    SpanElement questionTypeName;

	    @UiField
	    SpanElement isWeil;

	    @UiField
	    SpanElement trueAnswers;

	    @UiField
	    SpanElement falseAnswers;

	    @UiField
	    SpanElement sumAnswers;

	    @UiField
	    SpanElement maxLetters;

	    QuestionTypeProxy proxy;
//
//	    @UiField
//	    SpanElement displayRenderer;
	    
	    @UiHandler("edit")
	    public void onEditClicked(ClickEvent e) {
	        delegate.editClicked();
	      
	    }
	    @UiHandler("delete")
	    public void onDeleteClicked(ClickEvent e) {
	        delegate.deleteClicked();
	    }

	    public void setValue(QuestionTypeProxy proxy) {
	        this.proxy = proxy;
//	        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
//	        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
	        questionTypeName.setInnerText(proxy.getQuestionTypeName() == null ? "" : String.valueOf(proxy.getQuestionTypeName()));
	        isWeil.setInnerText(proxy.getIsWeil() == null ? "" : String.valueOf(proxy.getIsWeil()));
	        if(proxy.getIsWeil()){
	        	Document.get().getElementById("trueAnswers").removeFromParent();
	        	Document.get().getElementById("falseAnswers").removeFromParent();
	        	Document.get().getElementById("sumAnswers").removeFromParent();
	        	Document.get().getElementById("maxLetters").removeFromParent();
	        }
	        else{
		        trueAnswers.setInnerText(proxy.getTrueAnswers() == null ? "" : String.valueOf(proxy.getTrueAnswers()));
		        falseAnswers.setInnerText(proxy.getFalseAnswers() == null ? "" : String.valueOf(proxy.getFalseAnswers()));
		        sumAnswers.setInnerText(proxy.getSumAnswers() == null ? "" : String.valueOf(proxy.getSumAnswers()));
		        maxLetters.setInnerText(proxy.getMaxLetters() == null ? "" : String.valueOf(proxy.getMaxLetters()));
		        Document.get().getElementById("isWeil").removeFromParent();
	        }

	       
	       // displayRenderer.setInnerText(medizin.client.managed.ui.QuestionTypeProxyRenderer.instance().render(proxy));
	    }

	public QuestiontypesDetailsViewImpl() {
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


}
