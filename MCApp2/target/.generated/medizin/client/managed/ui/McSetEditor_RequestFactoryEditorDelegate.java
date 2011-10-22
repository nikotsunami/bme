package medizin.client.managed.ui;

public class McSetEditor_RequestFactoryEditorDelegate extends com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate {
  private medizin.client.managed.ui.McSetEditor editor;
  protected medizin.client.managed.ui.McSetEditor getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(medizin.client.managed.ui.McSetEditor)editor;}
  private java.util.Set object;
  public java.util.Set getObject() {return object;}
  protected void setObject(Object object) {this.object=(java.util.Set)object;}
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
  public static void traverseEditor(medizin.client.managed.ui.McSetEditor editor, String prefix, java.util.List<String> paths) {
  }
}
