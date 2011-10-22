package medizin.client.a_nonroo.app.client.ui.assesment;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class QuestionTypeCountAddDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountAddDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle {
  public medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountAddDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountAddDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GF2JA2OFCB{border:" + ("0"+ " " +"solid"+ " " +"#ddf")  + ";height:" + ("100%")  + ";width:" + ("100%")  + ";}.GF2JA2OCCB{margin-top:" + ("0.5em")  + ";margin-right:" + ("1em")  + ";}.GF2JA2OECB{min-height:" + ("25px")  + ";font-weight:" + ("bold")  + ";}.GF2JA2OBCB{margin-left:" + ("1em")  + ";}.GF2JA2OACB{margin-right:" + ("1em")  + ";}.GF2JA2ODCB{margin-right:" + ("1em")  + ";color:") + (("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";margin-bottom:" + ("0")  + ";}.GF2JA2OGCB{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";}")) : ((".GF2JA2OFCB{border:" + ("0"+ " " +"solid"+ " " +"#ddf")  + ";height:" + ("100%")  + ";width:" + ("100%")  + ";}.GF2JA2OCCB{margin-top:" + ("0.5em")  + ";margin-left:" + ("1em")  + ";}.GF2JA2OECB{min-height:" + ("25px")  + ";font-weight:" + ("bold")  + ";}.GF2JA2OBCB{margin-right:" + ("1em")  + ";}.GF2JA2OACB{margin-left:" + ("1em")  + ";}.GF2JA2ODCB{margin-left:" + ("1em")  + ";color:") + (("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";margin-bottom:" + ("0")  + ";}.GF2JA2OGCB{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";}"));
    }
    public java.lang.String bar(){
      return "GF2JA2OACB";
    }
    public java.lang.String button(){
      return "GF2JA2OBCB";
    }
    public java.lang.String fields(){
      return "GF2JA2OCCB";
    }
    public java.lang.String header(){
      return "GF2JA2ODCB";
    }
    public java.lang.String label(){
      return "GF2JA2OECB";
    }
    public java.lang.String panelHTML(){
      return "GF2JA2OFCB";
    }
    public java.lang.String underline(){
      return "GF2JA2OGCB";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountAddDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenCss_style style;
  
  static {
    new QuestionTypeCountAddDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator()._init0();
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
      case 'style': return this.@medizin.client.a_nonroo.app.client.ui.assesment.QuestionTypeCountAddDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
