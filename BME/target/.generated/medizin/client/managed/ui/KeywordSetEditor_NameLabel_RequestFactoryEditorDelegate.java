package medizin.client.managed.ui;

public class KeywordSetEditor_NameLabel_RequestFactoryEditorDelegate extends com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate {
  private medizin.client.managed.ui.KeywordSetEditor.NameLabel editor;
  protected medizin.client.managed.ui.KeywordSetEditor.NameLabel getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(medizin.client.managed.ui.KeywordSetEditor.NameLabel)editor;}
  private medizin.client.managed.request.KeywordProxy object;
  public medizin.client.managed.request.KeywordProxy getObject() {return object;}
  protected void setObject(Object object) {this.object=(medizin.client.managed.request.KeywordProxy)object;}
  protected void attachSubEditors(com.google.gwt.editor.client.impl.DelegateMap delegateMap) {
    if (editor.nameEditor.asEditor() != null) {
      if (true) editor.nameEditor.asEditor().setValue(getObject().getName());
      simpleEditors.put("name", editor.nameEditor.asEditor());
    }
  }
  protected void flushSubEditors(java.util.List errorAccumulator) {
    if (editor.nameEditor.asEditor() != null && true) {
      getObject().setName(editor.nameEditor.asEditor().getValue());
    }
  }
  protected void flushSubEditorErrors(java.util.List errorAccumulator) {
  }
  protected void refreshEditors() {
    if (editor.nameEditor.asEditor() != null) {
      if (true) editor.nameEditor.asEditor().setValue(getObject().getName());
      else { editor.nameEditor.asEditor().setValue(null); }
    }
  }
  protected void traverse(java.util.List paths) {
    traverseEditor(getEditor(), "", paths);
  }
  public static void traverseEditor(medizin.client.managed.ui.KeywordSetEditor.NameLabel editor, String prefix, java.util.List<String> paths) {
  }
}
