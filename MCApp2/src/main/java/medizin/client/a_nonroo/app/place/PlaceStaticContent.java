package medizin.client.a_nonroo.app.place;

import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class PlaceStaticContent extends Place {

	 private String placeName;

	    public PlaceStaticContent(String placeName) {
	        this.placeName = placeName;
	    }

	    public String getPlaceName() {
	        return placeName;
	    }

	    public static class Tokenizer implements PlaceTokenizer<PlaceStaticContent> {
	        private McAppRequestFactory requestFactory;

			public Tokenizer(McAppRequestFactory requestFactory) {
	        	this.requestFactory = requestFactory;
			}

			@Override
	        public String getToken(PlaceStaticContent place) {
	            return place.getPlaceName();
	        }

	        @Override
	        public PlaceStaticContent getPlace(String token) {
	            return new PlaceStaticContent(token);
	        }
	    }

}
