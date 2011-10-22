package medizin.client.a_nonroo.app.client.ui.question;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class AnswerDialogboxImpl_EventAccessDialogboxImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.question.AnswerDialogboxImpl>, medizin.client.a_nonroo.app.client.ui.question.AnswerDialogboxImpl.EventAccessDialogboxImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.question.AnswerDialogboxImpl owner) {

    medizin.client.a_nonroo.app.client.ui.question.AnswerDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.question.AnswerDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.question.AnswerDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.question.AnswerDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.SimplePanel toolbarPanel = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.RichTextArea answerTextArea = (com.google.gwt.user.client.ui.RichTextArea) GWT.create(com.google.gwt.user.client.ui.RichTextArea.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox rewiewer = owner.rewiewer;
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox validity = owner.validity;
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button save = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button closeButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<table class='" + "" + style.fields() + "" + "' id='boundElementHolder'> <tr id='text'><td colspan='2'> <span id='" + domId0 + "'></span>  <span id='" + domId1 + "'></span> </td> </tr> <tr id='rewiewer'> <td> <div class='" + "" + style.label() + "" + "'>Rewiewer:</div> </td> <td> <span id='" + domId2 + "'></span> </td> </tr>  <tr id='validity'> <td> <div class='" + "" + style.label() + "" + "'>Validity:</div> </td> <td> <span id='" + domId3 + "'></span> </td> </tr> </table> <div class='" + "" + style.barPopup() + "" + "'> <span id='" + domId4 + "'></span> <span id='" + domId5 + "'></span> </div>");

    toolbarPanel.addStyleName("" + style.nav() + "");
    answerTextArea.addStyleName("" + style.textarea() + "");
    save.setHTML("Speichern");
    save.addStyleName("ui-button");
    save.addStyleName("ui-widget");
    save.addStyleName("ui-state-default");
    save.addStyleName("ui-corner-all");
    save.addStyleName("ui-button-text-icon-primary");
    save.addStyleName("" + style.right() + "");
    closeButton.setHTML("Abbrechen");
    closeButton.addStyleName("ui-button");
    closeButton.addStyleName("ui-widget");
    closeButton.addStyleName("ui-state-default");
    closeButton.addStyleName("ui-corner-all");
    closeButton.addStyleName("ui-button-text-icon-primary");
    closeButton.addStyleName("" + style.right() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    com.google.gwt.user.client.Element domId5Element = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(toolbarPanel, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(answerTextArea, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(rewiewer, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(validity, domId3Element);
    f_HTMLPanel1.addAndReplaceElement(save, domId4Element);
    f_HTMLPanel1.addAndReplaceElement(closeButton, domId5Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onCloseButtonClick(event);
      }
    };
    closeButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onSave(event);
      }
    };
    save.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    owner.answerTextArea = answerTextArea;
    owner.closeButton = closeButton;
    owner.save = save;
    owner.toolbarPanel = toolbarPanel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
