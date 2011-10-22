package com.google.gwt.user.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class HorizontalSplitPanel_Resources_default_InlineClientBundleGenerator implements com.google.gwt.user.client.ui.HorizontalSplitPanel.Resources {
  public com.google.gwt.resources.client.ImageResource horizontalSplitPanelThumb() {
    return horizontalSplitPanelThumb;
  }
  private void _init0() {
    horizontalSplitPanelThumb = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "horizontalSplitPanelThumb",
    externalImage,
    0, 0, 7, 7, false, false
  );
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAcAAAAHCAYAAADEUlfTAAAArklEQVR42mNgAAI/Pz/xsLCweUC8KygoqJ4BBnx8fKRjYmJeBAQEPAwODr4THR39DIgPgSVBOoCCD+Pi4s5UVVWdaW5uPpOdnf02Pj7emyEiImJXYmLinUmTJp3ZsmXLmV27dp1pamp6UVxcXMgQFRXVnJ+f/xQkcerUqTMnTpw4W1tb+66trU0LbHRBQcH+urq6dz09PS9B9MSJExGOAgGgSnug0ekzZszQgokBAExeULnCXQAFAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource horizontalSplitPanelThumb;
  
  static {
    new HorizontalSplitPanel_Resources_default_InlineClientBundleGenerator()._init0();
  }
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      horizontalSplitPanelThumb(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("horizontalSplitPanelThumb", horizontalSplitPanelThumb());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'horizontalSplitPanelThumb': return this.@com.google.gwt.user.client.ui.HorizontalSplitPanel.Resources::horizontalSplitPanelThumb()();
    }
    return null;
  }-*/;
}
