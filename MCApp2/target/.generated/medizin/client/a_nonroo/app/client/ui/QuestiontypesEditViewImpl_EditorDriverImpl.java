package medizin.client.a_nonroo.app.client.ui;

public class QuestiontypesEditViewImpl_EditorDriverImpl extends com.google.gwt.requestfactory.client.impl.AbstractRequestFactoryEditorDriver<medizin.client.managed.request.QuestionTypeProxy, medizin.client.a_nonroo.app.client.ui.QuestiontypesEditViewImpl> implements medizin.client.a_nonroo.app.client.ui.QuestiontypesEditViewImpl.EditorDriver {
  protected com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate createDelegate() {
    return new medizin.client.a_nonroo.app.client.ui.QuestiontypesEditViewImpl_RequestFactoryEditorDelegate();
  }
  protected void traverseEditors(java.util.List<String> paths) {
    medizin.client.a_nonroo.app.client.ui.QuestiontypesEditViewImpl_RequestFactoryEditorDelegate.traverseEditor(getEditor(), "", paths);
  }
}
