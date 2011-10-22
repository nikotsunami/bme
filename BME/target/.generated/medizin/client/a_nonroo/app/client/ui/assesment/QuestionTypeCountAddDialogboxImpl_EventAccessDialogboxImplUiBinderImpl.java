package medizin.client.a_nonroo.app.client.ui.assesment;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class QuestionTypeCountAddDialogboxImpl_EventAccessDialogboxImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountAddDialogboxImpl>, medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountAddDialogboxImpl.EventAccessDialogboxImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountAddDialogboxImpl owner) {

    medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountAddDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountAddDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountAddDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountAddDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    medizin.client.managed.ui.QuestionTypeSetEditor questionTypesAssigned = (medizin.client.managed.ui.QuestionTypeSetEditor) GWT.create(medizin.client.managed.ui.QuestionTypeSetEditor.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.IntegerBox questionTypeCount = (com.google.gwt.user.client.ui.IntegerBox) GWT.create(com.google.gwt.user.client.ui.IntegerBox.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button save = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button closeButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<table class='" + "" + style.fields() + "" + "' id='boundElementHolder'> <tr id='questionTypesAssigned'> <td> <div class='" + "" + style.label() + "" + "'>Question Types Assigned:</div> </td> <td> <span id='" + domId0 + "'></span> </td> </tr> <tr id='questionTypeCount'> <td> <div class='" + "" + style.label() + "" + "'>Question Type Count:</div> </td> <td> <span id='" + domId1 + "'></span> </td> </tr> </table> <div class='" + "" + style.bar() + "" + "'> <span id='" + domId2 + "'></span> <span id='" + domId3 + "'></span> </div>");

    save.setHTML("Speichern");
    save.addStyleName("" + style.button() + "");
    closeButton.setHTML("Abbrechen");
    closeButton.addStyleName("" + style.button() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(questionTypesAssigned, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(questionTypeCount, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(save, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(closeButton, domId3Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onCloseButtonClick(event);
      }
    };
    closeButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onSave(event);
      }
    };
    save.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    owner.closeButton = closeButton;
    owner.questionTypeCount = questionTypeCount;
    owner.questionTypesAssigned = questionTypesAssigned;
    owner.save = save;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
