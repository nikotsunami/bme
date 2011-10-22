package emul.java.util;

public class Map_EntryAutoBean extends com.google.gwt.autobean.shared.impl.AbstractAutoBean<java.util.Map.Entry> {
  private final java.util.Map.Entry shim = new java.util.Map.Entry() {
    public java.lang.Object getKey()  {
      Map_EntryAutoBean.this.checkWrapped();
      java.lang.Object toReturn = Map_EntryAutoBean.this.get("getKey", getWrapped().getKey());
      if (toReturn != null) {
        if (Map_EntryAutoBean.this.isWrapped(toReturn)) {
          toReturn = Map_EntryAutoBean.this.getFromWrapper(toReturn);
        } else {
        }
      }
      return toReturn;
    }
    public java.lang.Object getValue()  {
      Map_EntryAutoBean.this.checkWrapped();
      java.lang.Object toReturn = Map_EntryAutoBean.this.get("getValue", getWrapped().getValue());
      if (toReturn != null) {
        if (Map_EntryAutoBean.this.isWrapped(toReturn)) {
          toReturn = Map_EntryAutoBean.this.getFromWrapper(toReturn);
        } else {
        }
      }
      return toReturn;
    }
    public java.lang.Object setValue(java.lang.Object value)  {
      Map_EntryAutoBean.this.checkWrapped();
      java.lang.Object toReturn = Map_EntryAutoBean.this.getWrapped().setValue(value);
      if (toReturn != null) {
        if (Map_EntryAutoBean.this.isWrapped(toReturn)) {
          toReturn = Map_EntryAutoBean.this.getFromWrapper(toReturn);
        } else {
        }
      }
      Map_EntryAutoBean.this.call("setValue", toReturn, value);
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
  public Map_EntryAutoBean(Map_EntryAutoBean toClone, boolean deep) {
    super(toClone, deep);
  }
  public Map_EntryAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory, java.util.Map.Entry wrapped) {
    super(factory, wrapped);
  }
  public java.util.Map.Entry as() {return shim;}
  public emul.java.util.Map_EntryAutoBean clone(boolean deep) {
    return new Map_EntryAutoBean(this, deep);
  }
  public Class<java.util.Map.Entry> getType() {return java.util.Map.Entry.class;}
  @Override protected void traverseProperties(com.google.gwt.autobean.shared.AutoBeanVisitor visitor, com.google.gwt.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    class _keyPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return false; }
      public Class<?> getType() { return java.lang.Object.class; }
      public void set(Object obj) { 
        throw new UnsupportedOperationException("No setter");
      }
    }
    {_keyPropertyContext _keyPropertyContext = new _keyPropertyContext();
      com.google.gwt.autobean.shared.impl.AbstractAutoBean value = (com.google.gwt.autobean.shared.impl.AbstractAutoBean) com.google.gwt.autobean.shared.AutoBeanUtils.getAutoBean(as().getKey());
      if (visitor.visitReferenceProperty("key", value, _keyPropertyContext))
        if (value != null) { value.traverse(visitor, ctx); }
      visitor.endVisitReferenceProperty("key", value, _keyPropertyContext);
    }class _valuePropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return false; }
      public Class<?> getType() { return java.lang.Object.class; }
      public void set(Object obj) { 
        throw new UnsupportedOperationException("No setter");
      }
    }
    {_valuePropertyContext _valuePropertyContext = new _valuePropertyContext();
      com.google.gwt.autobean.shared.impl.AbstractAutoBean value = (com.google.gwt.autobean.shared.impl.AbstractAutoBean) com.google.gwt.autobean.shared.AutoBeanUtils.getAutoBean(as().getValue());
      if (visitor.visitReferenceProperty("value", value, _valuePropertyContext))
        if (value != null) { value.traverse(visitor, ctx); }
      visitor.endVisitReferenceProperty("value", value, _valuePropertyContext);
    }}
}
