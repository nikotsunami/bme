package medizin.client.a_nonroo.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class QuestiontypesDetailsViewImpl_UserDetailsViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.QuestiontypesDetailsViewImpl>, medizin.client.a_nonroo.app.client.ui.QuestiontypesDetailsViewImpl.UserDetailsViewImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.QuestiontypesDetailsViewImpl owner) {

    medizin.client.a_nonroo.app.client.ui.QuestiontypesDetailsViewImpl_UserDetailsViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.QuestiontypesDetailsViewImpl_UserDetailsViewImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.QuestiontypesDetailsViewImpl_UserDetailsViewImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.QuestiontypesDetailsViewImpl_UserDetailsViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.SpanElement questionTypeName = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button edit = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button delete = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.dom.client.SpanElement isWeil = null;
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement trueAnswers = null;
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement falseAnswers = null;
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement sumAnswers = null;
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement maxLetters = null;
    java.lang.String domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div class='" + "" + style.boundary() + "" + "'> <table cellpadding='0' cellspacing='0' class='" + "" + style.details() + "" + "'> <tr> <td class='" + "" + style.header() + "" + "'> <span>Fragetyp Name:</span> <span id='" + domId0 + "'></span> </td> <td class='" + "" + style.bar() + "" + "'> <div> <span id='" + domId1 + "'></span> <span id='" + domId2 + "'></span> </div> </td> </tr> <tr> <td colspan='2'> <table class='" + "" + style.fields() + "" + "' id='boundElementHolder'> <tr id='isWeil'> <td> <span class='" + "" + style.label() + "" + "'>Ist eine Weil-Frage:</span> </td> <td> <span id='" + domId3 + "'></span> </td> </tr> <tr id='trueAnswers'> <td> <span class='" + "" + style.label() + "" + "'>Anzahl wahre Antworten:</span> </td> <td> <span id='" + domId4 + "'></span> </td> </tr> <tr id='falseAnswers'> <td> <span class='" + "" + style.label() + "" + "'>Anzahl falsche Antworten:</span> </td> <td> <span id='" + domId5 + "'></span> </td> </tr> <tr id='sumAnswers'> <td> <span class='" + "" + style.label() + "" + "'>Summe der Antworten:</span> </td> <td> <span id='" + domId6 + "'></span> </td> </tr> <tr id='maxLetters'> <td> <span class='" + "" + style.label() + "" + "'>Maximale Anzahl Buchstaben:</span> </td> <td> <span id='" + domId7 + "'></span> </td> </tr> </table> </td> </tr> </table> </div>");

    edit.setHTML("<span class='ui-icon ui-icon-pencil' style='float: left; margin-right: 0.3em;'></span> Fragetyp bearbeiten");
    edit.addStyleName("" + style.button() + "");
    delete.setHTML("<span class='ui-icon ui-icon-trash' style='float: left; margin-right: 0.3em;'></span> Fragetyp löschen");
    delete.addStyleName("" + style.button() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    questionTypeName = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    questionTypeName.removeAttribute("id");
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    isWeil = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    isWeil.removeAttribute("id");
    trueAnswers = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    trueAnswers.removeAttribute("id");
    falseAnswers = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    falseAnswers.removeAttribute("id");
    sumAnswers = com.google.gwt.dom.client.Document.get().getElementById(domId6).cast();
    sumAnswers.removeAttribute("id");
    maxLetters = com.google.gwt.dom.client.Document.get().getElementById(domId7).cast();
    maxLetters.removeAttribute("id");
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(edit, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(delete, domId2Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onEditClicked(event);
      }
    };
    edit.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onDeleteClicked(event);
      }
    };
    delete.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    owner.edit = edit;
    owner.falseAnswers = falseAnswers;
    owner.isWeil = isWeil;
    owner.maxLetters = maxLetters;
    owner.questionTypeName = questionTypeName;
    owner.sumAnswers = sumAnswers;
    owner.trueAnswers = trueAnswers;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
