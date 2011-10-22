package medizin.client.a_nonroo.app.activities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import medizin.client.a_nonroo.app.client.ErrorPanel;
import medizin.client.a_nonroo.app.client.McAppConstant;

import medizin.client.a_nonroo.app.client.ui.assesment.AssesmentEditView;
import medizin.client.a_nonroo.app.client.ui.assesment.AssesmentEditViewImpl;

import medizin.client.a_nonroo.app.place.PlaceAssesment;
import medizin.client.a_nonroo.app.place.PlaceAssesmentDetails;
import medizin.client.a_nonroo.app.place.PlaceUser;
import medizin.client.a_nonroo.app.place.PlaceUserDetails;
import medizin.client.a_nonroo.app.place.PlaceAssesmentDetails.Operation;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.AnswerRequest;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.AssesmentRequest;
import medizin.client.managed.request.McProxy;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.PersonRequest;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.client.RequestFactoryEditorDriver;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.ServerFailure;
import com.google.gwt.requestfactory.shared.Violation;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

import com.google.inject.Inject;

public class ActivityAssesmentCreate  extends AbstractActivityWrapper  implements AssesmentEditView.Presenter, AssesmentEditView.Delegate {
	
	
	private PlaceAssesmentDetails assesmentPlace;

	private AcceptsOneWidget widget;
	private AssesmentEditView view;
	private PlaceAssesmentDetails.Operation operation;
	private AssesmentProxy assesment;

//	public ActivityAssesmentCreate(PlaceAssesmentDetails place, McAppFactory mcAppFactory) {
//		this.assesmentPlace = place;
//		this.mcAppFactory = mcAppFactory;
//	}
//
//	public ActivityAssesmentCreate(PlaceAssesmentDetails place,
//			McAppFactory mcAppFactory, Operation operation) {
//		this.assesmentPlace = place;
//		this.mcAppFactory = mcAppFactory;
//		this.operation = operation;
//	}
	
	private McAppRequestFactory requests;
	private PlaceController placeController;

	@Inject
	public ActivityAssesmentCreate(PlaceAssesmentDetails place,
			McAppRequestFactory requests, PlaceController placeController) {
		super(place, requests, placeController);
		this.assesmentPlace = place;
        this.requests = requests;
        this.placeController = placeController;
	}

	@Inject
	public ActivityAssesmentCreate(PlaceAssesmentDetails place,
			McAppRequestFactory requests, PlaceController placeController,
			PlaceAssesmentDetails.Operation operation) {
		super(place, requests, placeController);
		this.assesmentPlace = place;
        this.requests = requests;
        this.placeController = placeController;
        this.operation = operation;
	}

	@Override
	public String mayStop() {
		//return McAppConstant.ACTIVITY_MAY_STOP;
		return null;
	}

	@Override
	public void onCancel() {
		onStop();

	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub

	}
	
	
	private RequestFactoryEditorDriver<AssesmentProxy,AssesmentEditViewImpl> editorDriver;

	@Override
	public void start(AcceptsOneWidget widget, EventBus eventBus) {
		super.start(widget, eventBus);

	}
	@Override
	public void start2(AcceptsOneWidget widget, EventBus eventBus) {
		AssesmentEditView assesmentEditView = new AssesmentEditViewImpl();
		assesmentEditView.setName("hallo");
		assesmentEditView.setPresenter(this);
		this.widget = widget;
		this.view = assesmentEditView;
		editorDriver = view.createEditorDriver();
		view.setDelegate(this);
		
        view.setMcPickerValues(Collections.<McProxy>emptyList());
        requests.mcRequest().findMcEntries(0, 50).with(medizin.client.managed.ui.McProxyRenderer.instance().getPaths()).fire(new Receiver<List<McProxy>>() {

            public void onSuccess(List<McProxy> response) {
                List<McProxy> values = new ArrayList<McProxy>();
                values.add(null);
                values.addAll(response);
                view.setMcPickerValues(values);
            }
        });
        view.setRepeForPickerValues(Collections.<AssesmentProxy>emptyList());
        requests.assesmentRequest().findAssesmentEntries(0, 50).with(medizin.client.managed.ui.AssesmentProxyRenderer.instance().getPaths()).fire(new Receiver<List<AssesmentProxy>>() {

            public void onSuccess(List<AssesmentProxy> response) {
                List<AssesmentProxy> values = new ArrayList<AssesmentProxy>();
                values.add(null);
                values.addAll(response);
                view.setRepeForPickerValues(values);
            }
        });

//		view.initialiseDriver(requests);
        widget.setWidget(assesmentEditView.asWidget());
		//setTable(view.getTable());
        
		eventBus.addHandler(PlaceChangeEvent.TYPE, new PlaceChangeEvent.Handler() {
			public void onPlaceChange(PlaceChangeEvent event) {
				
				//updateSelection(event.getNewPlace());
				// TODO implement
			}
		});
		//init();
		
		view.setDelegate(this);
		if(this.operation==PlaceAssesmentDetails.Operation.EDIT){
			Log.info("edit");
		requests.find(assesmentPlace.getProxyId()).with("mc","repeFor").fire(new Receiver<Object>() {

			public void onFailure(ServerFailure error){
				Log.error(error.getMessage());
			}
			@Override
			public void onSuccess(Object response) {
				if(response instanceof AssesmentProxy){
					Log.info(((AssesmentProxy) response).getName());
					//init((PersonProxy) response);
					assesment=(AssesmentProxy)response;
					init();
				}

				
			}
		    });
		}
		else{
			
			Log.info("neues Assement");
			//assesmentPlace.setProxyId(person.stableId());
			init();
		}
	}
	private void init() {
		
		AssesmentRequest request = requests.assesmentRequest();
		
		if(assesment==null){
			AssesmentProxy assesment = request.create(AssesmentProxy.class);
			this.assesment=assesment;
			view.setEditTitle(false);
		}
		else {
			view.setEditTitle(true);
		}
		
		Log.info("edit");
	      
	       Log.info("persist");
	        request.persist().using(assesment);
		editorDriver.edit(assesment, request);

		Log.info("flush");
		editorDriver.flush();
//		this.assesment = assesment;
		Log.debug("Create für: "+assesment.getName());
//		view.setValue(person);
		
	}
	
	
//	private void init(AssesmentProxy assesment) {
//
//		this.assesment = assesment;
//		AssesmentRequest request = requests.assesmentRequest();
//		request.persist().using(assesment);
//		Log.info("edit");
//		editorDriver.edit(assesment, request);
//
//		Log.info("flush");
//		editorDriver.flush();
//		Log.debug("Edit für: "+assesment.getName());
////		view.setValue(person);
//		
//	}




	@Override
	public void goTo(Place place) {
		placeController.goTo(place);
		
	}

	@Override
	public void cancelClicked() {
		if(this.operation==PlaceAssesmentDetails.Operation.EDIT)
			placeController.goTo(new PlaceAssesmentDetails(assesment.stableId()));
		else
			placeController.goTo(new PlaceAssesment("PlaceAssesment!CANCEL"));
		
	}

	@Override
	public void saveClicked() {

		editorDriver.flush().fire(new Receiver<Void>() {
			
          @Override
          public void onSuccess(Void response) {
        	  Log.info("PersonSucesfullSaved");
        	  
        		placeController.goTo(new PlaceAssesmentDetails(assesment.stableId(), PlaceAssesmentDetails.Operation.DETAILS));
          //	goTo(new PlaceAssesment(person.stableId()));
          }
          
          public void onFailure(ServerFailure error){
				Log.error(error.getMessage());
			}
          @Override
			public void onViolation(Set<Violation> errors) {
				Iterator<Violation> iter = errors.iterator();
				String message = "";
				while(iter.hasNext()){
					message += iter.next().getMessage() + "<br>";
				}
				Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION + " in Event -" + message);
				
				ErrorPanel erorPanel = new ErrorPanel();
			        	  erorPanel.setWarnMessage(message);

				
			}
      }); 
		
	}

}
