package medizin.client.managed.ui;

public class QuestionTypeSetEditor_NameLabel_RequestFactoryEditorDelegate extends com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate {
  private medizin.client.managed.ui.QuestionTypeSetEditor.NameLabel editor;
  protected medizin.client.managed.ui.QuestionTypeSetEditor.NameLabel getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(medizin.client.managed.ui.QuestionTypeSetEditor.NameLabel)editor;}
  private medizin.client.managed.request.QuestionTypeProxy object;
  public medizin.client.managed.request.QuestionTypeProxy getObject() {return object;}
  protected void setObject(Object object) {this.object=(medizin.client.managed.request.QuestionTypeProxy)object;}
  protected void attachSubEditors(com.google.gwt.editor.client.impl.DelegateMap delegateMap) {
    if (editor.questionTypeNameEditor.asEditor() != null) {
      if (true) editor.questionTypeNameEditor.asEditor().setValue(getObject().getQuestionTypeName());
      simpleEditors.put("questionTypeName", editor.questionTypeNameEditor.asEditor());
    }
  }
  protected void flushSubEditors(java.util.List errorAccumulator) {
    if (editor.questionTypeNameEditor.asEditor() != null && true) {
      getObject().setQuestionTypeName(editor.questionTypeNameEditor.asEditor().getValue());
    }
  }
  protected void flushSubEditorErrors(java.util.List errorAccumulator) {
  }
  protected void refreshEditors() {
    if (editor.questionTypeNameEditor.asEditor() != null) {
      if (true) editor.questionTypeNameEditor.asEditor().setValue(getObject().getQuestionTypeName());
      else { editor.questionTypeNameEditor.asEditor().setValue(null); }
    }
  }
  protected void traverse(java.util.List paths) {
    traverseEditor(getEditor(), "", paths);
  }
  public static void traverseEditor(medizin.client.managed.ui.QuestionTypeSetEditor.NameLabel editor, String prefix, java.util.List<String> paths) {
  }
}
