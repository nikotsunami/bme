package com.google.gwt.editor.client;

public class LeafValueEditor_java_lang_Boolean_RequestFactoryEditorDelegate extends com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate {
  private com.google.gwt.editor.client.LeafValueEditor editor;
  protected com.google.gwt.editor.client.LeafValueEditor getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(com.google.gwt.editor.client.LeafValueEditor)editor;}
  private java.lang.Boolean object;
  public java.lang.Boolean getObject() {return object;}
  protected void setObject(Object object) {this.object=(java.lang.Boolean)object;}
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
  public static void traverseEditor(com.google.gwt.editor.client.LeafValueEditor editor, String prefix, java.util.List<String> paths) {
  }
}
