package medizin.client.a_nonroo.app.client.ui.assignquestion;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class QuestionViewImpl_QuestionViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionViewImpl>, medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionViewImpl.QuestionViewImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionViewImpl owner) {

    medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionViewImpl_QuestionViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionViewImpl_QuestionViewImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionViewImpl_QuestionViewImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionViewImpl_QuestionViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label twistieOpen = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label twistieClose = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label header = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label addToAssesment = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.VerticalPanel answers = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement questEvent = null;
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement questionType = null;
    java.lang.String domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement rewiewer = null;
    java.lang.String domId8 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement autor = null;
    java.lang.String domId9 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement keywords = null;
    java.lang.String domId10 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement comment = null;
    java.lang.String domId11 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.HTMLPanel detailsTablePanel = new com.google.gwt.user.client.ui.HTMLPanel("<table class='" + "" + style.questionDetails() + "" + "'> <tr id='questEvent'> <td style='width: 100px;'> <span class='" + "" + style.label() + "" + "'>Themenbereich:</span> </td> <td style='width: 50%;'> <span id='" + domId6 + "'></span> </td> <td style='width: 100px;'> <span class='" + "" + style.label() + "" + "'>Fragentyp:</span> </td> <td style='width: 50%;'> <span id='" + domId7 + "'></span> </td> <tr id='rewiewer'> <td> <span class='" + "" + style.label() + "" + "'>Reviewer:</span> </td> <td> <span id='" + domId8 + "'></span> </td> <td> <span class='" + "" + style.label() + "" + "'>Autor:</span> </td> <td> <span id='" + domId9 + "'></span> </td> </tr> </tr> <tr id='keywords'> <td> <span class='" + "" + style.label() + "" + "'>Keywords:</span> </td> <td collspan='3'> <span id='" + domId10 + "'></span> </td> </tr> <tr id='comment'> <td> <span class='" + "" + style.label() + "" + "'>Kommentar:</span> </td> <td collspan='3'> <span id='" + domId11 + "'></span> </td> </tr> </table>");
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<table cellpadding='0' cellspacing='0' class='" + "" + style.question() + "" + "'> <tr> <td class='" + "" + style.headerIcon() + "" + "' valign='top' width='20px'> <span id='" + domId0 + "'></span> <span id='" + domId1 + "'></span> </td> <td class='" + "" + style.header() + "" + "' valign='top' width='100%'> <span id='" + domId2 + "'></span> </td> <td class='" + "" + style.headerIcon() + "" + "' valign='top'> <span id='" + domId3 + "'></span> </td> </tr> </table> <span id='" + domId4 + "'></span> <span id='" + domId5 + "'></span>");

    twistieOpen.setStyleName("ui-icon ui-icon-triangle-1-e " + style.fill() + "");
    twistieClose.setStyleName("ui-icon ui-icon-triangle-1-s " + style.fill() + "");
    addToAssesment.setStyleName("ui-icon ui-icon-plusthick " + style.fill() + "");
    answers.setStyleName("" + style.answers() + "");
    detailsTablePanel.setStyleName("" + style.detailsTablePanel() + "");
    detailsTablePanel.setVisible(false);
    f_HTMLPanel1.setStyleName("" + style.question() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    UiBinderUtil.TempAttachment attachRecord1 = UiBinderUtil.attachToDom(detailsTablePanel.getElement());
    questEvent = com.google.gwt.dom.client.Document.get().getElementById(domId6).cast();
    questEvent.removeAttribute("id");
    questionType = com.google.gwt.dom.client.Document.get().getElementById(domId7).cast();
    questionType.removeAttribute("id");
    rewiewer = com.google.gwt.dom.client.Document.get().getElementById(domId8).cast();
    rewiewer.removeAttribute("id");
    autor = com.google.gwt.dom.client.Document.get().getElementById(domId9).cast();
    autor.removeAttribute("id");
    keywords = com.google.gwt.dom.client.Document.get().getElementById(domId10).cast();
    keywords.removeAttribute("id");
    comment = com.google.gwt.dom.client.Document.get().getElementById(domId11).cast();
    comment.removeAttribute("id");
    attachRecord1.detach();
    com.google.gwt.user.client.Element domId5Element = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(twistieOpen, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(twistieClose, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(header, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(addToAssesment, domId3Element);
    f_HTMLPanel1.addAndReplaceElement(answers, domId4Element);
    f_HTMLPanel1.addAndReplaceElement(detailsTablePanel, domId5Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.twistieClicked(event);
      }
    };
    twistieOpen.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);
    twistieClose.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.addToAssesment = addToAssesment;
    owner.answers = answers;
    owner.autor = autor;
    owner.comment = comment;
    owner.detailsTablePanel = detailsTablePanel;
    owner.header = header;
    owner.keywords = keywords;
    owner.questEvent = questEvent;
    owner.questionType = questionType;
    owner.rewiewer = rewiewer;
    owner.twistieClose = twistieClose;
    owner.twistieOpen = twistieOpen;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
