package medizin.client.a_nonroo.app.ioc;


import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;


public class McGinModule extends medizin.client.scaffold.ioc.ScaffoldModule {
	
	@Override
	protected void configure() {
		bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
		bind(McAppRequestFactory.class).toProvider(RequestFactoryProvider.class).in(Singleton.class);
		bind(PlaceController.class).toProvider(PlaceControllerProvider.class).in(Singleton.class);
	}

	static class PlaceControllerProvider implements Provider<PlaceController> {

		private final PlaceController placeController;

		@Inject
		public PlaceControllerProvider(EventBus eventBus) {
			this.placeController = new PlaceController(eventBus);
		}

		public PlaceController get() {
			return placeController;
		}
	}

	static class RequestFactoryProvider implements Provider<McAppRequestFactory> {

		private final McAppRequestFactory requestFactory;

		@Inject
		public RequestFactoryProvider(EventBus eventBus) {
			requestFactory = GWT.create(McAppRequestFactory.class);
			requestFactory.initialize(eventBus, new medizin.client.scaffold.request.EventSourceRequestTransport(
					eventBus));
		}

		public McAppRequestFactory get() {
			return requestFactory;
		}
	}

}
