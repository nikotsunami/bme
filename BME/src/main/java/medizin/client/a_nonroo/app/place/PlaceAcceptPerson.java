package medizin.client.a_nonroo.app.place;

import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class PlaceAcceptPerson extends Place {

	 private String placeName;

	    public PlaceAcceptPerson(String placeName) {
	        this.placeName = placeName;
	    }

	    public String getPlaceName() {
	        return placeName;
	    }

	    public static class Tokenizer implements PlaceTokenizer<PlaceAcceptPerson> {
	    	private final McAppRequestFactory requestFactory;
	        public Tokenizer(McAppRequestFactory requestFactory) {
	        	this.requestFactory = requestFactory;
			}

			@Override
	        public String getToken(PlaceAcceptPerson place) {
	            return place.getPlaceName();
	        }

	        @Override
	        public PlaceAcceptPerson getPlace(String token) {
	            return new PlaceAcceptPerson(token);
	        }
	    }

}
