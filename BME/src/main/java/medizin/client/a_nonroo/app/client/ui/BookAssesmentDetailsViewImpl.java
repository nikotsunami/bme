package medizin.client.a_nonroo.app.client.ui;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


import medizin.client.a_nonroo.app.place.PlaceBookAssesmentDetails;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.AssesmentProxy;

import com.allen_sauer.gwt.dnd.client.PickupDragController;
import com.allen_sauer.gwt.dnd.client.drop.AbsolutePositionDropController;
import com.allen_sauer.gwt.dnd.client.drop.DropController;
import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class BookAssesmentDetailsViewImpl extends Composite implements BookAssesmentDetailsView  {

	private static BookAssesmentDetailsViewImplUiBinder uiBinder = GWT
			.create(BookAssesmentDetailsViewImplUiBinder.class);

	interface BookAssesmentDetailsViewImplUiBinder extends
			UiBinder<Widget, BookAssesmentDetailsViewImpl> {
		
		
	}

	private Presenter presenter;

	private McAppRequestFactory requests;
	private PlaceController placeController;

	@Inject
	public BookAssesmentDetailsViewImpl(McAppRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
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
	

	@UiField
	AbsolutePanel content;
	
	@UiField
	ScrollPanel scrollContainer;
	
	

	protected Set<String> paths = new HashSet<String>();
	private Integer tabId=0;
	private HashMap<Integer, EntityProxyId<?>> idMap = new HashMap<Integer, EntityProxyId<?>>();
	

	@Override
	public void reload(AssesmentProxy assesmentProxy){
		presenter.goTo(new PlaceBookAssesmentDetails(assesmentProxy.stableId())); 
	}


	@Override
	public AbsolutePanel getWorkingArea() {
		
		return content;
	}
	@Override
	public ScrollPanel getScrollContainer(){
		return scrollContainer;
	}
	@UiField
	Button printAButton;

	private Delegate delegate;
	
	@Override
	public
	void setDelegate(Delegate delegate){
		this.delegate = delegate;
	}
	
	@UiHandler ("printAButton")
	void printAButtonClicked(ClickEvent event){
		delegate.createAssementBook(true);
	}
	

}
