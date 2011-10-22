package medizin.client.a_nonroo.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class InstitutionViewImpl_InstitutionViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.InstitutionViewImpl>, medizin.client.a_nonroo.app.client.ui.InstitutionViewImpl.InstitutionViewImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.InstitutionViewImpl owner) {

    medizin.client.a_nonroo.app.client.ui.InstitutionViewImpl_InstitutionViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.InstitutionViewImpl_InstitutionViewImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.InstitutionViewImpl_InstitutionViewImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.InstitutionViewImpl_InstitutionViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.cellview.client.CellTable table = (com.google.gwt.user.cellview.client.CellTable) GWT.create(com.google.gwt.user.cellview.client.CellTable.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.cellview.client.SimplePager f_SimplePager3 = new com.google.gwt.user.cellview.client.SimplePager(com.google.gwt.user.cellview.client.SimplePager.TextLocation.RIGHT);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox institutionName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button addInstitution = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel("<div style='height:3em;'></div> <span id='" + domId0 + "'></span> <div class='" + "" + style.controls() + "" + "'> <span id='" + domId1 + "'></span> </div> <div> <span id='" + domId2 + "'></span> <span id='" + domId3 + "'></span> </div>");
    com.google.gwt.user.client.ui.ScrollPanel f_ScrollPanel1 = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
    com.google.gwt.user.client.ui.SimplePanel slidingPanel = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    com.google.gwt.user.client.ui.ScrollPanel f_ScrollPanel4 = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
    com.google.gwt.user.client.ui.SplitLayoutPanel splitLayoutPanel = (com.google.gwt.user.client.ui.SplitLayoutPanel) GWT.create(com.google.gwt.user.client.ui.SplitLayoutPanel.class);

    table.setWidth("100%");
    table.setPageSize(8);
    f_SimplePager3.setDisplay(table);
    addInstitution.setHTML("<span class='ui-icon ui-icon-plusthick' style='float: left; margin-right: 0.3em;'></span> Neue Institution");
    addInstitution.addStyleName("ui-button");
    addInstitution.addStyleName("ui-widget");
    addInstitution.addStyleName("ui-state-default");
    addInstitution.addStyleName("ui-corner-all");
    addInstitution.addStyleName("ui-button-text-only");
    f_HTMLPanel2.setStyleName("" + style.listView() + "");
    f_ScrollPanel1.add(f_HTMLPanel2);
    f_ScrollPanel1.setStyleName("" + style.scroll1() + "");
    splitLayoutPanel.addWest(f_ScrollPanel1, 400);
    f_ScrollPanel4.add(slidingPanel);
    splitLayoutPanel.add(f_ScrollPanel4);
    splitLayoutPanel.setStyleName("" + style.panelHTML() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    attachRecord0.detach();
    f_HTMLPanel2.addAndReplaceElement(table, domId0Element);
    f_HTMLPanel2.addAndReplaceElement(f_SimplePager3, domId1Element);
    f_HTMLPanel2.addAndReplaceElement(institutionName, domId2Element);
    f_HTMLPanel2.addAndReplaceElement(addInstitution, domId3Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.addInstitutionClicked(event);
      }
    };
    addInstitution.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.addInstitution = addInstitution;
    owner.institutionName = institutionName;
    owner.slidingPanel = slidingPanel;
    owner.table = table;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return splitLayoutPanel;
  }
}
