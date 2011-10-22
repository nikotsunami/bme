package medizin.client.a_nonroo.app.client.ui.question;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class QuestionViewImpl_QuestionViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.question.QuestionViewImpl>, medizin.client.a_nonroo.app.client.ui.question.QuestionViewImpl.QuestionViewImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.question.QuestionViewImpl owner) {

    medizin.client.a_nonroo.app.client.ui.question.QuestionViewImpl_QuestionViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.question.QuestionViewImpl_QuestionViewImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.question.QuestionViewImpl_QuestionViewImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.question.QuestionViewImpl_QuestionViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.cellview.client.CellTable table = (com.google.gwt.user.cellview.client.CellTable) GWT.create(com.google.gwt.user.cellview.client.CellTable.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button newButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.cellview.client.SimplePager f_SimplePager3 = new com.google.gwt.user.cellview.client.SimplePager(com.google.gwt.user.cellview.client.SimplePager.TextLocation.RIGHT);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel("<div style='height:3em;'></div> <span id='" + domId0 + "'></span> <div class='" + "" + style.controls() + "" + "'> <div> <span id='" + domId1 + "'></span> </div> <span id='" + domId2 + "'></span> </div>");
    com.google.gwt.user.client.ui.ScrollPanel f_ScrollPanel1 = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
    com.google.gwt.user.client.ui.SimplePanel detailsPanel = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    com.google.gwt.user.client.ui.ScrollPanel f_ScrollPanel4 = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
    com.google.gwt.user.client.ui.SplitLayoutPanel splitLayoutPanel = (com.google.gwt.user.client.ui.SplitLayoutPanel) GWT.create(com.google.gwt.user.client.ui.SplitLayoutPanel.class);

    table.setWidth("100%");
    table.setPageSize(8);
    newButton.setHTML("<span class='ui-icon ui-icon-plusthick' style='float: left; margin-right: 0.3em;'></span>neuer frage erstellen");
    newButton.addStyleName("ui-button");
    newButton.addStyleName("ui-widget");
    newButton.addStyleName("ui-state-default");
    newButton.addStyleName("ui-corner-all");
    newButton.addStyleName("ui-button-text-only");
    f_SimplePager3.setDisplay(table);
    f_HTMLPanel2.setStyleName("" + style.listView() + "");
    f_ScrollPanel1.add(f_HTMLPanel2);
    splitLayoutPanel.addWest(f_ScrollPanel1, 600);
    f_ScrollPanel4.add(detailsPanel);
    splitLayoutPanel.add(f_ScrollPanel4);
    splitLayoutPanel.setStyleName("" + style.panelHTML() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    attachRecord0.detach();
    f_HTMLPanel2.addAndReplaceElement(table, domId0Element);
    f_HTMLPanel2.addAndReplaceElement(newButton, domId1Element);
    f_HTMLPanel2.addAndReplaceElement(f_SimplePager3, domId2Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.newButtonClicked(event);
      }
    };
    newButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.detailsPanel = detailsPanel;
    owner.newButton = newButton;
    owner.splitLayoutPanel = splitLayoutPanel;
    owner.table = table;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return splitLayoutPanel;
  }
}
