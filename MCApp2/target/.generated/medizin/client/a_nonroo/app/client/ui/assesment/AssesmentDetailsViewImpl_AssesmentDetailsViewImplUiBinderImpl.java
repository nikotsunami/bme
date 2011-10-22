package medizin.client.a_nonroo.app.client.ui.assesment;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class AssesmentDetailsViewImpl_AssesmentDetailsViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.assesment.AssesmentDetailsViewImpl>, medizin.client.a_nonroo.app.client.ui.assesment.AssesmentDetailsViewImpl.AssesmentDetailsViewImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.assesment.AssesmentDetailsViewImpl owner) {

    medizin.client.a_nonroo.app.client.ui.assesment.AssesmentDetailsViewImpl_AssesmentDetailsViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.assesment.AssesmentDetailsViewImpl_AssesmentDetailsViewImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.assesment.AssesmentDetailsViewImpl_AssesmentDetailsViewImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.assesment.AssesmentDetailsViewImpl_AssesmentDetailsViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.SpanElement name = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement assesmentVersion = null;
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button edit = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button delete = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.dom.client.SpanElement dateOfAssesment = null;
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement mc = null;
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement dateOpen = null;
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement dateClosed = null;
    java.lang.String domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement place = null;
    java.lang.String domId8 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement isClosed = null;
    java.lang.String domId9 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement logo = null;
    java.lang.String domId10 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement repeFor = null;
    java.lang.String domId11 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement percentSameQuestion = null;
    java.lang.String domId12 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId13 = com.google.gwt.dom.client.Document.get().createUniqueId();
    medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountViewImpl questionTypeCountViewImpl = (medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountViewImpl) GWT.create(medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountViewImpl.class);
    java.lang.String domId14 = com.google.gwt.dom.client.Document.get().createUniqueId();
    medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonViewImpl questionSumPerPersonViewImpl = (medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonViewImpl) GWT.create(medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonViewImpl.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div class='" + "" + style.boundary() + "" + "'> <table cellpadding='0' cellspacing='0' class='" + "" + style.details() + "" + "'> <tr> <td class='" + "" + style.header() + "" + "'> <span id='" + domId0 + "'></span> <span>, Version:</span> <span id='" + domId1 + "'></span> </td> <td class='" + "" + style.bar() + "" + "'> <div> <span id='" + domId2 + "'></span> <span id='" + domId3 + "'></span> </div> </td> </tr> <tr> <td colspan='2'> <table class='" + "" + style.fields() + "" + "' id='boundElementHolder' width='100%'> <tr id='dateOfAssesment'> <td style='width: 200px;'> <span class='" + "" + style.label() + "" + "'>Prüfung am:</span> </td> <td style='width: 50%;'> <span id='" + domId4 + "'></span> </td> <td style='width: 200px;'> <span class='" + "" + style.label() + "" + "'>Mc:</span> </td> <td style='width: 50%;'> <span id='" + domId5 + "'></span> </td> </tr> <tr id='dateOpen'> <td> <span class='" + "" + style.label() + "" + "'>Offen ab:</span> </td> <td> <span id='" + domId6 + "'></span> </td> <td> <span class='" + "" + style.label() + "" + "'>Geschlossen ab:</span> </td> <td> <span id='" + domId7 + "'></span> </td> </tr> <tr id='place'> <td> <span class='" + "" + style.label() + "" + "'>Veranstalungsort:</span> </td> <td> <span id='" + domId8 + "'></span> </td> <td> <span class='" + "" + style.label() + "" + "'>Abgeschlossen:</span> </td> <td> <span id='" + domId9 + "'></span> </td> </tr> <tr id='logo'> <td> <span class='" + "" + style.label() + "" + "'>Logo für Titelblatt:</span> </td> <td colspan='3'> <span id='" + domId10 + "'></span> </td> </tr>  <tr id='repeFor'> <td> <span class='" + "" + style.label() + "" + "'>Repeprüfung für:</span> </td> <td> <span id='" + domId11 + "'></span> </td> <td> <span class='" + "" + style.label() + "" + "'>% gleiche Fragen:</span> </td> <td> <span id='" + domId12 + "'></span> </td> </tr> </table> </td> </tr> </table> <span id='" + domId13 + "'></span> <span id='" + domId14 + "'></span> </div>");

    edit.setHTML("<span class='ui-icon ui-icon-pencil' style='float: left; margin-right: 0.3em;'></span> Assement bearbeiten");
    edit.addStyleName("" + style.button() + "");
    delete.setHTML("<span class='ui-icon ui-icon-trash' style='float: left; margin-right: 0.3em;'></span> Assesment löschen");
    delete.addStyleName("" + style.button() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    name = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    name.removeAttribute("id");
    assesmentVersion = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    assesmentVersion.removeAttribute("id");
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    dateOfAssesment = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    dateOfAssesment.removeAttribute("id");
    mc = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    mc.removeAttribute("id");
    dateOpen = com.google.gwt.dom.client.Document.get().getElementById(domId6).cast();
    dateOpen.removeAttribute("id");
    dateClosed = com.google.gwt.dom.client.Document.get().getElementById(domId7).cast();
    dateClosed.removeAttribute("id");
    place = com.google.gwt.dom.client.Document.get().getElementById(domId8).cast();
    place.removeAttribute("id");
    isClosed = com.google.gwt.dom.client.Document.get().getElementById(domId9).cast();
    isClosed.removeAttribute("id");
    logo = com.google.gwt.dom.client.Document.get().getElementById(domId10).cast();
    logo.removeAttribute("id");
    repeFor = com.google.gwt.dom.client.Document.get().getElementById(domId11).cast();
    repeFor.removeAttribute("id");
    percentSameQuestion = com.google.gwt.dom.client.Document.get().getElementById(domId12).cast();
    percentSameQuestion.removeAttribute("id");
    com.google.gwt.user.client.Element domId13Element = com.google.gwt.dom.client.Document.get().getElementById(domId13).cast();
    com.google.gwt.user.client.Element domId14Element = com.google.gwt.dom.client.Document.get().getElementById(domId14).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(edit, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(delete, domId3Element);
    f_HTMLPanel1.addAndReplaceElement(questionTypeCountViewImpl, domId13Element);
    f_HTMLPanel1.addAndReplaceElement(questionSumPerPersonViewImpl, domId14Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onDeleteClicked(event);
      }
    };
    delete.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onEditClicked(event);
      }
    };
    edit.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    owner.assesmentVersion = assesmentVersion;
    owner.dateClosed = dateClosed;
    owner.dateOfAssesment = dateOfAssesment;
    owner.dateOpen = dateOpen;
    owner.delete = delete;
    owner.edit = edit;
    owner.isClosed = isClosed;
    owner.logo = logo;
    owner.mc = mc;
    owner.name = name;
    owner.percentSameQuestion = percentSameQuestion;
    owner.place = place;
    owner.questionSumPerPersonViewImpl = questionSumPerPersonViewImpl;
    owner.questionTypeCountViewImpl = questionTypeCountViewImpl;
    owner.repeFor = repeFor;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
