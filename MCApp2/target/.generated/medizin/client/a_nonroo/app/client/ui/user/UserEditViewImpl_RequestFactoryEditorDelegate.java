package medizin.client.a_nonroo.app.client.ui.user;

public class UserEditViewImpl_RequestFactoryEditorDelegate extends com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate {
  private medizin.client.a_nonroo.app.client.ui.user.UserEditViewImpl editor;
  protected medizin.client.a_nonroo.app.client.ui.user.UserEditViewImpl getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(medizin.client.a_nonroo.app.client.ui.user.UserEditViewImpl)editor;}
  private medizin.client.managed.request.PersonProxy object;
  public medizin.client.managed.request.PersonProxy getObject() {return object;}
  protected void setObject(Object object) {this.object=(medizin.client.managed.request.PersonProxy)object;}
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate nameDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate prenameDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate emailDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate alternativEmailDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate phoneNumberDelegate;
  protected void attachSubEditors(com.google.gwt.editor.client.impl.DelegateMap delegateMap) {
    if (editor.name.asEditor() != null) {
      nameDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate();
      nameDelegate.initialize(eventBus, factory, appendPath("name"), getObject().getName(), editor.name.asEditor(), delegateMap, request);
      delegateMap.put(nameDelegate.getObject(), nameDelegate);
    }
    if (editor.prename.asEditor() != null) {
      prenameDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate();
      prenameDelegate.initialize(eventBus, factory, appendPath("prename"), getObject().getPrename(), editor.prename.asEditor(), delegateMap, request);
      delegateMap.put(prenameDelegate.getObject(), prenameDelegate);
    }
    if (editor.email.asEditor() != null) {
      emailDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate();
      emailDelegate.initialize(eventBus, factory, appendPath("email"), getObject().getEmail(), editor.email.asEditor(), delegateMap, request);
      delegateMap.put(emailDelegate.getObject(), emailDelegate);
    }
    if (editor.alternativEmail.asEditor() != null) {
      alternativEmailDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate();
      alternativEmailDelegate.initialize(eventBus, factory, appendPath("alternativEmail"), getObject().getAlternativEmail(), editor.alternativEmail.asEditor(), delegateMap, request);
      delegateMap.put(alternativEmailDelegate.getObject(), alternativEmailDelegate);
    }
    if (editor.phoneNumber.asEditor() != null) {
      phoneNumberDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate();
      phoneNumberDelegate.initialize(eventBus, factory, appendPath("phoneNumber"), getObject().getPhoneNumber(), editor.phoneNumber.asEditor(), delegateMap, request);
      delegateMap.put(phoneNumberDelegate.getObject(), phoneNumberDelegate);
    }
    if (editor.isAdmin.asEditor() != null) {
      if (true) editor.isAdmin.asEditor().setValue(getObject().getIsAdmin());
      simpleEditors.put("isAdmin", editor.isAdmin.asEditor());
    }
    if (editor.isAccepted.asEditor() != null) {
      if (true) editor.isAccepted.asEditor().setValue(getObject().getIsAccepted());
      simpleEditors.put("isAccepted", editor.isAccepted.asEditor());
    }
  }
  protected void flushSubEditors(java.util.List errorAccumulator) {
    if (editor.name.asEditor() != null && true) {
      nameDelegate.flush(errorAccumulator);
      getObject().setName((java.lang.String)nameDelegate.getObject());
    }
    if (editor.prename.asEditor() != null && true) {
      prenameDelegate.flush(errorAccumulator);
      getObject().setPrename((java.lang.String)prenameDelegate.getObject());
    }
    if (editor.email.asEditor() != null && true) {
      emailDelegate.flush(errorAccumulator);
      getObject().setEmail((java.lang.String)emailDelegate.getObject());
    }
    if (editor.alternativEmail.asEditor() != null && true) {
      alternativEmailDelegate.flush(errorAccumulator);
      getObject().setAlternativEmail((java.lang.String)alternativEmailDelegate.getObject());
    }
    if (editor.phoneNumber.asEditor() != null && true) {
      phoneNumberDelegate.flush(errorAccumulator);
      getObject().setPhoneNumber((java.lang.String)phoneNumberDelegate.getObject());
    }
    if (editor.isAdmin.asEditor() != null && true) {
      getObject().setIsAdmin(editor.isAdmin.asEditor().getValue());
    }
    if (editor.isAccepted.asEditor() != null && true) {
      getObject().setIsAccepted(editor.isAccepted.asEditor().getValue());
    }
  }
  protected void flushSubEditorErrors(java.util.List errorAccumulator) {
    if (nameDelegate != null) nameDelegate.flushErrors(errorAccumulator);
    if (prenameDelegate != null) prenameDelegate.flushErrors(errorAccumulator);
    if (emailDelegate != null) emailDelegate.flushErrors(errorAccumulator);
    if (alternativEmailDelegate != null) alternativEmailDelegate.flushErrors(errorAccumulator);
    if (phoneNumberDelegate != null) phoneNumberDelegate.flushErrors(errorAccumulator);
  }
  protected void refreshEditors() {
    if (nameDelegate != null) {
      if (true) {
        nameDelegate.refresh(getObject().getName());
      } else { nameDelegate.refresh(null); }
    }
    if (prenameDelegate != null) {
      if (true) {
        prenameDelegate.refresh(getObject().getPrename());
      } else { prenameDelegate.refresh(null); }
    }
    if (emailDelegate != null) {
      if (true) {
        emailDelegate.refresh(getObject().getEmail());
      } else { emailDelegate.refresh(null); }
    }
    if (alternativEmailDelegate != null) {
      if (true) {
        alternativEmailDelegate.refresh(getObject().getAlternativEmail());
      } else { alternativEmailDelegate.refresh(null); }
    }
    if (phoneNumberDelegate != null) {
      if (true) {
        phoneNumberDelegate.refresh(getObject().getPhoneNumber());
      } else { phoneNumberDelegate.refresh(null); }
    }
    if (editor.isAdmin.asEditor() != null) {
      if (true) editor.isAdmin.asEditor().setValue(getObject().getIsAdmin());
      else { editor.isAdmin.asEditor().setValue(null); }
    }
    if (editor.isAccepted.asEditor() != null) {
      if (true) editor.isAccepted.asEditor().setValue(getObject().getIsAccepted());
      else { editor.isAccepted.asEditor().setValue(null); }
    }
  }
  protected void traverse(java.util.List paths) {
    traverseEditor(getEditor(), "", paths);
  }
  public static void traverseEditor(medizin.client.a_nonroo.app.client.ui.user.UserEditViewImpl editor, String prefix, java.util.List<String> paths) {
    if (editor.name.asEditor() != null) {
      String localPath = appendPath(prefix, "name");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate.traverseEditor(editor.name.asEditor(), localPath, paths);
    }
    if (editor.prename.asEditor() != null) {
      String localPath = appendPath(prefix, "prename");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate.traverseEditor(editor.prename.asEditor(), localPath, paths);
    }
    if (editor.email.asEditor() != null) {
      String localPath = appendPath(prefix, "email");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate.traverseEditor(editor.email.asEditor(), localPath, paths);
    }
    if (editor.alternativEmail.asEditor() != null) {
      String localPath = appendPath(prefix, "alternativEmail");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate.traverseEditor(editor.alternativEmail.asEditor(), localPath, paths);
    }
    if (editor.phoneNumber.asEditor() != null) {
      String localPath = appendPath(prefix, "phoneNumber");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate.traverseEditor(editor.phoneNumber.asEditor(), localPath, paths);
    }
  }
}
