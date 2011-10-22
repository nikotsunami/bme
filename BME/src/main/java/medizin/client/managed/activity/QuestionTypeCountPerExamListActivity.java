// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.activity;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.view.client.Range;
import java.util.List;
import java.util.Set;
import medizin.client.managed.request.ApplicationRequestFactory;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.QuestionTypeCountPerExamProxy;
import medizin.client.managed.request.QuestionTypeProxy;
import medizin.client.managed.ui.QuestionTypeSetEditor;
import medizin.client.scaffold.ScaffoldMobileApp;
import medizin.client.scaffold.activity.IsScaffoldMobileActivity;
import medizin.client.scaffold.place.AbstractProxyListActivity;
import medizin.client.scaffold.place.ProxyListView;

public class QuestionTypeCountPerExamListActivity extends AbstractProxyListActivity<QuestionTypeCountPerExamProxy> implements IsScaffoldMobileActivity {

    private final ApplicationRequestFactory requests;

    public QuestionTypeCountPerExamListActivity(ApplicationRequestFactory requests, ProxyListView<medizin.client.managed.request.QuestionTypeCountPerExamProxy> view, PlaceController placeController) {
        super(placeController, view, QuestionTypeCountPerExamProxy.class);
        this.requests = requests;
    }

    public Place getBackButtonPlace() {
        return ScaffoldMobileApp.ROOT_PLACE;
    }

    public String getBackButtonText() {
        return "Entities";
    }

    public Place getEditButtonPlace() {
        return null;
    }

    public String getTitleText() {
        return "QuestionTypeCountPerExams";
    }

    public boolean hasEditButton() {
        return false;
    }

    protected Request<java.util.List<medizin.client.managed.request.QuestionTypeCountPerExamProxy>> createRangeRequest(Range range) {
        return requests.questionTypeCountPerExamRequest().findQuestionTypeCountPerExamEntries(range.getStart(), range.getLength());
    }

    protected void fireCountRequest(Receiver<Long> callback) {
        requests.questionTypeCountPerExamRequest().countQuestionTypeCountPerExams().fire(callback);
    }
}