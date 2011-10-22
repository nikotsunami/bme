package medizin.client.a_nonroo.app.client.ui;

public class QuestiontypesEditViewImpl_RequestFactoryEditorDelegate extends com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate {
  private medizin.client.a_nonroo.app.client.ui.QuestiontypesEditViewImpl editor;
  protected medizin.client.a_nonroo.app.client.ui.QuestiontypesEditViewImpl getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(medizin.client.a_nonroo.app.client.ui.QuestiontypesEditViewImpl)editor;}
  private medizin.client.managed.request.QuestionTypeProxy object;
  public medizin.client.managed.request.QuestionTypeProxy getObject() {return object;}
  protected void setObject(Object object) {this.object=(medizin.client.managed.request.QuestionTypeProxy)object;}
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate questionTypeNameDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate trueAnswersDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate falseAnswersDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate sumAnswersDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate maxLettersDelegate;
  protected void attachSubEditors(com.google.gwt.editor.client.impl.DelegateMap delegateMap) {
    if (editor.questionTypeName.asEditor() != null) {
      questionTypeNameDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate();
      questionTypeNameDelegate.initialize(eventBus, factory, appendPath("questionTypeName"), getObject().getQuestionTypeName(), editor.questionTypeName.asEditor(), delegateMap, request);
      delegateMap.put(questionTypeNameDelegate.getObject(), questionTypeNameDelegate);
    }
    if (editor.isWeil.asEditor() != null) {
      if (true) editor.isWeil.asEditor().setValue(getObject().getIsWeil());
      simpleEditors.put("isWeil", editor.isWeil.asEditor());
    }
    if (editor.trueAnswers.asEditor() != null) {
      trueAnswersDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_Integer_RequestFactoryEditorDelegate();
      trueAnswersDelegate.initialize(eventBus, factory, appendPath("trueAnswers"), getObject().getTrueAnswers(), editor.trueAnswers.asEditor(), delegateMap, request);
      delegateMap.put(trueAnswersDelegate.getObject(), trueAnswersDelegate);
    }
    if (editor.falseAnswers.asEditor() != null) {
      falseAnswersDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_Integer_RequestFactoryEditorDelegate();
      falseAnswersDelegate.initialize(eventBus, factory, appendPath("falseAnswers"), getObject().getFalseAnswers(), editor.falseAnswers.asEditor(), delegateMap, request);
      delegateMap.put(falseAnswersDelegate.getObject(), falseAnswersDelegate);
    }
    if (editor.sumAnswers.asEditor() != null) {
      sumAnswersDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_Integer_RequestFactoryEditorDelegate();
      sumAnswersDelegate.initialize(eventBus, factory, appendPath("sumAnswers"), getObject().getSumAnswers(), editor.sumAnswers.asEditor(), delegateMap, request);
      delegateMap.put(sumAnswersDelegate.getObject(), sumAnswersDelegate);
    }
    if (editor.maxLetters.asEditor() != null) {
      maxLettersDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_Integer_RequestFactoryEditorDelegate();
      maxLettersDelegate.initialize(eventBus, factory, appendPath("maxLetters"), getObject().getMaxLetters(), editor.maxLetters.asEditor(), delegateMap, request);
      delegateMap.put(maxLettersDelegate.getObject(), maxLettersDelegate);
    }
  }
  protected void flushSubEditors(java.util.List errorAccumulator) {
    if (editor.questionTypeName.asEditor() != null && true) {
      questionTypeNameDelegate.flush(errorAccumulator);
      getObject().setQuestionTypeName((java.lang.String)questionTypeNameDelegate.getObject());
    }
    if (editor.isWeil.asEditor() != null && true) {
      getObject().setIsWeil(editor.isWeil.asEditor().getValue());
    }
    if (editor.trueAnswers.asEditor() != null && true) {
      trueAnswersDelegate.flush(errorAccumulator);
      getObject().setTrueAnswers((java.lang.Integer)trueAnswersDelegate.getObject());
    }
    if (editor.falseAnswers.asEditor() != null && true) {
      falseAnswersDelegate.flush(errorAccumulator);
      getObject().setFalseAnswers((java.lang.Integer)falseAnswersDelegate.getObject());
    }
    if (editor.sumAnswers.asEditor() != null && true) {
      sumAnswersDelegate.flush(errorAccumulator);
      getObject().setSumAnswers((java.lang.Integer)sumAnswersDelegate.getObject());
    }
    if (editor.maxLetters.asEditor() != null && true) {
      maxLettersDelegate.flush(errorAccumulator);
      getObject().setMaxLetters((java.lang.Integer)maxLettersDelegate.getObject());
    }
  }
  protected void flushSubEditorErrors(java.util.List errorAccumulator) {
    if (questionTypeNameDelegate != null) questionTypeNameDelegate.flushErrors(errorAccumulator);
    if (trueAnswersDelegate != null) trueAnswersDelegate.flushErrors(errorAccumulator);
    if (falseAnswersDelegate != null) falseAnswersDelegate.flushErrors(errorAccumulator);
    if (sumAnswersDelegate != null) sumAnswersDelegate.flushErrors(errorAccumulator);
    if (maxLettersDelegate != null) maxLettersDelegate.flushErrors(errorAccumulator);
  }
  protected void refreshEditors() {
    if (questionTypeNameDelegate != null) {
      if (true) {
        questionTypeNameDelegate.refresh(getObject().getQuestionTypeName());
      } else { questionTypeNameDelegate.refresh(null); }
    }
    if (editor.isWeil.asEditor() != null) {
      if (true) editor.isWeil.asEditor().setValue(getObject().getIsWeil());
      else { editor.isWeil.asEditor().setValue(null); }
    }
    if (trueAnswersDelegate != null) {
      if (true) {
        trueAnswersDelegate.refresh(getObject().getTrueAnswers());
      } else { trueAnswersDelegate.refresh(null); }
    }
    if (falseAnswersDelegate != null) {
      if (true) {
        falseAnswersDelegate.refresh(getObject().getFalseAnswers());
      } else { falseAnswersDelegate.refresh(null); }
    }
    if (sumAnswersDelegate != null) {
      if (true) {
        sumAnswersDelegate.refresh(getObject().getSumAnswers());
      } else { sumAnswersDelegate.refresh(null); }
    }
    if (maxLettersDelegate != null) {
      if (true) {
        maxLettersDelegate.refresh(getObject().getMaxLetters());
      } else { maxLettersDelegate.refresh(null); }
    }
  }
  protected void traverse(java.util.List paths) {
    traverseEditor(getEditor(), "", paths);
  }
  public static void traverseEditor(medizin.client.a_nonroo.app.client.ui.QuestiontypesEditViewImpl editor, String prefix, java.util.List<String> paths) {
    if (editor.questionTypeName.asEditor() != null) {
      String localPath = appendPath(prefix, "questionTypeName");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate.traverseEditor(editor.questionTypeName.asEditor(), localPath, paths);
    }
    if (editor.trueAnswers.asEditor() != null) {
      String localPath = appendPath(prefix, "trueAnswers");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_Integer_RequestFactoryEditorDelegate.traverseEditor(editor.trueAnswers.asEditor(), localPath, paths);
    }
    if (editor.falseAnswers.asEditor() != null) {
      String localPath = appendPath(prefix, "falseAnswers");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_Integer_RequestFactoryEditorDelegate.traverseEditor(editor.falseAnswers.asEditor(), localPath, paths);
    }
    if (editor.sumAnswers.asEditor() != null) {
      String localPath = appendPath(prefix, "sumAnswers");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_Integer_RequestFactoryEditorDelegate.traverseEditor(editor.sumAnswers.asEditor(), localPath, paths);
    }
    if (editor.maxLetters.asEditor() != null) {
      String localPath = appendPath(prefix, "maxLetters");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_Integer_RequestFactoryEditorDelegate.traverseEditor(editor.maxLetters.asEditor(), localPath, paths);
    }
  }
}
