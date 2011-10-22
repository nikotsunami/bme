package medizin.client.a_nonroo.app.client.ui.user;

import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.PersonProxy;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.requestfactory.client.RequestFactoryEditorDriver;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class UserDetailsViewImpl extends Composite implements UserDetailsView  {

	private static UserDetailsViewImplUiBinder uiBinder = GWT
			.create(UserDetailsViewImplUiBinder.class);

	interface UserDetailsViewImplUiBinder extends
			UiBinder<Widget, UserDetailsViewImpl> {
	}
	


	private Presenter presenter;

	
    @UiField
    HasClickHandlers edit;

    @UiField
    HasClickHandlers delete;

    private Delegate delegate;
	
//    @UiField
//    SpanElement id;
//
//    @UiField
//    SpanElement version;

    @UiField
    SpanElement name;

    @UiField
    SpanElement prename;
    
    @UiField
    SpanElement header;

    @UiField
    SpanElement email;

    @UiField
    SpanElement alternativEmail;

    @UiField
    SpanElement phoneNumber;

    @UiField
    SpanElement isAdmin;

    @UiField
    SpanElement isAccepted;

//    @UiField
//    SpanElement questionAccesses;
    
    @UiField
    EventAccessViewImpl eventAccessView;
    
    @UiField
    QuestionAccessViewImpl questionAccessView;
    
    
	@Override
    public EventAccessViewImpl getEventAccessView(){
    	return eventAccessView;
    }

    PersonProxy proxy;
    
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

    public void setValue(PersonProxy proxy) {
        this.proxy = proxy;
       
//        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
//        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        header.setInnerText((proxy.getName() == null ? "" : String.valueOf(proxy.getName()) )+" "+ (proxy.getPrename() == null ? "" : String.valueOf(proxy.getPrename())));
        name.setInnerText(proxy.getName() == null ? "" : String.valueOf(proxy.getName()));
        prename.setInnerText(proxy.getPrename() == null ? "" : String.valueOf(proxy.getPrename()));
        email.setInnerText(proxy.getEmail() == null ? "" : String.valueOf(proxy.getEmail()));
        alternativEmail.setInnerText(proxy.getAlternativEmail() == null ? "" : String.valueOf(proxy.getAlternativEmail()));
        phoneNumber.setInnerText(proxy.getPhoneNumber() == null ? "" : String.valueOf(proxy.getPhoneNumber()));
        isAdmin.setInnerText(proxy.getIsAdmin() == null ? "" : (proxy.getIsAdmin()? "ja" : "nein"));
        isAccepted.setInnerText(proxy.getIsAccepted() == null ? "" : (proxy.getIsAccepted()? "ja" : "nein"));
//        Log.info(proxy.getQuestionAccesses().toString());       
//        questionAccesses.setInnerText(proxy.getQuestionAccesses() == null ? "" : medizin.client.scaffold.place.CollectionRenderer.of(medizin.client.managed.ui.QuestionAccessProxyRenderer.instance()).render(proxy.getQuestionAccesses()));
//        displayRenderer.setInnerText(medizin.client.managed.ui.PersonProxyRenderer.instance().render(proxy));
    }

	public UserDetailsViewImpl() {
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
	public QuestionAccessViewImpl getQuestionAccessView() {
		// TODO Auto-generated method stub
		return questionAccessView;
	}




}
