package medizin.client.a_nonroo.app.client.ui.assignquestion;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class QuestionViewImpl_QuestionViewImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionViewImpl_QuestionViewImplUiBinderImpl_GenBundle {
  public medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionViewImpl_QuestionViewImplUiBinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionViewImpl_QuestionViewImplUiBinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GF2JA2OEX{background-color:" + ("#bfd6c3")  + ";padding:" + ("3px")  + ";valign:" + ("top")  + ";}.GF2JA2OFX{background-color:" + ("#bfd6c3")  + ";padding:" + ("3px")  + ";}.GF2JA2OBX{background-color:" + ("#e4f2e7")  + ";width:" + ("100%")  + ";padding:" + ("10px"+ " " +"5px"+ " " +"5px"+ " " +"5px")  + ";}.GF2JA2OHX{width:" + ("100%")  + ";}.GF2JA2OIX{width:" + ("100%")  + ";background-color:") + (("#e4f2e7")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#bfd6c3")  + ";}.GF2JA2OJX{width:" + ("100%")  + ";}.GF2JA2ODX{cursor:" + ("pointer")  + ";}.GF2JA2OCX{padding:" + ("3px")  + ";background-color:" + ("#e4f2e7")  + ";}.GF2JA2OGX{min-height:" + ("25px")  + ";font-weight:" + ("bold")  + ";}")) : ((".GF2JA2OEX{background-color:" + ("#bfd6c3")  + ";padding:" + ("3px")  + ";valign:" + ("top")  + ";}.GF2JA2OFX{background-color:" + ("#bfd6c3")  + ";padding:" + ("3px")  + ";}.GF2JA2OBX{background-color:" + ("#e4f2e7")  + ";width:" + ("100%")  + ";padding:" + ("10px"+ " " +"5px"+ " " +"5px"+ " " +"5px")  + ";}.GF2JA2OHX{width:" + ("100%")  + ";}.GF2JA2OIX{width:" + ("100%")  + ";background-color:") + (("#e4f2e7")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#bfd6c3")  + ";}.GF2JA2OJX{width:" + ("100%")  + ";}.GF2JA2ODX{cursor:" + ("pointer")  + ";}.GF2JA2OCX{padding:" + ("3px")  + ";background-color:" + ("#e4f2e7")  + ";}.GF2JA2OGX{min-height:" + ("25px")  + ";font-weight:" + ("bold")  + ";}"));
    }
    public java.lang.String answers(){
      return "GF2JA2OBX";
    }
    public java.lang.String detailsTablePanel(){
      return "GF2JA2OCX";
    }
    public java.lang.String fill(){
      return "GF2JA2ODX";
    }
    public java.lang.String header(){
      return "GF2JA2OEX";
    }
    public java.lang.String headerIcon(){
      return "GF2JA2OFX";
    }
    public java.lang.String label(){
      return "GF2JA2OGX";
    }
    public java.lang.String question(){
      return "GF2JA2OHX";
    }
    public java.lang.String questionDetails(){
      return "GF2JA2OIX";
    }
    public java.lang.String questionTable(){
      return "GF2JA2OJX";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionViewImpl_QuestionViewImplUiBinderImpl_GenCss_style style;
  
  static {
    new QuestionViewImpl_QuestionViewImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator()._init0();
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
      case 'style': return this.@medizin.client.a_nonroo.app.client.ui.assignquestion.QuestionViewImpl_QuestionViewImplUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
