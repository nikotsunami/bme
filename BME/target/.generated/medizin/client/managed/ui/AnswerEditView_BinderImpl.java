package medizin.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.HTMLPanel;

public class AnswerEditView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.HTMLPanel, medizin.client.managed.ui.AnswerEditView>, medizin.client.managed.ui.AnswerEditView.Binder {
  static AnswerEditViewBinderImplGenMessages messages = (AnswerEditViewBinderImplGenMessages) GWT.create(AnswerEditViewBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.HTMLPanel createAndBindUi(final medizin.client.managed.ui.AnswerEditView owner) {

    medizin.client.managed.ui.AnswerEditView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.managed.ui.AnswerEditView_BinderImpl_GenBundle) GWT.create(medizin.client.managed.ui.AnswerEditView_BinderImpl_GenBundle.class);
    medizin.client.managed.ui.AnswerEditView_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.HeadingElement editTitle = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.HeadingElement createTitle = null;
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.DivElement errors = null;
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.datepicker.client.DateBox dateAdded = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.datepicker.client.DateBox dateChanged = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox rewiewer = owner.rewiewer;
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox autor = owner.autor;
    java.lang.String domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox answerText = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    java.lang.String domId8 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.CheckBox isAnswerActive = owner.isAnswerActive;
    java.lang.String domId9 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.CheckBox isPicture = owner.isPicture;
    java.lang.String domId10 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.CheckBox isAnswerAcceptedReviewWahrer = owner.isAnswerAcceptedReviewWahrer;
    java.lang.String domId11 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.CheckBox isAnswerAcceptedAutor = owner.isAnswerAcceptedAutor;
    java.lang.String domId12 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.CheckBox isAnswerAcceptedAdmin = owner.isAnswerAcceptedAdmin;
    java.lang.String domId13 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox validity = owner.validity;
    java.lang.String domId14 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox picturePath = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    java.lang.String domId15 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox question = owner.question;
    java.lang.String domId16 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button save = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId17 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button cancel = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div class='" + "" + style.underline() + "" + "'> <h3 class='" + "" + style.header() + "" + "' id='" + domId0 + "'> " + messages.message1() + " </h3> <h3 class='" + "" + style.header() + "" + "' id='" + domId1 + "'>" + messages.message2() + "</h3> </div> <div class='" + "" + style.errors() + "" + "' id='" + domId2 + "'></div> <table class='" + "" + style.fields() + "" + "' id='boundElementHolder'> <tr id='dateAdded'><td><div class='" + "" + style.label() + "" + "'>Date Added:</div></td><td><span id='" + domId3 + "'></span></td></tr> <tr id='dateChanged'><td><div class='" + "" + style.label() + "" + "'>Date Changed:</div></td><td><span id='" + domId4 + "'></span></td></tr> <tr id='rewiewer'><td><div class='" + "" + style.label() + "" + "'>Rewiewer:</div></td><td><span id='" + domId5 + "'></span></td></tr> <tr id='autor'><td><div class='" + "" + style.label() + "" + "'>Autor:</div></td><td><span id='" + domId6 + "'></span></td></tr> <tr id='answerText'><td><div class='" + "" + style.label() + "" + "'>Answer Text:</div></td><td><span id='" + domId7 + "'></span></td></tr> <tr id='isAnswerActive'><td><div class='" + "" + style.label() + "" + "'>Is Answer Active:</div></td><td><span id='" + domId8 + "'></span></td></tr> <tr id='isPicture'><td><div class='" + "" + style.label() + "" + "'>Is Picture:</div></td><td><span id='" + domId9 + "'></span></td></tr> <tr id='isAnswerAcceptedReviewWahrer'><td><div class='" + "" + style.label() + "" + "'>Is Answer Accepted Review Wahrer:</div></td><td><span id='" + domId10 + "'></span></td></tr> <tr id='isAnswerAcceptedAutor'><td><div class='" + "" + style.label() + "" + "'>Is Answer Accepted Autor:</div></td><td><span id='" + domId11 + "'></span></td></tr> <tr id='isAnswerAcceptedAdmin'><td><div class='" + "" + style.label() + "" + "'>Is Answer Accepted Admin:</div></td><td><span id='" + domId12 + "'></span></td></tr> <tr id='validity'><td><div class='" + "" + style.label() + "" + "'>Validity:</div></td><td><span id='" + domId13 + "'></span></td></tr> <tr id='picturePath'><td><div class='" + "" + style.label() + "" + "'>Picture Path:</div></td><td><span id='" + domId14 + "'></span></td></tr> <tr id='question'><td><div class='" + "" + style.label() + "" + "'>Question:</div></td><td><span id='" + domId15 + "'></span></td></tr> </table> <div class='" + "" + style.bar() + "" + "'> <span id='" + domId16 + "'></span> <span id='" + domId17 + "'></span> </div>");

    save.setHTML("Save");
    save.addStyleName("" + style.button() + "");
    cancel.setHTML("Cancel");
    cancel.addStyleName("" + style.button() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    editTitle = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    editTitle.removeAttribute("id");
    createTitle = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    createTitle.removeAttribute("id");
    errors = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    errors.removeAttribute("id");
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    com.google.gwt.user.client.Element domId5Element = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    com.google.gwt.user.client.Element domId6Element = com.google.gwt.dom.client.Document.get().getElementById(domId6).cast();
    com.google.gwt.user.client.Element domId7Element = com.google.gwt.dom.client.Document.get().getElementById(domId7).cast();
    com.google.gwt.user.client.Element domId8Element = com.google.gwt.dom.client.Document.get().getElementById(domId8).cast();
    com.google.gwt.user.client.Element domId9Element = com.google.gwt.dom.client.Document.get().getElementById(domId9).cast();
    com.google.gwt.user.client.Element domId10Element = com.google.gwt.dom.client.Document.get().getElementById(domId10).cast();
    com.google.gwt.user.client.Element domId11Element = com.google.gwt.dom.client.Document.get().getElementById(domId11).cast();
    com.google.gwt.user.client.Element domId12Element = com.google.gwt.dom.client.Document.get().getElementById(domId12).cast();
    com.google.gwt.user.client.Element domId13Element = com.google.gwt.dom.client.Document.get().getElementById(domId13).cast();
    com.google.gwt.user.client.Element domId14Element = com.google.gwt.dom.client.Document.get().getElementById(domId14).cast();
    com.google.gwt.user.client.Element domId15Element = com.google.gwt.dom.client.Document.get().getElementById(domId15).cast();
    com.google.gwt.user.client.Element domId16Element = com.google.gwt.dom.client.Document.get().getElementById(domId16).cast();
    com.google.gwt.user.client.Element domId17Element = com.google.gwt.dom.client.Document.get().getElementById(domId17).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(dateAdded, domId3Element);
    f_HTMLPanel1.addAndReplaceElement(dateChanged, domId4Element);
    f_HTMLPanel1.addAndReplaceElement(rewiewer, domId5Element);
    f_HTMLPanel1.addAndReplaceElement(autor, domId6Element);
    f_HTMLPanel1.addAndReplaceElement(answerText, domId7Element);
    f_HTMLPanel1.addAndReplaceElement(isAnswerActive, domId8Element);
    f_HTMLPanel1.addAndReplaceElement(isPicture, domId9Element);
    f_HTMLPanel1.addAndReplaceElement(isAnswerAcceptedReviewWahrer, domId10Element);
    f_HTMLPanel1.addAndReplaceElement(isAnswerAcceptedAutor, domId11Element);
    f_HTMLPanel1.addAndReplaceElement(isAnswerAcceptedAdmin, domId12Element);
    f_HTMLPanel1.addAndReplaceElement(validity, domId13Element);
    f_HTMLPanel1.addAndReplaceElement(picturePath, domId14Element);
    f_HTMLPanel1.addAndReplaceElement(question, domId15Element);
    f_HTMLPanel1.addAndReplaceElement(save, domId16Element);
    f_HTMLPanel1.addAndReplaceElement(cancel, domId17Element);


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

    owner.answerText = answerText;
    owner.cancel = cancel;
    owner.createTitle = createTitle;
    owner.dateAdded = dateAdded;
    owner.dateChanged = dateChanged;
    owner.editTitle = editTitle;
    owner.errors = errors;
    owner.picturePath = picturePath;
    owner.save = save;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
