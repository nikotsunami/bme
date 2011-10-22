package com.google.gwt.user.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class NotificationMole_BinderImpl_GenBundle_default_StaticClientBundleGenerator implements com.google.gwt.user.client.ui.NotificationMole_BinderImpl_GenBundle {
  public com.google.gwt.user.client.ui.NotificationMole_BinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new com.google.gwt.user.client.ui.NotificationMole_BinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GF2JA2OMQ{position:" + ("absolute")  + ";height:" + ("0")  + ";text-align:" + ("center")  + ";width:" + ("100%")  + ";}.GF2JA2OLQ{margin-right:" + ("auto")  + ";margin-left:" + ("auto")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#96a2b5")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#96a2b5")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#96a2b5")  + ";background-color:" + ("#e5edf9")  + ";padding:") + (("5px")  + ";overflow:" + ("hidden")  + ";display:" + ("inline-block")  + ";}.GF2JA2ONQ{font-family:" + ("Helvetica")  + ";font-size:" + ("1em")  + ";}")) : ((".GF2JA2OMQ{position:" + ("absolute")  + ";height:" + ("0")  + ";text-align:" + ("center")  + ";width:" + ("100%")  + ";}.GF2JA2OLQ{margin-left:" + ("auto")  + ";margin-right:" + ("auto")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#96a2b5")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#96a2b5")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#96a2b5")  + ";background-color:" + ("#e5edf9")  + ";padding:") + (("5px")  + ";overflow:" + ("hidden")  + ";display:" + ("inline-block")  + ";}.GF2JA2ONQ{font-family:" + ("Helvetica")  + ";font-size:" + ("1em")  + ";}"));
    }
    public java.lang.String centered(){
      return "GF2JA2OLQ";
    }
    public java.lang.String container(){
      return "GF2JA2OMQ";
    }
    public java.lang.String notificationText(){
      return "GF2JA2ONQ";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.user.client.ui.NotificationMole_BinderImpl_GenCss_style style;
  
  static {
    new NotificationMole_BinderImpl_GenBundle_default_StaticClientBundleGenerator()._init0();
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
      case 'style': return this.@com.google.gwt.user.client.ui.NotificationMole_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
