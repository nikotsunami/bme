package com.google.gwt.editor.ui.client.adapters;

public class ValueBoxEditor_java_lang_Integer_RequestFactoryEditorDelegate extends com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate {
  private com.google.gwt.editor.ui.client.adapters.ValueBoxEditor editor;
  protected com.google.gwt.editor.ui.client.adapters.ValueBoxEditor getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(com.google.gwt.editor.ui.client.adapters.ValueBoxEditor)editor;}
  private java.lang.Integer object;
  public java.lang.Integer getObject() {return object;}
  protected void setObject(Object object) {this.object=(java.lang.Integer)object;}
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
  public static void traverseEditor(com.google.gwt.editor.ui.client.adapters.ValueBoxEditor editor, String prefix, java.util.List<String> paths) {
  }
}
