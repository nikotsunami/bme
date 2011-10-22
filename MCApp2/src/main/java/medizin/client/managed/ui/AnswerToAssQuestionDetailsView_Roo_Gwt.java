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
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.AnswerToAssQuestionProxy;
import medizin.client.managed.request.AssesmentQuestionProxy;
import medizin.client.scaffold.place.ProxyDetailsView;
import medizin.client.scaffold.place.ProxyListView;

public abstract class AnswerToAssQuestionDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<AnswerToAssQuestionProxy> {

    @UiField
    SpanElement sortOrder;

    @UiField
    SpanElement answers;

    @UiField
    SpanElement assesmentQuestion;

    @UiField
    SpanElement id;

    @UiField
    SpanElement version;

    AnswerToAssQuestionProxy proxy;

    @UiField
    SpanElement displayRenderer;

    public void setValue(AnswerToAssQuestionProxy proxy) {
        this.proxy = proxy;
        sortOrder.setInnerText(proxy.getSortOrder() == null ? "" : String.valueOf(proxy.getSortOrder()));
        answers.setInnerText(proxy.getAnswers() == null ? "" : medizin.client.managed.ui.AnswerProxyRenderer.instance().render(proxy.getAnswers()));
        assesmentQuestion.setInnerText(proxy.getAssesmentQuestion() == null ? "" : medizin.client.managed.ui.AssesmentQuestionProxyRenderer.instance().render(proxy.getAssesmentQuestion()));
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        displayRenderer.setInnerText(medizin.client.managed.ui.AnswerToAssQuestionProxyRenderer.instance().render(proxy));
    }
}