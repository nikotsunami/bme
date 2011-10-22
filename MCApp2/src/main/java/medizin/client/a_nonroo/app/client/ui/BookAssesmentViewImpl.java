package medizin.client.a_nonroo.app.client.ui;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import medizin.client.a_nonroo.app.place.PlaceBookAssesmentDetails;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class BookAssesmentViewImpl extends Composite implements BookAssesmentView  {

	private static BookAssesmentViewImplUiBinder uiBinder = GWT
			.create(BookAssesmentViewImplUiBinder.class);

	interface BookAssesmentViewImplUiBinder extends
			UiBinder<Widget, BookAssesmentViewImpl> {
	}

	private Presenter presenter;
	
	public BookAssesmentViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	private McAppRequestFactory requests;
	private PlaceController placeController;

	@Inject
	public BookAssesmentViewImpl(McAppRequestFactory requests, PlaceController placeController) {
		initWidget(uiBinder.createAndBindUi(this));
        this.requests = requests;
        this.placeController = placeController;
	}


	@Override
	public void setName(String helloName) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
		
	}
//	//Tab for Assesements
//	@UiField
//    TabLayoutPanel tabPanel;
// 
//	@UiField
//    CellTable<AssesmentProxy> table;
	
	@UiField
	HorizontalPanel tabs;
	@UiField
	SimplePanel content;
	
	

	protected Set<String> paths = new HashSet<String>();
	private Integer tabId=0;
	private HashMap<Integer, EntityProxyId<?>> idMap = new HashMap<Integer, EntityProxyId<?>>();
	
	public void init() {
		
		
	
	    }
	@Override
	public void createTab(String name, EntityProxyId<?> id) {

		Anchor link = new Anchor(name);
		link.setName(String.valueOf(tabId));
		link.addStyleName("ui-button ui-widget ui-state-default ui-button-text-only");
		idMap.put(tabId, id);
		tabId++;
		tabs.add(link);
		
		link.addClickHandler( new ClickHandler(){  
			   @Override  
			  public void onClick(ClickEvent event) {  
				   
				   Anchor clickedLink = (Anchor) event.getSource();
				   
				   Integer count = tabs.getWidgetCount();
				   for(Integer i = 0;i < count;i++){
					  Widget linkTemp = tabs.getWidget(i);
					  if (linkTemp != clickedLink){
						  linkTemp.setStyleName("ui-button ui-widget ui-state-default ui-button-text-only");
						  
					  }
				   }

				   Integer value = Integer.parseInt(clickedLink.getName());
				   clickedLink.setStyleName("ui-button ui-widget ui-state-default ui-button-text-only ui-state-active");
				   Log.info(idMap.get(value).toString());
			  presenter.goTo(new PlaceBookAssesmentDetails(idMap.get(value))); 
			  
			 }  
			 }); 
		
		
	}
	@Override
	public AcceptsOneWidget getDetailsPanel() {
		
		return content;
	}
	
	
	

}
