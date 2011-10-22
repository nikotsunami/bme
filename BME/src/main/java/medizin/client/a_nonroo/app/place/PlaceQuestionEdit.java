package medizin.client.a_nonroo.app.place;

import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class PlaceQuestionEdit extends Place {

	 private String placeName;

	    public PlaceQuestionEdit(String placeName) {
	        this.placeName = placeName;
	    }

	    public String getPlaceName() {
	        return placeName;
	    }

	    public static class Tokenizer implements PlaceTokenizer<PlaceQuestionEdit> {
	        private McAppRequestFactory requestFactory;

			public Tokenizer(McAppRequestFactory requestFactory) {
	        	this.requestFactory = requestFactory;
			}

			@Override
	        public String getToken(PlaceQuestionEdit place) {
	        	Log.debug("im get Token Place Question Edit");
	            return place.getPlaceName();
	        }

	        @Override
	        public PlaceQuestionEdit getPlace(String token) {
	            return new PlaceQuestionEdit(token);
	        }
	    }

}
