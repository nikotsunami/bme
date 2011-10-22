package medizin.client.a_nonroo.app.place;


import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.WithTokenizers;
import com.google.inject.Inject;

public class McPlaceHistoryFactory {
	
private final PlaceSystemOverview.Tokenizer placeSystemOverviewTokenizer ; 

private final PlaceAcceptPerson.Tokenizer placeAcceptPersonTokenizer ;
private final PlaceAcceptAnswer.Tokenizer placeAcceptAnswerTokenizer ;
private final PlaceAcceptAssQuestion.Tokenizer placeAcceptAssQuestionTokenizer ;
private final PlaceAcceptQuestion.Tokenizer placeAcceptQuestionTokenizer ;
private final PlaceAsignAssQuestion.Tokenizer placeAsignAssQuestionTokenizer ;
private final PlaceAssesment.Tokenizer placeAssesmentTokenizer ;
private final PlaceBookAssesment.Tokenizer placeBookAssesmentTokenizer;
private final PlaceOpenDemand.Tokenizer placeOpenDemandTokenizer;
private final PlaceQuestion.Tokenizer placeQuestionTokenizer;
private final PlaceQuestionDetails.Tokenizer placeQuestionDetailsTokenizer;
private final PlaceQuestiontypes.Tokenizer placeQuestiontypesTokenizer;
private final PlaceQuestiontypesDetails.Tokenizer placeQuestiontypesDetailsTokenizer;
private final PlaceStaticContent.Tokenizer placeStaticContentTokenizer;
private final PlaceUser.Tokenizer placeUserTokenizer;
private final PlaceUserDetails.Tokenizer placeUserDetailsTokenizer;
private final PlaceInstitution.Tokenizer placeInstitutionTokenizer;
private final PlaceQuestionEdit.Tokenizer placeQuestionEditTokenizer;
private final PlaceInstitutionEvent.Tokenizer placeInstitutionEventTokenizer ;
private final PlaceBookAssesmentDetails.Tokenizer placeBookAssesmentDetailsTokenizer ;
private final PlaceUserDetailsEvent.Tokenizer placeUserDetailsEventTokenizer ;
private final PlaceAssesmentDetails.Tokenizer placeAssesmentDetails ;




public PlaceUserDetailsEvent.Tokenizer getPlaceUserDetailsEventTokenizer() {
	return placeUserDetailsEventTokenizer;
}


public PlaceSystemOverview.Tokenizer getPlaceSystemOverviewTokenizer() {
	Log.debug("McPlaceHistoryFactory.getPlaceSystemOverviewTokenizer");
	return placeSystemOverviewTokenizer;
}


public PlaceAcceptPerson.Tokenizer getPlaceAcceptPersonTokenizer() {
	return placeAcceptPersonTokenizer;
}


public PlaceAcceptAnswer.Tokenizer getPlaceAcceptAnswerTokenizer() {
	return placeAcceptAnswerTokenizer;
}


public PlaceAcceptAssQuestion.Tokenizer getPlaceAcceptAssQuestionTokenizer() {
	return placeAcceptAssQuestionTokenizer;
}


public PlaceAcceptQuestion.Tokenizer getPlaceAcceptQuestionTokenizer() {
	return placeAcceptQuestionTokenizer;
}


public PlaceAsignAssQuestion.Tokenizer getPlaceAsignAssQuestionTokenizer() {
	return placeAsignAssQuestionTokenizer;
}


public PlaceAssesment.Tokenizer getPlaceAssesmentTokenizer() {
	return placeAssesmentTokenizer;
}


public PlaceBookAssesment.Tokenizer getPlaceBookAssesmentTokenizer() {
	return placeBookAssesmentTokenizer;
}


public PlaceOpenDemand.Tokenizer getPlaceOpenDemandTokenizer() {
	return placeOpenDemandTokenizer;
}


public PlaceQuestion.Tokenizer getPlaceQuestionTokenizer() {
	return placeQuestionTokenizer;
}

public PlaceQuestionDetails.Tokenizer getPlaceQuestionDetailsTokenizer() {
	return placeQuestionDetailsTokenizer;
}


public PlaceQuestiontypes.Tokenizer getPlaceQuestiontypesTokenizer() {
	return placeQuestiontypesTokenizer;
}


public PlaceQuestiontypesDetails.Tokenizer getPlaceQuestiontypesDetailsTokenizer() {
	return placeQuestiontypesDetailsTokenizer;
}


public PlaceStaticContent.Tokenizer getPlaceStaticContentTokenizer() {
	return placeStaticContentTokenizer;
}


public PlaceUser.Tokenizer getPlaceUserTokenizer() {
	return placeUserTokenizer;
}


public PlaceUserDetails.Tokenizer getPlaceUserDetailsTokenizer() {
	return placeUserDetailsTokenizer;
}


public PlaceInstitution.Tokenizer getPlaceInstitutionTokenizer() {
	return placeInstitutionTokenizer;
}


public PlaceQuestionEdit.Tokenizer getPlaceQuestionEditTokenizer() {
	return placeQuestionEditTokenizer;
}


public PlaceInstitutionEvent.Tokenizer getPlaceInstitutionEventTokenizer() {
	return placeInstitutionEventTokenizer;
}


public PlaceBookAssesmentDetails.Tokenizer getPlaceBookAssesmentDetailsTokenizer() {
	return placeBookAssesmentDetailsTokenizer;
}
public  PlaceAssesmentDetails.Tokenizer getPlaceAssesmentDetailsTokenizer() {
	return placeAssesmentDetails;
}




//	private final NationalityPlace.Tokenizer nationalityPlaceTokenizer;
//	private final NationalityDetailsPlace.Tokenizer nationalityDetailsPlaceTokenizer;

	@Inject
	public McPlaceHistoryFactory(McAppRequestFactory requestFactory) {
		Log.debug("McPlaceHistoryFactory.Konstruktor");
		this.placeSystemOverviewTokenizer= new PlaceSystemOverview.Tokenizer(requestFactory) ; 
		this. placeAcceptPersonTokenizer= new PlaceAcceptPerson.Tokenizer(requestFactory) ; 
		this. placeAcceptAnswerTokenizer= new PlaceAcceptAnswer.Tokenizer(requestFactory) ; 
		this. placeAcceptAssQuestionTokenizer= new PlaceAcceptAssQuestion.Tokenizer(requestFactory) ; 
		this. placeAcceptQuestionTokenizer= new PlaceAcceptQuestion.Tokenizer(requestFactory) ; 
		this. placeAsignAssQuestionTokenizer= new PlaceAsignAssQuestion.Tokenizer(requestFactory) ; 
		this. placeAssesmentTokenizer= new PlaceAssesment.Tokenizer(requestFactory) ; 
		this. placeBookAssesmentTokenizer= new PlaceBookAssesment.Tokenizer(requestFactory) ; 
		this. placeOpenDemandTokenizer= new PlaceOpenDemand.Tokenizer(requestFactory) ; 
		this. placeQuestionTokenizer= new PlaceQuestion.Tokenizer(requestFactory) ; 
		this. placeQuestionDetailsTokenizer= new PlaceQuestionDetails.Tokenizer(requestFactory) ; 
		this.placeQuestiontypesTokenizer= new PlaceQuestiontypes.Tokenizer (requestFactory) ; 
		this.placeQuestiontypesDetailsTokenizer= new PlaceQuestiontypesDetails.Tokenizer (requestFactory) ; 
		this.placeStaticContentTokenizer= new PlaceStaticContent.Tokenizer (requestFactory) ; 
		this. placeUserTokenizer= new PlaceUser.Tokenizer(requestFactory) ; 
		this. placeUserDetailsTokenizer= new PlaceUserDetails.Tokenizer(requestFactory) ; 
		this. placeInstitutionTokenizer= new PlaceInstitution.Tokenizer(requestFactory) ; 
		this. placeQuestionEditTokenizer= new PlaceQuestionEdit.Tokenizer(requestFactory) ; 
		this. placeInstitutionEventTokenizer= new PlaceInstitutionEvent.Tokenizer(requestFactory) ; 
		this. placeBookAssesmentDetailsTokenizer= new PlaceBookAssesmentDetails.Tokenizer(requestFactory) ; 
		this.placeUserDetailsEventTokenizer = new PlaceUserDetailsEvent.Tokenizer(requestFactory) ;
//		this.nationalityPlaceTokenizer = new NationalityPlace.Tokenizer(requestFactory);
//		this.nationalityDetailsPlaceTokenizer = new NationalityDetailsPlace.Tokenizer(requestFactory);
		this.placeAssesmentDetails = new PlaceAssesmentDetails.Tokenizer(requestFactory);
	}

//	public PlaceTokenizer<NationalityPlace> getNationalityPlaceTokenizer() {
//		return nationalityPlaceTokenizer;
//	}
//	
//	public PlaceTokenizer<NationalityDetailsPlace> getNationalityDetailsPlaceTokenizer() {
//		return nationalityDetailsPlaceTokenizer;
//	}

//	public PlaceTokenizer<ProxyPlace> getProxyPlaceTokenizer() {
//		return proxyPlaceTokenizer;
//	}


}
