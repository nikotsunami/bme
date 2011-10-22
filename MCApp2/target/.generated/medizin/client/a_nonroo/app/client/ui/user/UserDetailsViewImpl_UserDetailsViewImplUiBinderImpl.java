package medizin.client.a_nonroo.app.client.ui.user;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class UserDetailsViewImpl_UserDetailsViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.user.UserDetailsViewImpl>, medizin.client.a_nonroo.app.client.ui.user.UserDetailsViewImpl.UserDetailsViewImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.user.UserDetailsViewImpl owner) {

    medizin.client.a_nonroo.app.client.ui.user.UserDetailsViewImpl_UserDetailsViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.user.UserDetailsViewImpl_UserDetailsViewImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.user.UserDetailsViewImpl_UserDetailsViewImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.user.UserDetailsViewImpl_UserDetailsViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.SpanElement header = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button edit = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button delete = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.dom.client.SpanElement name = null;
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement prename = null;
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement email = null;
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement alternativEmail = null;
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement phoneNumber = null;
    java.lang.String domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement isAdmin = null;
    java.lang.String domId8 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement isAccepted = null;
    java.lang.String domId9 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId10 = com.google.gwt.dom.client.Document.get().createUniqueId();
    medizin.client.a_nonroo.app.client.ui.user.EventAccessViewImpl eventAccessView = (medizin.client.a_nonroo.app.client.ui.user.EventAccessViewImpl) GWT.create(medizin.client.a_nonroo.app.client.ui.user.EventAccessViewImpl.class);
    java.lang.String domId11 = com.google.gwt.dom.client.Document.get().createUniqueId();
    medizin.client.a_nonroo.app.client.ui.user.QuestionAccessViewImpl questionAccessView = (medizin.client.a_nonroo.app.client.ui.user.QuestionAccessViewImpl) GWT.create(medizin.client.a_nonroo.app.client.ui.user.QuestionAccessViewImpl.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div class='" + "" + style.boundary() + "" + "'> <table cellpadding='0' cellspacing='0' class='" + "" + style.details() + "" + "'> <tr> <td class='" + "" + style.header() + "" + "'> <span id='" + domId0 + "'></span> </td> <td class='" + "" + style.bar() + "" + "'> <div> <span id='" + domId1 + "'></span> <span id='" + domId2 + "'></span> </div> </td> </tr> <tr> <td colspan='2'> <table class='" + "" + style.fields() + "" + "' id='boundElementHolder'> <tr id='name'> <td> <span class='" + "" + style.label() + "" + "'>Name:</span> </td> <td> <span id='" + domId3 + "'></span> </td> </tr> <tr id='prename'> <td> <span class='" + "" + style.label() + "" + "'>Vorname:</span> </td> <td> <span id='" + domId4 + "'></span> </td> </tr> <tr id='email'> <td> <span class='" + "" + style.label() + "" + "'>Email:</span> </td> <td> <span id='" + domId5 + "'></span> </td> </tr> <tr id='alternativEmail'> <td> <span class='" + "" + style.label() + "" + "'>alternative Email:</span> </td> <td> <span id='" + domId6 + "'></span> </td> </tr> <tr id='phoneNumber'> <td> <span class='" + "" + style.label() + "" + "'>Telefonnummer:</span> </td> <td> <span id='" + domId7 + "'></span> </td> </tr> <tr id='isAdmin'> <td> <span class='" + "" + style.label() + "" + "'>Adminrechte:</span> </td> <td> <span id='" + domId8 + "'></span> </td> </tr> <tr id='isAccepted'> <td> <span class='" + "" + style.label() + "" + "'>Zugang freigeschaltet:</span> </td> <td> <span id='" + domId9 + "'></span> </td> </tr> </table> </td> </tr> </table> <span id='" + domId10 + "'></span> <span id='" + domId11 + "'></span> </div>");

    edit.setHTML("<span class='ui-icon ui-icon-pencil' style='float: left; margin-right: 0.3em;'></span> Person bearbeiten");
    edit.addStyleName("" + style.button() + "");
    delete.setHTML("<span class='ui-icon ui-icon-trash' style='float: left; margin-right: 0.3em;'></span> Person löschen");
    delete.addStyleName("" + style.button() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    header = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    header.removeAttribute("id");
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    name = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    name.removeAttribute("id");
    prename = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    prename.removeAttribute("id");
    email = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    email.removeAttribute("id");
    alternativEmail = com.google.gwt.dom.client.Document.get().getElementById(domId6).cast();
    alternativEmail.removeAttribute("id");
    phoneNumber = com.google.gwt.dom.client.Document.get().getElementById(domId7).cast();
    phoneNumber.removeAttribute("id");
    isAdmin = com.google.gwt.dom.client.Document.get().getElementById(domId8).cast();
    isAdmin.removeAttribute("id");
    isAccepted = com.google.gwt.dom.client.Document.get().getElementById(domId9).cast();
    isAccepted.removeAttribute("id");
    com.google.gwt.user.client.Element domId10Element = com.google.gwt.dom.client.Document.get().getElementById(domId10).cast();
    com.google.gwt.user.client.Element domId11Element = com.google.gwt.dom.client.Document.get().getElementById(domId11).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(edit, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(delete, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(eventAccessView, domId10Element);
    f_HTMLPanel1.addAndReplaceElement(questionAccessView, domId11Element);


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

    owner.alternativEmail = alternativEmail;
    owner.delete = delete;
    owner.edit = edit;
    owner.email = email;
    owner.eventAccessView = eventAccessView;
    owner.header = header;
    owner.isAccepted = isAccepted;
    owner.isAdmin = isAdmin;
    owner.name = name;
    owner.phoneNumber = phoneNumber;
    owner.prename = prename;
    owner.questionAccessView = questionAccessView;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
