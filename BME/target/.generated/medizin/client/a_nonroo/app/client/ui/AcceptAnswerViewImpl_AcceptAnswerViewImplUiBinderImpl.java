package medizin.client.a_nonroo.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class AcceptAnswerViewImpl_AcceptAnswerViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.AcceptAnswerViewImpl>, medizin.client.a_nonroo.app.client.ui.AcceptAnswerViewImpl.AcceptAnswerViewImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.AcceptAnswerViewImpl owner) {

    medizin.client.a_nonroo.app.client.ui.AcceptAnswerViewImpl_AcceptAnswerViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.AcceptAnswerViewImpl_AcceptAnswerViewImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.AcceptAnswerViewImpl_AcceptAnswerViewImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.AcceptAnswerViewImpl_AcceptAnswerViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel("Keine Antworten zu akzeptieren");
    com.google.gwt.user.client.ui.VerticalPanel questionPanel = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId0 + "'></span>");

    questionPanel.add(f_HTMLPanel2);
    questionPanel.setStyleName("" + style.fullWidth() + "");
    questionPanel.setSpacing(15);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(questionPanel, domId0Element);


    owner.questionPanel = questionPanel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
