package medizin.client.a_nonroo.app.client.ui.assesment;

public class AssesmentEditViewImpl_RequestFactoryEditorDelegate extends com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate {
  private medizin.client.a_nonroo.app.client.ui.assesment.AssesmentEditViewImpl editor;
  protected medizin.client.a_nonroo.app.client.ui.assesment.AssesmentEditViewImpl getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(medizin.client.a_nonroo.app.client.ui.assesment.AssesmentEditViewImpl)editor;}
  private medizin.client.managed.request.AssesmentProxy object;
  public medizin.client.managed.request.AssesmentProxy getObject() {return object;}
  protected void setObject(Object object) {this.object=(medizin.client.managed.request.AssesmentProxy)object;}
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate nameDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate logoDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate placeDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate mcDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate repeForDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate percentSameQuestionDelegate;
  protected void attachSubEditors(com.google.gwt.editor.client.impl.DelegateMap delegateMap) {
    if (editor.name.asEditor() != null) {
      nameDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate();
      nameDelegate.initialize(eventBus, factory, appendPath("name"), getObject().getName(), editor.name.asEditor(), delegateMap, request);
      delegateMap.put(nameDelegate.getObject(), nameDelegate);
    }
    if (editor.logo.asEditor() != null) {
      logoDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate();
      logoDelegate.initialize(eventBus, factory, appendPath("logo"), getObject().getLogo(), editor.logo.asEditor(), delegateMap, request);
      delegateMap.put(logoDelegate.getObject(), logoDelegate);
    }
    if (editor.dateOfAssesment.asEditor() != null) {
      if (true) editor.dateOfAssesment.asEditor().setValue(getObject().getDateOfAssesment());
      simpleEditors.put("dateOfAssesment", editor.dateOfAssesment.asEditor());
    }
    if (editor.dateOpen.asEditor() != null) {
      if (true) editor.dateOpen.asEditor().setValue(getObject().getDateOpen());
      simpleEditors.put("dateOpen", editor.dateOpen.asEditor());
    }
    if (editor.dateClosed.asEditor() != null) {
      if (true) editor.dateClosed.asEditor().setValue(getObject().getDateClosed());
      simpleEditors.put("dateClosed", editor.dateClosed.asEditor());
    }
    if (editor.place.asEditor() != null) {
      placeDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate();
      placeDelegate.initialize(eventBus, factory, appendPath("place"), getObject().getPlace(), editor.place.asEditor(), delegateMap, request);
      delegateMap.put(placeDelegate.getObject(), placeDelegate);
    }
    if (editor.isClosed.asEditor() != null) {
      if (true) editor.isClosed.asEditor().setValue(getObject().getIsClosed());
      simpleEditors.put("isClosed", editor.isClosed.asEditor());
    }
    if (editor.mc.asEditor() != null) {
      mcDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_medizin_client_managed_request_McProxy_RequestFactoryEditorDelegate();
      mcDelegate.initialize(eventBus, factory, appendPath("mc"), getObject().getMc(), editor.mc.asEditor(), delegateMap, request);
      delegateMap.put(mcDelegate.getObject(), mcDelegate);
    }
    if (editor.repeFor.asEditor() != null) {
      repeForDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_medizin_client_managed_request_AssesmentProxy_RequestFactoryEditorDelegate();
      repeForDelegate.initialize(eventBus, factory, appendPath("repeFor"), getObject().getRepeFor(), editor.repeFor.asEditor(), delegateMap, request);
      delegateMap.put(repeForDelegate.getObject(), repeForDelegate);
    }
    if (editor.percentSameQuestion.asEditor() != null) {
      percentSameQuestionDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_Integer_RequestFactoryEditorDelegate();
      percentSameQuestionDelegate.initialize(eventBus, factory, appendPath("percentSameQuestion"), getObject().getPercentSameQuestion(), editor.percentSameQuestion.asEditor(), delegateMap, request);
      delegateMap.put(percentSameQuestionDelegate.getObject(), percentSameQuestionDelegate);
    }
  }
  protected void flushSubEditors(java.util.List errorAccumulator) {
    if (editor.name.asEditor() != null && true) {
      nameDelegate.flush(errorAccumulator);
      getObject().setName((java.lang.String)nameDelegate.getObject());
    }
    if (editor.logo.asEditor() != null && true) {
      logoDelegate.flush(errorAccumulator);
      getObject().setLogo((java.lang.String)logoDelegate.getObject());
    }
    if (editor.dateOfAssesment.asEditor() != null && true) {
      getObject().setDateOfAssesment(editor.dateOfAssesment.asEditor().getValue());
    }
    if (editor.dateOpen.asEditor() != null && true) {
      getObject().setDateOpen(editor.dateOpen.asEditor().getValue());
    }
    if (editor.dateClosed.asEditor() != null && true) {
      getObject().setDateClosed(editor.dateClosed.asEditor().getValue());
    }
    if (editor.place.asEditor() != null && true) {
      placeDelegate.flush(errorAccumulator);
      getObject().setPlace((java.lang.String)placeDelegate.getObject());
    }
    if (editor.isClosed.asEditor() != null && true) {
      getObject().setIsClosed(editor.isClosed.asEditor().getValue());
    }
    if (editor.mc.asEditor() != null && true) {
      mcDelegate.flush(errorAccumulator);
      getObject().setMc((medizin.client.managed.request.McProxy)mcDelegate.getObject());
    }
    if (editor.repeFor.asEditor() != null && true) {
      repeForDelegate.flush(errorAccumulator);
      getObject().setRepeFor((medizin.client.managed.request.AssesmentProxy)repeForDelegate.getObject());
    }
    if (editor.percentSameQuestion.asEditor() != null && true) {
      percentSameQuestionDelegate.flush(errorAccumulator);
      getObject().setPercentSameQuestion((java.lang.Integer)percentSameQuestionDelegate.getObject());
    }
  }
  protected void flushSubEditorErrors(java.util.List errorAccumulator) {
    if (nameDelegate != null) nameDelegate.flushErrors(errorAccumulator);
    if (logoDelegate != null) logoDelegate.flushErrors(errorAccumulator);
    if (placeDelegate != null) placeDelegate.flushErrors(errorAccumulator);
    if (mcDelegate != null) mcDelegate.flushErrors(errorAccumulator);
    if (repeForDelegate != null) repeForDelegate.flushErrors(errorAccumulator);
    if (percentSameQuestionDelegate != null) percentSameQuestionDelegate.flushErrors(errorAccumulator);
  }
  protected void refreshEditors() {
    if (nameDelegate != null) {
      if (true) {
        nameDelegate.refresh(getObject().getName());
      } else { nameDelegate.refresh(null); }
    }
    if (logoDelegate != null) {
      if (true) {
        logoDelegate.refresh(getObject().getLogo());
      } else { logoDelegate.refresh(null); }
    }
    if (editor.dateOfAssesment.asEditor() != null) {
      if (true) editor.dateOfAssesment.asEditor().setValue(getObject().getDateOfAssesment());
      else { editor.dateOfAssesment.asEditor().setValue(null); }
    }
    if (editor.dateOpen.asEditor() != null) {
      if (true) editor.dateOpen.asEditor().setValue(getObject().getDateOpen());
      else { editor.dateOpen.asEditor().setValue(null); }
    }
    if (editor.dateClosed.asEditor() != null) {
      if (true) editor.dateClosed.asEditor().setValue(getObject().getDateClosed());
      else { editor.dateClosed.asEditor().setValue(null); }
    }
    if (placeDelegate != null) {
      if (true) {
        placeDelegate.refresh(getObject().getPlace());
      } else { placeDelegate.refresh(null); }
    }
    if (editor.isClosed.asEditor() != null) {
      if (true) editor.isClosed.asEditor().setValue(getObject().getIsClosed());
      else { editor.isClosed.asEditor().setValue(null); }
    }
    if (mcDelegate != null) {
      if (true) {
        mcDelegate.refresh(getObject().getMc());
      } else { mcDelegate.refresh(null); }
    }
    if (repeForDelegate != null) {
      if (true) {
        repeForDelegate.refresh(getObject().getRepeFor());
      } else { repeForDelegate.refresh(null); }
    }
    if (percentSameQuestionDelegate != null) {
      if (true) {
        percentSameQuestionDelegate.refresh(getObject().getPercentSameQuestion());
      } else { percentSameQuestionDelegate.refresh(null); }
    }
  }
  protected void traverse(java.util.List paths) {
    traverseEditor(getEditor(), "", paths);
  }
  public static void traverseEditor(medizin.client.a_nonroo.app.client.ui.assesment.AssesmentEditViewImpl editor, String prefix, java.util.List<String> paths) {
    if (editor.name.asEditor() != null) {
      String localPath = appendPath(prefix, "name");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate.traverseEditor(editor.name.asEditor(), localPath, paths);
    }
    if (editor.logo.asEditor() != null) {
      String localPath = appendPath(prefix, "logo");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate.traverseEditor(editor.logo.asEditor(), localPath, paths);
    }
    if (editor.place.asEditor() != null) {
      String localPath = appendPath(prefix, "place");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate.traverseEditor(editor.place.asEditor(), localPath, paths);
    }
    if (editor.mc.asEditor() != null) {
      String localPath = appendPath(prefix, "mc");
      paths.add(localPath);
      com.google.gwt.editor.client.adapters.TakesValueEditor_medizin_client_managed_request_McProxy_RequestFactoryEditorDelegate.traverseEditor(editor.mc.asEditor(), localPath, paths);
    }
    if (editor.repeFor.asEditor() != null) {
      String localPath = appendPath(prefix, "repeFor");
      paths.add(localPath);
      com.google.gwt.editor.client.adapters.TakesValueEditor_medizin_client_managed_request_AssesmentProxy_RequestFactoryEditorDelegate.traverseEditor(editor.repeFor.asEditor(), localPath, paths);
    }
    if (editor.percentSameQuestion.asEditor() != null) {
      String localPath = appendPath(prefix, "percentSameQuestion");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_Integer_RequestFactoryEditorDelegate.traverseEditor(editor.percentSameQuestion.asEditor(), localPath, paths);
    }
  }
}
