package medizin.client.managed.ui;

public class KeywordSetEditor_DriverImpl extends com.google.gwt.requestfactory.client.impl.AbstractRequestFactoryEditorDriver<java.util.List<medizin.client.managed.request.KeywordProxy>, com.google.gwt.editor.client.adapters.ListEditor<medizin.client.managed.request.KeywordProxy, medizin.client.managed.ui.KeywordSetEditor.NameLabel>> implements medizin.client.managed.ui.KeywordSetEditor.Driver {
  protected com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate createDelegate() {
    return new com.google.gwt.editor.client.adapters.ListEditor_medizin_client_managed_request_KeywordProxy_medizin_client_managed_ui_KeywordSetEditor_NameLabel_RequestFactoryEditorDelegate();
  }
  protected void traverseEditors(java.util.List<String> paths) {
    com.google.gwt.editor.client.adapters.ListEditor_medizin_client_managed_request_KeywordProxy_medizin_client_managed_ui_KeywordSetEditor_NameLabel_RequestFactoryEditorDelegate.traverseEditor(getEditor(), "", paths);
  }
}
