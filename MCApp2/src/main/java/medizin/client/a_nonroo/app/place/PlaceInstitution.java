package medizin.client.a_nonroo.app.place;


import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.scaffold.place.ProxyListPlace;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.RequestFactory;

public class PlaceInstitution extends Place {

	public enum Operation {
		DETAILS
	}
	private static final String SEPARATOR = "!";
	private String placeName;

	private  EntityProxyId<?> proxyId;
	private Operation operation = null;

	
	
	public  EntityProxyId<?> getProxyId() {
		return proxyId;
	}

	    public PlaceInstitution(String placeName) {
	        this.placeName = placeName;
	    }
	    
		public PlaceInstitution(EntityProxyId<?> record) {
			this.proxyId = record;
			
		}


	    public PlaceInstitution(EntityProxyId<?> stableId, Operation operation) {
			this.operation = operation;
			this.proxyId = stableId;
		}

		public String getPlaceName() {
	        return placeName;
	    }
		public Operation getOperation() {
			return operation;
		}


	    public static class Tokenizer implements PlaceTokenizer<PlaceInstitution> {
	    	
private McAppRequestFactory requestFactory;

//			private final McAppFactory mcAppFactory;
//
//			public Tokenizer(McAppFactory mcAppFactory) {
//				this.mcAppFactory = mcAppFactory;
//			}
			
	        public Tokenizer(McAppRequestFactory requestFactory) {
	        	this.requestFactory = requestFactory;
			}

			@Override
	        public String getToken(PlaceInstitution place) {
	     
	        	

	            return place.getPlaceName();
	        }

	        @Override
	        public PlaceInstitution getPlace(String token) {
	        	Log.debug("Im PlaceInstitution.getPlace: Token -" + token);


				
	            return new PlaceInstitution(token);
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
