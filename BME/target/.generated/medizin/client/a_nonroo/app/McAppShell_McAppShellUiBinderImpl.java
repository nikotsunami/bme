package medizin.client.a_nonroo.app;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class McAppShell_McAppShellUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.McAppShell>, medizin.client.a_nonroo.app.McAppShell.McAppShellUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.McAppShell owner) {

    medizin.client.a_nonroo.app.McAppShell_McAppShellUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.McAppShell_McAppShellUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.McAppShell_McAppShellUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.McAppShell_McAppShellUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.SimplePanel topPanel = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    com.google.gwt.user.client.ui.SimplePanel mcAppNav = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    com.google.gwt.user.client.ui.NotificationMole mole = (com.google.gwt.user.client.ui.NotificationMole) GWT.create(com.google.gwt.user.client.ui.NotificationMole.class);
    com.google.gwt.user.client.ui.SimplePanel masterPanel = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel2 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.SplitLayoutPanel splitPanel = (com.google.gwt.user.client.ui.SplitLayoutPanel) GWT.create(com.google.gwt.user.client.ui.SplitLayoutPanel.class);
    com.google.gwt.user.client.ui.DockLayoutPanel f_DockLayoutPanel1 = new com.google.gwt.user.client.ui.DockLayoutPanel(com.google.gwt.dom.client.Style.Unit.PX);

    f_DockLayoutPanel1.addNorth(topPanel, 96);
    splitPanel.addWest(mcAppNav, 250);
    mole.setMessage("loading...");
    mole.setAnimationDuration(0);
    f_FlowPanel2.add(mole);
    f_FlowPanel2.add(masterPanel);
    splitPanel.add(f_FlowPanel2);
    f_DockLayoutPanel1.add(splitPanel);



    owner.masterPanel = masterPanel;
    owner.mcAppNav = mcAppNav;
    owner.mole = mole;
    owner.topPanel = topPanel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_DockLayoutPanel1;
  }
}
