package medizin.client.a_nonroo.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class BookAssesmentViewImpl_BookAssesmentViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.BookAssesmentViewImpl>, medizin.client.a_nonroo.app.client.ui.BookAssesmentViewImpl.BookAssesmentViewImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.BookAssesmentViewImpl owner) {

    medizin.client.a_nonroo.app.client.ui.BookAssesmentViewImpl_BookAssesmentViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.BookAssesmentViewImpl_BookAssesmentViewImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.BookAssesmentViewImpl_BookAssesmentViewImplUiBinderImpl_GenBundle.class);
    com.google.gwt.resources.client.ImageResource createButton = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.createButton();
    medizin.client.a_nonroo.app.client.ui.BookAssesmentViewImpl_BookAssesmentViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.HorizontalPanel tabs = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.SimplePanel content = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);

    f_VerticalPanel1.add(tabs);
    f_VerticalPanel1.add(content);



    owner.content = content;
    owner.tabs = tabs;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_VerticalPanel1;
  }
}
