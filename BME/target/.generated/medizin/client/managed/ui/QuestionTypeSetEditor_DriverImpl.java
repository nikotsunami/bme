package medizin.client.managed.ui;

public class QuestionTypeSetEditor_DriverImpl extends com.google.gwt.requestfactory.client.impl.AbstractRequestFactoryEditorDriver<java.util.List<medizin.client.managed.request.QuestionTypeProxy>, com.google.gwt.editor.client.adapters.ListEditor<medizin.client.managed.request.QuestionTypeProxy, medizin.client.managed.ui.QuestionTypeSetEditor.NameLabel>> implements medizin.client.managed.ui.QuestionTypeSetEditor.Driver {
  protected com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate createDelegate() {
    return new com.google.gwt.editor.client.adapters.ListEditor_medizin_client_managed_request_QuestionTypeProxy_medizin_client_managed_ui_QuestionTypeSetEditor_NameLabel_RequestFactoryEditorDelegate();
  }
  protected void traverseEditors(java.util.List<String> paths) {
    com.google.gwt.editor.client.adapters.ListEditor_medizin_client_managed_request_QuestionTypeProxy_medizin_client_managed_ui_QuestionTypeSetEditor_NameLabel_RequestFactoryEditorDelegate.traverseEditor(getEditor(), "", paths);
  }
}
