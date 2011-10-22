package medizin.client.a_nonroo.app.place;

import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class PlaceAsignAssQuestion extends Place {

	 private String placeName;

	    public PlaceAsignAssQuestion(String placeName) {
	        this.placeName = placeName;
	    }

	    public String getPlaceName() {
	        return placeName;
	    }

	    public static class Tokenizer implements PlaceTokenizer<PlaceAsignAssQuestion> {
	    	private final McAppRequestFactory requestFactory;
	        public Tokenizer(McAppRequestFactory requestFactory) {
				this.requestFactory = requestFactory;
			}

			@Override
	        public String getToken(PlaceAsignAssQuestion place) {
	            return place.getPlaceName();
	        }

	        @Override
	        public PlaceAsignAssQuestion getPlace(String token) {
	            return new PlaceAsignAssQuestion(token);
	        }
	    }

}
