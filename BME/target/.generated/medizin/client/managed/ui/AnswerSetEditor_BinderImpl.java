package medizin.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class AnswerSetEditor_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.managed.ui.AnswerSetEditor>, medizin.client.managed.ui.AnswerSetEditor.Binder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.managed.ui.AnswerSetEditor owner) {

    medizin.client.managed.ui.AnswerSetEditor_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.managed.ui.AnswerSetEditor_BinderImpl_GenBundle) GWT.create(medizin.client.managed.ui.AnswerSetEditor_BinderImpl_GenBundle.class);
    medizin.client.managed.ui.AnswerSetEditor_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button clickToEdit = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label viewLabel = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.HTMLPanel viewPanel = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId2 + "'></span>");
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox picker = owner.picker;
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button add = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.FlowPanel container = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel editorPanel = new com.google.gwt.user.client.ui.HTMLPanel("Entry to Add: <span id='" + domId4 + "'></span> <span id='" + domId5 + "'></span> <br> <span id='" + domId6 + "'></span>");
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId0 + "'></span> <span id='" + domId1 + "'></span> <span id='" + domId3 + "'></span>");

    clickToEdit.setHTML("Edit");
    add.setHTML("Add");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    UiBinderUtil.TempAttachment attachRecord1 = UiBinderUtil.attachToDom(viewPanel.getElement());
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    attachRecord1.detach();
    viewPanel.addAndReplaceElement(viewLabel, domId2Element);
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    UiBinderUtil.TempAttachment attachRecord2 = UiBinderUtil.attachToDom(editorPanel.getElement());
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    com.google.gwt.user.client.Element domId5Element = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    com.google.gwt.user.client.Element domId6Element = com.google.gwt.dom.client.Document.get().getElementById(domId6).cast();
    attachRecord2.detach();
    editorPanel.addAndReplaceElement(picker, domId4Element);
    editorPanel.addAndReplaceElement(add, domId5Element);
    editorPanel.addAndReplaceElement(container, domId6Element);
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(clickToEdit, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(viewPanel, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(editorPanel, domId3Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.addClicked(event);
      }
    };
    add.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.clickToEditClicked(event);
      }
    };
    clickToEdit.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    owner.add = add;
    owner.clickToEdit = clickToEdit;
    owner.container = container;
    owner.editorPanel = editorPanel;
    owner.style = style;
    owner.viewLabel = viewLabel;
    owner.viewPanel = viewPanel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
