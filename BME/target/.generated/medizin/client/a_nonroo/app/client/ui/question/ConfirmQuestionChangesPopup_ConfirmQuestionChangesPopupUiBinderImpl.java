package medizin.client.a_nonroo.app.client.ui.question;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ConfirmQuestionChangesPopup_ConfirmQuestionChangesPopupUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.question.ConfirmQuestionChangesPopup>, medizin.client.a_nonroo.app.client.ui.question.ConfirmQuestionChangesPopup.ConfirmQuestionChangesPopupUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.question.ConfirmQuestionChangesPopup owner) {

    medizin.client.a_nonroo.app.client.ui.question.ConfirmQuestionChangesPopup_ConfirmQuestionChangesPopupUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.question.ConfirmQuestionChangesPopup_ConfirmQuestionChangesPopupUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.question.ConfirmQuestionChangesPopup_ConfirmQuestionChangesPopupUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.question.ConfirmQuestionChangesPopup_ConfirmQuestionChangesPopupUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button saveChange = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button saveNew = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div class='" + "ui-state-highlight ui-corner-all " + style.panel() + "" + "'> <span class='ui-icon ui-icon-info' style='float: left; margin-right: 0.3em;'></span> Sie haben gerade eine Frage geändert. Falls sie nur geringfügige Änderungen vorgenommen haben, bleibt die Frage aktiv und der Administrator muss diese Frage neu bestättigen. <span id='" + domId0 + "'></span> </div> <div style='height:2em;'></div> <div class='" + "ui-state-error ui-corner-all  " + style.panel() + "" + "'><span class='ui-icon ui-icon-alert' style='float: left; margin-right: 0.3em;'></span> Falls sie Änderungenvorgenommen haben, welche den Inhalt der Frage ändern, erstellen Sie eine neue Frage. Die bestehende Frage wird mit ihren Antworten kopiert. Die Frage, und alle Antworten, müssen neu vom Reviewer und Admin bestätigt werden. Diese Frage wird nach dem Akzeptieren durch den Admin deaktiviert uns steht für Prüfungen nicht mehr zur verfügung. <span id='" + domId1 + "'></span> </div>");

    saveChange.setHTML("<span class='ui-icon ui-icon-disk' style='float: left; margin-right: 0.3em;'></span> Frage als neue unterversion Speichern");
    saveChange.addStyleName("" + style.button() + "");
    saveNew.setHTML("<span class='ui-icon ui-icon-disk' style='float: left; margin-right: 0.3em;'></span> Frage als neue Version Kopieren");
    saveNew.addStyleName("" + style.button() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(saveChange, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(saveNew, domId1Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.saveNewClicked(event);
      }
    };
    saveNew.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.saveChangesClicked(event);
      }
    };
    saveChange.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    owner.saveChange = saveChange;
    owner.saveNew = saveNew;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
