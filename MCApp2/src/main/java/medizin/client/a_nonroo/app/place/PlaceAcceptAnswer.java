package medizin.client.a_nonroo.app.place;

import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class PlaceAcceptAnswer extends Place {

	 private String placeName;

	    public PlaceAcceptAnswer(String placeName) {
	        this.placeName = placeName;
	    }

	    public String getPlaceName() {
	        return placeName;
	    }

	    public static class Tokenizer implements PlaceTokenizer<PlaceAcceptAnswer> {
	    	private final McAppRequestFactory requestFactory;
	        public Tokenizer(McAppRequestFactory requestFactory) {
	        	this.requestFactory = requestFactory;
			}

			@Override
	        public String getToken(PlaceAcceptAnswer place) {
	            return place.getPlaceName();
	        }

	        @Override
	        public PlaceAcceptAnswer getPlace(String token) {
	            return new PlaceAcceptAnswer(token);
	        }
	    }

}
