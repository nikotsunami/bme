package medizin.client.a_nonroo.app.client.ui.assignquestion;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class AssesmentTabPanelImpl_AssesmentTabPanelImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentTabPanelImpl>, medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentTabPanelImpl.AssesmentTabPanelImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentTabPanelImpl owner) {

    medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentTabPanelImpl_AssesmentTabPanelImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentTabPanelImpl_AssesmentTabPanelImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentTabPanelImpl_AssesmentTabPanelImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentTabPanelImpl_AssesmentTabPanelImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label2 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId0 + "'></span>");

    f_Label2.setText("AssesmentTabpanel");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(f_Label2, domId0Element);


    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
