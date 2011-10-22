package medizin.client.a_nonroo.app.place;


import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.RequestFactory;

public class PlaceInstitutionEvent extends Place {

	public enum Operation {
		DETAILS
	}
	private static final String SEPARATOR = "!";
	private String placeName;

	private EntityProxyId<?> proxyId;
	private Operation operation = null;
	
	
	public EntityProxyId<?> getProxyId() {
		return proxyId;
	}

	    public PlaceInstitutionEvent(String placeName) {
	        this.placeName = placeName;
	    }
	    
		public PlaceInstitutionEvent(EntityProxyId<?> record) {
			this(record, Operation.DETAILS);
			
		}


	    public PlaceInstitutionEvent(EntityProxyId<?> stableId, Operation operation) {
	    	Log.debug("PlaceInstitutionEvent wird erstellt");
			this.operation = operation;
			proxyId = stableId;
		}

		public String getPlaceName() {
	        return placeName;
	    }
		public Operation getOperation() {
			return operation;
		}


	    public static class Tokenizer implements PlaceTokenizer<PlaceInstitutionEvent> {
	    	
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
	        public String getToken(PlaceInstitutionEvent place) {
	        	Log.debug("Im PlaceInstitution.getToken: Placename -" + place.getProxyId());
	        	
//	        	if (requests==null)
//	        	Log.warn("requests null");
	        	
				if (Operation.DETAILS == place.getOperation()) {
					return place.getProxyId() + SEPARATOR + PlaceInstitutionEvent.Operation.DETAILS;
				}

	        	
	            return place.getPlaceName();
	        }

	        @Override
	        public PlaceInstitutionEvent getPlace(String token) {
	        	Log.debug("Im PlaceInstitutionEvent.getPlace: Token -" + token);
	        	
				String bits[] = token.split(SEPARATOR);
				Operation operation = Operation.valueOf(bits[1]);
				if (Operation.DETAILS == operation) {
					return new PlaceInstitutionEvent(token);
				}

				
	            return new PlaceInstitutionEvent(token);
	            
	            
	        }
	    }

}
