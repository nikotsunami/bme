// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import medizin.client.managed.request.StaticContentProxy;
import medizin.client.scaffold.place.ProxyDetailsView;
import medizin.client.scaffold.place.ProxyListView;

public abstract class StaticContentDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<StaticContentProxy> {

    @UiField
    SpanElement staticText;

    @UiField
    SpanElement id;

    @UiField
    SpanElement version;

    StaticContentProxy proxy;

    @UiField
    SpanElement displayRenderer;

    public void setValue(StaticContentProxy proxy) {
        this.proxy = proxy;
        staticText.setInnerText(proxy.getStaticText() == null ? "" : String.valueOf(proxy.getStaticText()));
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        displayRenderer.setInnerText(medizin.client.managed.ui.StaticContentProxyRenderer.instance().render(proxy));
    }
}
