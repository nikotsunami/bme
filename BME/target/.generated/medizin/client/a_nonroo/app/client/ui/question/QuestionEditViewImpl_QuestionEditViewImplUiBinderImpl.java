package medizin.client.a_nonroo.app.client.ui.question;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class QuestionEditViewImpl_QuestionEditViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.question.QuestionEditViewImpl>, medizin.client.a_nonroo.app.client.ui.question.QuestionEditViewImpl.QuestionEditViewImplUiBinder {
  static QuestionEditViewImplQuestionEditViewImplUiBinderImplGenMessages messages = (QuestionEditViewImplQuestionEditViewImplUiBinderImplGenMessages) GWT.create(QuestionEditViewImplQuestionEditViewImplUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.question.QuestionEditViewImpl owner) {

    medizin.client.a_nonroo.app.client.ui.question.QuestionEditViewImpl_QuestionEditViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.question.QuestionEditViewImpl_QuestionEditViewImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.question.QuestionEditViewImpl_QuestionEditViewImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.question.QuestionEditViewImpl_QuestionEditViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.DivElement editTitle = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.DivElement createTitle = null;
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button save = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button cancel = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.SimplePanel toolbarPanel = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.RichTextArea questionTextArea = (com.google.gwt.user.client.ui.RichTextArea) GWT.create(com.google.gwt.user.client.ui.RichTextArea.class);
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox rewiewer = owner.rewiewer;
    java.lang.String domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox questEvent = owner.questEvent;
    java.lang.String domId8 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox questionType = owner.questionType;
    java.lang.String domId9 = com.google.gwt.dom.client.Document.get().createUniqueId();
    medizin.client.managed.ui.McSetEditor mcs = (medizin.client.managed.ui.McSetEditor) GWT.create(medizin.client.managed.ui.McSetEditor.class);
    java.lang.String domId10 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox autor = owner.autor;
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div class='" + "" + style.boundary() + "" + "'> <table cellpadding='0' cellspacing='0' class='" + "" + style.details() + "" + "'> <tr> <td class='" + "" + style.header() + "" + "'> <div class='" + "" + style.header() + "" + "' id='" + domId0 + "' visible='false'> " + messages.message1() + " </div> <div class='" + "" + style.header() + "" + "' id='" + domId1 + "' visible='false'> " + messages.message2() + " </div> </td> <td class='" + "" + style.bar() + "" + "'> <div> <span id='" + domId2 + "'></span> <span id='" + domId3 + "'></span> </div> </td> </tr> <tr> <td colspan='2'> <table class='" + "" + style.fields() + "" + "' id='boundElementHolder'> <tr id='questionText'> <td colspan='2'> <div class='" + "" + style.label() + "" + "'>Text der Frage:</div> </td> </tr> <tr> <td colspan='2'> <span id='" + domId4 + "'></span>  <span id='" + domId5 + "'></span> </td> </tr> <tr id='rewiewer'> <td> <div class='" + "" + style.label() + "" + "'>Reviewer:</div> </td> <td> <span id='" + domId6 + "'></span> </td> </tr> <tr id='questEvent'> <td> <div class='" + "" + style.label() + "" + "'>Themenbereich:</div> </td> <td> <span id='" + domId7 + "'></span> </td> </tr> <tr id='questionType'> <td> <div class='" + "" + style.label() + "" + "'>Fragetyp:</div> </td> <td> <span id='" + domId8 + "'></span> </td> </tr> <tr id='mcs'> <td> <div class='" + "" + style.label() + "" + "'>Mcs:</div> </td> <td> <span id='" + domId9 + "'></span> </td> </tr> </table> </td> </tr> </table> <span id='" + domId10 + "'></span> </div>");

    save.setHTML("<span class='ui-icon ui-icon-disk' style='float: left; margin-right: 0.3em;'></span> Frage speichern");
    save.addStyleName("" + style.button() + "");
    cancel.setHTML("<span class='ui-icon ui-icon-closethick' style='float: left; margin-right: 0.3em;'></span> Bearbeiten abbrechen");
    cancel.addStyleName("" + style.button() + "");
    toolbarPanel.addStyleName("" + style.nav() + "");
    questionTextArea.addStyleName("" + style.textarea() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    editTitle = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    editTitle.removeAttribute("id");
    createTitle = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    createTitle.removeAttribute("id");
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    com.google.gwt.user.client.Element domId5Element = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    com.google.gwt.user.client.Element domId6Element = com.google.gwt.dom.client.Document.get().getElementById(domId6).cast();
    com.google.gwt.user.client.Element domId7Element = com.google.gwt.dom.client.Document.get().getElementById(domId7).cast();
    com.google.gwt.user.client.Element domId8Element = com.google.gwt.dom.client.Document.get().getElementById(domId8).cast();
    com.google.gwt.user.client.Element domId9Element = com.google.gwt.dom.client.Document.get().getElementById(domId9).cast();
    com.google.gwt.user.client.Element domId10Element = com.google.gwt.dom.client.Document.get().getElementById(domId10).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(save, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(cancel, domId3Element);
    f_HTMLPanel1.addAndReplaceElement(toolbarPanel, domId4Element);
    f_HTMLPanel1.addAndReplaceElement(questionTextArea, domId5Element);
    f_HTMLPanel1.addAndReplaceElement(rewiewer, domId6Element);
    f_HTMLPanel1.addAndReplaceElement(questEvent, domId7Element);
    f_HTMLPanel1.addAndReplaceElement(questionType, domId8Element);
    f_HTMLPanel1.addAndReplaceElement(mcs, domId9Element);
    f_HTMLPanel1.addAndReplaceElement(autor, domId10Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onCancel(event);
      }
    };
    cancel.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onSave(event);
      }
    };
    save.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    owner.cancel = cancel;
    owner.createTitle = createTitle;
    owner.editTitle = editTitle;
    owner.mcs = mcs;
    owner.questionTextArea = questionTextArea;
    owner.save = save;
    owner.toolbarPanel = toolbarPanel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
