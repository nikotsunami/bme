package medizin.client.a_nonroo.app.client.ui.question;

public class AnswerDialogboxImpl_RequestFactoryEditorDelegate extends com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate {
  private medizin.client.a_nonroo.app.client.ui.question.AnswerDialogboxImpl editor;
  protected medizin.client.a_nonroo.app.client.ui.question.AnswerDialogboxImpl getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(medizin.client.a_nonroo.app.client.ui.question.AnswerDialogboxImpl)editor;}
  private medizin.client.managed.request.AnswerProxy object;
  public medizin.client.managed.request.AnswerProxy getObject() {return object;}
  protected void setObject(Object object) {this.object=(medizin.client.managed.request.AnswerProxy)object;}
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate rewiewerDelegate;
  protected void attachSubEditors(com.google.gwt.editor.client.impl.DelegateMap delegateMap) {
    if (editor.rewiewer.asEditor() != null) {
      rewiewerDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_medizin_client_managed_request_PersonProxy_RequestFactoryEditorDelegate();
      rewiewerDelegate.initialize(eventBus, factory, appendPath("rewiewer"), getObject().getRewiewer(), editor.rewiewer.asEditor(), delegateMap, request);
      delegateMap.put(rewiewerDelegate.getObject(), rewiewerDelegate);
    }
    if (editor.validity.asEditor() != null) {
      if (true) editor.validity.asEditor().setValue(getObject().getValidity());
      simpleEditors.put("validity", editor.validity.asEditor());
    }
  }
  protected void flushSubEditors(java.util.List errorAccumulator) {
    if (editor.rewiewer.asEditor() != null && true) {
      rewiewerDelegate.flush(errorAccumulator);
      getObject().setRewiewer((medizin.client.managed.request.PersonProxy)rewiewerDelegate.getObject());
    }
    if (editor.validity.asEditor() != null && true) {
      getObject().setValidity(editor.validity.asEditor().getValue());
    }
  }
  protected void flushSubEditorErrors(java.util.List errorAccumulator) {
    if (rewiewerDelegate != null) rewiewerDelegate.flushErrors(errorAccumulator);
  }
  protected void refreshEditors() {
    if (rewiewerDelegate != null) {
      if (true) {
        rewiewerDelegate.refresh(getObject().getRewiewer());
      } else { rewiewerDelegate.refresh(null); }
    }
    if (editor.validity.asEditor() != null) {
      if (true) editor.validity.asEditor().setValue(getObject().getValidity());
      else { editor.validity.asEditor().setValue(null); }
    }
  }
  protected void traverse(java.util.List paths) {
    traverseEditor(getEditor(), "", paths);
  }
  public static void traverseEditor(medizin.client.a_nonroo.app.client.ui.question.AnswerDialogboxImpl editor, String prefix, java.util.List<String> paths) {
    if (editor.rewiewer.asEditor() != null) {
      String localPath = appendPath(prefix, "rewiewer");
      paths.add(localPath);
      com.google.gwt.editor.client.adapters.TakesValueEditor_medizin_client_managed_request_PersonProxy_RequestFactoryEditorDelegate.traverseEditor(editor.rewiewer.asEditor(), localPath, paths);
    }
  }
}
