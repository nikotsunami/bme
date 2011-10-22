package medizin.client.a_nonroo.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import medizin.client.a_nonroo.app.activities.FilterForMainPlaces;
import medizin.client.a_nonroo.app.activities.McAppActivityMapper;
import medizin.client.a_nonroo.app.client.ErrorPanel;
import medizin.client.a_nonroo.app.client.McAppConstant;
import medizin.client.a_nonroo.app.client.McAppNav;
import medizin.client.a_nonroo.app.client.TopPanel;
import medizin.client.a_nonroo.app.place.McAppPlaceHistoryMapper;
import medizin.client.a_nonroo.app.place.McPlaceHistoryFactory;
import medizin.client.a_nonroo.app.place.PlaceSystemOverview;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.InstitutionProxy;
import medizin.client.managed.request.PersonProxy;
import medizin.client.scaffold.request.RequestEvent;



import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.activity.shared.CachingActivityMapper;
import com.google.gwt.activity.shared.FilteredActivityMapper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.logging.client.LogConfiguration;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.requestfactory.client.RequestFactoryLogHandler;
import com.google.gwt.requestfactory.shared.LoggingRequest;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.ServerFailure;
import com.google.gwt.requestfactory.shared.Violation;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HasConstrainedValue;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.inject.Inject;
/**
 * The applications core. Is instantiated by GIN.
 * @author masterthesis
 *
 */
public class McApplication {

	private static final Logger log = Logger.getLogger(McApplication.class.getName());

	private final McAppShell shell;
	private final McAppRequestFactory requestFactory;
	private final EventBus eventBus;
	private final PlaceController placeController;
	private final McPlaceHistoryFactory mcPlaceHistoryFactory;
	private final McAppActivityMapper mcAppActivitiesMapper;


	@Inject
	public McApplication(McAppShell shell, McAppRequestFactory requestFactory, EventBus eventBus,
	                          PlaceController placeController, McPlaceHistoryFactory oscePlaceHistoryFactory,
	                          McAppActivityMapper applicationMainActivitiesMapper) {
		Log.debug("OsceApp.OsceApp");
		this.shell = shell;
		this.requestFactory = requestFactory;
		this.eventBus = eventBus;
		this.placeController = placeController;
		this.mcPlaceHistoryFactory = oscePlaceHistoryFactory;
		this.mcAppActivitiesMapper = applicationMainActivitiesMapper;
		
		
	}

	public void run() {
		
		Log.debug("McApp.run()");

		/* Add handlers, setup activities */

		init();

		/* Hide the loading message */

//		Element loading = Document.get().getElementById("loading");
//		loading.getParentElement().removeChild(loading);

		/* And show the user the shell */

		Log.debug("McApp.addPanlel");
		RootLayoutPanel.get().add(shell);
		Log.debug("McApp.addPanlel.after");

	}

	private void init() {
		Log.debug("McApp.init()");
		GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
			public void onUncaughtException(Throwable e) {
				Log.warn("Fehler im Exception Handler: "+e.getMessage(), e);
				log.log(Level.SEVERE, e.getMessage(), e);
			}
		});

		if (LogConfiguration.loggingIsEnabled()) {
			// Add remote logging handler
			RequestFactoryLogHandler.LoggingRequestProvider provider = new RequestFactoryLogHandler.LoggingRequestProvider() {
				public LoggingRequest getLoggingRequest() {
					return requestFactory.loggingRequest();
				}
			};
			Logger.getLogger("").addHandler(
					new RequestFactoryLogHandler(provider, Level.WARNING,
							new ArrayList<String>()));
		}

		RequestEvent.register(eventBus, new RequestEvent.Handler() {
			// Only show loading status if a request isn't serviced in 250ms.
			private static final int LOADING_TIMEOUT = 250;

			public void onRequestEvent(RequestEvent requestEvent) {
				if (requestEvent.getState() == RequestEvent.State.SENT) {
					shell.getMole().showDelayed(LOADING_TIMEOUT);
				} else {
					shell.getMole().hide();
				}
			}
		});

		
		Log.debug("McApp.Mapper");
		

		
		CachingActivityMapper cached = new CachingActivityMapper(mcAppActivitiesMapper);
		FilterForMainPlaces filterForMainPlaces = new FilterForMainPlaces();
		ActivityMapper masterActivityMap = new FilteredActivityMapper(filterForMainPlaces, cached);
		final ActivityManager masterActivityManager = new ActivityManager(masterActivityMap, eventBus);

		masterActivityManager.setDisplay(shell.getPanel());

//		ProxyListPlacePicker proxyListPlacePicker = new ProxyListPlacePicker(placeController, proxyPlaceToListPlace);
//		HasConstrainedValue<ProxyListPlace> listPlacePickerView = shell.getPlacesBox();
//		listPlacePickerView.setAcceptableValues(getTopPlaces());
//		proxyListPlacePicker.register(eventBus, listPlacePickerView);

//		final ActivityManager detailsActivityManager = new ActivityManager(applicationDetailsActivities, eventBus);

//		detailsActivityManager.setDisplay(shell.getDetailsPanel());
		Log.debug("McApp.History");
		/* Browser history integration */
		McAppPlaceHistoryMapper mapper = GWT.create(McAppPlaceHistoryMapper.class);
		mapper.setFactory(mcPlaceHistoryFactory);
		PlaceHistoryHandler placeHistoryHandler = new PlaceHistoryHandler(mapper);
//		ProxyListPlace defaultPlace = getTopPlaces().iterator().next();
		placeHistoryHandler.register(placeController, eventBus, new PlaceSystemOverview("PlaceSystemOverview"));
		placeHistoryHandler.handleCurrentHistory();
		
		McAppNav nav = new McAppNav(requestFactory, placeController, shell);
		
		//shell.setNavigation(nav);
		
		final TopPanel topPanel = TopPanel.instance(requestFactory, placeController);
		shell.setTopPanel(topPanel);
		
		requestFactory.personRequest().findAllPeople().fire(new Receiver<List<PersonProxy>>(){

			@Override
			public void onSuccess(List<PersonProxy> response) {
				topPanel.getLoggedUser().setAcceptableValues(response);
				//topPanel.getLoggedUser().setValue(response.get(0), true);
				
				
			}
	          public void onFailure(ServerFailure error){
	        	  ErrorPanel erorPanel = new ErrorPanel();
	        	  erorPanel.setErrorMessage(error.getMessage());
					Log.error(error.getMessage());
				}
	          @Override
				public void onViolation(Set<Violation> errors) {
					Iterator<Violation> iter = errors.iterator();
					String message = "";
					while(iter.hasNext()){
						message += iter.next().getMessage() + "<br>";
					}
					Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION + " in Antwort löschen -" + message);
					
		        	  ErrorPanel erorPanel = new ErrorPanel();
		        	  erorPanel.setErrorMessage(message);
					

					
				}
		});
		
		requestFactory.institutionRequest().findAllInstitutions().fire(new Receiver<List<InstitutionProxy>>(){

			@Override
			public void onSuccess(List<InstitutionProxy> response) {
				topPanel.getInstitutionListBox().setAcceptableValues(response);
				//topPanel.getInstitutionListBox().setValue(response.get(0), true);
			}
	          public void onFailure(ServerFailure error){
	        	  ErrorPanel erorPanel = new ErrorPanel();
	        	  erorPanel.setErrorMessage(error.getMessage());
					Log.error(error.getMessage());
				}
	          @Override
				public void onViolation(Set<Violation> errors) {
					Iterator<Violation> iter = errors.iterator();
					String message = "";
					while(iter.hasNext()){
						message += iter.next().getMessage() + "<br>";
					}
					Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION + " in Antwort löschen -" + message);
					
		        	  ErrorPanel erorPanel = new ErrorPanel();
		        	  erorPanel.setErrorMessage(message);
					

					
				}
		});
		
		Log.debug("McApp.initAfter");
	}

}
