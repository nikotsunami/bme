package com.google.gwt.editor.client.adapters;

public class ListEditor_medizin_client_managed_request_KeywordProxy_medizin_client_managed_ui_KeywordSetEditor_NameLabel_RequestFactoryEditorDelegate extends com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate {
  private com.google.gwt.editor.client.adapters.ListEditor editor;
  protected com.google.gwt.editor.client.adapters.ListEditor getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(com.google.gwt.editor.client.adapters.ListEditor)editor;}
  private java.util.List object;
  public java.util.List getObject() {return object;}
  protected void setObject(Object object) {this.object=(java.util.List)object;}
  protected com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate createComposedDelegate() {
    return new medizin.client.managed.ui.KeywordSetEditor_NameLabel_RequestFactoryEditorDelegate();
  }
  protected void attachSubEditors(com.google.gwt.editor.client.impl.DelegateMap delegateMap) {
  }
  protected void flushSubEditors(java.util.List errorAccumulator) {
  }
  protected void flushSubEditorErrors(java.util.List errorAccumulator) {
  }
  protected void refreshEditors() {
  }
  protected void traverse(java.util.List paths) {
    traverseEditor(getEditor(), "", paths);
  }
  public static void traverseEditor(com.google.gwt.editor.client.adapters.ListEditor editor, String prefix, java.util.List<String> paths) {
  }
}
