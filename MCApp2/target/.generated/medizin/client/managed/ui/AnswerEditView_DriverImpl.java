package medizin.client.managed.ui;

public class AnswerEditView_DriverImpl extends com.google.gwt.requestfactory.client.impl.AbstractRequestFactoryEditorDriver<medizin.client.managed.request.AnswerProxy, medizin.client.managed.ui.AnswerEditView> implements medizin.client.managed.ui.AnswerEditView.Driver {
  protected com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate createDelegate() {
    return new medizin.client.managed.ui.AnswerEditView_RequestFactoryEditorDelegate();
  }
  protected void traverseEditors(java.util.List<String> paths) {
    medizin.client.managed.ui.AnswerEditView_RequestFactoryEditorDelegate.traverseEditor(getEditor(), "", paths);
  }
}
