package medizin.client.a_nonroo.app.client.ui.question;

public class QuestionEditViewImpl_EditorDriverImpl extends com.google.gwt.requestfactory.client.impl.AbstractRequestFactoryEditorDriver<medizin.client.managed.request.QuestionProxy, medizin.client.a_nonroo.app.client.ui.question.QuestionEditViewImpl> implements medizin.client.a_nonroo.app.client.ui.question.QuestionEditViewImpl.EditorDriver {
  protected com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate createDelegate() {
    return new medizin.client.a_nonroo.app.client.ui.question.QuestionEditViewImpl_RequestFactoryEditorDelegate();
  }
  protected void traverseEditors(java.util.List<String> paths) {
    medizin.client.a_nonroo.app.client.ui.question.QuestionEditViewImpl_RequestFactoryEditorDelegate.traverseEditor(getEditor(), "", paths);
  }
}
