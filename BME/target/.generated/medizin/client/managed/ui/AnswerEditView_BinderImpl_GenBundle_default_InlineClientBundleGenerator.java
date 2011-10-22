package medizin.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class AnswerEditView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements medizin.client.managed.ui.AnswerEditView_BinderImpl_GenBundle {
  public medizin.client.managed.ui.AnswerEditView_BinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new medizin.client.managed.ui.AnswerEditView_BinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GF2JA2OALB{padding-right:" + ("0.5em")  + ";background-color:" + ("red")  + ";}.GF2JA2OBLB{margin-top:" + ("0.5em")  + ";margin-right:" + ("1em")  + ";}.GF2JA2ODLB{min-height:" + ("25px")  + ";font-weight:" + ("bold")  + ";}.GF2JA2OPKB{margin-left:" + ("1em")  + ";}.GF2JA2OOKB{margin-right:" + ("1em")  + ";}.GF2JA2OCLB{margin-right:" + ("1em")  + ";color:" + ("#4b4a4a")  + ";text-shadow:") + (("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";margin-bottom:" + ("0")  + ";}.GF2JA2OELB{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";}")) : ((".GF2JA2OALB{padding-left:" + ("0.5em")  + ";background-color:" + ("red")  + ";}.GF2JA2OBLB{margin-top:" + ("0.5em")  + ";margin-left:" + ("1em")  + ";}.GF2JA2ODLB{min-height:" + ("25px")  + ";font-weight:" + ("bold")  + ";}.GF2JA2OPKB{margin-right:" + ("1em")  + ";}.GF2JA2OOKB{margin-left:" + ("1em")  + ";}.GF2JA2OCLB{margin-left:" + ("1em")  + ";color:" + ("#4b4a4a")  + ";text-shadow:") + (("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";margin-bottom:" + ("0")  + ";}.GF2JA2OELB{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";}"));
    }
    public java.lang.String bar(){
      return "GF2JA2OOKB";
    }
    public java.lang.String button(){
      return "GF2JA2OPKB";
    }
    public java.lang.String errors(){
      return "GF2JA2OALB";
    }
    public java.lang.String fields(){
      return "GF2JA2OBLB";
    }
    public java.lang.String header(){
      return "GF2JA2OCLB";
    }
    public java.lang.String label(){
      return "GF2JA2ODLB";
    }
    public java.lang.String underline(){
      return "GF2JA2OELB";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static medizin.client.managed.ui.AnswerEditView_BinderImpl_GenCss_style style;
  
  static {
    new AnswerEditView_BinderImpl_GenBundle_default_InlineClientBundleGenerator()._init0();
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
      case 'style': return this.@medizin.client.managed.ui.AnswerEditView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
