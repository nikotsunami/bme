// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.ui;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.text.client.DateTimeFormatRenderer;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.AbstractSafeHtmlRenderer;
import com.google.gwt.text.shared.Renderer;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import medizin.client.managed.request.AnswerToAssQuestionProxy;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.AssesmentQuestionProxy;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.scaffold.ScaffoldMobileApp;
import medizin.client.scaffold.ui.MobileProxyListView;

public class AssesmentQuestionMobileListView extends AssesmentQuestionMobileListView_Roo_Gwt {

    private static medizin.client.managed.ui.AssesmentQuestionMobileListView instance;

    public AssesmentQuestionMobileListView() {
        super("New AssesmentQuestion", new CellRenderer());
        init();
    }

    public static medizin.client.managed.ui.AssesmentQuestionMobileListView instance() {
        if (instance == null) {
            instance = new AssesmentQuestionMobileListView();
        }
        return instance;
    }

    public String[] getPaths() {
        return paths.toArray(new String[paths.size()]);
    }

    private static class CellRenderer extends AbstractSafeHtmlRenderer<AssesmentQuestionProxy> {

        private final String dateStyle = ScaffoldMobileApp.getMobileListResources().cellListStyle().dateProp();

        private final String secondaryStyle = ScaffoldMobileApp.getMobileListResources().cellListStyle().secondaryProp();

        private final Renderer<Long> primaryRenderer = new AbstractRenderer<Long>() {

            public String render(java.lang.Long obj) {
                return obj == null ? "" : String.valueOf(obj);
            }
        };

        private final Renderer<Integer> secondaryRenderer = new AbstractRenderer<Integer>() {

            public String render(java.lang.Integer obj) {
                return obj == null ? "" : String.valueOf(obj);
            }
        };

        private final Renderer<Date> dateRenderer = new DateTimeFormatRenderer(DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT));

        @Override
        public SafeHtml render(AssesmentQuestionProxy value) {
            if (value == null) {
                return SafeHtmlUtils.EMPTY_SAFE_HTML;
            }
            SafeHtmlBuilder sb = new SafeHtmlBuilder();
            if (value.getId() != null) {
                sb.appendEscaped(primaryRenderer.render(value.getId()));
            }
            sb.appendHtmlConstant("<div style=\"position:relative;\">");
            sb.appendHtmlConstant("<div class=\"" + secondaryStyle + "\">");
            if (value.getVersion() != null) {
                sb.appendEscaped(secondaryRenderer.render(value.getVersion()));
            }
            sb.appendHtmlConstant("</div>");
            sb.appendHtmlConstant("<div class=\"" + dateStyle + "\">");
            if (value.getDateAdded() != null) {
                sb.appendEscaped(dateRenderer.render(value.getDateAdded()));
            }
            sb.appendHtmlConstant("</div>");
            sb.appendHtmlConstant("</div>");
            return sb.toSafeHtml();
        }
    }
}