package medizin.client.a_nonroo.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class QuestiontypesDetailsViewImpl_UserDetailsViewImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements medizin.client.a_nonroo.app.client.ui.QuestiontypesDetailsViewImpl_UserDetailsViewImplUiBinderImpl_GenBundle {
  public medizin.client.a_nonroo.app.client.ui.QuestiontypesDetailsViewImpl_UserDetailsViewImplUiBinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new medizin.client.a_nonroo.app.client.ui.QuestiontypesDetailsViewImpl_UserDetailsViewImplUiBinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GF2JA2ON3{border:" + ("0"+ " " +"solid"+ " " +"#ddf")  + ";height:" + ("100%")  + ";width:" + ("100%")  + ";}.GF2JA2OJ3{margin:" + ("0.5em")  + ";padding-left:" + ("1em")  + ";}.GF2JA2OL3{min-height:" + ("25px")  + ";font-weight:" + ("bold")  + ";}.GF2JA2OM3{float:" + ("right")  + ";}.GF2JA2OH3{margin-right:" + ("0.5em")  + ";float:" + ("left")  + ";background:") + (("none")  + ";cursor:" + ("pointer")  + ";}.GF2JA2OK3{padding:" + ("3px")  + ";color:" + ("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";margin-bottom:" + ("0")  + ";background-color:" + ("#e6eded")  + ";font-size:" + ("1.2em")  + ";font-weight:" + ("bold")  + ";}.GF2JA2OP3{border-bottom:" + ("1px"+ " " +"solid"+ " " +"#6f7277")  + ";}.GF2JA2OG3{padding-right:" + ("10px") ) + (";padding-left:" + ("10px")  + ";}.GF2JA2OF3{padding:" + ("3px")  + ";background-color:" + ("#e6eded")  + ";}.GF2JA2OI3{border:" + ("1px"+ " " +"solid"+ " " +"#e6eded")  + ";width:" + ("100%")  + ";}.GF2JA2OO3{border-bottom:" + ("1px"+ " " +"solid"+ " " +"#e6eded")  + ";}")) : ((".GF2JA2ON3{border:" + ("0"+ " " +"solid"+ " " +"#ddf")  + ";height:" + ("100%")  + ";width:" + ("100%")  + ";}.GF2JA2OJ3{margin:" + ("0.5em")  + ";padding-right:" + ("1em")  + ";}.GF2JA2OL3{min-height:" + ("25px")  + ";font-weight:" + ("bold")  + ";}.GF2JA2OM3{float:" + ("left")  + ";}.GF2JA2OH3{margin-left:" + ("0.5em")  + ";float:" + ("right")  + ";background:") + (("none")  + ";cursor:" + ("pointer")  + ";}.GF2JA2OK3{padding:" + ("3px")  + ";color:" + ("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";margin-bottom:" + ("0")  + ";background-color:" + ("#e6eded")  + ";font-size:" + ("1.2em")  + ";font-weight:" + ("bold")  + ";}.GF2JA2OP3{border-bottom:" + ("1px"+ " " +"solid"+ " " +"#6f7277")  + ";}.GF2JA2OG3{padding-left:" + ("10px") ) + (";padding-right:" + ("10px")  + ";}.GF2JA2OF3{padding:" + ("3px")  + ";background-color:" + ("#e6eded")  + ";}.GF2JA2OI3{border:" + ("1px"+ " " +"solid"+ " " +"#e6eded")  + ";width:" + ("100%")  + ";}.GF2JA2OO3{border-bottom:" + ("1px"+ " " +"solid"+ " " +"#e6eded")  + ";}"));
    }
    public java.lang.String bar(){
      return "GF2JA2OF3";
    }
    public java.lang.String boundary(){
      return "GF2JA2OG3";
    }
    public java.lang.String button(){
      return "GF2JA2OH3";
    }
    public java.lang.String details(){
      return "GF2JA2OI3";
    }
    public java.lang.String fields(){
      return "GF2JA2OJ3";
    }
    public java.lang.String header(){
      return "GF2JA2OK3";
    }
    public java.lang.String label(){
      return "GF2JA2OL3";
    }
    public java.lang.String label2(){
      return "GF2JA2OM3";
    }
    public java.lang.String panelHTML(){
      return "GF2JA2ON3";
    }
    public java.lang.String trenner(){
      return "GF2JA2OO3";
    }
    public java.lang.String underline(){
      return "GF2JA2OP3";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static medizin.client.a_nonroo.app.client.ui.QuestiontypesDetailsViewImpl_UserDetailsViewImplUiBinderImpl_GenCss_style style;
  
  static {
    new QuestiontypesDetailsViewImpl_UserDetailsViewImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator()._init0();
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
      case 'style': return this.@medizin.client.a_nonroo.app.client.ui.QuestiontypesDetailsViewImpl_UserDetailsViewImplUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
