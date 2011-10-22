package medizin.client.a_nonroo.app.activities;

import medizin.client.a_nonroo.app.place.PlaceAcceptAnswer;
import medizin.client.a_nonroo.app.place.PlaceAcceptAssQuestion;
import medizin.client.a_nonroo.app.place.PlaceAcceptPerson;
import medizin.client.a_nonroo.app.place.PlaceAcceptQuestion;
import medizin.client.a_nonroo.app.place.PlaceAsignAssQuestion;
import medizin.client.a_nonroo.app.place.PlaceAssesment;
import medizin.client.a_nonroo.app.place.PlaceAssesmentDetails;
import medizin.client.a_nonroo.app.place.PlaceBookAssesmentDetails;
import medizin.client.a_nonroo.app.place.PlaceBookAssesment;
import medizin.client.a_nonroo.app.place.PlaceInstitution;
import medizin.client.a_nonroo.app.place.PlaceInstitutionEvent;
import medizin.client.a_nonroo.app.place.PlaceOpenDemand;
import medizin.client.a_nonroo.app.place.PlaceQuestion;
import medizin.client.a_nonroo.app.place.PlaceQuestionDetails;
import medizin.client.a_nonroo.app.place.PlaceQuestiontypes;
import medizin.client.a_nonroo.app.place.PlaceStaticContent;
import medizin.client.a_nonroo.app.place.PlaceSystemOverview;
import medizin.client.a_nonroo.app.place.PlaceUser;
import medizin.client.a_nonroo.app.place.PlaceUserDetails;
import medizin.client.a_nonroo.app.place.PlaceQuestiontypesDetails;
import medizin.client.scaffold.place.ProxyListPlace;
import medizin.client.scaffold.place.ProxyPlace;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.activity.shared.FilteredActivityMapper;
import com.google.gwt.place.shared.Place;

/**
 * Converts a {@link #ProxyPlace} to a {@link ProxyListPlace}.
 */
public class FilterForMainPlaces implements FilteredActivityMapper.Filter {

	/**
	 * Required by {@link FilteredActivityMapper.Filter}, calls
	 * {@link #proxyListPlaceFor()}.
	 */
	public Place filter(Place place) {
		
		Log.debug("im FilterForMainPlaces");
		 if (place instanceof PlaceSystemOverview)
	            return (PlaceSystemOverview) place;
		 if (place instanceof PlaceAcceptPerson)
	            return (PlaceAcceptPerson) place;		 
		 if (place instanceof PlaceAcceptAnswer)
	            return  (PlaceAcceptAnswer) place;		 
		 if (place instanceof PlaceAcceptAssQuestion)
	            return  (PlaceAcceptAssQuestion) place;
		 
		 if (place instanceof PlaceAcceptQuestion)
	            return  (PlaceAcceptQuestion) place;
		 
		 if (place instanceof PlaceAssesment)
	            return  (PlaceAssesment) place;
		 
		 if (place instanceof PlaceAsignAssQuestion)
	            return (PlaceAsignAssQuestion) place;
		 
		 if (place instanceof PlaceBookAssesment)
	            return  (PlaceBookAssesment) place;
		 
		 if (place instanceof PlaceInstitution)
	            return  (PlaceInstitution) place;
		 
		 if (place instanceof PlaceOpenDemand)
	            return  (PlaceOpenDemand) place;
		 
		 if (place instanceof PlaceQuestion)
	            return  (PlaceQuestion) place;
		 
		 if (place instanceof PlaceQuestiontypes)
	            return  (PlaceQuestiontypes) place;
		 
		 if (place instanceof PlaceStaticContent)
	            return  (PlaceStaticContent) place;
		 
		 if (place instanceof PlaceUser)
	            return  (PlaceUser) place;
		 
		 if (place instanceof PlaceQuestiontypes)
			 	return (PlaceQuestiontypes) place;
		 
		 if (place instanceof PlaceInstitutionEvent){
			 PlaceInstitutionEvent placeInstitutionEvent= (PlaceInstitutionEvent)place;
			 return  new PlaceInstitution(placeInstitutionEvent.getProxyId());
			 
		 }
		 
		 if (place instanceof PlaceBookAssesmentDetails){
			 PlaceBookAssesmentDetails placeBookAssementDetails= (PlaceBookAssesmentDetails)place;
			 return  new PlaceBookAssesment(placeBookAssementDetails.getProxyId());
			 
		 }
		 if (place instanceof PlaceUserDetails){
			 PlaceUserDetails placeUserDetails= (PlaceUserDetails)place;
			 if(placeUserDetails.getOperation()!=PlaceUserDetails.Operation.CREATE)
				 return  new PlaceUser(placeUserDetails.getProxyId());
			 else
				 return  new PlaceUser(placeUserDetails.getOperation().toString());
			 
		 }
		 if (place instanceof PlaceQuestiontypesDetails){
			 PlaceQuestiontypesDetails placeQuestiontypesDetails= (PlaceQuestiontypesDetails)place;
			 return new PlaceQuestiontypes(placeQuestiontypesDetails.getProxyId());
			
		 }
		 if (place instanceof PlaceAssesmentDetails){
			 PlaceAssesmentDetails placeAssesmentDetails= (PlaceAssesmentDetails)place;
			 return new PlaceAssesment(placeAssesmentDetails.getProxyId());
		 }
		 
		 if (place instanceof PlaceQuestionDetails){
			 PlaceQuestionDetails placeQuestionDetails= (PlaceQuestionDetails)place;
			 return new PlaceQuestion(placeQuestionDetails.getProxyId());
		 }
	           
		 
		 return null;
	}

	/**
	 * @param place a place to process
	 * @return an appropriate ProxyListPlace, or null if the given place has
	 *         nothing to do with proxies
	 */
	public ProxyListPlace proxyListPlaceFor(Place place) {
		
		
		
		
		
		
		if (place instanceof ProxyListPlace) {
			return (ProxyListPlace) place;
		}

		if (!(place instanceof ProxyPlace)) {
			return null;
		}

		ProxyPlace proxyPlace = (ProxyPlace) place;
		return new ProxyListPlace(proxyPlace.getProxyClass());
	}
}
