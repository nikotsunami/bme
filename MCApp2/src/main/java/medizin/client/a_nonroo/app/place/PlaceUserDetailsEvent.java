package medizin.client.a_nonroo.app.place;


import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.RequestFactory;

public class PlaceUserDetailsEvent extends Place {

	public enum Operation {
		SHOW, ADD
	}
	private static final String SEPARATOR = "!";
	private String placeName;

	private EntityProxyId<?> proxyId;
	private Operation operation = null;
	
	
	public EntityProxyId<?> getProxyId() {
		return proxyId;
	}
	public void setProxyId(EntityProxyId<?> id) {
		this.proxyId = id;
	}
	    public PlaceUserDetailsEvent(String placeName) {
	        this.placeName = placeName;
	    }
	    
		public PlaceUserDetailsEvent(EntityProxyId<?> record) {
			this(record, Operation.SHOW);
			
		}

		public PlaceUserDetailsEvent(Operation operation) {
	    	Log.debug("PlaceUserDetails wird erstellt");
			this.operation = operation;

		}

	    public PlaceUserDetailsEvent(EntityProxyId<?> stableId, Operation operation) {
	    	Log.debug("PlaceUserDetails wird erstellt");
			this.operation = operation;
			proxyId = stableId;
		}

		public String getPlaceName() {
	        return placeName;
	    }
		public Operation getOperation() {
			Log.debug("PlaceUserDetails.getOperation: " + operation);
			return operation;
		}


	    public static class Tokenizer implements PlaceTokenizer<PlaceUserDetailsEvent> {
	    	

	        private McAppRequestFactory requestFactory;

			public Tokenizer(McAppRequestFactory requestFactory) {
	        	this.requestFactory = requestFactory;
			}

			@Override
	        public String getToken(PlaceUserDetailsEvent place) {
	        	Log.debug("Im PlaceInstitution.getToken: Placename -" + place.getProxyId());
	        	
//	        	if (requests==null)
//	        	Log.warn("requests null");
	        	
				if (Operation.ADD == place.getOperation()) {
					return place.getProxyId() + SEPARATOR + PlaceUserDetailsEvent.Operation.ADD;
				}
				else if (Operation.SHOW == place.getOperation()) {
					return place.getProxyId() + SEPARATOR + PlaceUserDetailsEvent.Operation.SHOW;
				}


	        	
	            return place.getPlaceName();
	        }

	        @Override
	        public PlaceUserDetailsEvent getPlace(String token) {
	        	Log.debug("Im PlaceInstitutionEvent.getPlace: Token -" + token);
	        	
				String bits[] = token.split(SEPARATOR);
				Operation operation = Operation.valueOf(bits[1]);
				if (Operation.ADD == operation) {
					return new PlaceUserDetailsEvent(requestFactory.getProxyId(bits[0]), Operation.ADD);
				}
				if (Operation.SHOW == operation) {
					return new PlaceUserDetailsEvent(requestFactory.getProxyId(bits[0]), Operation.SHOW);
				}


				
	            return new PlaceUserDetailsEvent(token);
	            
	            
	        }
	    }
	    
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj) {
//				return true;
//			}
//			if (obj == null) {
//				return false;
//			}
//			if (getClass() != obj.getClass()) {
//				return false;
//			}
//			//wenn ProxyId nicht gesetzt war es eine Löschaktion
//			if (this.proxyId==null){
//				return false;
//			}
//			PlaceUserDetails other = (PlaceUserDetails) obj;
//			//wenn O
//			if (this.getOperation()!=other.getOperation()){
//				return false;
//			}
////			ProxyListPlace other = (ProxyListPlace) obj;
////			if (!proxyType.equals(other.proxyType)) {
////				return false;
////			}
//			return true;
//		}

}
