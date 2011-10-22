package medizin.client.a_nonroo.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class AcceptAnswerSubViewImpl_AcceptAnswerViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.AcceptAnswerSubViewImpl>, medizin.client.a_nonroo.app.client.ui.AcceptAnswerSubViewImpl.AcceptAnswerViewImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.AcceptAnswerSubViewImpl owner) {

    medizin.client.a_nonroo.app.client.ui.AcceptAnswerSubViewImpl_AcceptAnswerViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.AcceptAnswerSubViewImpl_AcceptAnswerViewImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.AcceptAnswerSubViewImpl_AcceptAnswerViewImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.AcceptAnswerSubViewImpl_AcceptAnswerViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.DivElement questionText = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.cellview.client.SimplePager f_SimplePager3 = new com.google.gwt.user.cellview.client.SimplePager(com.google.gwt.user.cellview.client.SimplePager.TextLocation.RIGHT);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.cellview.client.CellTable table = (com.google.gwt.user.cellview.client.CellTable) GWT.create(com.google.gwt.user.cellview.client.CellTable.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel("<div style='height:2em;'></div> <div class='" + "" + style.controls() + "" + "'> <span id='" + domId2 + "'></span> </div> <span id='" + domId3 + "'></span>");
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div class='" + "" + style.bar() + "" + "' id='" + domId0 + "'></div> <span id='" + domId1 + "'></span>");

    f_SimplePager3.setDisplay(table);
    table.setWidth("100%");
    table.setPageSize(8);
    f_HTMLPanel2.setStyleName("" + style.details() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    questionText = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    questionText.removeAttribute("id");
    UiBinderUtil.TempAttachment attachRecord1 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    attachRecord1.detach();
    f_HTMLPanel2.addAndReplaceElement(f_SimplePager3, domId2Element);
    f_HTMLPanel2.addAndReplaceElement(table, domId3Element);
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(f_HTMLPanel2, domId1Element);


    owner.questionText = questionText;
    owner.table = table;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
