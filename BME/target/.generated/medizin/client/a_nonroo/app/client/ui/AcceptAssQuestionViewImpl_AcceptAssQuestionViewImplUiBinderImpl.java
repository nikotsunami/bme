package medizin.client.a_nonroo.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class AcceptAssQuestionViewImpl_AcceptAssQuestionViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.AcceptAssQuestionViewImpl>, medizin.client.a_nonroo.app.client.ui.AcceptAssQuestionViewImpl.AcceptAssQuestionViewImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.AcceptAssQuestionViewImpl owner) {

    medizin.client.a_nonroo.app.client.ui.AcceptAssQuestionViewImpl_AcceptAssQuestionViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.AcceptAssQuestionViewImpl_AcceptAssQuestionViewImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.AcceptAssQuestionViewImpl_AcceptAssQuestionViewImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.AcceptAssQuestionViewImpl_AcceptAssQuestionViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.Label f_Label1 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    medizin.client.a_nonroo.app.client.SlidingPanel slidingPanel = (medizin.client.a_nonroo.app.client.SlidingPanel) GWT.create(medizin.client.a_nonroo.app.client.SlidingPanel.class);

    f_Label1.setText("Accept Ass Question");
    slidingPanel.add(f_Label1);
    slidingPanel.setStyleName("" + style.panelHTML() + "");



    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return slidingPanel;
  }
}
