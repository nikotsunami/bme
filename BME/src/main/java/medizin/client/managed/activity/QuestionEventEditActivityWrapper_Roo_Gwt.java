// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import medizin.client.managed.activity.QuestionEventEditActivityWrapper.View;
import medizin.client.managed.request.ApplicationRequestFactory;
import medizin.client.managed.request.InstitutionProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.scaffold.activity.IsScaffoldMobileActivity;
import medizin.client.scaffold.place.ProxyEditView;
import medizin.client.scaffold.place.ProxyListPlace;
import medizin.client.scaffold.place.ProxyPlace;

public abstract class QuestionEventEditActivityWrapper_Roo_Gwt implements Activity, IsScaffoldMobileActivity {

    protected Activity wrapped;

    protected View<?> view;

    protected ApplicationRequestFactory requests;

    @Override
    public void start(AcceptsOneWidget display, EventBus eventBus) {
        view.setInstitutionPickerValues(Collections.<InstitutionProxy>emptyList());
        requests.institutionRequest().findInstitutionEntries(0, 50).with(medizin.client.managed.ui.InstitutionProxyRenderer.instance().getPaths()).fire(new Receiver<List<InstitutionProxy>>() {

            public void onSuccess(List<InstitutionProxy> response) {
                List<InstitutionProxy> values = new ArrayList<InstitutionProxy>();
                values.add(null);
                values.addAll(response);
                view.setInstitutionPickerValues(values);
            }
        });
        wrapped.start(display, eventBus);
    }

    public interface View_Roo_Gwt<V extends medizin.client.scaffold.place.ProxyEditView<medizin.client.managed.request.QuestionEventProxy, V>> extends ProxyEditView<QuestionEventProxy, V> {

        void setInstitutionPickerValues(Collection<InstitutionProxy> values);
    }
}