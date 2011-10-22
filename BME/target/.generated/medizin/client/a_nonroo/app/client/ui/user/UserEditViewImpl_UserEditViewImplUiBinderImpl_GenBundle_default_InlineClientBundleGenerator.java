package medizin.client.a_nonroo.app.client.ui.user;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class UserEditViewImpl_UserEditViewImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements medizin.client.a_nonroo.app.client.ui.user.UserEditViewImpl_UserEditViewImplUiBinderImpl_GenBundle {
  public medizin.client.a_nonroo.app.client.ui.user.UserEditViewImpl_UserEditViewImplUiBinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new medizin.client.a_nonroo.app.client.ui.user.UserEditViewImpl_UserEditViewImplUiBinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GF2JA2OMKB{border:" + ("0"+ " " +"solid"+ " " +"#ddf")  + ";height:" + ("100%")  + ";width:" + ("100%")  + ";}.GF2JA2OJKB{margin:" + ("0.5em")  + ";padding-left:" + ("1em")  + ";white-space:" + ("nowrap")  + ";width:" + ("1005")  + ";}.GF2JA2OLKB{min-height:" + ("25px")  + ";font-weight:" + ("bold")  + ";}.GF2JA2OHKB{margin-right:" + ("0.5em")  + ";float:") + (("left")  + ";background:" + ("none")  + ";cursor:" + ("pointer")  + ";}.GF2JA2OKKB{padding:" + ("3px")  + ";color:" + ("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";margin-bottom:" + ("0")  + ";background-color:" + ("#e6eded")  + ";font-size:" + ("1.2em")  + ";font-weight:" + ("bold")  + ";}.GF2JA2ONKB{border-bottom:" + ("1px"+ " " +"solid"+ " " +"#6f7277") ) + (";}.GF2JA2OGKB{padding-right:" + ("10px")  + ";padding-left:" + ("10px")  + ";}.GF2JA2OFKB{padding:" + ("3px")  + ";background-color:" + ("#e6eded")  + ";}.GF2JA2OIKB{border:" + ("1px"+ " " +"solid"+ " " +"#e6eded")  + ";width:" + ("100%")  + ";}")) : ((".GF2JA2OMKB{border:" + ("0"+ " " +"solid"+ " " +"#ddf")  + ";height:" + ("100%")  + ";width:" + ("100%")  + ";}.GF2JA2OJKB{margin:" + ("0.5em")  + ";padding-right:" + ("1em")  + ";white-space:" + ("nowrap")  + ";width:" + ("1005")  + ";}.GF2JA2OLKB{min-height:" + ("25px")  + ";font-weight:" + ("bold")  + ";}.GF2JA2OHKB{margin-left:" + ("0.5em")  + ";float:") + (("right")  + ";background:" + ("none")  + ";cursor:" + ("pointer")  + ";}.GF2JA2OKKB{padding:" + ("3px")  + ";color:" + ("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";margin-bottom:" + ("0")  + ";background-color:" + ("#e6eded")  + ";font-size:" + ("1.2em")  + ";font-weight:" + ("bold")  + ";}.GF2JA2ONKB{border-bottom:" + ("1px"+ " " +"solid"+ " " +"#6f7277") ) + (";}.GF2JA2OGKB{padding-left:" + ("10px")  + ";padding-right:" + ("10px")  + ";}.GF2JA2OFKB{padding:" + ("3px")  + ";background-color:" + ("#e6eded")  + ";}.GF2JA2OIKB{border:" + ("1px"+ " " +"solid"+ " " +"#e6eded")  + ";width:" + ("100%")  + ";}"));
    }
    public java.lang.String bar(){
      return "GF2JA2OFKB";
    }
    public java.lang.String boundary(){
      return "GF2JA2OGKB";
    }
    public java.lang.String button(){
      return "GF2JA2OHKB";
    }
    public java.lang.String details(){
      return "GF2JA2OIKB";
    }
    public java.lang.String fields(){
      return "GF2JA2OJKB";
    }
    public java.lang.String header(){
      return "GF2JA2OKKB";
    }
    public java.lang.String label(){
      return "GF2JA2OLKB";
    }
    public java.lang.String panelHTML(){
      return "GF2JA2OMKB";
    }
    public java.lang.String underline(){
      return "GF2JA2ONKB";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static medizin.client.a_nonroo.app.client.ui.user.UserEditViewImpl_UserEditViewImplUiBinderImpl_GenCss_style style;
  
  static {
    new UserEditViewImpl_UserEditViewImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator()._init0();
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
      case 'style': return this.@medizin.client.a_nonroo.app.client.ui.user.UserEditViewImpl_UserEditViewImplUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
