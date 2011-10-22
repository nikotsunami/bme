package medizin.client.a_nonroo.app.client.dnd3.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class QuestionViewImpl_QuestionViewImplUiBinderImpl_GenBundle_default_StaticClientBundleGenerator implements medizin.client.a_nonroo.app.client.dnd3.ui.QuestionViewImpl_QuestionViewImplUiBinderImpl_GenBundle {
  public medizin.client.a_nonroo.app.client.dnd3.ui.QuestionViewImpl_QuestionViewImplUiBinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new medizin.client.a_nonroo.app.client.dnd3.ui.QuestionViewImpl_QuestionViewImplUiBinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GF2JA2OL2{font-weight:" + ("bold")  + ";}")) : ((".GF2JA2OL2{font-weight:" + ("bold")  + ";}"));
    }
    public java.lang.String important(){
      return "GF2JA2OL2";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static medizin.client.a_nonroo.app.client.dnd3.ui.QuestionViewImpl_QuestionViewImplUiBinderImpl_GenCss_style style;
  
  static {
    new QuestionViewImpl_QuestionViewImplUiBinderImpl_GenBundle_default_StaticClientBundleGenerator()._init0();
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
      case 'style': return this.@medizin.client.a_nonroo.app.client.dnd3.ui.QuestionViewImpl_QuestionViewImplUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
