package com.google.gwt.cell.client;

public class IconCellDecorator_TemplateImpl implements com.google.gwt.cell.client.IconCellDecorator.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml imageWrapperTop(java.lang.String arg0,com.google.gwt.safehtml.shared.SafeHtml arg1) {
    StringBuilder sb = new java.lang.StringBuilder()
        .append("<div style=\"position:absolute;")
        .append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0))
        .append(":0px;top:0px;line-height:0px;\">")
        .append(arg1.asString())
        .append("</div>")
        ;
    return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
  }
  
  public com.google.gwt.safehtml.shared.SafeHtml imageWrapperBottom(java.lang.String arg0,com.google.gwt.safehtml.shared.SafeHtml arg1) {
    StringBuilder sb = new java.lang.StringBuilder()
        .append("<div style=\"position:absolute;")
        .append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0))
        .append(":0px;bottom:0px;line-height:0px;\">")
        .append(arg1.asString())
        .append("</div>")
        ;
    return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
  }
  
  public com.google.gwt.safehtml.shared.SafeHtml outerDiv(java.lang.String arg0,int arg1,com.google.gwt.safehtml.shared.SafeHtml arg2,com.google.gwt.safehtml.shared.SafeHtml arg3) {
    StringBuilder sb = new java.lang.StringBuilder()
        .append("<div style=\"position:relative;padding-")
        .append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0))
        .append(":")
        .append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(String.valueOf(arg1)))
        .append("px;zoom:1;\">")
        .append(arg2.asString())
        .append("<div>")
        .append(arg3.asString())
        .append("</div></div>")
        ;
    return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
  }
  
  public com.google.gwt.safehtml.shared.SafeHtml imageWrapperMiddle(java.lang.String arg0,int arg1,com.google.gwt.safehtml.shared.SafeHtml arg2) {
    StringBuilder sb = new java.lang.StringBuilder()
        .append("<div style=\"position:absolute;")
        .append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0))
        .append(":0px;top:50%;line-height:0px;margin-top:-")
        .append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(String.valueOf(arg1)))
        .append("px;\">")
        .append(arg2.asString())
        .append("</div>")
        ;
    return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
  }
}
