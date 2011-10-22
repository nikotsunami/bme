package medizin.client.managed.ui;

public class McSetEditor_DriverImpl extends com.google.gwt.requestfactory.client.impl.AbstractRequestFactoryEditorDriver<java.util.List<medizin.client.managed.request.McProxy>, com.google.gwt.editor.client.adapters.ListEditor<medizin.client.managed.request.McProxy, medizin.client.managed.ui.McSetEditor.NameLabel>> implements medizin.client.managed.ui.McSetEditor.Driver {
  protected com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate createDelegate() {
    return new com.google.gwt.editor.client.adapters.ListEditor_medizin_client_managed_request_McProxy_medizin_client_managed_ui_McSetEditor_NameLabel_RequestFactoryEditorDelegate();
  }
  protected void traverseEditors(java.util.List<String> paths) {
    com.google.gwt.editor.client.adapters.ListEditor_medizin_client_managed_request_McProxy_medizin_client_managed_ui_McSetEditor_NameLabel_RequestFactoryEditorDelegate.traverseEditor(getEditor(), "", paths);
  }
}
