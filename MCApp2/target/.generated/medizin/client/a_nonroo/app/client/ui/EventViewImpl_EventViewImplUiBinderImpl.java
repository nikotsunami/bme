package medizin.client.a_nonroo.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class EventViewImpl_EventViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.EventViewImpl>, medizin.client.a_nonroo.app.client.ui.EventViewImpl.EventViewImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.EventViewImpl owner) {

    medizin.client.a_nonroo.app.client.ui.EventViewImpl_EventViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.EventViewImpl_EventViewImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.EventViewImpl_EventViewImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.EventViewImpl_EventViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.cellview.client.CellTable tableEvent = (com.google.gwt.user.cellview.client.CellTable) GWT.create(com.google.gwt.user.cellview.client.CellTable.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.cellview.client.SimplePager f_SimplePager3 = new com.google.gwt.user.cellview.client.SimplePager(com.google.gwt.user.cellview.client.SimplePager.TextLocation.RIGHT);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox eventName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button addEvent = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel("<div style='height:3em;'></div> <span id='" + domId0 + "'></span> <div class='" + "" + style.controls() + "" + "'> <span id='" + domId1 + "'></span> </div> <div> <span id='" + domId2 + "'></span> <span id='" + domId3 + "'></span> </div>");
    com.google.gwt.user.client.ui.ScrollPanel f_ScrollPanel1 = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);

    tableEvent.setWidth("100%");
    tableEvent.setPageSize(8);
    f_SimplePager3.setDisplay(tableEvent);
    addEvent.setHTML("<span class='ui-icon ui-icon-plusthick' style='float: left; margin-right: 0.3em;'></span> neuer Themenblock");
    addEvent.addStyleName("ui-button");
    addEvent.addStyleName("ui-widget");
    addEvent.addStyleName("ui-state-default");
    addEvent.addStyleName("ui-corner-all");
    addEvent.addStyleName("ui-button-text-only");
    f_HTMLPanel2.setStyleName("" + style.panelHTML() + "");
    f_ScrollPanel1.add(f_HTMLPanel2);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    attachRecord0.detach();
    f_HTMLPanel2.addAndReplaceElement(tableEvent, domId0Element);
    f_HTMLPanel2.addAndReplaceElement(f_SimplePager3, domId1Element);
    f_HTMLPanel2.addAndReplaceElement(eventName, domId2Element);
    f_HTMLPanel2.addAndReplaceElement(addEvent, domId3Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.addEventClicked(event);
      }
    };
    addEvent.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.addEvent = addEvent;
    owner.eventName = eventName;
    owner.tableEvent = tableEvent;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_ScrollPanel1;
  }
}
