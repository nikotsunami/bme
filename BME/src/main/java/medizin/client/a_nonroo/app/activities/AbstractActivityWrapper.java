package medizin.client.a_nonroo.app.activities;

import java.util.Iterator;

import java.util.Set;

import medizin.client.a_nonroo.app.client.ErrorPanel;
import medizin.client.a_nonroo.app.client.McAppConstant;
import medizin.client.a_nonroo.app.client.ui.question.AnswerListViewImpl;
import medizin.client.a_nonroo.app.client.ui.question.QuestionDetailsView;
import medizin.client.a_nonroo.app.place.PlaceQuestionDetails;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.InstitutionProxy;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionProxy;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.dom.client.Document;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.ServerFailure;
import com.google.gwt.requestfactory.shared.Violation;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
/**
 * This wrapper is used to provide access control in all activities.
 * @author masterthesis
 *
 */

abstract public class AbstractActivityWrapper extends AbstractActivity {

	private McAppRequestFactory requests;
	private PlaceController placeController;
	private Place place;
	
	
	
	public AbstractActivityWrapper(Place place,
			McAppRequestFactory requests, PlaceController placeController) {
		this.place = place;
        this.requests = requests;
        this.placeController = placeController;
	}
	
	protected PersonProxy userLoggedIn;

	protected InstitutionProxy institutionActive;
	
	private int count = 0;
	@Override
	public void start(final AcceptsOneWidget panel, final EventBus eventBus) {

		

			requests.personRequestNonRoo().myGetLoggedPerson()
			.fire(new Receiver<PersonProxy>() {

				@Override
				public void onSuccess(PersonProxy response) {
					userLoggedIn = response;
					newStart(panel, eventBus);

				}

				public void onFailure(ServerFailure error) {
					ErrorPanel erorPanel = new ErrorPanel();
					erorPanel.setErrorMessage(error.getMessage());
					Log.error(error.getMessage());
					//onStop();
				}

				@Override
				public void onViolation(Set<Violation> errors) {
					Iterator<Violation> iter = errors.iterator();
					String message = "";
					while (iter.hasNext()) {
						message += iter.next().getMessage() + "<br>";
					}
					Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION
							+ " in Antwort löschen -" + message);

					ErrorPanel erorPanel = new ErrorPanel();
					erorPanel.setErrorMessage(message);
					//onStop();

				}

			});
			requests.institutionRequestNonRoo().myGetInstitutionToWorkWith()
			.fire(new Receiver<InstitutionProxy>() {

				@Override
				public void onSuccess(InstitutionProxy response) {
					institutionActive = response;
					newStart(panel, eventBus);
				}

				public void onFailure(ServerFailure error) {
					ErrorPanel erorPanel = new ErrorPanel();
					erorPanel.setErrorMessage(error.getMessage());
					Log.error(error.getMessage());
					//onStop();
				}

				@Override
				public void onViolation(Set<Violation> errors) {
					Iterator<Violation> iter = errors.iterator();
					String message = "";
					while (iter.hasNext()) {
						message += iter.next().getMessage() + "<br>";
					}
					Log.warn(McAppConstant.ERROR_WHILE_DELETE_VIOLATION
							+ " in Antwort löschen -" + message);

					ErrorPanel erorPanel = new ErrorPanel();
					erorPanel.setErrorMessage(message);
					//onStop();
					

				}

			});


	}
	/**
	 * Checks if user is logged, if not login dialog is shown.
	 * @param panel
	 * @param eventBus
	 */
	public void newStart(AcceptsOneWidget panel, EventBus eventBus){
		count ++;
		
		if(count<2){
			return;
		}
		
		

		if (userLoggedIn==null) {
			Window.alert("Please log in");
			return;
		}
		else {
			Document.get().getElementById("userLoggedIn").setInnerHTML("Eingeloggt als: " + userLoggedIn.getName() + " " + userLoggedIn.getPrename());
		}
		if (institutionActive==null) {
			Window.alert("Please select a institution");
			return;
		}
		else {
			Document.get().getElementById("institutionActive").setInnerHTML("Institution: " + institutionActive.getInstitutionName());
		}
		
		start2(panel, eventBus);
		
		
	}
	
	public abstract void start2(AcceptsOneWidget panel, EventBus eventBus);

}
