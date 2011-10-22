package com.allen_sauer.gwt.log.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class LogClientBundle_default_StaticClientBundleGenerator implements com.allen_sauer.gwt.log.client.impl.LogClientBundle {
  public com.allen_sauer.gwt.log.client.impl.LogClientBundle.LogCssResource css() {
    return css;
  }
  private void _init0() {
    css = new com.allen_sauer.gwt.log.client.impl.LogClientBundle.LogCssResource() {
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
      return "css";
    }
    public String getText() {
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".log-panel{background-color:" + ("#ecf2fc")  + ";border:" + ("1px"+ " " +"solid"+ " " +"red")  + ";margin:" + ("0")  + ";filter:" + ("alpha(opacity\\=95)")  + ";opacity:" + ("0.95")  + ";z-index:" + ("1000")  + ";}.log-panel .GF2JA2ODB{font-size:" + ("10pt")  + ";margin:" + ("0")  + ";text-align:" + ("right")  + ";}.log-panel BUTTON{font-size:" + ("10pt")  + ";margin:") + (("0")  + ";}.log-panel .GF2JA2OEB{cursor:" + ("move")  + ";font-weight:" + ("bold")  + ";}.log-panel .GF2JA2OM{margin:" + ("0"+ " " +"1.2em")  + ";}.log-panel BUTTON.GF2JA2OL{color:" + ("#444")  + " !important;}.log-panel .GF2JA2OCB{white-space:" + ("nowrap")  + ";}.log-panel .GF2JA2ON{white-space:" + ("pre")  + ";font-family:" + ("monospace")  + ";cursor:" + ("help")  + ";}.log-panel .GF2JA2OO{background-color:" + ("#f0f0f0")  + ";}.log-panel .GF2JA2OBB{background-color:" + ("#fff") ) + (";}.log-panel .GF2JA2OAB{cursor:" + ("sw-resize")  + ";}")) : ((".log-panel{background-color:" + ("#ecf2fc")  + ";border:" + ("1px"+ " " +"solid"+ " " +"red")  + ";margin:" + ("0")  + ";filter:" + ("alpha(opacity\\=95)")  + ";opacity:" + ("0.95")  + ";z-index:" + ("1000")  + ";}.log-panel .GF2JA2ODB{font-size:" + ("10pt")  + ";margin:" + ("0")  + ";text-align:" + ("left")  + ";}.log-panel BUTTON{font-size:" + ("10pt")  + ";margin:") + (("0")  + ";}.log-panel .GF2JA2OEB{cursor:" + ("move")  + ";font-weight:" + ("bold")  + ";}.log-panel .GF2JA2OM{margin:" + ("0"+ " " +"1.2em")  + ";}.log-panel BUTTON.GF2JA2OL{color:" + ("#444")  + " !important;}.log-panel .GF2JA2OCB{white-space:" + ("nowrap")  + ";}.log-panel .GF2JA2ON{white-space:" + ("pre")  + ";font-family:" + ("monospace")  + ";cursor:" + ("help")  + ";}.log-panel .GF2JA2OO{background-color:" + ("#f0f0f0")  + ";}.log-panel .GF2JA2OBB{background-color:" + ("#fff") ) + (";}.log-panel .GF2JA2OAB{cursor:" + ("se-resize")  + ";}"));
    }
    public java.lang.String logClearAbout(){
      return "GF2JA2OL";
    }
    public java.lang.String logClearButton(){
      return "GF2JA2OM";
    }
    public java.lang.String logMessage(){
      return "GF2JA2ON";
    }
    public java.lang.String logMessageHover(){
      return "GF2JA2OO";
    }
    public java.lang.String logPanel(){
      return "log-panel";
    }
    public java.lang.String logResizeSe(){
      return "GF2JA2OAB";
    }
    public java.lang.String logScrollPanel(){
      return "GF2JA2OBB";
    }
    public java.lang.String logStacktrace(){
      return "GF2JA2OCB";
    }
    public java.lang.String logTextArea(){
      return "GF2JA2ODB";
    }
    public java.lang.String logTitle(){
      return "GF2JA2OEB";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.allen_sauer.gwt.log.client.impl.LogClientBundle.LogCssResource css;
  
  static {
    new LogClientBundle_default_StaticClientBundleGenerator()._init0();
  }
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("css", css());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@com.allen_sauer.gwt.log.client.impl.LogClientBundle::css()();
    }
    return null;
  }-*/;
}
