package medizin.client.a_nonroo.app.place;

import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class PlaceSystemOverview extends Place {

	 private String placeName;

	    public PlaceSystemOverview(String placeName) {
	        this.placeName = placeName;
	    }

	    public String getPlaceName() {
	        return placeName;
	    }

	    public static class Tokenizer implements PlaceTokenizer<PlaceSystemOverview> {
	    	
	    	private final McAppRequestFactory requestFactory;
	    	
	        public Tokenizer(McAppRequestFactory requestFactory) {
	        	this.requestFactory = requestFactory;
			}

			@Override
	        public String getToken(PlaceSystemOverview place) {
	            return place.getPlaceName();
	        }

	        @Override
	        public PlaceSystemOverview getPlace(String token) {
	            return new PlaceSystemOverview(token);
	        }
	    }

}
