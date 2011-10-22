package medizin.client.a_nonroo.app.place;

import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.requestfactory.shared.EntityProxyId;

public class PlaceBookAssesment extends Place {

	 private String placeName;
	private EntityProxyId<?> proxyType;

	    public PlaceBookAssesment(String placeName) {
	        this.placeName = placeName;
	    }

	    public PlaceBookAssesment(EntityProxyId<?> proxyId) {
			this.proxyType = proxyId;
		}

		public String getPlaceName() {
	        return placeName;
	    }

	    public static class Tokenizer implements PlaceTokenizer<PlaceBookAssesment> {
	        private McAppRequestFactory requestFactory;

			public Tokenizer(McAppRequestFactory requestFactory) {
	        	this.requestFactory = requestFactory;
			}

			@Override
	        public String getToken(PlaceBookAssesment place) {
	            return place.getPlaceName();
	        }

	        @Override
	        public PlaceBookAssesment getPlace(String token) {
	            return new PlaceBookAssesment(token);
	        }
	    }

	    
		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
//			ProxyListPlace other = (ProxyListPlace) obj;
//			if (!proxyType.equals(other.proxyType)) {
//				return false;
//			}
			return true;
		}
}
