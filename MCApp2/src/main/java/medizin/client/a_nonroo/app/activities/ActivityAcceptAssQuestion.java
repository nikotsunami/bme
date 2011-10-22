package medizin.client.a_nonroo.app.activities;

import medizin.client.a_nonroo.app.client.SlidingPanel;
import medizin.client.a_nonroo.app.client.ui.AcceptAssQuestionView;
import medizin.client.a_nonroo.app.client.ui.AcceptAssQuestionViewImpl;

import medizin.client.a_nonroo.app.place.PlaceAcceptAssQuestion;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;

public class ActivityAcceptAssQuestion extends AbstractActivityWrapper implements AcceptAssQuestionView.Presenter {

	private PlaceAcceptAssQuestion assQuestionPlace;

	private AcceptsOneWidget widget;
	private AcceptAssQuestionView view;


	private McAppRequestFactory requests;
	private PlaceController placeController;


	@Inject
	public ActivityAcceptAssQuestion(PlaceAcceptAssQuestion place,
			McAppRequestFactory requests, PlaceController placeController) {
		super(place, requests, placeController);
		this.assQuestionPlace = place;
        this.requests = requests;
        this.placeController = placeController;
	}

	@Override
	public String mayStop() {
		
		return null;
	}

	@Override
	public void onCancel() {
		onStop();

	}

	@Override
	public void onStop() {
//		((SlidingPanel)widget).remove(view.asWidget());


	}
	
	@Override
	public void start(AcceptsOneWidget widget, EventBus eventBus) {
		super.start(widget, eventBus);

	}

	@Override
	public void start2(AcceptsOneWidget widget, EventBus eventBus) {
		AcceptAssQuestionView acceptAssQuestionView = new AcceptAssQuestionViewImpl();
		acceptAssQuestionView.setName("hallo");
		acceptAssQuestionView.setPresenter(this);
		this.widget = widget;
		this.view = acceptAssQuestionView;
        widget.setWidget(acceptAssQuestionView.asWidget());

	}

	@Override
	public void goTo(Place place) {
		  placeController.goTo(place);
	}

}
