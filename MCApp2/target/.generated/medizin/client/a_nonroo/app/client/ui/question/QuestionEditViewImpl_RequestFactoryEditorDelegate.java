package medizin.client.a_nonroo.app.client.ui.question;

public class QuestionEditViewImpl_RequestFactoryEditorDelegate extends com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate {
  private medizin.client.a_nonroo.app.client.ui.question.QuestionEditViewImpl editor;
  protected medizin.client.a_nonroo.app.client.ui.question.QuestionEditViewImpl getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(medizin.client.a_nonroo.app.client.ui.question.QuestionEditViewImpl)editor;}
  private medizin.client.managed.request.QuestionProxy object;
  public medizin.client.managed.request.QuestionProxy getObject() {return object;}
  protected void setObject(Object object) {this.object=(medizin.client.managed.request.QuestionProxy)object;}
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate rewiewerDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate autorDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate questEventDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate questionTypeDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate mcsDelegate;
  protected void attachSubEditors(com.google.gwt.editor.client.impl.DelegateMap delegateMap) {
    if (editor.rewiewer.asEditor() != null) {
      rewiewerDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_medizin_client_managed_request_PersonProxy_RequestFactoryEditorDelegate();
      rewiewerDelegate.initialize(eventBus, factory, appendPath("rewiewer"), getObject().getRewiewer(), editor.rewiewer.asEditor(), delegateMap, request);
      delegateMap.put(rewiewerDelegate.getObject(), rewiewerDelegate);
    }
    if (editor.autor.asEditor() != null) {
      autorDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_medizin_client_managed_request_PersonProxy_RequestFactoryEditorDelegate();
      autorDelegate.initialize(eventBus, factory, appendPath("autor"), getObject().getAutor(), editor.autor.asEditor(), delegateMap, request);
      delegateMap.put(autorDelegate.getObject(), autorDelegate);
    }
    if (editor.questEvent.asEditor() != null) {
      questEventDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_medizin_client_managed_request_QuestionEventProxy_RequestFactoryEditorDelegate();
      questEventDelegate.initialize(eventBus, factory, appendPath("questEvent"), getObject().getQuestEvent(), editor.questEvent.asEditor(), delegateMap, request);
      delegateMap.put(questEventDelegate.getObject(), questEventDelegate);
    }
    if (editor.questionType.asEditor() != null) {
      questionTypeDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_medizin_client_managed_request_QuestionTypeProxy_RequestFactoryEditorDelegate();
      questionTypeDelegate.initialize(eventBus, factory, appendPath("questionType"), getObject().getQuestionType(), editor.questionType.asEditor(), delegateMap, request);
      delegateMap.put(questionTypeDelegate.getObject(), questionTypeDelegate);
    }
    if (editor.mcs != null) {
      mcsDelegate = new medizin.client.managed.ui.McSetEditor_RequestFactoryEditorDelegate();
      mcsDelegate.initialize(eventBus, factory, appendPath("mcs"), getObject().getMcs(), editor.mcs, delegateMap, request);
      delegateMap.put(mcsDelegate.getObject(), mcsDelegate);
    }
  }
  protected void flushSubEditors(java.util.List errorAccumulator) {
    if (editor.rewiewer.asEditor() != null && true) {
      rewiewerDelegate.flush(errorAccumulator);
      getObject().setRewiewer((medizin.client.managed.request.PersonProxy)rewiewerDelegate.getObject());
    }
    if (editor.autor.asEditor() != null && true) {
      autorDelegate.flush(errorAccumulator);
      getObject().setAutor((medizin.client.managed.request.PersonProxy)autorDelegate.getObject());
    }
    if (editor.questEvent.asEditor() != null && true) {
      questEventDelegate.flush(errorAccumulator);
      getObject().setQuestEvent((medizin.client.managed.request.QuestionEventProxy)questEventDelegate.getObject());
    }
    if (editor.questionType.asEditor() != null && true) {
      questionTypeDelegate.flush(errorAccumulator);
      getObject().setQuestionType((medizin.client.managed.request.QuestionTypeProxy)questionTypeDelegate.getObject());
    }
    if (editor.mcs != null && true) {
      mcsDelegate.flush(errorAccumulator);
      getObject().setMcs((java.util.Set)mcsDelegate.getObject());
    }
  }
  protected void flushSubEditorErrors(java.util.List errorAccumulator) {
    if (rewiewerDelegate != null) rewiewerDelegate.flushErrors(errorAccumulator);
    if (autorDelegate != null) autorDelegate.flushErrors(errorAccumulator);
    if (questEventDelegate != null) questEventDelegate.flushErrors(errorAccumulator);
    if (questionTypeDelegate != null) questionTypeDelegate.flushErrors(errorAccumulator);
    if (mcsDelegate != null) mcsDelegate.flushErrors(errorAccumulator);
  }
  protected void refreshEditors() {
    if (rewiewerDelegate != null) {
      if (true) {
        rewiewerDelegate.refresh(getObject().getRewiewer());
      } else { rewiewerDelegate.refresh(null); }
    }
    if (autorDelegate != null) {
      if (true) {
        autorDelegate.refresh(getObject().getAutor());
      } else { autorDelegate.refresh(null); }
    }
    if (questEventDelegate != null) {
      if (true) {
        questEventDelegate.refresh(getObject().getQuestEvent());
      } else { questEventDelegate.refresh(null); }
    }
    if (questionTypeDelegate != null) {
      if (true) {
        questionTypeDelegate.refresh(getObject().getQuestionType());
      } else { questionTypeDelegate.refresh(null); }
    }
    if (mcsDelegate != null) {
      if (true) {
        mcsDelegate.refresh(getObject().getMcs());
      } else { mcsDelegate.refresh(null); }
    }
  }
  protected void traverse(java.util.List paths) {
    traverseEditor(getEditor(), "", paths);
  }
  public static void traverseEditor(medizin.client.a_nonroo.app.client.ui.question.QuestionEditViewImpl editor, String prefix, java.util.List<String> paths) {
    if (editor.rewiewer.asEditor() != null) {
      String localPath = appendPath(prefix, "rewiewer");
      paths.add(localPath);
      com.google.gwt.editor.client.adapters.TakesValueEditor_medizin_client_managed_request_PersonProxy_RequestFactoryEditorDelegate.traverseEditor(editor.rewiewer.asEditor(), localPath, paths);
    }
    if (editor.autor.asEditor() != null) {
      String localPath = appendPath(prefix, "autor");
      paths.add(localPath);
      com.google.gwt.editor.client.adapters.TakesValueEditor_medizin_client_managed_request_PersonProxy_RequestFactoryEditorDelegate.traverseEditor(editor.autor.asEditor(), localPath, paths);
    }
    if (editor.questEvent.asEditor() != null) {
      String localPath = appendPath(prefix, "questEvent");
      paths.add(localPath);
      com.google.gwt.editor.client.adapters.TakesValueEditor_medizin_client_managed_request_QuestionEventProxy_RequestFactoryEditorDelegate.traverseEditor(editor.questEvent.asEditor(), localPath, paths);
    }
    if (editor.questionType.asEditor() != null) {
      String localPath = appendPath(prefix, "questionType");
      paths.add(localPath);
      com.google.gwt.editor.client.adapters.TakesValueEditor_medizin_client_managed_request_QuestionTypeProxy_RequestFactoryEditorDelegate.traverseEditor(editor.questionType.asEditor(), localPath, paths);
    }
    if (editor.mcs != null) {
      String localPath = appendPath(prefix, "mcs");
      paths.add(localPath);
      medizin.client.managed.ui.McSetEditor_RequestFactoryEditorDelegate.traverseEditor(editor.mcs, localPath, paths);
    }
  }
}
