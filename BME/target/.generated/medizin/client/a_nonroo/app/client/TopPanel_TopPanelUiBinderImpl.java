package medizin.client.a_nonroo.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class TopPanel_TopPanelUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.TopPanel>, medizin.client.a_nonroo.app.client.TopPanel.TopPanelUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.TopPanel owner) {

    medizin.client.a_nonroo.app.client.TopPanel_TopPanelUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.TopPanel_TopPanelUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.TopPanel_TopPanelUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.TopPanel_TopPanelUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox institutionListBox = owner.institutionListBox;
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox loggedUser = owner.loggedUser;
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId1 + "'></span> <span id='" + domId2 + "'></span> <div id='userLoggedIn'></div> <div id='institutionActive'></div>");
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId0 + "'></span>");


    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    attachRecord0.detach();
    f_HTMLPanel2.addAndReplaceElement(institutionListBox, domId1Element);
    f_HTMLPanel2.addAndReplaceElement(loggedUser, domId2Element);
    UiBinderUtil.TempAttachment attachRecord1 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    attachRecord1.detach();
    f_HTMLPanel1.addAndReplaceElement(f_HTMLPanel2, domId0Element);


    final com.google.gwt.event.logical.shared.ValueChangeHandler<medizin.client.managed.request.PersonProxy> handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.logical.shared.ValueChangeHandler<medizin.client.managed.request.PersonProxy>() {
      public void onValueChange(com.google.gwt.event.logical.shared.ValueChangeEvent<medizin.client.managed.request.PersonProxy> event) {
        owner.loginUser(event);
      }
    };
    loggedUser.addValueChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.logical.shared.ValueChangeHandler<medizin.client.managed.request.InstitutionProxy> handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.logical.shared.ValueChangeHandler<medizin.client.managed.request.InstitutionProxy>() {
      public void onValueChange(com.google.gwt.event.logical.shared.ValueChangeEvent<medizin.client.managed.request.InstitutionProxy> event) {
        owner.setInstitution(event);
      }
    };
    institutionListBox.addValueChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
