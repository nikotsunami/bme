package medizin.client.a_nonroo.app.client.ui.assignquestion;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class QuestionPanelImpl_QuestionPanelImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionPanelImpl>, medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionPanelImpl.QuestionPanelImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionPanelImpl owner) {

    medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionPanelImpl_QuestionPanelImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionPanelImpl_QuestionPanelImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionPanelImpl_QuestionPanelImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionPanelImpl_QuestionPanelImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.VerticalPanel questionPanel = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId0 + "'></span>");

    questionPanel.setStyleName("" + style.displayPanel() + "");
    f_HTMLPanel1.setStyleName("" + style.maxWidth() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(questionPanel, domId0Element);


    owner.questionPanel = questionPanel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
