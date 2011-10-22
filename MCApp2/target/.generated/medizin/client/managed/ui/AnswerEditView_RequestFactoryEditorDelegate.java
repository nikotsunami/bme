package medizin.client.managed.ui;

public class AnswerEditView_RequestFactoryEditorDelegate extends com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate {
  private medizin.client.managed.ui.AnswerEditView editor;
  protected medizin.client.managed.ui.AnswerEditView getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(medizin.client.managed.ui.AnswerEditView)editor;}
  private medizin.client.managed.request.AnswerProxy object;
  public medizin.client.managed.request.AnswerProxy getObject() {return object;}
  protected void setObject(Object object) {this.object=(medizin.client.managed.request.AnswerProxy)object;}
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate rewiewerDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate autorDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate answerTextDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate picturePathDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate questionDelegate;
  protected void attachSubEditors(com.google.gwt.editor.client.impl.DelegateMap delegateMap) {
    if (editor.dateAdded.asEditor() != null) {
      if (true) editor.dateAdded.asEditor().setValue(getObject().getDateAdded());
      simpleEditors.put("dateAdded", editor.dateAdded.asEditor());
    }
    if (editor.dateChanged.asEditor() != null) {
      if (true) editor.dateChanged.asEditor().setValue(getObject().getDateChanged());
      simpleEditors.put("dateChanged", editor.dateChanged.asEditor());
    }
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
    if (editor.answerText.asEditor() != null) {
      answerTextDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate();
      answerTextDelegate.initialize(eventBus, factory, appendPath("answerText"), getObject().getAnswerText(), editor.answerText.asEditor(), delegateMap, request);
      delegateMap.put(answerTextDelegate.getObject(), answerTextDelegate);
    }
    if (editor.isAnswerActive.asEditor() != null) {
      if (true) editor.isAnswerActive.asEditor().setValue(getObject().getIsAnswerActive());
      simpleEditors.put("isAnswerActive", editor.isAnswerActive.asEditor());
    }
    if (editor.isPicture.asEditor() != null) {
      if (true) editor.isPicture.asEditor().setValue(getObject().getIsPicture());
      simpleEditors.put("isPicture", editor.isPicture.asEditor());
    }
    if (editor.isAnswerAcceptedReviewWahrer.asEditor() != null) {
      if (true) editor.isAnswerAcceptedReviewWahrer.asEditor().setValue(getObject().getIsAnswerAcceptedReviewWahrer());
      simpleEditors.put("isAnswerAcceptedReviewWahrer", editor.isAnswerAcceptedReviewWahrer.asEditor());
    }
    if (editor.isAnswerAcceptedAutor.asEditor() != null) {
      if (true) editor.isAnswerAcceptedAutor.asEditor().setValue(getObject().getIsAnswerAcceptedAutor());
      simpleEditors.put("isAnswerAcceptedAutor", editor.isAnswerAcceptedAutor.asEditor());
    }
    if (editor.isAnswerAcceptedAdmin.asEditor() != null) {
      if (true) editor.isAnswerAcceptedAdmin.asEditor().setValue(getObject().getIsAnswerAcceptedAdmin());
      simpleEditors.put("isAnswerAcceptedAdmin", editor.isAnswerAcceptedAdmin.asEditor());
    }
    if (editor.validity.asEditor() != null) {
      if (true) editor.validity.asEditor().setValue(getObject().getValidity());
      simpleEditors.put("validity", editor.validity.asEditor());
    }
    if (editor.picturePath.asEditor() != null) {
      picturePathDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate();
      picturePathDelegate.initialize(eventBus, factory, appendPath("picturePath"), getObject().getPicturePath(), editor.picturePath.asEditor(), delegateMap, request);
      delegateMap.put(picturePathDelegate.getObject(), picturePathDelegate);
    }
    if (editor.question.asEditor() != null) {
      questionDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_medizin_client_managed_request_QuestionProxy_RequestFactoryEditorDelegate();
      questionDelegate.initialize(eventBus, factory, appendPath("question"), getObject().getQuestion(), editor.question.asEditor(), delegateMap, request);
      delegateMap.put(questionDelegate.getObject(), questionDelegate);
    }
  }
  protected void flushSubEditors(java.util.List errorAccumulator) {
    if (editor.dateAdded.asEditor() != null && true) {
      getObject().setDateAdded(editor.dateAdded.asEditor().getValue());
    }
    if (editor.dateChanged.asEditor() != null && true) {
      getObject().setDateChanged(editor.dateChanged.asEditor().getValue());
    }
    if (editor.rewiewer.asEditor() != null && true) {
      rewiewerDelegate.flush(errorAccumulator);
      getObject().setRewiewer((medizin.client.managed.request.PersonProxy)rewiewerDelegate.getObject());
    }
    if (editor.autor.asEditor() != null && true) {
      autorDelegate.flush(errorAccumulator);
      getObject().setAutor((medizin.client.managed.request.PersonProxy)autorDelegate.getObject());
    }
    if (editor.answerText.asEditor() != null && true) {
      answerTextDelegate.flush(errorAccumulator);
      getObject().setAnswerText((java.lang.String)answerTextDelegate.getObject());
    }
    if (editor.isAnswerActive.asEditor() != null && true) {
      getObject().setIsAnswerActive(editor.isAnswerActive.asEditor().getValue());
    }
    if (editor.isPicture.asEditor() != null && true) {
      getObject().setIsPicture(editor.isPicture.asEditor().getValue());
    }
    if (editor.isAnswerAcceptedReviewWahrer.asEditor() != null && true) {
      getObject().setIsAnswerAcceptedReviewWahrer(editor.isAnswerAcceptedReviewWahrer.asEditor().getValue());
    }
    if (editor.isAnswerAcceptedAutor.asEditor() != null && true) {
      getObject().setIsAnswerAcceptedAutor(editor.isAnswerAcceptedAutor.asEditor().getValue());
    }
    if (editor.isAnswerAcceptedAdmin.asEditor() != null && true) {
      getObject().setIsAnswerAcceptedAdmin(editor.isAnswerAcceptedAdmin.asEditor().getValue());
    }
    if (editor.validity.asEditor() != null && true) {
      getObject().setValidity(editor.validity.asEditor().getValue());
    }
    if (editor.picturePath.asEditor() != null && true) {
      picturePathDelegate.flush(errorAccumulator);
      getObject().setPicturePath((java.lang.String)picturePathDelegate.getObject());
    }
    if (editor.question.asEditor() != null && true) {
      questionDelegate.flush(errorAccumulator);
      getObject().setQuestion((medizin.client.managed.request.QuestionProxy)questionDelegate.getObject());
    }
  }
  protected void flushSubEditorErrors(java.util.List errorAccumulator) {
    if (rewiewerDelegate != null) rewiewerDelegate.flushErrors(errorAccumulator);
    if (autorDelegate != null) autorDelegate.flushErrors(errorAccumulator);
    if (answerTextDelegate != null) answerTextDelegate.flushErrors(errorAccumulator);
    if (picturePathDelegate != null) picturePathDelegate.flushErrors(errorAccumulator);
    if (questionDelegate != null) questionDelegate.flushErrors(errorAccumulator);
  }
  protected void refreshEditors() {
    if (editor.dateAdded.asEditor() != null) {
      if (true) editor.dateAdded.asEditor().setValue(getObject().getDateAdded());
      else { editor.dateAdded.asEditor().setValue(null); }
    }
    if (editor.dateChanged.asEditor() != null) {
      if (true) editor.dateChanged.asEditor().setValue(getObject().getDateChanged());
      else { editor.dateChanged.asEditor().setValue(null); }
    }
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
    if (answerTextDelegate != null) {
      if (true) {
        answerTextDelegate.refresh(getObject().getAnswerText());
      } else { answerTextDelegate.refresh(null); }
    }
    if (editor.isAnswerActive.asEditor() != null) {
      if (true) editor.isAnswerActive.asEditor().setValue(getObject().getIsAnswerActive());
      else { editor.isAnswerActive.asEditor().setValue(null); }
    }
    if (editor.isPicture.asEditor() != null) {
      if (true) editor.isPicture.asEditor().setValue(getObject().getIsPicture());
      else { editor.isPicture.asEditor().setValue(null); }
    }
    if (editor.isAnswerAcceptedReviewWahrer.asEditor() != null) {
      if (true) editor.isAnswerAcceptedReviewWahrer.asEditor().setValue(getObject().getIsAnswerAcceptedReviewWahrer());
      else { editor.isAnswerAcceptedReviewWahrer.asEditor().setValue(null); }
    }
    if (editor.isAnswerAcceptedAutor.asEditor() != null) {
      if (true) editor.isAnswerAcceptedAutor.asEditor().setValue(getObject().getIsAnswerAcceptedAutor());
      else { editor.isAnswerAcceptedAutor.asEditor().setValue(null); }
    }
    if (editor.isAnswerAcceptedAdmin.asEditor() != null) {
      if (true) editor.isAnswerAcceptedAdmin.asEditor().setValue(getObject().getIsAnswerAcceptedAdmin());
      else { editor.isAnswerAcceptedAdmin.asEditor().setValue(null); }
    }
    if (editor.validity.asEditor() != null) {
      if (true) editor.validity.asEditor().setValue(getObject().getValidity());
      else { editor.validity.asEditor().setValue(null); }
    }
    if (picturePathDelegate != null) {
      if (true) {
        picturePathDelegate.refresh(getObject().getPicturePath());
      } else { picturePathDelegate.refresh(null); }
    }
    if (questionDelegate != null) {
      if (true) {
        questionDelegate.refresh(getObject().getQuestion());
      } else { questionDelegate.refresh(null); }
    }
  }
  protected void traverse(java.util.List paths) {
    traverseEditor(getEditor(), "", paths);
  }
  public static void traverseEditor(medizin.client.managed.ui.AnswerEditView editor, String prefix, java.util.List<String> paths) {
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
    if (editor.answerText.asEditor() != null) {
      String localPath = appendPath(prefix, "answerText");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate.traverseEditor(editor.answerText.asEditor(), localPath, paths);
    }
    if (editor.picturePath.asEditor() != null) {
      String localPath = appendPath(prefix, "picturePath");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate.traverseEditor(editor.picturePath.asEditor(), localPath, paths);
    }
    if (editor.question.asEditor() != null) {
      String localPath = appendPath(prefix, "question");
      paths.add(localPath);
      com.google.gwt.editor.client.adapters.TakesValueEditor_medizin_client_managed_request_QuestionProxy_RequestFactoryEditorDelegate.traverseEditor(editor.question.asEditor(), localPath, paths);
    }
  }
}
