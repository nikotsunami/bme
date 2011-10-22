package medizin.client.a_nonroo.app.client.ui.user;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class QuestionAccessDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements medizin.client.a_nonroo.app.client.ui.user.QuestionAccessDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle {
  public medizin.client.a_nonroo.app.client.ui.user.QuestionAccessDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new medizin.client.a_nonroo.app.client.ui.user.QuestionAccessDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GF2JA2OBIB{border:" + ("0"+ " " +"solid"+ " " +"#ddf")  + ";height:" + ("100%")  + ";width:" + ("1200px")  + ";}.GF2JA2OPHB{position:" + ("absolute")  + ";right:" + ("0")  + ";left:" + ("0")  + ";top:" + ("9px")  + ";height:" + ("2em")  + ";margin-right:" + ("15px")  + ";margin-top:" + ("25px")  + ";margin-left:") + (("10px")  + ";}.GF2JA2OPHB table{position:" + ("absolute")  + ";left:" + ("0")  + ";top:" + ("0")  + ";}.GF2JA2OPHB button{display:" + ("inline")  + ";}.GF2JA2OAIB{position:" + ("relative")  + ";}.GF2JA2ODIB{width:" + ("100%")  + ";}.GF2JA2OAIB>table{table-layout:" + ("fixed")  + ";}.GF2JA2OAIB>table td{text-overflow:" + ("ellipsis")  + ";overflow:" + ("hidden")  + ";white-space:" + ("nowrap") ) + (";cursor:" + ("pointer")  + ";}.GF2JA2OOHB{float:" + ("left")  + ";width:" + ("100%")  + ";background-color:" + ("#e6eded")  + ";}.GF2JA2OCIB{float:" + ("left")  + ";margin:" + ("3px")  + ";}")) : ((".GF2JA2OBIB{border:" + ("0"+ " " +"solid"+ " " +"#ddf")  + ";height:" + ("100%")  + ";width:" + ("1200px")  + ";}.GF2JA2OPHB{position:" + ("absolute")  + ";left:" + ("0")  + ";right:" + ("0")  + ";top:" + ("9px")  + ";height:" + ("2em")  + ";margin-left:" + ("15px")  + ";margin-top:" + ("25px")  + ";margin-right:") + (("10px")  + ";}.GF2JA2OPHB table{position:" + ("absolute")  + ";right:" + ("0")  + ";top:" + ("0")  + ";}.GF2JA2OPHB button{display:" + ("inline")  + ";}.GF2JA2OAIB{position:" + ("relative")  + ";}.GF2JA2ODIB{width:" + ("100%")  + ";}.GF2JA2OAIB>table{table-layout:" + ("fixed")  + ";}.GF2JA2OAIB>table td{text-overflow:" + ("ellipsis")  + ";overflow:" + ("hidden")  + ";white-space:" + ("nowrap") ) + (";cursor:" + ("pointer")  + ";}.GF2JA2OOHB{float:" + ("right")  + ";width:" + ("100%")  + ";background-color:" + ("#e6eded")  + ";}.GF2JA2OCIB{float:" + ("right")  + ";margin:" + ("3px")  + ";}"));
    }
    public java.lang.String bar(){
      return "GF2JA2OOHB";
    }
    public java.lang.String controls(){
      return "GF2JA2OPHB";
    }
    public java.lang.String listView(){
      return "GF2JA2OAIB";
    }
    public java.lang.String panelHTML(){
      return "GF2JA2OBIB";
    }
    public java.lang.String right(){
      return "GF2JA2OCIB";
    }
    public java.lang.String scroll1(){
      return "GF2JA2ODIB";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static medizin.client.a_nonroo.app.client.ui.user.QuestionAccessDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenCss_style style;
  
  static {
    new QuestionAccessDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator()._init0();
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
      case 'style': return this.@medizin.client.a_nonroo.app.client.ui.user.QuestionAccessDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
