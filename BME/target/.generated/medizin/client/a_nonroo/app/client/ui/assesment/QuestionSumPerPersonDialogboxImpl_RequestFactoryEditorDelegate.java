package medizin.client.a_nonroo.app.client.ui.assesment;

public class QuestionSumPerPersonDialogboxImpl_RequestFactoryEditorDelegate extends com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate {
  private medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonDialogboxImpl editor;
  protected medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonDialogboxImpl getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonDialogboxImpl)editor;}
  private medizin.client.managed.request.QuestionSumPerPersonProxy object;
  public medizin.client.managed.request.QuestionSumPerPersonProxy getObject() {return object;}
  protected void setObject(Object object) {this.object=(medizin.client.managed.request.QuestionSumPerPersonProxy)object;}
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate responsiblePersonDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate questionEventDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate questionSumDelegate;
  protected void attachSubEditors(com.google.gwt.editor.client.impl.DelegateMap delegateMap) {
    if (editor.responsiblePerson.asEditor() != null) {
      responsiblePersonDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_medizin_client_managed_request_PersonProxy_RequestFactoryEditorDelegate();
      responsiblePersonDelegate.initialize(eventBus, factory, appendPath("responsiblePerson"), getObject().getResponsiblePerson(), editor.responsiblePerson.asEditor(), delegateMap, request);
      delegateMap.put(responsiblePersonDelegate.getObject(), responsiblePersonDelegate);
    }
    if (editor.questionEvent.asEditor() != null) {
      questionEventDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_medizin_client_managed_request_QuestionEventProxy_RequestFactoryEditorDelegate();
      questionEventDelegate.initialize(eventBus, factory, appendPath("questionEvent"), getObject().getQuestionEvent(), editor.questionEvent.asEditor(), delegateMap, request);
      delegateMap.put(questionEventDelegate.getObject(), questionEventDelegate);
    }
    if (editor.questionSum.asEditor() != null) {
      questionSumDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_Integer_RequestFactoryEditorDelegate();
      questionSumDelegate.initialize(eventBus, factory, appendPath("questionSum"), getObject().getQuestionSum(), editor.questionSum.asEditor(), delegateMap, request);
      delegateMap.put(questionSumDelegate.getObject(), questionSumDelegate);
    }
  }
  protected void flushSubEditors(java.util.List errorAccumulator) {
    if (editor.responsiblePerson.asEditor() != null && true) {
      responsiblePersonDelegate.flush(errorAccumulator);
      getObject().setResponsiblePerson((medizin.client.managed.request.PersonProxy)responsiblePersonDelegate.getObject());
    }
    if (editor.questionEvent.asEditor() != null && true) {
      questionEventDelegate.flush(errorAccumulator);
      getObject().setQuestionEvent((medizin.client.managed.request.QuestionEventProxy)questionEventDelegate.getObject());
    }
    if (editor.questionSum.asEditor() != null && true) {
      questionSumDelegate.flush(errorAccumulator);
      getObject().setQuestionSum((java.lang.Integer)questionSumDelegate.getObject());
    }
  }
  protected void flushSubEditorErrors(java.util.List errorAccumulator) {
    if (responsiblePersonDelegate != null) responsiblePersonDelegate.flushErrors(errorAccumulator);
    if (questionEventDelegate != null) questionEventDelegate.flushErrors(errorAccumulator);
    if (questionSumDelegate != null) questionSumDelegate.flushErrors(errorAccumulator);
  }
  protected void refreshEditors() {
    if (responsiblePersonDelegate != null) {
      if (true) {
        responsiblePersonDelegate.refresh(getObject().getResponsiblePerson());
      } else { responsiblePersonDelegate.refresh(null); }
    }
    if (questionEventDelegate != null) {
      if (true) {
        questionEventDelegate.refresh(getObject().getQuestionEvent());
      } else { questionEventDelegate.refresh(null); }
    }
    if (questionSumDelegate != null) {
      if (true) {
        questionSumDelegate.refresh(getObject().getQuestionSum());
      } else { questionSumDelegate.refresh(null); }
    }
  }
  protected void traverse(java.util.List paths) {
    traverseEditor(getEditor(), "", paths);
  }
  public static void traverseEditor(medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonDialogboxImpl editor, String prefix, java.util.List<String> paths) {
    if (editor.responsiblePerson.asEditor() != null) {
      String localPath = appendPath(prefix, "responsiblePerson");
      paths.add(localPath);
      com.google.gwt.editor.client.adapters.TakesValueEditor_medizin_client_managed_request_PersonProxy_RequestFactoryEditorDelegate.traverseEditor(editor.responsiblePerson.asEditor(), localPath, paths);
    }
    if (editor.questionEvent.asEditor() != null) {
      String localPath = appendPath(prefix, "questionEvent");
      paths.add(localPath);
      com.google.gwt.editor.client.adapters.TakesValueEditor_medizin_client_managed_request_QuestionEventProxy_RequestFactoryEditorDelegate.traverseEditor(editor.questionEvent.asEditor(), localPath, paths);
    }
    if (editor.questionSum.asEditor() != null) {
      String localPath = appendPath(prefix, "questionSum");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_Integer_RequestFactoryEditorDelegate.traverseEditor(editor.questionSum.asEditor(), localPath, paths);
    }
  }
}
