package medizin.client.a_nonroo.app.client.ui.assesment;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class QuestionSumPerPersonDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle {
  public medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GF2JA2OOBB{border:" + ("0"+ " " +"solid"+ " " +"#ddf")  + ";height:" + ("100%")  + ";width:" + ("100%")  + ";}.GF2JA2OLBB{margin-top:" + ("0.5em")  + ";margin-right:" + ("1em")  + ";}.GF2JA2ONBB{min-height:" + ("25px")  + ";font-weight:" + ("bold")  + ";}.GF2JA2OKBB{margin-left:" + ("1em")  + ";}.GF2JA2OJBB{margin-right:" + ("1em")  + ";}.GF2JA2OMBB{margin-right:" + ("1em")  + ";color:") + (("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";margin-bottom:" + ("0")  + ";}.GF2JA2OPBB{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";}")) : ((".GF2JA2OOBB{border:" + ("0"+ " " +"solid"+ " " +"#ddf")  + ";height:" + ("100%")  + ";width:" + ("100%")  + ";}.GF2JA2OLBB{margin-top:" + ("0.5em")  + ";margin-left:" + ("1em")  + ";}.GF2JA2ONBB{min-height:" + ("25px")  + ";font-weight:" + ("bold")  + ";}.GF2JA2OKBB{margin-right:" + ("1em")  + ";}.GF2JA2OJBB{margin-left:" + ("1em")  + ";}.GF2JA2OMBB{margin-left:" + ("1em")  + ";color:") + (("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";margin-bottom:" + ("0")  + ";}.GF2JA2OPBB{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";}"));
    }
    public java.lang.String bar(){
      return "GF2JA2OJBB";
    }
    public java.lang.String button(){
      return "GF2JA2OKBB";
    }
    public java.lang.String fields(){
      return "GF2JA2OLBB";
    }
    public java.lang.String header(){
      return "GF2JA2OMBB";
    }
    public java.lang.String label(){
      return "GF2JA2ONBB";
    }
    public java.lang.String panelHTML(){
      return "GF2JA2OOBB";
    }
    public java.lang.String underline(){
      return "GF2JA2OPBB";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenCss_style style;
  
  static {
    new QuestionSumPerPersonDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator()._init0();
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
      case 'style': return this.@medizin.client.a_nonroo.app.client.ui.assesment.QuestionSumPerPersonDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
