// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.EntityProxy;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import java.util.Set;
import medizin.client.managed.request.ApplicationRequestFactory;
import medizin.client.managed.request.McProxy;
import medizin.client.scaffold.activity.IsScaffoldMobileActivity;
import medizin.client.scaffold.place.ProxyDetailsView;
import medizin.client.scaffold.place.ProxyDetailsView.Delegate;
import medizin.client.scaffold.place.ProxyListPlace;
import medizin.client.scaffold.place.ProxyPlace;
import medizin.client.scaffold.place.ProxyPlace.Operation;

public abstract class McDetailsActivity_Roo_Gwt extends AbstractActivity implements Delegate, IsScaffoldMobileActivity {

    protected ApplicationRequestFactory requests;

    protected EntityProxyId<McProxy> proxyId;

    protected void find(Receiver<EntityProxy> callback) {
        requests.find(proxyId).with().fire(callback);
    }
}