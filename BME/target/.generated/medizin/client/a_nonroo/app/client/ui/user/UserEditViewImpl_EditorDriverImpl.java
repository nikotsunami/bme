package medizin.client.a_nonroo.app.client.ui.user;

public class UserEditViewImpl_EditorDriverImpl extends com.google.gwt.requestfactory.client.impl.AbstractRequestFactoryEditorDriver<medizin.client.managed.request.PersonProxy, medizin.client.a_nonroo.app.client.ui.user.UserEditViewImpl> implements medizin.client.a_nonroo.app.client.ui.user.UserEditViewImpl.EditorDriver {
  protected com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate createDelegate() {
    return new medizin.client.a_nonroo.app.client.ui.user.UserEditViewImpl_RequestFactoryEditorDelegate();
  }
  protected void traverseEditors(java.util.List<String> paths) {
    medizin.client.a_nonroo.app.client.ui.user.UserEditViewImpl_RequestFactoryEditorDelegate.traverseEditor(getEditor(), "", paths);
  }
}
