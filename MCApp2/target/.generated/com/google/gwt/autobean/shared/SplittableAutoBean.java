package com.google.gwt.autobean.shared;

public class SplittableAutoBean extends com.google.gwt.autobean.shared.impl.AbstractAutoBean<com.google.gwt.autobean.shared.Splittable> {
  private final com.google.gwt.autobean.shared.Splittable shim = new com.google.gwt.autobean.shared.Splittable() {
    public boolean isIndexed()  {
      SplittableAutoBean.this.checkWrapped();
      boolean toReturn = SplittableAutoBean.this.get("isIndexed", getWrapped().isIndexed());
      return toReturn;
    }
    public boolean isKeyed()  {
      SplittableAutoBean.this.checkWrapped();
      boolean toReturn = SplittableAutoBean.this.get("isKeyed", getWrapped().isKeyed());
      return toReturn;
    }
    public boolean isString()  {
      SplittableAutoBean.this.checkWrapped();
      boolean toReturn = SplittableAutoBean.this.get("isString", getWrapped().isString());
      return toReturn;
    }
    public java.lang.String getPayload()  {
      SplittableAutoBean.this.checkWrapped();
      java.lang.String toReturn = SplittableAutoBean.this.get("getPayload", getWrapped().getPayload());
      return toReturn;
    }
    public java.util.List getPropertyKeys()  {
      SplittableAutoBean.this.checkWrapped();
      java.util.List toReturn = SplittableAutoBean.this.get("getPropertyKeys", getWrapped().getPropertyKeys());
      if (toReturn != null) {
        if (SplittableAutoBean.this.isWrapped(toReturn)) {
          toReturn = SplittableAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public boolean isNull(int index)  {
      SplittableAutoBean.this.checkWrapped();
      boolean toReturn = SplittableAutoBean.this.getWrapped().isNull(index);
      SplittableAutoBean.this.call("isNull", toReturn, index);
      return toReturn;
    }
    public boolean isNull(java.lang.String key)  {
      SplittableAutoBean.this.checkWrapped();
      boolean toReturn = SplittableAutoBean.this.getWrapped().isNull(key);
      SplittableAutoBean.this.call("isNull", toReturn, key);
      return toReturn;
    }
    public com.google.gwt.autobean.shared.Splittable get(int index)  {
      SplittableAutoBean.this.checkWrapped();
      com.google.gwt.autobean.shared.Splittable toReturn = SplittableAutoBean.this.getWrapped().get(index);
      if (toReturn != null) {
        if (SplittableAutoBean.this.isWrapped(toReturn)) {
          toReturn = SplittableAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new com.google.gwt.autobean.shared.SplittableAutoBean(getFactory(), toReturn).as();
        }
      }
      SplittableAutoBean.this.call("get", toReturn, index);
      return toReturn;
    }
    public com.google.gwt.autobean.shared.Splittable get(java.lang.String key)  {
      SplittableAutoBean.this.checkWrapped();
      com.google.gwt.autobean.shared.Splittable toReturn = SplittableAutoBean.this.getWrapped().get(key);
      if (toReturn != null) {
        if (SplittableAutoBean.this.isWrapped(toReturn)) {
          toReturn = SplittableAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new com.google.gwt.autobean.shared.SplittableAutoBean(getFactory(), toReturn).as();
        }
      }
      SplittableAutoBean.this.call("get", toReturn, key);
      return toReturn;
    }
    public int size()  {
      SplittableAutoBean.this.checkWrapped();
      int toReturn = SplittableAutoBean.this.getWrapped().size();
      SplittableAutoBean.this.call("size", toReturn );
      return toReturn;
    }
    public java.lang.String asString()  {
      SplittableAutoBean.this.checkWrapped();
      java.lang.String toReturn = SplittableAutoBean.this.getWrapped().asString();
      SplittableAutoBean.this.call("asString", toReturn );
      return toReturn;
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
  public SplittableAutoBean(SplittableAutoBean toClone, boolean deep) {
    super(toClone, deep);
  }
  public SplittableAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory, com.google.gwt.autobean.shared.Splittable wrapped) {
    super(factory, wrapped);
  }
  public com.google.gwt.autobean.shared.Splittable as() {return shim;}
  public com.google.gwt.autobean.shared.SplittableAutoBean clone(boolean deep) {
    return new SplittableAutoBean(this, deep);
  }
  public Class<com.google.gwt.autobean.shared.Splittable> getType() {return com.google.gwt.autobean.shared.Splittable.class;}
  @Override protected void traverseProperties(com.google.gwt.autobean.shared.AutoBeanVisitor visitor, com.google.gwt.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    class _indexedPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return false; }
      public Class<?> getType() { return boolean.class; }
      public void set(Object obj) { 
        throw new UnsupportedOperationException("No setter");
      }
    }
    {_indexedPropertyContext _indexedPropertyContext = new _indexedPropertyContext();
      Object value = as().isIndexed();
      if (visitor.visitValueProperty("indexed", value, _indexedPropertyContext))
      visitor.endVisitValueProperty("indexed", value, _indexedPropertyContext);
    }class _keyedPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return false; }
      public Class<?> getType() { return boolean.class; }
      public void set(Object obj) { 
        throw new UnsupportedOperationException("No setter");
      }
    }
    {_keyedPropertyContext _keyedPropertyContext = new _keyedPropertyContext();
      Object value = as().isKeyed();
      if (visitor.visitValueProperty("keyed", value, _keyedPropertyContext))
      visitor.endVisitValueProperty("keyed", value, _keyedPropertyContext);
    }class _stringPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return false; }
      public Class<?> getType() { return boolean.class; }
      public void set(Object obj) { 
        throw new UnsupportedOperationException("No setter");
      }
    }
    {_stringPropertyContext _stringPropertyContext = new _stringPropertyContext();
      Object value = as().isString();
      if (visitor.visitValueProperty("string", value, _stringPropertyContext))
      visitor.endVisitValueProperty("string", value, _stringPropertyContext);
    }class _payloadPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return false; }
      public Class<?> getType() { return java.lang.String.class; }
      public void set(Object obj) { 
        throw new UnsupportedOperationException("No setter");
      }
    }
    {_payloadPropertyContext _payloadPropertyContext = new _payloadPropertyContext();
      Object value = as().getPayload();
      if (visitor.visitValueProperty("payload", value, _payloadPropertyContext))
      visitor.endVisitValueProperty("payload", value, _payloadPropertyContext);
    }class _propertyKeysPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.CollectionPropertyContext {
      public boolean canSet() { return false; }
      public Class<?> getElementType() { return java.lang.String.class; }
      public Class<?> getType() { return java.util.List.class; }
      public void set(Object obj) { 
        throw new UnsupportedOperationException("No setter");
      }
    }
    {_propertyKeysPropertyContext _propertyKeysPropertyContext = new _propertyKeysPropertyContext();
      com.google.gwt.autobean.shared.impl.AbstractAutoBean value = (com.google.gwt.autobean.shared.impl.AbstractAutoBean) com.google.gwt.autobean.shared.AutoBeanUtils.getAutoBean(as().getPropertyKeys());
      if (visitor.visitCollectionProperty("propertyKeys", value, _propertyKeysPropertyContext))
        if (value != null) { value.traverse(visitor, ctx); }
      visitor.endVisitCollectionProperty("propertyKeys", value, _propertyKeysPropertyContext);
    }}
}
