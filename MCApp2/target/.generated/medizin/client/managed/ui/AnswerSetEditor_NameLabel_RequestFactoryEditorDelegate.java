package medizin.client.managed.ui;

public class AnswerSetEditor_NameLabel_RequestFactoryEditorDelegate extends com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate {
  private medizin.client.managed.ui.AnswerSetEditor.NameLabel editor;
  protected medizin.client.managed.ui.AnswerSetEditor.NameLabel getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(medizin.client.managed.ui.AnswerSetEditor.NameLabel)editor;}
  private medizin.client.managed.request.AnswerProxy object;
  public medizin.client.managed.request.AnswerProxy getObject() {return object;}
  protected void setObject(Object object) {this.object=(medizin.client.managed.request.AnswerProxy)object;}
  protected void attachSubEditors(com.google.gwt.editor.client.impl.DelegateMap delegateMap) {
    if (editor.answerTextEditor.asEditor() != null) {
      if (true) editor.answerTextEditor.asEditor().setValue(getObject().getAnswerText());
      simpleEditors.put("answerText", editor.answerTextEditor.asEditor());
    }
  }
  protected void flushSubEditors(java.util.List errorAccumulator) {
    if (editor.answerTextEditor.asEditor() != null && true) {
      getObject().setAnswerText(editor.answerTextEditor.asEditor().getValue());
    }
  }
  protected void flushSubEditorErrors(java.util.List errorAccumulator) {
  }
  protected void refreshEditors() {
    if (editor.answerTextEditor.asEditor() != null) {
      if (true) editor.answerTextEditor.asEditor().setValue(getObject().getAnswerText());
      else { editor.answerTextEditor.asEditor().setValue(null); }
    }
  }
  protected void traverse(java.util.List paths) {
    traverseEditor(getEditor(), "", paths);
  }
  public static void traverseEditor(medizin.client.managed.ui.AnswerSetEditor.NameLabel editor, String prefix, java.util.List<String> paths) {
  }
}
