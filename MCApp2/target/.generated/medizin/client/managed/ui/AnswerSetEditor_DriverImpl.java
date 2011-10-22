package medizin.client.managed.ui;

public class AnswerSetEditor_DriverImpl extends com.google.gwt.requestfactory.client.impl.AbstractRequestFactoryEditorDriver<java.util.List<medizin.client.managed.request.AnswerProxy>, com.google.gwt.editor.client.adapters.ListEditor<medizin.client.managed.request.AnswerProxy, medizin.client.managed.ui.AnswerSetEditor.NameLabel>> implements medizin.client.managed.ui.AnswerSetEditor.Driver {
  protected com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate createDelegate() {
    return new com.google.gwt.editor.client.adapters.ListEditor_medizin_client_managed_request_AnswerProxy_medizin_client_managed_ui_AnswerSetEditor_NameLabel_RequestFactoryEditorDelegate();
  }
  protected void traverseEditors(java.util.List<String> paths) {
    com.google.gwt.editor.client.adapters.ListEditor_medizin_client_managed_request_AnswerProxy_medizin_client_managed_ui_AnswerSetEditor_NameLabel_RequestFactoryEditorDelegate.traverseEditor(getEditor(), "", paths);
  }
}
