package medizin.client.a_nonroo.app.client.ui.question;

public class AnswerDialogboxImpl_EditorDriverImpl extends com.google.gwt.requestfactory.client.impl.AbstractRequestFactoryEditorDriver<medizin.client.managed.request.AnswerProxy, medizin.client.a_nonroo.app.client.ui.question.AnswerDialogboxImpl> implements medizin.client.a_nonroo.app.client.ui.question.AnswerDialogboxImpl.EditorDriver {
  protected com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate createDelegate() {
    return new medizin.client.a_nonroo.app.client.ui.question.AnswerDialogboxImpl_RequestFactoryEditorDelegate();
  }
  protected void traverseEditors(java.util.List<String> paths) {
    medizin.client.a_nonroo.app.client.ui.question.AnswerDialogboxImpl_RequestFactoryEditorDelegate.traverseEditor(getEditor(), "", paths);
  }
}
