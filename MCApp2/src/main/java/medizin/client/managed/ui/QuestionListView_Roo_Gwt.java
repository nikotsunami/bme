// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.text.client.DateTimeFormatRenderer;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import java.util.HashSet;
import java.util.Set;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.CommentProxy;
import medizin.client.managed.request.KeywordProxy;
import medizin.client.managed.request.McProxy;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.managed.request.QuestionTypeProxy;
import medizin.client.scaffold.place.AbstractProxyListView;

public abstract class QuestionListView_Roo_Gwt extends AbstractProxyListView<QuestionProxy> {

    @UiField
    CellTable<QuestionProxy> table;

    protected Set<String> paths = new HashSet<String>();

    public void init() {
        paths.add("questionText");
        table.addColumn(new TextColumn<QuestionProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionProxy object) {
                return renderer.render(object.getQuestionText());
            }
        }, "Question Text");
        paths.add("picturePath");
        table.addColumn(new TextColumn<QuestionProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionProxy object) {
                return renderer.render(object.getPicturePath());
            }
        }, "Picture Path");
        paths.add("questionVersion");
        table.addColumn(new TextColumn<QuestionProxy>() {

            Renderer<java.lang.Double> renderer = new AbstractRenderer<java.lang.Double>() {

                public String render(java.lang.Double obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionProxy object) {
                return renderer.render(object.getQuestionVersion());
            }
        }, "Question Version");
        paths.add("isAcceptedRewiever");
        table.addColumn(new TextColumn<QuestionProxy>() {

            Renderer<java.lang.Boolean> renderer = new AbstractRenderer<java.lang.Boolean>() {

                public String render(java.lang.Boolean obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionProxy object) {
                return renderer.render(object.getIsAcceptedRewiever());
            }
        }, "Is Accepted Rewiever");
        paths.add("isAcceptedAdmin");
        table.addColumn(new TextColumn<QuestionProxy>() {

            Renderer<java.lang.Boolean> renderer = new AbstractRenderer<java.lang.Boolean>() {

                public String render(java.lang.Boolean obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionProxy object) {
                return renderer.render(object.getIsAcceptedAdmin());
            }
        }, "Is Accepted Admin");
        paths.add("isActive");
        table.addColumn(new TextColumn<QuestionProxy>() {

            Renderer<java.lang.Boolean> renderer = new AbstractRenderer<java.lang.Boolean>() {

                public String render(java.lang.Boolean obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionProxy object) {
                return renderer.render(object.getIsActive());
            }
        }, "Is Active");
        paths.add("previousVersion");
        table.addColumn(new TextColumn<QuestionProxy>() {

            Renderer<medizin.client.managed.request.QuestionProxy> renderer = medizin.client.managed.ui.QuestionProxyRenderer.instance();

            @Override
            public String getValue(QuestionProxy object) {
                return renderer.render(object.getPreviousVersion());
            }
        }, "Previous Version");
        paths.add("keywords");
        table.addColumn(new TextColumn<QuestionProxy>() {

            Renderer<java.util.Set> renderer = medizin.client.scaffold.place.CollectionRenderer.of(medizin.client.managed.ui.KeywordProxyRenderer.instance());

            @Override
            public String getValue(QuestionProxy object) {
                return renderer.render(object.getKeywords());
            }
        }, "Keywords");
        paths.add("questEvent");
        table.addColumn(new TextColumn<QuestionProxy>() {

            Renderer<medizin.client.managed.request.QuestionEventProxy> renderer = medizin.client.managed.ui.QuestionEventProxyRenderer.instance();

            @Override
            public String getValue(QuestionProxy object) {
                return renderer.render(object.getQuestEvent());
            }
        }, "Quest Event");
        paths.add("comment");
        table.addColumn(new TextColumn<QuestionProxy>() {

            Renderer<medizin.client.managed.request.CommentProxy> renderer = medizin.client.managed.ui.CommentProxyRenderer.instance();

            @Override
            public String getValue(QuestionProxy object) {
                return renderer.render(object.getComment());
            }
        }, "Comment");
        paths.add("questionType");
        table.addColumn(new TextColumn<QuestionProxy>() {

            Renderer<medizin.client.managed.request.QuestionTypeProxy> renderer = medizin.client.managed.ui.QuestionTypeProxyRenderer.instance();

            @Override
            public String getValue(QuestionProxy object) {
                return renderer.render(object.getQuestionType());
            }
        }, "Question Type");
        paths.add("mcs");
        table.addColumn(new TextColumn<QuestionProxy>() {

            Renderer<java.util.Set> renderer = medizin.client.scaffold.place.CollectionRenderer.of(medizin.client.managed.ui.McProxyRenderer.instance());

            @Override
            public String getValue(QuestionProxy object) {
                return renderer.render(object.getMcs());
            }
        }, "Mcs");
        paths.add("answers");
        table.addColumn(new TextColumn<QuestionProxy>() {

            Renderer<java.util.Set> renderer = medizin.client.scaffold.place.CollectionRenderer.of(medizin.client.managed.ui.AnswerProxyRenderer.instance());

            @Override
            public String getValue(QuestionProxy object) {
                return renderer.render(object.getAnswers());
            }
        }, "Answers");
        paths.add("dateAdded");
        table.addColumn(new TextColumn<QuestionProxy>() {

            Renderer<java.util.Date> renderer = new DateTimeFormatRenderer(DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT));

            @Override
            public String getValue(QuestionProxy object) {
                return renderer.render(object.getDateAdded());
            }
        }, "Date Added");
        paths.add("dateChanged");
        table.addColumn(new TextColumn<QuestionProxy>() {

            Renderer<java.util.Date> renderer = new DateTimeFormatRenderer(DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT));

            @Override
            public String getValue(QuestionProxy object) {
                return renderer.render(object.getDateChanged());
            }
        }, "Date Changed");
        paths.add("rewiewer");
        table.addColumn(new TextColumn<QuestionProxy>() {

            Renderer<medizin.client.managed.request.PersonProxy> renderer = medizin.client.managed.ui.PersonProxyRenderer.instance();

            @Override
            public String getValue(QuestionProxy object) {
                return renderer.render(object.getRewiewer());
            }
        }, "Rewiewer");
        paths.add("autor");
        table.addColumn(new TextColumn<QuestionProxy>() {

            Renderer<medizin.client.managed.request.PersonProxy> renderer = medizin.client.managed.ui.PersonProxyRenderer.instance();

            @Override
            public String getValue(QuestionProxy object) {
                return renderer.render(object.getAutor());
            }
        }, "Autor");
        paths.add("id");
        table.addColumn(new TextColumn<QuestionProxy>() {

            Renderer<java.lang.Long> renderer = new AbstractRenderer<java.lang.Long>() {

                public String render(java.lang.Long obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionProxy object) {
                return renderer.render(object.getId());
            }
        }, "Id");
        paths.add("version");
        table.addColumn(new TextColumn<QuestionProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionProxy object) {
                return renderer.render(object.getVersion());
            }
        }, "Version");
    }
}