package medizin.client.a_nonroo.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class StaticContentViewImpl_StaticContentViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.StaticContentViewImpl>, medizin.client.a_nonroo.app.client.ui.StaticContentViewImpl.StaticContentViewImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.StaticContentViewImpl owner) {

    medizin.client.a_nonroo.app.client.ui.StaticContentViewImpl_StaticContentViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.StaticContentViewImpl_StaticContentViewImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.StaticContentViewImpl_StaticContentViewImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.StaticContentViewImpl_StaticContentViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.Label f_Label1 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    medizin.client.a_nonroo.app.client.SlidingPanel slidingPanel = (medizin.client.a_nonroo.app.client.SlidingPanel) GWT.create(medizin.client.a_nonroo.app.client.SlidingPanel.class);

    f_Label1.setText("Static content");
    slidingPanel.add(f_Label1);
    slidingPanel.setStyleName("" + style.panelHTML() + "");



    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return slidingPanel;
  }
}
