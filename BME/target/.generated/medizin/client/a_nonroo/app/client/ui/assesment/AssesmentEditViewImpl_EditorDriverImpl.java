package medizin.client.a_nonroo.app.client.ui.assesment;

public class AssesmentEditViewImpl_EditorDriverImpl extends com.google.gwt.requestfactory.client.impl.AbstractRequestFactoryEditorDriver<medizin.client.managed.request.AssesmentProxy, medizin.client.a_nonroo.app.client.ui.assesment.AssesmentEditViewImpl> implements medizin.client.a_nonroo.app.client.ui.assesment.AssesmentEditViewImpl.EditorDriver {
  protected com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate createDelegate() {
    return new medizin.client.a_nonroo.app.client.ui.assesment.AssesmentEditViewImpl_RequestFactoryEditorDelegate();
  }
  protected void traverseEditors(java.util.List<String> paths) {
    medizin.client.a_nonroo.app.client.ui.assesment.AssesmentEditViewImpl_RequestFactoryEditorDelegate.traverseEditor(getEditor(), "", paths);
  }
}
