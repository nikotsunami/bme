package medizin.client.managed.ui;

public class McSetEditor_NameLabel_RequestFactoryEditorDelegate extends com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate {
  private medizin.client.managed.ui.McSetEditor.NameLabel editor;
  protected medizin.client.managed.ui.McSetEditor.NameLabel getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(medizin.client.managed.ui.McSetEditor.NameLabel)editor;}
  private medizin.client.managed.request.McProxy object;
  public medizin.client.managed.request.McProxy getObject() {return object;}
  protected void setObject(Object object) {this.object=(medizin.client.managed.request.McProxy)object;}
  protected void attachSubEditors(com.google.gwt.editor.client.impl.DelegateMap delegateMap) {
    if (editor.mcNameEditor.asEditor() != null) {
      if (true) editor.mcNameEditor.asEditor().setValue(getObject().getMcName());
      simpleEditors.put("mcName", editor.mcNameEditor.asEditor());
    }
  }
  protected void flushSubEditors(java.util.List errorAccumulator) {
    if (editor.mcNameEditor.asEditor() != null && true) {
      getObject().setMcName(editor.mcNameEditor.asEditor().getValue());
    }
  }
  protected void flushSubEditorErrors(java.util.List errorAccumulator) {
  }
  protected void refreshEditors() {
    if (editor.mcNameEditor.asEditor() != null) {
      if (true) editor.mcNameEditor.asEditor().setValue(getObject().getMcName());
      else { editor.mcNameEditor.asEditor().setValue(null); }
    }
  }
  protected void traverse(java.util.List paths) {
    traverseEditor(getEditor(), "", paths);
  }
  public static void traverseEditor(medizin.client.managed.ui.McSetEditor.NameLabel editor, String prefix, java.util.List<String> paths) {
  }
}
