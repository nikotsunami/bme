package com.allen_sauer.gwt.dnd.client.util;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class DragClientBundle_default_InlineClientBundleGenerator implements com.allen_sauer.gwt.dnd.client.util.DragClientBundle {
  public com.allen_sauer.gwt.dnd.client.util.DragClientBundle.DragCssResource css() {
    return css;
  }
  private void _init0() {
    css = new com.allen_sauer.gwt.dnd.client.util.DragClientBundle.DragCssResource() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("HTML{margin:" + ("0")  + " !important;border:" + ("none")  + " !important;}.dragdrop-handle{cursor:" + ("move")  + ";user-select:" + ("none")  + ";-khtml-user-select:" + ("none")  + ";-moz-user-select:" + ("none")  + ";}.dragdrop-draggable{zoom:" + ("1")  + ";}.dragdrop-dragging{zoom:" + ("normal")  + ";}.dragdrop-positioner{border:" + ("1px"+ " " +"dashed"+ " " +"#1e90ff")  + ";margin:" + ("0")  + " !important;zoom:") + (("1")  + ";z-index:" + ("100")  + ";}.dragdrop-flow-panel-positioner{color:" + ("#1e90ff")  + ";display:" + ("inline")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.dragdrop-proxy{background-color:" + ("#7af")  + ";}.dragdrop-selected,.dragdrop-dragging,.dragdrop-proxy{filter:" + ("alpha(opacity\\=30)")  + ";opacity:" + ("0.3")  + ";}.dragdrop-movable-panel{z-index:" + ("200")  + ";margin:" + ("0") ) + (" !important;border:" + ("none")  + " !important;}")) : (("HTML{margin:" + ("0")  + " !important;border:" + ("none")  + " !important;}.dragdrop-handle{cursor:" + ("move")  + ";user-select:" + ("none")  + ";-khtml-user-select:" + ("none")  + ";-moz-user-select:" + ("none")  + ";}.dragdrop-draggable{zoom:" + ("1")  + ";}.dragdrop-dragging{zoom:" + ("normal")  + ";}.dragdrop-positioner{border:" + ("1px"+ " " +"dashed"+ " " +"#1e90ff")  + ";margin:" + ("0")  + " !important;zoom:") + (("1")  + ";z-index:" + ("100")  + ";}.dragdrop-flow-panel-positioner{color:" + ("#1e90ff")  + ";display:" + ("inline")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.dragdrop-proxy{background-color:" + ("#7af")  + ";}.dragdrop-selected,.dragdrop-dragging,.dragdrop-proxy{filter:" + ("alpha(opacity\\=30)")  + ";opacity:" + ("0.3")  + ";}.dragdrop-movable-panel{z-index:" + ("200")  + ";margin:" + ("0") ) + (" !important;border:" + ("none")  + " !important;}"));
    }
    public java.lang.String boundary(){
      return "dragdrop-boundary";
    }
    public java.lang.String draggable(){
      return "dragdrop-draggable";
    }
    public java.lang.String dragging(){
      return "dragdrop-dragging";
    }
    public java.lang.String dropTarget(){
      return "dragdrop-dropTarget";
    }
    public java.lang.String dropTargetEngage(){
      return "dragdrop-dropTarget-engage";
    }
    public java.lang.String flowPanelPositioner(){
      return "dragdrop-flow-panel-positioner";
    }
    public java.lang.String handle(){
      return "dragdrop-handle";
    }
    public java.lang.String movablePanel(){
      return "dragdrop-movable-panel";
    }
    public java.lang.String positioner(){
      return "dragdrop-positioner";
    }
    public java.lang.String proxy(){
      return "dragdrop-proxy";
    }
    public java.lang.String selected(){
      return "dragdrop-selected";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.allen_sauer.gwt.dnd.client.util.DragClientBundle.DragCssResource css;
  
  static {
    new DragClientBundle_default_InlineClientBundleGenerator()._init0();
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
      case 'css': return this.@com.allen_sauer.gwt.dnd.client.util.DragClientBundle::css()();
    }
    return null;
  }-*/;
}
