package com.google.gwt.user.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.HTMLPanel;

public class NotificationMole_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.HTMLPanel, com.google.gwt.user.client.ui.NotificationMole>, com.google.gwt.user.client.ui.NotificationMole.Binder {

  public com.google.gwt.user.client.ui.HTMLPanel createAndBindUi(final com.google.gwt.user.client.ui.NotificationMole owner) {

    com.google.gwt.user.client.ui.NotificationMole_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.google.gwt.user.client.ui.NotificationMole_BinderImpl_GenBundle) GWT.create(com.google.gwt.user.client.ui.NotificationMole_BinderImpl_GenBundle.class);
    com.google.gwt.user.client.ui.NotificationMole_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.DivElement borderElement = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.DivElement heightMeasure = null;
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement notificationText = null;
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div class='" + "" + style.centered() + "" + "' id='" + domId0 + "' style='display:none'> <div id='" + domId1 + "'> <span class='" + "" + style.notificationText() + "" + "' id='" + domId2 + "'></span> </div> </div>");

    f_HTMLPanel1.setStyleName("" + style.container() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    borderElement = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    borderElement.removeAttribute("id");
    heightMeasure = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    heightMeasure.removeAttribute("id");
    notificationText = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    notificationText.removeAttribute("id");
    attachRecord0.detach();


    owner.borderElement = borderElement;
    owner.heightMeasure = heightMeasure;
    owner.notificationText = notificationText;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
