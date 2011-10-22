package medizin.client.a_nonroo.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class McAppNav_McAppNavAdminUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.McAppNav>, medizin.client.a_nonroo.app.client.McAppNav.McAppNavAdminUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.McAppNav owner) {

    medizin.client.a_nonroo.app.client.McAppNav_McAppNavAdminUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.McAppNav_McAppNavAdminUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.McAppNav_McAppNavAdminUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.McAppNav_McAppNavAdminUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Anchor systemOverview = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.Anchor acceptPerson = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.Anchor acceptQuestion = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.Anchor acceptAnswer = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.Anchor acceptAssQuestion = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.Anchor openDemand = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel2 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
    com.google.gwt.user.client.ui.DisclosurePanel systemOweviewPanel = new com.google.gwt.user.client.ui.DisclosurePanel("Systemübersicht und Freischaltungen");
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Anchor user = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel3 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
    com.google.gwt.user.client.ui.DisclosurePanel managementPanel = new com.google.gwt.user.client.ui.DisclosurePanel("Benutzerverwaltung");
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Anchor question = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.Anchor questionType = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.Anchor institution = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel4 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
    com.google.gwt.user.client.ui.DisclosurePanel questionPanel = new com.google.gwt.user.client.ui.DisclosurePanel("Fragenverwaltung");
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Anchor assesment = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.Anchor asignAssQuestion = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.Anchor bookAssesment = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.Anchor staticContent = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel5 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
    com.google.gwt.user.client.ui.DisclosurePanel assementPanel = new com.google.gwt.user.client.ui.DisclosurePanel("Prüfungen verwalten");
    com.google.gwt.dom.client.DivElement deletethis = null;
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId0 + "'></span> <span id='" + domId1 + "'></span> <span id='" + domId2 + "'></span> <span id='" + domId3 + "'></span> <div id='" + domId4 + "'></div>");

    systemOverview.setHTML("Systemübersicht");
    f_VerticalPanel2.add(systemOverview);
    acceptPerson.setHTML("Personen akzeptieren");
    f_VerticalPanel2.add(acceptPerson);
    acceptQuestion.setHTML("Fragen akzeptieren");
    f_VerticalPanel2.add(acceptQuestion);
    acceptAnswer.setHTML("Antworten akzeptieren");
    f_VerticalPanel2.add(acceptAnswer);
    acceptAssQuestion.setHTML("Prüfungsfragen akzeptieren");
    f_VerticalPanel2.add(acceptAssQuestion);
    openDemand.setHTML("Offene Anfragen");
    f_VerticalPanel2.add(openDemand);
    systemOweviewPanel.add(f_VerticalPanel2);
    user.setHTML("Benutzer und Berechtigungen");
    f_VerticalPanel3.add(user);
    managementPanel.add(f_VerticalPanel3);
    question.setHTML("Fragen");
    f_VerticalPanel4.add(question);
    questionType.setHTML("Fragentypen");
    f_VerticalPanel4.add(questionType);
    institution.setHTML("Institutionen und Themenstrukturen");
    f_VerticalPanel4.add(institution);
    questionPanel.add(f_VerticalPanel4);
    assesment.setHTML("Prüfungen");
    f_VerticalPanel5.add(assesment);
    asignAssQuestion.setHTML("Prüfungsfragen zu Prüfung");
    f_VerticalPanel5.add(asignAssQuestion);
    bookAssesment.setHTML("Prüfungsheft");
    f_VerticalPanel5.add(bookAssesment);
    staticContent.setHTML("Statische Inhalte");
    f_VerticalPanel5.add(staticContent);
    assementPanel.add(f_VerticalPanel5);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    deletethis = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    deletethis.removeAttribute("id");
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(systemOweviewPanel, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(managementPanel, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(questionPanel, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(assementPanel, domId3Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.systemOverviewClicked(event);
      }
    };
    systemOverview.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.acceptPersonClicked(event);
      }
    };
    acceptPerson.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.acceptQuestionClicked(event);
      }
    };
    acceptQuestion.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.PlaceAcceptAnswerClicked(event);
      }
    };
    acceptAnswer.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.acceptAssQuestionClicked(event);
      }
    };
    acceptAssQuestion.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.openDemandClicked(event);
      }
    };
    openDemand.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.userClicked(event);
      }
    };
    user.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames8 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.questionClicked(event);
      }
    };
    question.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames8);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames9 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.questionTypeClicked(event);
      }
    };
    questionType.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames9);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames10 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.institutionClicked(event);
      }
    };
    institution.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames10);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames11 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.assesmentClicked(event);
      }
    };
    assesment.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames11);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames12 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.asignAssQuestionClicked(event);
      }
    };
    asignAssQuestion.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames12);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames13 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.bookAssesmentClicked(event);
      }
    };
    bookAssesment.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames13);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames14 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.staticContentClicked(event);
      }
    };
    staticContent.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames14);

    owner.acceptAnswer = acceptAnswer;
    owner.acceptAssQuestion = acceptAssQuestion;
    owner.acceptPerson = acceptPerson;
    owner.acceptQuestion = acceptQuestion;
    owner.asignAssQuestion = asignAssQuestion;
    owner.assementPanel = assementPanel;
    owner.assesment = assesment;
    owner.bookAssesment = bookAssesment;
    owner.deletethis = deletethis;
    owner.institution = institution;
    owner.managementPanel = managementPanel;
    owner.openDemand = openDemand;
    owner.question = question;
    owner.questionPanel = questionPanel;
    owner.questionType = questionType;
    owner.staticContent = staticContent;
    owner.systemOverview = systemOverview;
    owner.systemOweviewPanel = systemOweviewPanel;
    owner.user = user;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
