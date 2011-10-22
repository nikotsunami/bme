package medizin.client.a_nonroo.app.client.ui.assesment;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class QuestionSumPerPersonViewImpl_QuestionSumPerPersonViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonViewImpl>, medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonViewImpl.QuestionSumPerPersonViewImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonViewImpl owner) {

    medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonViewImpl_QuestionSumPerPersonViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonViewImpl_QuestionSumPerPersonViewImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonViewImpl_QuestionSumPerPersonViewImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonViewImpl_QuestionSumPerPersonViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button newQuestionSumPerPerson = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.cellview.client.SimplePager f_SimplePager3 = new com.google.gwt.user.cellview.client.SimplePager(com.google.gwt.user.cellview.client.SimplePager.TextLocation.RIGHT);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.cellview.client.CellTable tableQuestionSumPerPerson = (com.google.gwt.user.cellview.client.CellTable) GWT.create(com.google.gwt.user.cellview.client.CellTable.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel("<div style='height:2em;'></div> <table cellpadding='0' cellspacing='0' class='" + "" + style.details() + "" + "'> <tr class='" + "" + style.headerLine() + "" + "'> <td class='" + "" + style.header() + "" + "'> <span id='" + domId0 + "'></span> </td> <td class='" + "" + style.barDetailsList() + "" + "'> <span id='" + domId1 + "'></span> </td> </tr> <tr> <td class='" + "" + style.content() + "" + "' colspan='2'> <div style='height:1em;'></div> <span id='" + domId2 + "'></span> </td> </tr> </table>");
    com.google.gwt.user.client.ui.ScrollPanel f_ScrollPanel1 = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);

    newQuestionSumPerPerson.setHTML("<span class='ui-icon ui-icon-plusthick' style='float: left; margin-right: 0.3em;'></span> neue Fragesummen pro Person erfassen");
    newQuestionSumPerPerson.addStyleName("" + style.buttonDetailsList() + "");
    f_SimplePager3.setDisplay(tableQuestionSumPerPerson);
    tableQuestionSumPerPerson.setWidth("100%");
    tableQuestionSumPerPerson.setPageSize(8);
    f_ScrollPanel1.add(f_HTMLPanel2);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    attachRecord0.detach();
    f_HTMLPanel2.addAndReplaceElement(newQuestionSumPerPerson, domId0Element);
    f_HTMLPanel2.addAndReplaceElement(f_SimplePager3, domId1Element);
    f_HTMLPanel2.addAndReplaceElement(tableQuestionSumPerPerson, domId2Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.addEventClicked(event);
      }
    };
    newQuestionSumPerPerson.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.newQuestionSumPerPerson = newQuestionSumPerPerson;
    owner.tableQuestionSumPerPerson = tableQuestionSumPerPerson;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_ScrollPanel1;
  }
}
