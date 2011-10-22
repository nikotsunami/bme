package medizin.client.a_nonroo.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class SystemOverviewViewImpl_SystemOverviewViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.SystemOverviewViewImpl>, medizin.client.a_nonroo.app.client.ui.SystemOverviewViewImpl.SystemOverviewViewImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.SystemOverviewViewImpl owner) {

    medizin.client.a_nonroo.app.client.ui.SystemOverviewViewImpl_SystemOverviewViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.SystemOverviewViewImpl_SystemOverviewViewImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.SystemOverviewViewImpl_SystemOverviewViewImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.SystemOverviewViewImpl_SystemOverviewViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.Button myButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    medizin.client.a_nonroo.app.client.SlidingPanel slidingPanel = (medizin.client.a_nonroo.app.client.SlidingPanel) GWT.create(medizin.client.a_nonroo.app.client.SlidingPanel.class);

    slidingPanel.add(myButton);
    slidingPanel.setStyleName("" + style.panelHTML() + "");



    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.buttonClicked(event);
      }
    };
    myButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.myButton = myButton;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return slidingPanel;
  }
}
