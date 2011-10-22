package medizin.client.a_nonroo.app.place;

import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.requestfactory.shared.EntityProxyId;

public class PlaceUser extends Place {

	 private String placeName;
	private EntityProxyId<?> proxyId;

	    public PlaceUser(String placeName) {
	        this.placeName = placeName;
	    }

	    public PlaceUser(EntityProxyId<?> proxyId) {
			this.proxyId=proxyId;
		}

	    public EntityProxyId<?> getProxyId(){
	    	return proxyId;
	    }
	    
	    
		public String getPlaceName() {
	        return placeName;
	    }

	    public static class Tokenizer implements PlaceTokenizer<PlaceUser> {
	        private McAppRequestFactory requestFactory;

			public Tokenizer(McAppRequestFactory requestFactory) {
	        	this.requestFactory = requestFactory;
			}

			@Override
	        public String getToken(PlaceUser place) {
	            return place.getPlaceName();
	        }

	        @Override
	        public PlaceUser getPlace(String token) {
	        	
	            return new PlaceUser(token);
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
			//bei Löschaktion neu laden
			if(this.getPlaceName()!=null){
				if(this.getPlaceName().contains("PlaceUser!DELETED")||this.getPlaceName().contains("PlaceUser!CANCEL")){
					return false;
				}
			}
		
//			//wenn ProxyId nicht gesetzt war es eine Löschaktion
//			if (this.proxyId==null){
//				return false;
//			}

//			ProxyListPlace other = (ProxyListPlace) obj;
//			if (!proxyType.equals(other.proxyType)) {
//				return false;
//			}
			return true;
		}

}
