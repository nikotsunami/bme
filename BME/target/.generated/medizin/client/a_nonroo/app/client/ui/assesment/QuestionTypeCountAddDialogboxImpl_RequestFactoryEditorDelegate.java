package medizin.client.a_nonroo.app.client.ui.assesment;

public class QuestionTypeCountAddDialogboxImpl_RequestFactoryEditorDelegate extends com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate {
  private medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountAddDialogboxImpl editor;
  protected medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountAddDialogboxImpl getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountAddDialogboxImpl)editor;}
  private medizin.client.managed.request.QuestionTypeCountPerExamProxy object;
  public medizin.client.managed.request.QuestionTypeCountPerExamProxy getObject() {return object;}
  protected void setObject(Object object) {this.object=(medizin.client.managed.request.QuestionTypeCountPerExamProxy)object;}
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate questionTypesAssignedDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate questionTypeCountDelegate;
  protected void attachSubEditors(com.google.gwt.editor.client.impl.DelegateMap delegateMap) {
    if (editor.questionTypesAssigned != null) {
      questionTypesAssignedDelegate = new medizin.client.managed.ui.QuestionTypeSetEditor_RequestFactoryEditorDelegate();
      questionTypesAssignedDelegate.initialize(eventBus, factory, appendPath("questionTypesAssigned"), getObject().getQuestionTypesAssigned(), editor.questionTypesAssigned, delegateMap, request);
      delegateMap.put(questionTypesAssignedDelegate.getObject(), questionTypesAssignedDelegate);
    }
    if (editor.questionTypeCount.asEditor() != null) {
      questionTypeCountDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_Integer_RequestFactoryEditorDelegate();
      questionTypeCountDelegate.initialize(eventBus, factory, appendPath("questionTypeCount"), getObject().getQuestionTypeCount(), editor.questionTypeCount.asEditor(), delegateMap, request);
      delegateMap.put(questionTypeCountDelegate.getObject(), questionTypeCountDelegate);
    }
  }
  protected void flushSubEditors(java.util.List errorAccumulator) {
    if (editor.questionTypesAssigned != null && true) {
      questionTypesAssignedDelegate.flush(errorAccumulator);
      getObject().setQuestionTypesAssigned((java.util.Set)questionTypesAssignedDelegate.getObject());
    }
    if (editor.questionTypeCount.asEditor() != null && true) {
      questionTypeCountDelegate.flush(errorAccumulator);
      getObject().setQuestionTypeCount((java.lang.Integer)questionTypeCountDelegate.getObject());
    }
  }
  protected void flushSubEditorErrors(java.util.List errorAccumulator) {
    if (questionTypesAssignedDelegate != null) questionTypesAssignedDelegate.flushErrors(errorAccumulator);
    if (questionTypeCountDelegate != null) questionTypeCountDelegate.flushErrors(errorAccumulator);
  }
  protected void refreshEditors() {
    if (questionTypesAssignedDelegate != null) {
      if (true) {
        questionTypesAssignedDelegate.refresh(getObject().getQuestionTypesAssigned());
      } else { questionTypesAssignedDelegate.refresh(null); }
    }
    if (questionTypeCountDelegate != null) {
      if (true) {
        questionTypeCountDelegate.refresh(getObject().getQuestionTypeCount());
      } else { questionTypeCountDelegate.refresh(null); }
    }
  }
  protected void traverse(java.util.List paths) {
    traverseEditor(getEditor(), "", paths);
  }
  public static void traverseEditor(medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountAddDialogboxImpl editor, String prefix, java.util.List<String> paths) {
    if (editor.questionTypesAssigned != null) {
      String localPath = appendPath(prefix, "questionTypesAssigned");
      paths.add(localPath);
      medizin.client.managed.ui.QuestionTypeSetEditor_RequestFactoryEditorDelegate.traverseEditor(editor.questionTypesAssigned, localPath, paths);
    }
    if (editor.questionTypeCount.asEditor() != null) {
      String localPath = appendPath(prefix, "questionTypeCount");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_Integer_RequestFactoryEditorDelegate.traverseEditor(editor.questionTypeCount.asEditor(), localPath, paths);
    }
  }
}
