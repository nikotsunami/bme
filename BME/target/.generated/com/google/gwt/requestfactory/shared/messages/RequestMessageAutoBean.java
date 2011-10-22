package com.google.gwt.requestfactory.shared.messages;

public class RequestMessageAutoBean extends com.google.gwt.autobean.shared.impl.AbstractAutoBean<com.google.gwt.requestfactory.shared.messages.RequestMessage> {
  private final com.google.gwt.requestfactory.shared.messages.RequestMessage shim = new com.google.gwt.requestfactory.shared.messages.RequestMessage() {
    public java.lang.String getVersion()  {
      RequestMessageAutoBean.this.checkWrapped();
      java.lang.String toReturn = RequestMessageAutoBean.this.get("getVersion", getWrapped().getVersion());
      return toReturn;
    }
    public java.util.List getInvocations()  {
      RequestMessageAutoBean.this.checkWrapped();
      java.util.List toReturn = RequestMessageAutoBean.this.get("getInvocations", getWrapped().getInvocations());
      if (toReturn != null) {
        if (RequestMessageAutoBean.this.isWrapped(toReturn)) {
          toReturn = RequestMessageAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getOperations()  {
      RequestMessageAutoBean.this.checkWrapped();
      java.util.List toReturn = RequestMessageAutoBean.this.get("getOperations", getWrapped().getOperations());
      if (toReturn != null) {
        if (RequestMessageAutoBean.this.isWrapped(toReturn)) {
          toReturn = RequestMessageAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public void setInvocations(java.util.List value)  {
      RequestMessageAutoBean.this.checkWrapped();
      RequestMessageAutoBean.this.checkFrozen();
      RequestMessageAutoBean.this.getWrapped().setInvocations(value);
      RequestMessageAutoBean.this.set("setInvocations", value);
    }
    public void setOperations(java.util.List value)  {
      RequestMessageAutoBean.this.checkWrapped();
      RequestMessageAutoBean.this.checkFrozen();
      RequestMessageAutoBean.this.getWrapped().setOperations(value);
      RequestMessageAutoBean.this.set("setOperations", value);
    }
    public void setVersion(java.lang.String version)  {
      RequestMessageAutoBean.this.checkWrapped();
      RequestMessageAutoBean.this.checkFrozen();
      RequestMessageAutoBean.this.getWrapped().setVersion(version);
      RequestMessageAutoBean.this.set("setVersion", version);
    }
    @Override public boolean equals(Object o) {
      return this == o || getWrapped().equals(o);
    }
    @Override public int hashCode() {
      return getWrapped().hashCode();
    }
    @Override public String toString() {
      return getWrapped().toString();
    }
  };
  { com.google.gwt.core.client.impl.WeakMapping.set(shim, com.google.gwt.autobean.shared.AutoBean.class.getName(), this); }
  public RequestMessageAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public RequestMessageAutoBean(RequestMessageAutoBean toClone, boolean deep) {
    super(toClone, deep);
  }
  public RequestMessageAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory, com.google.gwt.requestfactory.shared.messages.RequestMessage wrapped) {
    super(factory, wrapped);
  }
  public com.google.gwt.requestfactory.shared.messages.RequestMessage as() {return shim;}
  public com.google.gwt.requestfactory.shared.messages.RequestMessageAutoBean clone(boolean deep) {
    return new RequestMessageAutoBean(this, deep);
  }
  public Class<com.google.gwt.requestfactory.shared.messages.RequestMessage> getType() {return com.google.gwt.requestfactory.shared.messages.RequestMessage.class;}
  @Override protected com.google.gwt.requestfactory.shared.messages.RequestMessage createSimplePeer() {
    return new com.google.gwt.requestfactory.shared.messages.RequestMessage() {
      public java.lang.String getVersion()  {
        return (java.lang.String) values.get("V");
      }
      public java.util.List getInvocations()  {
        return (java.util.List) values.get("I");
      }
      public java.util.List getOperations()  {
        return (java.util.List) values.get("O");
      }
      public void setInvocations(java.util.List value)  {
        values.put("I", value);
      }
      public void setOperations(java.util.List value)  {
        values.put("O", value);
      }
      public void setVersion(java.lang.String version)  {
        values.put("V", version);
      }
    };
  }
  @Override protected void traverseProperties(com.google.gwt.autobean.shared.AutoBeanVisitor visitor, com.google.gwt.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    class _VPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getType() { return java.lang.String.class; }
      public void set(Object obj) { 
        values.put("V", obj);
      }
    }
    {_VPropertyContext _VPropertyContext = new _VPropertyContext();
      Object value = as().getVersion();
      if (visitor.visitValueProperty("V", value, _VPropertyContext))
      visitor.endVisitValueProperty("V", value, _VPropertyContext);
    }class _IPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.CollectionPropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getElementType() { return com.google.gwt.requestfactory.shared.messages.InvocationMessage.class; }
      public Class<?> getType() { return java.util.List.class; }
      public void set(Object obj) { 
        values.put("I", obj);
      }
    }
    {_IPropertyContext _IPropertyContext = new _IPropertyContext();
      com.google.gwt.autobean.shared.impl.AbstractAutoBean value = (com.google.gwt.autobean.shared.impl.AbstractAutoBean) com.google.gwt.autobean.shared.AutoBeanUtils.getAutoBean(as().getInvocations());
      if (visitor.visitCollectionProperty("I", value, _IPropertyContext))
        if (value != null) { value.traverse(visitor, ctx); }
      visitor.endVisitCollectionProperty("I", value, _IPropertyContext);
    }class _OPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.CollectionPropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getElementType() { return com.google.gwt.requestfactory.shared.messages.OperationMessage.class; }
      public Class<?> getType() { return java.util.List.class; }
      public void set(Object obj) { 
        values.put("O", obj);
      }
    }
    {_OPropertyContext _OPropertyContext = new _OPropertyContext();
      com.google.gwt.autobean.shared.impl.AbstractAutoBean value = (com.google.gwt.autobean.shared.impl.AbstractAutoBean) com.google.gwt.autobean.shared.AutoBeanUtils.getAutoBean(as().getOperations());
      if (visitor.visitCollectionProperty("O", value, _OPropertyContext))
        if (value != null) { value.traverse(visitor, ctx); }
      visitor.endVisitCollectionProperty("O", value, _OPropertyContext);
    }}
}
