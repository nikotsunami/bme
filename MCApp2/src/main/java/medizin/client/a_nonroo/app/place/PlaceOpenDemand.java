package medizin.client.a_nonroo.app.place;

import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class PlaceOpenDemand extends Place {

	 private String placeName;

	    public PlaceOpenDemand(String placeName) {
	        this.placeName = placeName;
	    }

	    public String getPlaceName() {
	        return placeName;
	    }

	    public static class Tokenizer implements PlaceTokenizer<PlaceOpenDemand> {
	        private McAppRequestFactory requestFactory;

			public Tokenizer(McAppRequestFactory requestFactory) {
	        	this.requestFactory = requestFactory;
			}

			@Override
	        public String getToken(PlaceOpenDemand place) {
	            return place.getPlaceName();
	        }

	        @Override
	        public PlaceOpenDemand getPlace(String token) {
	            return new PlaceOpenDemand(token);
	        }
	    }

}
