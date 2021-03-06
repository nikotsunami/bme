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
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.StaticContentProxy;
import medizin.client.managed.request.StaticToAssesmentProxy;
import medizin.client.scaffold.place.ProxyDetailsView;
import medizin.client.scaffold.place.ProxyListView;

public abstract class StaticToAssesmentDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<StaticToAssesmentProxy> {

    @UiField
    SpanElement id;

    @UiField
    SpanElement version;

    @UiField
    SpanElement sortOrder;

    @UiField
    SpanElement staticContent;

    @UiField
    SpanElement assesment;

    StaticToAssesmentProxy proxy;

    @UiField
    SpanElement displayRenderer;

    public void setValue(StaticToAssesmentProxy proxy) {
        this.proxy = proxy;
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        sortOrder.setInnerText(proxy.getSortOrder() == null ? "" : String.valueOf(proxy.getSortOrder()));
        staticContent.setInnerText(proxy.getStaticContent() == null ? "" : medizin.client.managed.ui.StaticContentProxyRenderer.instance().render(proxy.getStaticContent()));
        assesment.setInnerText(proxy.getAssesment() == null ? "" : medizin.client.managed.ui.AssesmentProxyRenderer.instance().render(proxy.getAssesment()));
        displayRenderer.setInnerText(medizin.client.managed.ui.StaticToAssesmentProxyRenderer.instance().render(proxy));
    }
}
