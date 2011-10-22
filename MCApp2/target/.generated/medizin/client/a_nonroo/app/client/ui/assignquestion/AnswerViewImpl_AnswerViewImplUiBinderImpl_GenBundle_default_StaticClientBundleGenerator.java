package medizin.client.a_nonroo.app.client.ui.assignquestion;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class AnswerViewImpl_AnswerViewImplUiBinderImpl_GenBundle_default_StaticClientBundleGenerator implements medizin.client.a_nonroo.app.client.ui.assignquestion.AnswerViewImpl_AnswerViewImplUiBinderImpl_GenBundle {
  public medizin.client.a_nonroo.app.client.ui.assignquestion.AnswerViewImpl_AnswerViewImplUiBinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new medizin.client.a_nonroo.app.client.ui.assignquestion.AnswerViewImpl_AnswerViewImplUiBinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GF2JA2ONV{background-color:" + ("#bfd6c3")  + ";}.GF2JA2OLV{background-color:" + ("#e4f2e7")  + ";width:" + ("100%")  + ";}.GF2JA2OOV{width:" + ("100%")  + ";}.GF2JA2OMV{width:" + ("100%")  + ";height:" + ("100%")  + ";display:" + ("block")  + ";}.GF2JA2OKV{width:" + ("100%")  + ";}.GF2JA2OJV{background-color:" + ("#e89ea2")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#cf7074")  + ";margin-bottom:") + (("5px")  + ";width:" + ("95%")  + ";padding:" + ("1px")  + ";margin-right:" + ("10px")  + ";-moz-border-radius:" + ("5px")  + ";-webkit-border-radius:" + ("5px")  + ";-khtml-border-radius:" + ("5px")  + ";border-radius:" + ("5px")  + ";float:" + ("right")  + ";}.GF2JA2OPV{float:" + ("left")  + ";}.GF2JA2OAW{width:" + ("18px") ) + (";}")) : ((".GF2JA2ONV{background-color:" + ("#bfd6c3")  + ";}.GF2JA2OLV{background-color:" + ("#e4f2e7")  + ";width:" + ("100%")  + ";}.GF2JA2OOV{width:" + ("100%")  + ";}.GF2JA2OMV{width:" + ("100%")  + ";height:" + ("100%")  + ";display:" + ("block")  + ";}.GF2JA2OKV{width:" + ("100%")  + ";}.GF2JA2OJV{background-color:" + ("#e89ea2")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#cf7074")  + ";margin-bottom:") + (("5px")  + ";width:" + ("95%")  + ";padding:" + ("1px")  + ";margin-left:" + ("10px")  + ";-moz-border-radius:" + ("5px")  + ";-webkit-border-radius:" + ("5px")  + ";-khtml-border-radius:" + ("5px")  + ";border-radius:" + ("5px")  + ";float:" + ("left")  + ";}.GF2JA2OPV{float:" + ("right")  + ";}.GF2JA2OAW{width:" + ("18px") ) + (";}"));
    }
    public java.lang.String answer(){
      return "GF2JA2OJV";
    }
    public java.lang.String answerTable(){
      return "GF2JA2OKV";
    }
    public java.lang.String answers(){
      return "GF2JA2OLV";
    }
    public java.lang.String fill(){
      return "GF2JA2OMV";
    }
    public java.lang.String header(){
      return "GF2JA2ONV";
    }
    public java.lang.String maxWidth(){
      return "GF2JA2OOV";
    }
    public java.lang.String right(){
      return "GF2JA2OPV";
    }
    public java.lang.String validity(){
      return "GF2JA2OAW";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static medizin.client.a_nonroo.app.client.ui.assignquestion.AnswerViewImpl_AnswerViewImplUiBinderImpl_GenCss_style style;
  
  static {
    new AnswerViewImpl_AnswerViewImplUiBinderImpl_GenBundle_default_StaticClientBundleGenerator()._init0();
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
      case 'style': return this.@medizin.client.a_nonroo.app.client.ui.assignquestion.AnswerViewImpl_AnswerViewImplUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
