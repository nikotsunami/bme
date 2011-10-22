package medizin.client.a_nonroo.app.activities;


import medizin.client.a_nonroo.app.place.PlaceQuestionDetails;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
/**
 * Maps question detail places with activities (Detailansicht Fragen).
 * @author masterthesis
 *
 */
public class ActivityQuestionMapper implements ActivityMapper {

	private McAppRequestFactory requests;
	private PlaceController placeController;

	@Inject
	public ActivityQuestionMapper(McAppRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
	}

	@Override
	public Activity getActivity(Place place) {
		Log.debug("im ActivityQuestionMapper.getActivity");
		 if (place instanceof PlaceQuestionDetails){
			 PlaceQuestionDetails myPlace = (PlaceQuestionDetails) place;
			 if(myPlace.getOperation() == PlaceQuestionDetails.Operation.DETAILS){
				 return new ActivityQuestionDetails((PlaceQuestionDetails) place, requests, placeController);
			 }
				
			 else if (myPlace.getOperation() == PlaceQuestionDetails.Operation.CREATE){
				 return new ActivityQuestionEdit((PlaceQuestionDetails) place,  requests, placeController);
				 }
			 
			 else if (myPlace.getOperation() == PlaceQuestionDetails.Operation.EDIT){
				 return new ActivityQuestionEdit((PlaceQuestionDetails) place,  requests, placeController, PlaceQuestionDetails.Operation.EDIT);
				 }
		 }
		 return null;
	            


		
	}
	

}
