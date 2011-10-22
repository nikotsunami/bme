// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.RequestContext;
import medizin.client.managed.request.ApplicationRequestFactory;
import medizin.client.managed.request.QuestionTypeProxy;
import medizin.client.managed.request.QuestionTypeRequest;
import medizin.client.managed.ui.QuestionTypeDetailsView;
import medizin.client.managed.ui.QuestionTypeEditView;
import medizin.client.managed.ui.QuestionTypeListView;
import medizin.client.managed.ui.QuestionTypeMobileDetailsView;
import medizin.client.managed.ui.QuestionTypeMobileEditView;
import medizin.client.scaffold.ScaffoldApp;
import medizin.client.scaffold.place.CreateAndEditProxy;
import medizin.client.scaffold.place.FindAndEditProxy;
import medizin.client.scaffold.place.ProxyPlace;

public class QuestionTypeActivitiesMapper {

    private final ApplicationRequestFactory requests;

    private final PlaceController placeController;

    public QuestionTypeActivitiesMapper(ApplicationRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }

    public Activity getActivity(ProxyPlace place) {
        switch(place.getOperation()) {
            case DETAILS:
                return new QuestionTypeDetailsActivity((EntityProxyId<QuestionTypeProxy>) place.getProxyId(), requests, placeController, ScaffoldApp.isMobile() ? QuestionTypeMobileDetailsView.instance() : QuestionTypeDetailsView.instance());
            case EDIT:
                return makeEditActivity(place);
            case CREATE:
                return makeCreateActivity();
        }
        throw new IllegalArgumentException("Unknown operation " + place.getOperation());
    }

    @SuppressWarnings("unchecked")
    private EntityProxyId<medizin.client.managed.request.QuestionTypeProxy> coerceId(ProxyPlace place) {
        return (EntityProxyId<QuestionTypeProxy>) place.getProxyId();
    }

    private Activity makeCreateActivity() {
        QuestionTypeEditView.instance().setCreating(true);
        final QuestionTypeRequest request = requests.questionTypeRequest();
        Activity activity = new CreateAndEditProxy<QuestionTypeProxy>(QuestionTypeProxy.class, request, ScaffoldApp.isMobile() ? QuestionTypeMobileEditView.instance() : QuestionTypeEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(QuestionTypeProxy proxy) {
                request.persist().using(proxy);
                return request;
            }
        };
        return new QuestionTypeEditActivityWrapper(requests, ScaffoldApp.isMobile() ? QuestionTypeMobileEditView.instance() : QuestionTypeEditView.instance(), activity, null);
    }

    private Activity makeEditActivity(ProxyPlace place) {
        QuestionTypeEditView.instance().setCreating(false);
        EntityProxyId<QuestionTypeProxy> proxyId = coerceId(place);
        Activity activity = new FindAndEditProxy<QuestionTypeProxy>(proxyId, requests, ScaffoldApp.isMobile() ? QuestionTypeMobileEditView.instance() : QuestionTypeEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(QuestionTypeProxy proxy) {
                QuestionTypeRequest request = requests.questionTypeRequest();
                request.persist().using(proxy);
                return request;
            }
        };
        return new QuestionTypeEditActivityWrapper(requests, ScaffoldApp.isMobile() ? QuestionTypeMobileEditView.instance() : QuestionTypeEditView.instance(), activity, proxyId);
    }
}