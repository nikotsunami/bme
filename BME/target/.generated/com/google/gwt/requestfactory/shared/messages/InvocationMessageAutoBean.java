package com.google.gwt.requestfactory.shared.messages;

public class InvocationMessageAutoBean extends com.google.gwt.autobean.shared.impl.AbstractAutoBean<com.google.gwt.requestfactory.shared.messages.InvocationMessage> {
  private final com.google.gwt.requestfactory.shared.messages.InvocationMessage shim = new com.google.gwt.requestfactory.shared.messages.InvocationMessage() {
    public java.lang.String getOperation()  {
      InvocationMessageAutoBean.this.checkWrapped();
      java.lang.String toReturn = InvocationMessageAutoBean.this.get("getOperation", getWrapped().getOperation());
      return toReturn;
    }
    public java.util.List getParameters()  {
      InvocationMessageAutoBean.this.checkWrapped();
      java.util.List toReturn = InvocationMessageAutoBean.this.get("getParameters", getWrapped().getParameters());
      if (toReturn != null) {
        if (InvocationMessageAutoBean.this.isWrapped(toReturn)) {
          toReturn = InvocationMessageAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.Set getPropertyRefs()  {
      InvocationMessageAutoBean.this.checkWrapped();
      java.util.Set toReturn = InvocationMessageAutoBean.this.get("getPropertyRefs", getWrapped().getPropertyRefs());
      if (toReturn != null) {
        if (InvocationMessageAutoBean.this.isWrapped(toReturn)) {
          toReturn = InvocationMessageAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.SetAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public void setOperation(java.lang.String value)  {
      InvocationMessageAutoBean.this.checkWrapped();
      InvocationMessageAutoBean.this.checkFrozen();
      InvocationMessageAutoBean.this.getWrapped().setOperation(value);
      InvocationMessageAutoBean.this.set("setOperation", value);
    }
    public void setParameters(java.util.List value)  {
      InvocationMessageAutoBean.this.checkWrapped();
      InvocationMessageAutoBean.this.checkFrozen();
      InvocationMessageAutoBean.this.getWrapped().setParameters(value);
      InvocationMessageAutoBean.this.set("setParameters", value);
    }
    public void setPropertyRefs(java.util.Set value)  {
      InvocationMessageAutoBean.this.checkWrapped();
      InvocationMessageAutoBean.this.checkFrozen();
      InvocationMessageAutoBean.this.getWrapped().setPropertyRefs(value);
      InvocationMessageAutoBean.this.set("setPropertyRefs", value);
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
  public InvocationMessageAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public InvocationMessageAutoBean(InvocationMessageAutoBean toClone, boolean deep) {
    super(toClone, deep);
  }
  public InvocationMessageAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory, com.google.gwt.requestfactory.shared.messages.InvocationMessage wrapped) {
    super(factory, wrapped);
  }
  public com.google.gwt.requestfactory.shared.messages.InvocationMessage as() {return shim;}
  public com.google.gwt.requestfactory.shared.messages.InvocationMessageAutoBean clone(boolean deep) {
    return new InvocationMessageAutoBean(this, deep);
  }
  public Class<com.google.gwt.requestfactory.shared.messages.InvocationMessage> getType() {return com.google.gwt.requestfactory.shared.messages.InvocationMessage.class;}
  @Override protected com.google.gwt.requestfactory.shared.messages.InvocationMessage createSimplePeer() {
    return new com.google.gwt.requestfactory.shared.messages.InvocationMessage() {
      public java.lang.String getOperation()  {
        return (java.lang.String) values.get("O");
      }
      public java.util.List getParameters()  {
        return (java.util.List) values.get("P");
      }
      public java.util.Set getPropertyRefs()  {
        return (java.util.Set) values.get("R");
      }
      public void setOperation(java.lang.String value)  {
        values.put("O", value);
      }
      public void setParameters(java.util.List value)  {
        values.put("P", value);
      }
      public void setPropertyRefs(java.util.Set value)  {
        values.put("R", value);
      }
    };
  }
  @Override protected void traverseProperties(com.google.gwt.autobean.shared.AutoBeanVisitor visitor, com.google.gwt.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    class _OPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getType() { return java.lang.String.class; }
      public void set(Object obj) { 
        values.put("O", obj);
      }
    }
    {_OPropertyContext _OPropertyContext = new _OPropertyContext();
      Object value = as().getOperation();
      if (visitor.visitValueProperty("O", value, _OPropertyContext))
      visitor.endVisitValueProperty("O", value, _OPropertyContext);
    }class _PPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.CollectionPropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getElementType() { return com.google.gwt.autobean.shared.Splittable.class; }
      public Class<?> getType() { return java.util.List.class; }
      public void set(Object obj) { 
        values.put("P", obj);
      }
    }
    {_PPropertyContext _PPropertyContext = new _PPropertyContext();
      com.google.gwt.autobean.shared.impl.AbstractAutoBean value = (com.google.gwt.autobean.shared.impl.AbstractAutoBean) com.google.gwt.autobean.shared.AutoBeanUtils.getAutoBean(as().getParameters());
      if (visitor.visitCollectionProperty("P", value, _PPropertyContext))
        if (value != null) { value.traverse(visitor, ctx); }
      visitor.endVisitCollectionProperty("P", value, _PPropertyContext);
    }class _RPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.CollectionPropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getElementType() { return java.lang.String.class; }
      public Class<?> getType() { return java.util.Set.class; }
      public void set(Object obj) { 
        values.put("R", obj);
      }
    }
    {_RPropertyContext _RPropertyContext = new _RPropertyContext();
      com.google.gwt.autobean.shared.impl.AbstractAutoBean value = (com.google.gwt.autobean.shared.impl.AbstractAutoBean) com.google.gwt.autobean.shared.AutoBeanUtils.getAutoBean(as().getPropertyRefs());
      if (visitor.visitCollectionProperty("R", value, _RPropertyContext))
        if (value != null) { value.traverse(visitor, ctx); }
      visitor.endVisitCollectionProperty("R", value, _RPropertyContext);
    }}
}
