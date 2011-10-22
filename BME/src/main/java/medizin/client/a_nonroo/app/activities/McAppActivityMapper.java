package medizin.client.a_nonroo.app.activities;


import medizin.client.a_nonroo.app.place.PlaceAcceptAnswer;
import medizin.client.a_nonroo.app.place.PlaceAcceptAssQuestion;
import medizin.client.a_nonroo.app.place.PlaceAcceptPerson;
import medizin.client.a_nonroo.app.place.PlaceAcceptQuestion;
import medizin.client.a_nonroo.app.place.PlaceAsignAssQuestion;
import medizin.client.a_nonroo.app.place.PlaceAssesment;
import medizin.client.a_nonroo.app.place.PlaceBookAssesment;
import medizin.client.a_nonroo.app.place.PlaceInstitution;
import medizin.client.a_nonroo.app.place.PlaceInstitutionEvent;
import medizin.client.a_nonroo.app.place.PlaceOpenDemand;
import medizin.client.a_nonroo.app.place.PlaceQuestion;
import medizin.client.a_nonroo.app.place.PlaceQuestiontypes;
import medizin.client.a_nonroo.app.place.PlaceStaticContent;
import medizin.client.a_nonroo.app.place.PlaceSystemOverview;
import medizin.client.a_nonroo.app.place.PlaceUser;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.inject.Inject;
/**
 * ActivityMapper for all main places. 
 * @author masterthesis
 *
 */
public class McAppActivityMapper implements ActivityMapper {



	private McAppRequestFactory requests;
	private PlaceController placeController;


	@Inject
	public McAppActivityMapper(McAppRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }

	
	@Override
	public Activity getActivity(Place place) {
		Log.debug("im McAppActivityMapper.getActivity");
		 if (place instanceof PlaceSystemOverview)
	            return new ActivitySystemOverview((PlaceSystemOverview) place, requests, placeController);
		 if (place instanceof PlaceAcceptPerson)
	            return new ActivityAcceptPerson((PlaceAcceptPerson) place, requests, placeController);		 
		 if (place instanceof PlaceAcceptAnswer)
	            return new ActivityAcceptAnswer((PlaceAcceptAnswer) place, requests, placeController);		 
		 if (place instanceof PlaceAcceptAssQuestion)
	            return new ActivityAcceptAssQuestion((PlaceAcceptAssQuestion) place, requests, placeController);
		 
		 if (place instanceof PlaceAcceptQuestion)
	            return new ActivityAcceptQuestion((PlaceAcceptQuestion) place, requests, placeController);
		 
		 if (place instanceof PlaceAssesment)
	            return new ActivityAssesment((PlaceAssesment) place, requests, placeController);
		 
		 if (place instanceof PlaceAsignAssQuestion)
	            return new ActivityAsignAssQuestion((PlaceAsignAssQuestion) place, requests, placeController);
		 
		 if (place instanceof PlaceBookAssesment)
	            return new ActivityBookAssesment((PlaceBookAssesment) place, requests, placeController);
		 
		 if (place instanceof PlaceInstitution)
	            return new ActivityInstitution((PlaceInstitution) place, requests, placeController);
		 
		 if (place instanceof PlaceOpenDemand)
	            return new ActivityOpenDemand((PlaceOpenDemand) place, requests, placeController);
		 
		 if (place instanceof PlaceQuestion)
	            return new ActivityQuestion((PlaceQuestion) place, requests, placeController);
		 
		 if (place instanceof PlaceQuestiontypes)
	            return new ActivityQuestiontypes((PlaceQuestiontypes) place, requests, placeController);
		 
		 if (place instanceof PlaceStaticContent)
	            return new ActivityStaticContent((PlaceStaticContent) place, requests, placeController);
		 
		 if (place instanceof PlaceUser)
	            return new ActivityUser((PlaceUser) place, requests, placeController);
		 
		 
		 

		 Log.debug("im McAppActivityMapper.getActivity, return null");
		return null;
	}



}
