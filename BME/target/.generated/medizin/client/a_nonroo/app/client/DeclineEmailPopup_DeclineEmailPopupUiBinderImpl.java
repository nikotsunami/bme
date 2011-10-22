package medizin.client.a_nonroo.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class DeclineEmailPopup_DeclineEmailPopupUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.DeclineEmailPopup>, medizin.client.a_nonroo.app.client.DeclineEmailPopup.DeclineEmailPopupUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.DeclineEmailPopup owner) {

    medizin.client.a_nonroo.app.client.DeclineEmailPopup_DeclineEmailPopupUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.DeclineEmailPopup_DeclineEmailPopupUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.DeclineEmailPopup_DeclineEmailPopupUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.DeclineEmailPopup_DeclineEmailPopupUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.SimplePanel toolbarPanel = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.RichTextArea questionTextArea = (com.google.gwt.user.client.ui.RichTextArea) GWT.create(com.google.gwt.user.client.ui.RichTextArea.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button sendMail = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button abbortButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId0 + "'></span>  <span id='" + domId1 + "'></span> <div class='" + "ui-state-highlight ui-corner-all " + style.panel() + "" + "'> <span class='ui-icon ui-icon-info' style='float: left; margin-right: 0.3em;'></span> Wenn Sie die Nachricht abschicken, wird der Autor darüber Informiert. Die geschriebene Nachricht wird mitgesendet. Das Objekt wird gelöscht, sofern keine Beziehungen zu anderen bestehen. Sollten bereits Objekte zugeordnet Sein, lehnen Sie bitte zuerst diese ebenfalls ab. <span id='" + domId2 + "'></span> </div> <div style='height:2em;'></div> <span id='" + domId3 + "'></span>");

    toolbarPanel.addStyleName("" + style.nav() + "");
    questionTextArea.addStyleName("" + style.textarea() + "");
    sendMail.setHTML("<span class='ui-icon ui-icon-mail-closed' style='float: left; margin-right: 0.3em;'></span> Objekt löschen und Nachricht senden");
    sendMail.addStyleName("" + style.button() + "");
    abbortButton.setHTML("<span class='ui-icon ui-icon-close' style='float: left; margin-right: 0.3em;'></span> Zurück zur Auflistung");
    abbortButton.addStyleName("" + style.button() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(toolbarPanel, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(questionTextArea, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(sendMail, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(abbortButton, domId3Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.saveNewClicked(event);
      }
    };
    sendMail.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.saveChangesClicked(event);
      }
    };
    abbortButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    owner.abbortButton = abbortButton;
    owner.questionTextArea = questionTextArea;
    owner.sendMail = sendMail;
    owner.toolbarPanel = toolbarPanel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
