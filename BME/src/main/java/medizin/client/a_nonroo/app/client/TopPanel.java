/**
 * 
 */
package medizin.client.a_nonroo.app.client;

import javax.servlet.http.HttpSession;

import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.InstitutionProxy;
import medizin.client.managed.request.PersonProxy;


import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.server.RequestFactoryServlet;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

/**
 * The TopPanel contains the users login information and a list box to select the institution. 
 *
 */
public class TopPanel extends Composite {

	private static TopPanelUiBinder uiBinder = GWT
			.create(TopPanelUiBinder.class);

	interface TopPanelUiBinder extends UiBinder<Widget, TopPanel> {
	}
    private static TopPanel instance;
    public static TopPanel instance(McAppRequestFactory requests, PlaceController placeController) {
        if (instance == null) {
            instance = new TopPanel(requests, placeController);
        }
//		HttpSession session = RequestFactoryServlet.getThreadLocalRequest().getSession();

        return instance;
    }
    
    @UiField(provided = true)
    ValueListBox<InstitutionProxy> institutionListBox = new ValueListBox<InstitutionProxy>(medizin.client.managed.ui.InstitutionProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<medizin.client.managed.request.InstitutionProxy>());

    @UiField(provided = true)
    ValueListBox<PersonProxy> loggedUser = new ValueListBox<PersonProxy>(medizin.client.managed.ui.PersonProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<medizin.client.managed.request.PersonProxy>());

    @UiHandler ("loggedUser")
    public void loginUser(ValueChangeEvent<PersonProxy> event){
    	requests.personRequestNonRoo().loginPerson().using(loggedUser.getValue()).fire();
    }
    @UiHandler ("institutionListBox")
    public void setInstitution(ValueChangeEvent<InstitutionProxy> event){
    	requests.institutionRequestNonRoo().mySetCurrentInstitution().using(institutionListBox.getValue()).fire();
    }
    
    public ValueListBox<InstitutionProxy> getInstitutionListBox() {
		return institutionListBox;
	}

	public ValueListBox<PersonProxy> getLoggedUser() {
		return loggedUser;
		
	}
	
	private McAppRequestFactory requests;
	private PlaceController placeController;

	/**
	 * Because this class has a default constructor, it can
	 * be used as a binder template. In other words, it can be used in other
	 * *.ui.xml files as follows:
	 * <ui:UiBinder xmlns:ui="urn:ui:com.google.gwt.uibinder"
	 *   xmlns:g="urn:import:**user's package**">
	 *  <g:**UserClassName**>Hello!</g:**UserClassName>
	 * </ui:UiBinder>
	 * Note that depending on the widget that is used, it may be necessary to
	 * implement HasHTML instead of HasText.
	 */
	@Inject
	public TopPanel(McAppRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
		initWidget(uiBinder.createAndBindUi(this));
		
	}

}
