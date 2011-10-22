package medizin.client.a_nonroo.app.activities;

import medizin.client.a_nonroo.app.client.McAppConstant;
import medizin.client.a_nonroo.app.client.ui.user.UserDetailsView;
import medizin.client.a_nonroo.app.client.ui.user.UserDetailsViewImpl;
import medizin.client.a_nonroo.app.client.ui.user.UserEditView;
import medizin.client.a_nonroo.app.client.ui.user.UserEditViewImpl;

import medizin.client.a_nonroo.app.place.PlaceUser;
import medizin.client.a_nonroo.app.place.PlaceUserDetails;
import medizin.client.a_nonroo.app.place.PlaceUserDetails.Operation;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.AnswerRequest;
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
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
/**
 * Activity for creating a new User
 * @author masterthesis
 *
 */
public class ActivityUserCreate  extends AbstractActivityWrapper  implements UserEditView.Presenter, UserEditView.Delegate {
	
	
	private PlaceUserDetails userPlace;

	private AcceptsOneWidget widget;
	private UserEditView view;
	private PlaceUserDetails.Operation operation;
	private PersonProxy person;

//	public ActivityUserCreate(PlaceUserDetails place, McAppFactory mcAppFactory) {
//		this.userPlace = place;
//		this.mcAppFactory = mcAppFactory;
//	}
//
//	public ActivityUserCreate(PlaceUserDetails place,
//			McAppFactory mcAppFactory, Operation operation) {
//		this.userPlace = place;
//		this.mcAppFactory = mcAppFactory;
//		this.operation = operation;
//	}
	
	private McAppRequestFactory requests;
	private PlaceController placeController;

	private boolean save;

	@Inject
	public ActivityUserCreate(PlaceUserDetails place,
			McAppRequestFactory requests, PlaceController placeController) {
		super(place, requests, placeController);
		this.userPlace = place;
        this.requests = requests;
        this.placeController = placeController;
	}

	@Inject
	public ActivityUserCreate(PlaceUserDetails place,
			McAppRequestFactory requests, PlaceController placeController,
			PlaceUserDetails.Operation operation) {
		super(place, requests, placeController);
		this.userPlace = place;
        this.requests = requests;
        this.placeController = placeController;
        this.operation = operation;
	}

	@Override
	public String mayStop() {
		if(!save)
			return McAppConstant.DO_NOT_SAVE_CHANGES;
		else
			return null;
	}

	@Override
	public void onCancel() {
		onStop();

	}

	@Override
	public void onStop() {
		

	}
	
	private RequestFactoryEditorDriver<PersonProxy,UserEditViewImpl> editorDriver;

	
	@Override
	public void start(AcceptsOneWidget widget, EventBus eventBus) {
		super.start(widget, eventBus);

	}
	
	@Override
	public void start2(AcceptsOneWidget widget, EventBus eventBus) {
		UserEditView userEditView = new UserEditViewImpl();

		this.widget = widget;
		this.view = userEditView;
		editorDriver = view.createEditorDriver();
		view.setDelegate(this);

//		view.initialiseDriver(requests);
        widget.setWidget(userEditView.asWidget());
		//setTable(view.getTable());
        
		eventBus.addHandler(PlaceChangeEvent.TYPE, new PlaceChangeEvent.Handler() {
			public void onPlaceChange(PlaceChangeEvent event) {
				
				//updateSelection(event.getNewPlace());
				// TODO implement
			}
		});
		//init();
		
		view.setDelegate(this);
		if(this.operation==PlaceUserDetails.Operation.EDIT){
			Log.info("edit");
		requests.find(userPlace.getProxyId()).fire(new Receiver<Object>() {

			public void onFailure(ServerFailure error){
				Log.error(error.getMessage());
			}
			@Override
			public void onSuccess(Object response) {
				if(response instanceof PersonProxy){
					Log.info(((PersonProxy) response).getEmail());
					//init((PersonProxy) response);
					person=(PersonProxy)response;
					init();
				}

				
			}
		    });
		}
		else{
			
			Log.info("neuePerson");
			//userPlace.setProxyId(person.stableId());
			init();
		}
	}
	private void init() {
		
		PersonRequest request = requests.personRequest();
		
		if(person==null){
			PersonProxy person = request.create(PersonProxy.class);
			this.person=person;
			view.setEditTitle(false);
		}
		else
		{
			view.setEditTitle(true);
		}
		
		Log.info("edit");
	      
	       Log.info("persist");
	        request.persist().using(person);
		editorDriver.edit(person, request);

		Log.info("flush");
		editorDriver.flush();
		this.person = person;
		Log.debug("Create für: "+person.getEmail());
//		view.setValue(person);
		
	}
	
	
	private void init(PersonProxy person) {

		this.person = person;
		PersonRequest request = requests.personRequest();
		request.persist().using(person);
		Log.info("edit");
		editorDriver.edit(person, request);

		Log.info("flush");
		editorDriver.flush();
		Log.debug("Edit für: "+person.getEmail());
//		view.setValue(person);
		
	}




	@Override
	public void goTo(Place place) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelClicked() {
		if(this.operation==PlaceUserDetails.Operation.EDIT)
			placeController.goTo(new PlaceUserDetails(person.stableId(), PlaceUserDetails.Operation.DETAILS));
		else
			placeController.goTo(new PlaceUser("PlaceUser!CANCEL"));
		
	}

	@Override
	public void saveClicked() {
		save=true;
		editorDriver.flush().fire(new Receiver<Void>() {
			
          @Override
          public void onSuccess(Void response) {
        	  Log.info("PersonSucesfullSaved");
        	  
        		placeController.goTo(new PlaceUserDetails(person.stableId(), PlaceUserDetails.Operation.DETAILS));
          //	goTo(new PlaceUser(person.stableId()));
          }
          
          public void onFailure(ServerFailure error){
				Log.error(error.getMessage());
			}
      }); 
		
	}

}
