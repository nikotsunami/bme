package medizin.client.a_nonroo.app.place;

import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class PlaceAcceptQuestion extends Place {

	 private String placeName;

	    public PlaceAcceptQuestion(String placeName) {
	        this.placeName = placeName;
	    }

	    public String getPlaceName() {
	        return placeName;
	    }

	    public static class Tokenizer implements PlaceTokenizer<PlaceAcceptQuestion> {
	    	private final McAppRequestFactory requestFactory;
	        public Tokenizer(McAppRequestFactory requestFactory) {
	        	this.requestFactory = requestFactory;
			}

			@Override
	        public String getToken(PlaceAcceptQuestion place) {
	            return place.getPlaceName();
	        }

	        @Override
	        public PlaceAcceptQuestion getPlace(String token) {
	            return new PlaceAcceptQuestion(token);
	        }
	    }

}
