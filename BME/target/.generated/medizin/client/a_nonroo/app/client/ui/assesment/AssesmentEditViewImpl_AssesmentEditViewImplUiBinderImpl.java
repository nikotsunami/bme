package medizin.client.a_nonroo.app.client.ui.assesment;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class AssesmentEditViewImpl_AssesmentEditViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.assesment.AssesmentEditViewImpl>, medizin.client.a_nonroo.app.client.ui.assesment.AssesmentEditViewImpl.AssesmentEditViewImplUiBinder {
  static AssesmentEditViewImplAssesmentEditViewImplUiBinderImplGenMessages messages = (AssesmentEditViewImplAssesmentEditViewImplUiBinderImplGenMessages) GWT.create(AssesmentEditViewImplAssesmentEditViewImplUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.assesment.AssesmentEditViewImpl owner) {

    medizin.client.a_nonroo.app.client.ui.assesment.AssesmentEditViewImpl_AssesmentEditViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.assesment.AssesmentEditViewImpl_AssesmentEditViewImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.assesment.AssesmentEditViewImpl_AssesmentEditViewImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.assesment.AssesmentEditViewImpl_AssesmentEditViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.DivElement editTitle = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.DivElement createTitle = null;
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button save = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button cancel = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox name = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.datepicker.client.DateBox dateOfAssesment = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.datepicker.client.DateBox dateOpen = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
    java.lang.String domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.datepicker.client.DateBox dateClosed = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
    java.lang.String domId8 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox place = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    java.lang.String domId9 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.CheckBox isClosed = owner.isClosed;
    java.lang.String domId10 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox mc = owner.mc;
    java.lang.String domId11 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox repeFor = owner.repeFor;
    java.lang.String domId12 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.IntegerBox percentSameQuestion = (com.google.gwt.user.client.ui.IntegerBox) GWT.create(com.google.gwt.user.client.ui.IntegerBox.class);
    java.lang.String domId13 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox logo = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div class='" + "" + style.boundary() + "" + "'> <table cellpadding='0' cellspacing='0' class='" + "" + style.details() + "" + "'> <tr> <td class='" + "" + style.header() + "" + "'> <div class='" + "" + style.header() + "" + "' id='" + domId0 + "' visible='false'> " + messages.message1() + " </div> <div class='" + "" + style.header() + "" + "' id='" + domId1 + "' visible='false'> " + messages.message2() + " </div> </td> <td class='" + "" + style.bar() + "" + "'> <div> <span id='" + domId2 + "'></span> <span id='" + domId3 + "'></span> </div> </td> </tr> <tr> <td colspan='2'> <table class='" + "" + style.fields() + "" + "' id='boundElementHolder'> <tr id='name'> <td> <div class='" + "" + style.label() + "" + "'>Name der Prüfung:</div> </td> <td> <span id='" + domId4 + "'></span> </td> </tr> <tr id='dateOfAssesment'> <td> <div class='" + "" + style.label() + "" + "'>Findet statt am:</div> </td> <td> <span id='" + domId5 + "'></span> </td> </tr> <tr id='dateOpen'> <td> <div class='" + "" + style.label() + "" + "'>Geöffnet ab:</div> </td> <td> <span id='" + domId6 + "'></span> </td> </tr> <tr id='dateClosed'> <td> <div class='" + "" + style.label() + "" + "'>Geschlossen ab:</div> </td> <td> <span id='" + domId7 + "'></span> </td> </tr> <tr id='place'> <td> <div class='" + "" + style.label() + "" + "'>Findet statt in:</div> </td> <td> <span id='" + domId8 + "'></span> </td> </tr> <tr id='isClosed'> <td> <div class='" + "" + style.label() + "" + "'>Ist geschlossen:</div> </td> <td> <span id='" + domId9 + "'></span> </td> </tr> <tr id='mc'> <td> <div class='" + "" + style.label() + "" + "'>Gehört zu MC:</div> </td> <td> <span id='" + domId10 + "'></span> </td> </tr> <tr id='repeFor'> <td> <div class='" + "" + style.label() + "" + "'>Repeprüfung für:</div> </td> <td> <span id='" + domId11 + "'></span> </td> </tr> <tr id='percentSameQuestion'> <td> <div class='" + "" + style.label() + "" + "'>Prozent gleicher Frage:</div> </td> <td> <span id='" + domId12 + "'></span> </td> </tr> <tr id='logo'> <td> <div class='" + "" + style.label() + "" + "'>Logo:</div> </td> <td> <span id='" + domId13 + "'></span> </td> </tr> </table> </td> </tr> </table> </div>");

    save.setHTML("<span class='ui-icon ui-icon-disk' style='float: left; margin-right: 0.3em;'></span> Prüfung speichern");
    save.addStyleName("" + style.button() + "");
    cancel.setHTML("<span class='ui-icon ui-icon-closethick' style='float: left; margin-right: 0.3em;'></span> Bearbeiten abbrechen");
    cancel.addStyleName("" + style.button() + "");

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
    com.google.gwt.user.client.Element domId11Element = com.google.gwt.dom.client.Document.get().getElementById(domId11).cast();
    com.google.gwt.user.client.Element domId12Element = com.google.gwt.dom.client.Document.get().getElementById(domId12).cast();
    com.google.gwt.user.client.Element domId13Element = com.google.gwt.dom.client.Document.get().getElementById(domId13).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(save, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(cancel, domId3Element);
    f_HTMLPanel1.addAndReplaceElement(name, domId4Element);
    f_HTMLPanel1.addAndReplaceElement(dateOfAssesment, domId5Element);
    f_HTMLPanel1.addAndReplaceElement(dateOpen, domId6Element);
    f_HTMLPanel1.addAndReplaceElement(dateClosed, domId7Element);
    f_HTMLPanel1.addAndReplaceElement(place, domId8Element);
    f_HTMLPanel1.addAndReplaceElement(isClosed, domId9Element);
    f_HTMLPanel1.addAndReplaceElement(mc, domId10Element);
    f_HTMLPanel1.addAndReplaceElement(repeFor, domId11Element);
    f_HTMLPanel1.addAndReplaceElement(percentSameQuestion, domId12Element);
    f_HTMLPanel1.addAndReplaceElement(logo, domId13Element);


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
    owner.dateClosed = dateClosed;
    owner.dateOfAssesment = dateOfAssesment;
    owner.dateOpen = dateOpen;
    owner.editTitle = editTitle;
    owner.logo = logo;
    owner.name = name;
    owner.percentSameQuestion = percentSameQuestion;
    owner.place = place;
    owner.save = save;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
