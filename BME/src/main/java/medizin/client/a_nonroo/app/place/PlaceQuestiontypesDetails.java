package medizin.client.a_nonroo.app.place;



import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.RequestFactory;

public class PlaceQuestiontypesDetails extends Place {


	public enum Operation {
		DETAILS, CREATE, EDIT
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
	    public PlaceQuestiontypesDetails(String placeName) {
	        this.placeName = placeName;
	    }
	    
		public PlaceQuestiontypesDetails(EntityProxyId<?> record) {
			this(record, Operation.DETAILS);
			
		}

		public PlaceQuestiontypesDetails(Operation operation) {
	    	Log.debug("PlaceQuestiontypesDetails wird erstellt");
			this.operation = operation;

		}

	    public PlaceQuestiontypesDetails(EntityProxyId<?> stableId, Operation operation) {
	    	Log.debug("PlaceQuestiontypesDetails wird erstellt");
			this.operation = operation;
			proxyId = stableId;

		}

		public String getPlaceName() {
	        return placeName;
	    }
		public Operation getOperation() {
			Log.debug("PlaceQuestiontypesDetails.getOperation: " + operation);
			return operation;
		}


	    public static class Tokenizer implements PlaceTokenizer<PlaceQuestiontypesDetails> {
	    	

	        private McAppRequestFactory requestFactory;

			public Tokenizer(McAppRequestFactory requestFactory) {
	        	this.requestFactory = requestFactory;
			}

			@Override
	        public String getToken(PlaceQuestiontypesDetails place) {
	        	Log.debug("Im PlaceQuestiontypesDetails.getToken: Placename -" + place.getProxyId());
	        	
//	        	if (requests==null)
//	        	Log.warn("requests null");
	        	
				if (Operation.DETAILS == place.getOperation()) {
					return place.getProxyId() + SEPARATOR + PlaceQuestiontypesDetails.Operation.DETAILS;
				}
				else if (Operation.CREATE == place.getOperation()) {
					return /*place.getProxyId() + SEPARATOR + */PlaceQuestiontypesDetails.Operation.CREATE.toString();
				}
				else if (Operation.EDIT == place.getOperation()) {
					return place.getProxyId() + SEPARATOR + PlaceQuestiontypesDetails.Operation.EDIT;
				}

	        	
	            return place.getPlaceName();
	        }

	        @Override
	        public PlaceQuestiontypesDetails getPlace(String token) {
	        	Log.debug("Im PlaceQuestiontypesDetails.getPlace: Token -" + token);
	        	
				String bits[] = token.split(SEPARATOR);
				Operation operation = Operation.valueOf(bits[1]);
				if (Operation.DETAILS == operation) {
					return new PlaceQuestiontypesDetails(requestFactory.getProxyId(bits[0]), Operation.DETAILS);
				}
				if (Operation.EDIT == operation) {
					return new PlaceQuestiontypesDetails(requestFactory.getProxyId(bits[0]), Operation.EDIT);
				}
				if (Operation.CREATE == operation) {
					return new PlaceQuestiontypesDetails(/*requestFactory.getProxyId(bits[0]), */Operation.CREATE);
				}

				
	            return new PlaceQuestiontypesDetails(token);
	            
	            
	        }
	    }
	    

}
