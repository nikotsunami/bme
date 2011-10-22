package medizin.client.a_nonroo.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class InstitutionViewImpl_InstitutionViewImplUiBinderImpl_GenBundle_default_StaticClientBundleGenerator implements medizin.client.a_nonroo.app.client.ui.InstitutionViewImpl_InstitutionViewImplUiBinderImpl_GenBundle {
  public medizin.client.a_nonroo.app.client.ui.InstitutionViewImpl_InstitutionViewImplUiBinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new medizin.client.a_nonroo.app.client.ui.InstitutionViewImpl_InstitutionViewImplUiBinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GF2JA2ONU{border:" + ("0"+ " " +"solid"+ " " +"#ddf")  + ";position:" + ("absolute")  + ";right:" + ("0")  + ";top:" + ("0")  + ";left:" + ("5px")  + ";bottom:" + ("0")  + ";}.GF2JA2OLU{position:" + ("absolute")  + ";right:" + ("0")  + ";left:" + ("0")  + ";top:" + ("3px")  + ";height:") + (("2em")  + ";margin-right:" + ("15px")  + ";}.GF2JA2OLU table{position:" + ("absolute")  + ";left:" + ("0")  + ";top:" + ("0")  + ";}.GF2JA2OLU button{display:" + ("inline")  + ";}.GF2JA2OMU{position:" + ("relative")  + ";padding-left:" + ("5px")  + ";}.GF2JA2OOU{width:" + ("100%")  + ";}.GF2JA2OMU>table td{text-overflow:" + ("ellipsis")  + ";overflow:" + ("hidden") ) + (";cursor:" + ("pointer")  + ";}.GF2JA2OKU{float:" + ("left")  + ";background:" + ("none")  + ";cursor:" + ("pointer")  + ";}table button{background:" + ("none")  + ";}")) : ((".GF2JA2ONU{border:" + ("0"+ " " +"solid"+ " " +"#ddf")  + ";position:" + ("absolute")  + ";left:" + ("0")  + ";top:" + ("0")  + ";right:" + ("5px")  + ";bottom:" + ("0")  + ";}.GF2JA2OLU{position:" + ("absolute")  + ";left:" + ("0")  + ";right:" + ("0")  + ";top:" + ("3px")  + ";height:") + (("2em")  + ";margin-left:" + ("15px")  + ";}.GF2JA2OLU table{position:" + ("absolute")  + ";right:" + ("0")  + ";top:" + ("0")  + ";}.GF2JA2OLU button{display:" + ("inline")  + ";}.GF2JA2OMU{position:" + ("relative")  + ";padding-right:" + ("5px")  + ";}.GF2JA2OOU{width:" + ("100%")  + ";}.GF2JA2OMU>table td{text-overflow:" + ("ellipsis")  + ";overflow:" + ("hidden") ) + (";cursor:" + ("pointer")  + ";}.GF2JA2OKU{float:" + ("right")  + ";background:" + ("none")  + ";cursor:" + ("pointer")  + ";}table button{background:" + ("none")  + ";}"));
    }
    public java.lang.String button(){
      return "GF2JA2OKU";
    }
    public java.lang.String controls(){
      return "GF2JA2OLU";
    }
    public java.lang.String listView(){
      return "GF2JA2OMU";
    }
    public java.lang.String panelHTML(){
      return "GF2JA2ONU";
    }
    public java.lang.String scroll1(){
      return "GF2JA2OOU";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static medizin.client.a_nonroo.app.client.ui.InstitutionViewImpl_InstitutionViewImplUiBinderImpl_GenCss_style style;
  
  static {
    new InstitutionViewImpl_InstitutionViewImplUiBinderImpl_GenBundle_default_StaticClientBundleGenerator()._init0();
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
      case 'style': return this.@medizin.client.a_nonroo.app.client.ui.InstitutionViewImpl_InstitutionViewImplUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
