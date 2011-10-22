package medizin.client.a_nonroo.app.place;

import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class PlaceAcceptAssQuestion extends Place {

	 private String placeName;

	    public PlaceAcceptAssQuestion(String placeName) {
	        this.placeName = placeName;
	    }

	    public String getPlaceName() {
	        return placeName;
	    }

	    public static class Tokenizer implements PlaceTokenizer<PlaceAcceptAssQuestion> {
	    	private final McAppRequestFactory requestFactory;
	        public Tokenizer(McAppRequestFactory requestFactory) {
	        	this.requestFactory = requestFactory;
			}

			@Override
	        public String getToken(PlaceAcceptAssQuestion place) {
	            return place.getPlaceName();
	        }

	        @Override
	        public PlaceAcceptAssQuestion getPlace(String token) {
	            return new PlaceAcceptAssQuestion(token);
	        }
	    }

}
