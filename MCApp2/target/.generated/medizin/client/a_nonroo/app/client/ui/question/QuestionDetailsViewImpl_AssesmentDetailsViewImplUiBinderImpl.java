package medizin.client.a_nonroo.app.client.ui.question;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class QuestionDetailsViewImpl_AssesmentDetailsViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.question.QuestionDetailsViewImpl>, medizin.client.a_nonroo.app.client.ui.question.QuestionDetailsViewImpl.AssesmentDetailsViewImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.question.QuestionDetailsViewImpl owner) {

    medizin.client.a_nonroo.app.client.ui.question.QuestionDetailsViewImpl_AssesmentDetailsViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.question.QuestionDetailsViewImpl_AssesmentDetailsViewImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.question.QuestionDetailsViewImpl_AssesmentDetailsViewImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.question.QuestionDetailsViewImpl_AssesmentDetailsViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.SpanElement isActive = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement questionVersion = null;
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button edit = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button delete = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.dom.client.SpanElement questionType = null;
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement mcs = null;
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement questEvent = null;
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement questionText = null;
    java.lang.String domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement autor = null;
    java.lang.String domId8 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement dateChanged = null;
    java.lang.String domId9 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement rewiewer = null;
    java.lang.String domId10 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement dateAdded = null;
    java.lang.String domId11 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement picturePath = null;
    java.lang.String domId12 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement isAcceptedRewiever = null;
    java.lang.String domId13 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement isAcceptedAdmin = null;
    java.lang.String domId14 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement previousVersion = null;
    java.lang.String domId15 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement keywords = null;
    java.lang.String domId16 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement comment = null;
    java.lang.String domId17 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId18 = com.google.gwt.dom.client.Document.get().createUniqueId();
    medizin.client.a_nonroo.app.client.ui.question.AnswerListViewImpl answerListViewImpl = (medizin.client.a_nonroo.app.client.ui.question.AnswerListViewImpl) GWT.create(medizin.client.a_nonroo.app.client.ui.question.AnswerListViewImpl.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div class='" + "" + style.boundary() + "" + "'> <table cellpadding='0' cellspacing='0' class='" + "" + style.details() + "" + "'> <tr> <td class='" + "" + style.header() + "" + "'> <span>Frage aktiv:</span> <span id='" + domId0 + "'></span> <span>, Version:</span> <span id='" + domId1 + "'></span> </td> <td class='" + "" + style.bar() + "" + "'> <div> <span id='" + domId2 + "'></span> <span id='" + domId3 + "'></span> </div> </td> </tr> <tr> <td colspan='2'> <table class='" + "" + style.fields() + "" + "' id='boundElementHolder'> <tr> <td width='100px'> <span class='" + "" + style.label() + "" + "'>Fragentyp:</span> </td> <td width='33%'> <span id='" + domId4 + "'></span> </td> <td width='100px'> <span class='" + "" + style.label() + "" + "'>Mcs:</span> </td> <td width='33%'> <span id='" + domId5 + "'></span> </td> </tr> <tr><td class='" + "" + style.trenner() + "" + "' colspan='4'></td></tr> <tr> <td> <span class='" + "" + style.label() + "" + "'>Themenbereich:</span> </td> <td colspan='3'> <span id='" + domId6 + "'></span> </td> </tr> <tr><td class='" + "" + style.trenner() + "" + "' colspan='4'></td></tr> <tr id='questionText'> <td colspan='4'> <span class='" + "" + style.label() + "" + "'>Text der Frage:</span> </td> </tr> <tr> <td colspan='4'> <span class='" + "" + style.fieldsFliestext() + "" + "' id='" + domId7 + "'></span> </td> </tr> <tr><td class='" + "" + style.trenner() + "" + "' colspan='4'></td></tr> <tr id='dateAdded'> <td> <span class='" + "" + style.label() + "" + "'>Autor:</span> </td> <td> <span id='" + domId8 + "'></span> </td> <td> <span class='" + "" + style.label() + "" + "'>Geändert:</span> </td> <td> <span id='" + domId9 + "'></span> </td> </tr> <tr id='rewiewer'> <td> <span class='" + "" + style.label() + "" + "'>Reviewer:</span> </td> <td> <span id='" + domId10 + "'></span> </td> <td> <span class='" + "" + style.label() + "" + "'>Hinzugefügt:</span> </td> <td> <span id='" + domId11 + "'></span> </td> </tr> <tr><td class='" + "" + style.trenner() + "" + "' colspan='4'></td></tr> <tr id='picturePath'> <td> <span class='" + "" + style.label() + "" + "'>Bildpfad:</span> </td> <td colspan='3'> <span id='" + domId12 + "'></span> </td> </tr> <tr id='isAcceptedRewiever'> <td> <span class='" + "" + style.label() + "" + "'>Akzeptiert vom: </span> </td> <td colspan='3'> <span class='" + "" + style.label2() + "" + "'>Reviewer </span><span id='" + domId13 + "'></span><span class='" + "" + style.label2() + "" + "'> Admin</span> <span id='" + domId14 + "'></span> </td> </tr> <tr><td class='" + "" + style.trenner() + "" + "' colspan='4'></td></tr> <tr id='previousVersion'> <td> <span class='" + "" + style.label() + "" + "'>Vorherige version:</span> </td> <td colspan='3'> <span class='" + "" + style.fieldsFliestext() + "" + "' id='" + domId15 + "'></span> </td> </tr> <tr id='keywords'> <td> <span class='" + "" + style.label() + "" + "'>Keywords:</span> </td> <td colspan='3'> <span class='" + "" + style.fieldsFliestext() + "" + "' id='" + domId16 + "'></span> </td> </tr> <tr><td class='" + "" + style.trenner() + "" + "' colspan='4'></td></tr> <tr><td class='" + "" + style.trenner() + "" + "' colspan='4'></td></tr> <tr id='comment'> <td> <span class='" + "" + style.label() + "" + "'>Kommentar:</span> </td> <td colspan='3'> <span class='" + "" + style.fieldsFliestext() + "" + "' id='" + domId17 + "'></span> </td> </tr> </table> </td> </tr> </table> <span id='" + domId18 + "'></span> </div>");

    edit.setHTML("<span class='ui-icon ui-icon-pencil' style='float: left; margin-right: 0.3em;'></span> Frage bearbeiten");
    edit.addStyleName("" + style.button() + "");
    delete.setHTML("<span class='ui-icon ui-icon-trash' style='float: left; margin-right: 0.3em;'></span> Frage löschen");
    delete.addStyleName("" + style.button() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    isActive = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    isActive.removeAttribute("id");
    questionVersion = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    questionVersion.removeAttribute("id");
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    questionType = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    questionType.removeAttribute("id");
    mcs = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    mcs.removeAttribute("id");
    questEvent = com.google.gwt.dom.client.Document.get().getElementById(domId6).cast();
    questEvent.removeAttribute("id");
    questionText = com.google.gwt.dom.client.Document.get().getElementById(domId7).cast();
    questionText.removeAttribute("id");
    autor = com.google.gwt.dom.client.Document.get().getElementById(domId8).cast();
    autor.removeAttribute("id");
    dateChanged = com.google.gwt.dom.client.Document.get().getElementById(domId9).cast();
    dateChanged.removeAttribute("id");
    rewiewer = com.google.gwt.dom.client.Document.get().getElementById(domId10).cast();
    rewiewer.removeAttribute("id");
    dateAdded = com.google.gwt.dom.client.Document.get().getElementById(domId11).cast();
    dateAdded.removeAttribute("id");
    picturePath = com.google.gwt.dom.client.Document.get().getElementById(domId12).cast();
    picturePath.removeAttribute("id");
    isAcceptedRewiever = com.google.gwt.dom.client.Document.get().getElementById(domId13).cast();
    isAcceptedRewiever.removeAttribute("id");
    isAcceptedAdmin = com.google.gwt.dom.client.Document.get().getElementById(domId14).cast();
    isAcceptedAdmin.removeAttribute("id");
    previousVersion = com.google.gwt.dom.client.Document.get().getElementById(domId15).cast();
    previousVersion.removeAttribute("id");
    keywords = com.google.gwt.dom.client.Document.get().getElementById(domId16).cast();
    keywords.removeAttribute("id");
    comment = com.google.gwt.dom.client.Document.get().getElementById(domId17).cast();
    comment.removeAttribute("id");
    com.google.gwt.user.client.Element domId18Element = com.google.gwt.dom.client.Document.get().getElementById(domId18).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(edit, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(delete, domId3Element);
    f_HTMLPanel1.addAndReplaceElement(answerListViewImpl, domId18Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onDeleteClicked(event);
      }
    };
    delete.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onEditClicked(event);
      }
    };
    edit.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    owner.answerListViewImpl = answerListViewImpl;
    owner.autor = autor;
    owner.comment = comment;
    owner.dateAdded = dateAdded;
    owner.dateChanged = dateChanged;
    owner.delete = delete;
    owner.edit = edit;
    owner.isAcceptedAdmin = isAcceptedAdmin;
    owner.isAcceptedRewiever = isAcceptedRewiever;
    owner.isActive = isActive;
    owner.keywords = keywords;
    owner.mcs = mcs;
    owner.picturePath = picturePath;
    owner.previousVersion = previousVersion;
    owner.questEvent = questEvent;
    owner.questionText = questionText;
    owner.questionType = questionType;
    owner.questionVersion = questionVersion;
    owner.rewiewer = rewiewer;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
