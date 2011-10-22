package medizin.client.a_nonroo.app.client.ui.assesment;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class AssesmentViewImpl_AssesmentViewImplUiBinderImpl_GenBundle_default_StaticClientBundleGenerator implements medizin.client.a_nonroo.app.client.ui.assesment.AssesmentViewImpl_AssesmentViewImplUiBinderImpl_GenBundle {
  public medizin.client.a_nonroo.app.client.ui.assesment.AssesmentViewImpl_AssesmentViewImplUiBinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new medizin.client.a_nonroo.app.client.ui.assesment.AssesmentViewImpl_AssesmentViewImplUiBinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GF2JA2OHV{border:" + ("0"+ " " +"solid"+ " " +"#ddf")  + ";position:" + ("absolute")  + ";right:" + ("0")  + ";top:" + ("0")  + ";left:" + ("5px")  + ";bottom:" + ("0")  + ";}.GF2JA2OFV{position:" + ("absolute")  + ";right:" + ("0")  + ";left:" + ("0")  + ";top:" + ("3px")  + ";height:") + (("2em")  + ";margin-right:" + ("15px")  + ";}.GF2JA2OFV table{position:" + ("absolute")  + ";left:" + ("0")  + ";top:" + ("0")  + ";}.GF2JA2OFV button{display:" + ("inline")  + ";}.GF2JA2OGV{position:" + ("relative")  + ";padding-left:" + ("5px")  + ";}.GF2JA2OIV{width:" + ("100%")  + ";}.GF2JA2OGV>table td{text-overflow:" + ("ellipsis")  + ";overflow:" + ("hidden") ) + (";cursor:" + ("pointer")  + ";}")) : ((".GF2JA2OHV{border:" + ("0"+ " " +"solid"+ " " +"#ddf")  + ";position:" + ("absolute")  + ";left:" + ("0")  + ";top:" + ("0")  + ";right:" + ("5px")  + ";bottom:" + ("0")  + ";}.GF2JA2OFV{position:" + ("absolute")  + ";left:" + ("0")  + ";right:" + ("0")  + ";top:" + ("3px")  + ";height:") + (("2em")  + ";margin-left:" + ("15px")  + ";}.GF2JA2OFV table{position:" + ("absolute")  + ";right:" + ("0")  + ";top:" + ("0")  + ";}.GF2JA2OFV button{display:" + ("inline")  + ";}.GF2JA2OGV{position:" + ("relative")  + ";padding-right:" + ("5px")  + ";}.GF2JA2OIV{width:" + ("100%")  + ";}.GF2JA2OGV>table td{text-overflow:" + ("ellipsis")  + ";overflow:" + ("hidden") ) + (";cursor:" + ("pointer")  + ";}"));
    }
    public java.lang.String controls(){
      return "GF2JA2OFV";
    }
    public java.lang.String listView(){
      return "GF2JA2OGV";
    }
    public java.lang.String panelHTML(){
      return "GF2JA2OHV";
    }
    public java.lang.String scroll1(){
      return "GF2JA2OIV";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static medizin.client.a_nonroo.app.client.ui.assesment.AssesmentViewImpl_AssesmentViewImplUiBinderImpl_GenCss_style style;
  
  static {
    new AssesmentViewImpl_AssesmentViewImplUiBinderImpl_GenBundle_default_StaticClientBundleGenerator()._init0();
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
      case 'style': return this.@medizin.client.a_nonroo.app.client.ui.assesment.AssesmentViewImpl_AssesmentViewImplUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
