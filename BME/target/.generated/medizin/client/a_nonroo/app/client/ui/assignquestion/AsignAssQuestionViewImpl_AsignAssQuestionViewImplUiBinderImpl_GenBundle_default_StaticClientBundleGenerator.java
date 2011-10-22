package medizin.client.a_nonroo.app.client.ui.assignquestion;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class AsignAssQuestionViewImpl_AsignAssQuestionViewImplUiBinderImpl_GenBundle_default_StaticClientBundleGenerator implements medizin.client.a_nonroo.app.client.ui.assignquestion.AsignAssQuestionViewImpl_AsignAssQuestionViewImplUiBinderImpl_GenBundle {
  public medizin.client.a_nonroo.app.client.ui.assignquestion.AsignAssQuestionViewImpl_AsignAssQuestionViewImplUiBinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new medizin.client.a_nonroo.app.client.ui.assignquestion.AsignAssQuestionViewImpl_AsignAssQuestionViewImplUiBinderImpl_GenCss_style() {
    private boolean injected;
    public boolean ensureInjected() {
      if (!injected) {
        injected = true;
        com.google.gwt.dom.client.StyleInjector.inject(getText());
        return true;
      }
      return false;
    }
    public String getName() {
      return "style";
    }
    public String getText() {
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GF2JA2OBW{border:" + ("0"+ " " +"solid"+ " " +"#ddf")  + ";height:" + ("100%")  + ";width:" + ("100%")  + ";}.GF2JA2OCW,.GF2JA2ODW{height:" + ("auto")  + ";width:" + ("100%")  + ";padding:" + ("5px")  + ";}")) : ((".GF2JA2OBW{border:" + ("0"+ " " +"solid"+ " " +"#ddf")  + ";height:" + ("100%")  + ";width:" + ("100%")  + ";}.GF2JA2OCW,.GF2JA2ODW{height:" + ("auto")  + ";width:" + ("100%")  + ";padding:" + ("5px")  + ";}"));
    }
    public java.lang.String panelHTML(){
      return "GF2JA2OBW";
    }
    public java.lang.String panelLeft(){
      return "GF2JA2OCW";
    }
    public java.lang.String panelRight(){
      return "GF2JA2ODW";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static medizin.client.a_nonroo.app.client.ui.assignquestion.AsignAssQuestionViewImpl_AsignAssQuestionViewImplUiBinderImpl_GenCss_style style;
  
  static {
    new AsignAssQuestionViewImpl_AsignAssQuestionViewImplUiBinderImpl_GenBundle_default_StaticClientBundleGenerator()._init0();
  }
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@medizin.client.a_nonroo.app.client.ui.assignquestion.AsignAssQuestionViewImpl_AsignAssQuestionViewImplUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
