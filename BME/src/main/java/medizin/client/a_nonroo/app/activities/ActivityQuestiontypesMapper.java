package medizin.client.a_nonroo.app.activities;





import medizin.client.a_nonroo.app.place.PlaceQuestiontypesDetails;

import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
/**
 * Maps questiontypes details places with activities (Detailansicht Fragetypen)
 * @author masterthesis
 *
 */
public class ActivityQuestiontypesMapper implements ActivityMapper {

	private McAppRequestFactory requests;
	private PlaceController placeController;

	@Inject
	public ActivityQuestiontypesMapper(McAppRequestFactory requests,
			PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
	}

	@Override
	public Activity getActivity(Place place) {
		Log.debug("im ActivityQuestiontypeMapper.getActivity");
		 if (place instanceof PlaceQuestiontypesDetails){
			 PlaceQuestiontypesDetails myPlace = (PlaceQuestiontypesDetails) place;
			 if(myPlace.getOperation() == PlaceQuestiontypesDetails.Operation.DETAILS){
				 return new ActivityQuestiontypesDetails((PlaceQuestiontypesDetails) place, requests, placeController);
			 }
				
			 else if (myPlace.getOperation() == PlaceQuestiontypesDetails.Operation.CREATE){
				 return new ActivityQuestiontypesCreate((PlaceQuestiontypesDetails) place,  requests, placeController);
				 }
			 
			 else if (myPlace.getOperation() == PlaceQuestiontypesDetails.Operation.EDIT){
				 return new ActivityQuestiontypesCreate((PlaceQuestiontypesDetails) place,  requests, placeController, PlaceQuestiontypesDetails.Operation.EDIT);
				 }
		 

		 }
	            

		 Log.debug("im ActivityQuestiontypeMapper.getActivity, null returned");

		return null;
	}
	
	

}
