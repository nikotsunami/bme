package com.google.gwt.editor.client;

public class LeafValueEditor_java_util_Date_RequestFactoryEditorDelegate extends com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate {
  private com.google.gwt.editor.client.LeafValueEditor editor;
  protected com.google.gwt.editor.client.LeafValueEditor getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(com.google.gwt.editor.client.LeafValueEditor)editor;}
  private java.util.Date object;
  public java.util.Date getObject() {return object;}
  protected void setObject(Object object) {this.object=(java.util.Date)object;}
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
