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
import medizin.client.managed.request.McProxy;
import medizin.client.scaffold.place.ProxyDetailsView;
import medizin.client.scaffold.place.ProxyListView;

public abstract class AssesmentDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<AssesmentProxy> {

    @UiField
    SpanElement name;

    @UiField
    SpanElement dateOfAssesment;

    @UiField
    SpanElement dateOpen;

    @UiField
    SpanElement dateClosed;

    @UiField
    SpanElement place;

    @UiField
    SpanElement logo;

    @UiField
    SpanElement isClosed;

    @UiField
    SpanElement assesmentVersion;

    @UiField
    SpanElement mc;

    @UiField
    SpanElement repeFor;

    @UiField
    SpanElement percentSameQuestion;

    @UiField
    SpanElement id;

    @UiField
    SpanElement version;

    AssesmentProxy proxy;

    @UiField
    SpanElement displayRenderer;

    public void setValue(AssesmentProxy proxy) {
        this.proxy = proxy;
        name.setInnerText(proxy.getName() == null ? "" : String.valueOf(proxy.getName()));
        dateOfAssesment.setInnerText(proxy.getDateOfAssesment() == null ? "" : DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT).format(proxy.getDateOfAssesment()));
        dateOpen.setInnerText(proxy.getDateOpen() == null ? "" : DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT).format(proxy.getDateOpen()));
        dateClosed.setInnerText(proxy.getDateClosed() == null ? "" : DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT).format(proxy.getDateClosed()));
        place.setInnerText(proxy.getPlace() == null ? "" : String.valueOf(proxy.getPlace()));
        logo.setInnerText(proxy.getLogo() == null ? "" : String.valueOf(proxy.getLogo()));
        isClosed.setInnerText(proxy.getIsClosed() == null ? "" : String.valueOf(proxy.getIsClosed()));
        assesmentVersion.setInnerText(proxy.getAssesmentVersion() == null ? "" : String.valueOf(proxy.getAssesmentVersion()));
        mc.setInnerText(proxy.getMc() == null ? "" : medizin.client.managed.ui.McProxyRenderer.instance().render(proxy.getMc()));
        repeFor.setInnerText(proxy.getRepeFor() == null ? "" : medizin.client.managed.ui.AssesmentProxyRenderer.instance().render(proxy.getRepeFor()));
        percentSameQuestion.setInnerText(proxy.getPercentSameQuestion() == null ? "" : String.valueOf(proxy.getPercentSameQuestion()));
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        displayRenderer.setInnerText(medizin.client.managed.ui.AssesmentProxyRenderer.instance().render(proxy));
    }
}
