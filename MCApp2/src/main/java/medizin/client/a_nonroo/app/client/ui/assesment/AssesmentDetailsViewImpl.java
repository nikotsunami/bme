package medizin.client.a_nonroo.app.client.ui.assesment;

import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.PersonProxy;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.requestfactory.client.RequestFactoryEditorDriver;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class AssesmentDetailsViewImpl extends Composite implements AssesmentDetailsView  {

	private static AssesmentDetailsViewImplUiBinder uiBinder = GWT
			.create(AssesmentDetailsViewImplUiBinder.class);

	interface AssesmentDetailsViewImplUiBinder extends
			UiBinder<Widget, AssesmentDetailsViewImpl> {
	}
	


	private Presenter presenter;

	
    @UiField
    HasClickHandlers edit;

    @UiField
    HasClickHandlers delete;

    private Delegate delegate;
	

    @UiField
    SpanElement name;

    @UiField
    SpanElement dateOfAssesment;

    @UiField
    SpanElement dateOpen;

    @UiField
    SpanElement dateClosed;

    @UiField
    SpanElement place;

    @UiField
    SpanElement logo;

    @UiField
    SpanElement isClosed;

    @UiField
    SpanElement assesmentVersion;

    @UiField
    SpanElement mc;

    @UiField
    SpanElement repeFor;

    @UiField
    SpanElement percentSameQuestion;

    AssesmentProxy proxy;

    @UiField
	QuestionTypeCountViewImpl questionTypeCountViewImpl;


    
//    @UiField
//    EventAccessViewImpl eventAccessView;
//    
//    @UiField
//    QuestionAccessViewImpl questionAccessView;
    
    
//	@Override
//    public EventAccessViewImpl getEventAccessView(){
//    	return eventAccessView;
//    }


    
    @UiHandler("delete")
    public void onDeleteClicked(ClickEvent e) {
        delegate.deleteClicked();
    }

    @UiHandler("edit")
    public void onEditClicked(ClickEvent e) {
        delegate.editClicked();
    }

//    @UiField
//    SpanElement displayRenderer;

    public void setValue(AssesmentProxy proxy) {
        this.proxy = proxy;
        
        name.setInnerText(proxy.getName() == null ? "" : String.valueOf(proxy.getName()));
        dateOfAssesment.setInnerText(proxy.getDateOfAssesment() == null ? "" : DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT).format(proxy.getDateOfAssesment()));
        dateOpen.setInnerText(proxy.getDateOpen() == null ? "" : DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT).format(proxy.getDateOpen()));
        dateClosed.setInnerText(proxy.getDateClosed() == null ? "" : DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT).format(proxy.getDateClosed()));
        place.setInnerText(proxy.getPlace() == null ? "" : String.valueOf(proxy.getPlace()));
        logo.setInnerText(proxy.getLogo() == null ? "" : String.valueOf(proxy.getLogo()));
        isClosed.setInnerText(proxy.getIsClosed() == null ? "" : (proxy.getIsClosed()? "ja":"nein"));
        assesmentVersion.setInnerText(proxy.getAssesmentVersion() == null ? "" : String.valueOf(proxy.getAssesmentVersion()));
        mc.setInnerText(proxy.getMc() == null ? "" : medizin.client.managed.ui.McProxyRenderer.instance().render(proxy.getMc()));
        repeFor.setInnerText(proxy.getRepeFor() == null ? "" : medizin.client.managed.ui.AssesmentProxyRenderer.instance().render(proxy.getRepeFor()));
        percentSameQuestion.setInnerText(proxy.getPercentSameQuestion() == null ? "" : String.valueOf(proxy.getPercentSameQuestion()));
      //  displayRenderer.setInnerText(medizin.client.managed.ui.AssesmentProxyRenderer.instance().render(proxy));
       
       
    }

	public AssesmentDetailsViewImpl() {
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

	@Override
	public QuestionTypeCountViewImpl getQuestionTypeCountViewImpl() {
		// TODO Auto-generated method stub
		return questionTypeCountViewImpl;
	}
	
	@UiField
	QuestionSumPerPersonViewImpl questionSumPerPersonViewImpl;
	
	@Override
	public QuestionSumPerPersonViewImpl getQuestionSumPerPersonViewImpl(){
		return questionSumPerPersonViewImpl;
	}
	




}
