package medizin.client.a_nonroo.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class DeclineEmailPopup_DeclineEmailPopupUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements medizin.client.a_nonroo.app.client.DeclineEmailPopup_DeclineEmailPopupUiBinderImpl_GenBundle {
  public medizin.client.a_nonroo.app.client.DeclineEmailPopup_DeclineEmailPopupUiBinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new medizin.client.a_nonroo.app.client.DeclineEmailPopup_DeclineEmailPopupUiBinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GF2JA2OD2{margin:" + ("1em")  + ";float:" + ("left")  + ";background:" + ("none")  + ";cursor:" + ("pointer")  + ";}.GF2JA2OF2{margin:" + ("1.5em")  + ";padding:" + ("1em")  + ";float:" + ("left")  + ";background:" + ("none")  + ";cursor:" + ("pointer")  + ";}.GF2JA2OE2{border:" + ("1px"+ " " +"solid"+ " " +"#e6eded")  + ";width:") + (("100%")  + ";background:" + ("#e3e8f3"+ " " +"url(images/hborder.png)"+ " " +"repeat-x"+ " " +"0"+ " " +"-2003px")  + ";}.GF2JA2OG2{border:" + ("1px"+ " " +"solid"+ " " +"#e6eded")  + ";width:" + ("100%")  + ";}")) : ((".GF2JA2OD2{margin:" + ("1em")  + ";float:" + ("right")  + ";background:" + ("none")  + ";cursor:" + ("pointer")  + ";}.GF2JA2OF2{margin:" + ("1.5em")  + ";padding:" + ("1em")  + ";float:" + ("right")  + ";background:" + ("none")  + ";cursor:" + ("pointer")  + ";}.GF2JA2OE2{border:" + ("1px"+ " " +"solid"+ " " +"#e6eded")  + ";width:") + (("100%")  + ";background:" + ("#e3e8f3"+ " " +"url(images/hborder.png)"+ " " +"repeat-x"+ " " +"0"+ " " +"-2003px")  + ";}.GF2JA2OG2{border:" + ("1px"+ " " +"solid"+ " " +"#e6eded")  + ";width:" + ("100%")  + ";}"));
    }
    public java.lang.String button(){
      return "GF2JA2OD2";
    }
    public java.lang.String nav(){
      return "GF2JA2OE2";
    }
    public java.lang.String panel(){
      return "GF2JA2OF2";
    }
    public java.lang.String textarea(){
      return "GF2JA2OG2";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static medizin.client.a_nonroo.app.client.DeclineEmailPopup_DeclineEmailPopupUiBinderImpl_GenCss_style style;
  
  static {
    new DeclineEmailPopup_DeclineEmailPopupUiBinderImpl_GenBundle_default_InlineClientBundleGenerator()._init0();
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
      case 'style': return this.@medizin.client.a_nonroo.app.client.DeclineEmailPopup_DeclineEmailPopupUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
