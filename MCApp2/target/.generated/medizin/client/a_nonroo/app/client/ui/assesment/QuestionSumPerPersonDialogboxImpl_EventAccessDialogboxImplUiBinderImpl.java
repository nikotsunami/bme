package medizin.client.a_nonroo.app.client.ui.assesment;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class QuestionSumPerPersonDialogboxImpl_EventAccessDialogboxImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonDialogboxImpl>, medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonDialogboxImpl.EventAccessDialogboxImplUiBinder {
  static QuestionSumPerPersonDialogboxImplEventAccessDialogboxImplUiBinderImplGenMessages messages = (QuestionSumPerPersonDialogboxImplEventAccessDialogboxImplUiBinderImplGenMessages) GWT.create(QuestionSumPerPersonDialogboxImplEventAccessDialogboxImplUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonDialogboxImpl owner) {

    medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.HeadingElement editTitle = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.HeadingElement createTitle = null;
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox responsiblePerson = owner.responsiblePerson;
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox questionEvent = owner.questionEvent;
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.IntegerBox questionSum = (com.google.gwt.user.client.ui.IntegerBox) GWT.create(com.google.gwt.user.client.ui.IntegerBox.class);
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button save = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button closeButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div class='" + "" + style.underline() + "" + "'> <h3 class='" + "" + style.header() + "" + "' id='" + domId0 + "'> " + messages.message1() + " </h3> <h3 class='" + "" + style.header() + "" + "' id='" + domId1 + "'> " + messages.message2() + " </h3> </div> <table class='" + "" + style.fields() + "" + "' id='boundElementHolder'> <tr id='responsiblePerson'> <td> <div class='" + "" + style.label() + "" + "'>Responsible Person:</div> </td> <td> <span id='" + domId2 + "'></span> </td> </tr> <tr id='questionEvent'> <td> <div class='" + "" + style.label() + "" + "'>Question Event:</div> </td> <td> <span id='" + domId3 + "'></span> </td> </tr> <tr id='questionSum'> <td> <div class='" + "" + style.label() + "" + "'>Question Sum:</div> </td> <td> <span id='" + domId4 + "'></span> </td> </tr> </table> <div class='" + "" + style.bar() + "" + "'> <span id='" + domId5 + "'></span> <span id='" + domId6 + "'></span> </div>");

    save.setHTML("Speichern");
    save.addStyleName("" + style.button() + "");
    closeButton.setHTML("Abbrechen");
    closeButton.addStyleName("" + style.button() + "");

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
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(responsiblePerson, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(questionEvent, domId3Element);
    f_HTMLPanel1.addAndReplaceElement(questionSum, domId4Element);
    f_HTMLPanel1.addAndReplaceElement(save, domId5Element);
    f_HTMLPanel1.addAndReplaceElement(closeButton, domId6Element);


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

    owner.closeButton = closeButton;
    owner.questionSum = questionSum;
    owner.save = save;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
