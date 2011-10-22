package emul.java.util;

public class MapAutoBean extends com.google.gwt.autobean.shared.impl.AbstractAutoBean<java.util.Map> {
  private final java.util.Map shim = new java.util.Map() {
    public boolean isEmpty()  {
      MapAutoBean.this.checkWrapped();
      boolean toReturn = MapAutoBean.this.get("isEmpty", getWrapped().isEmpty());
      return toReturn;
    }
    public java.lang.Object get(java.lang.Object key)  {
      MapAutoBean.this.checkWrapped();
      java.lang.Object toReturn = MapAutoBean.this.getWrapped().get(key);
      if (toReturn != null) {
        if (MapAutoBean.this.isWrapped(toReturn)) {
          toReturn = MapAutoBean.this.getFromWrapper(toReturn);
        } else {
        }
      }
      MapAutoBean.this.call("get", toReturn, key);
      return toReturn;
    }
    public java.lang.Object put(java.lang.Object key,java.lang.Object value)  {
      MapAutoBean.this.checkWrapped();
      java.lang.Object toReturn = MapAutoBean.this.getWrapped().put(key,value);
      if (toReturn != null) {
        if (MapAutoBean.this.isWrapped(toReturn)) {
          toReturn = MapAutoBean.this.getFromWrapper(toReturn);
        } else {
        }
      }
      MapAutoBean.this.call("put", toReturn, key,value);
      return toReturn;
    }
    public java.lang.Object remove(java.lang.Object key)  {
      MapAutoBean.this.checkWrapped();
      java.lang.Object toReturn = MapAutoBean.this.getWrapped().remove(key);
      if (toReturn != null) {
        if (MapAutoBean.this.isWrapped(toReturn)) {
          toReturn = MapAutoBean.this.getFromWrapper(toReturn);
        } else {
        }
      }
      MapAutoBean.this.call("remove", toReturn, key);
      return toReturn;
    }
    public boolean containsKey(java.lang.Object key)  {
      MapAutoBean.this.checkWrapped();
      boolean toReturn = MapAutoBean.this.getWrapped().containsKey(key);
      MapAutoBean.this.call("containsKey", toReturn, key);
      return toReturn;
    }
    public boolean containsValue(java.lang.Object value)  {
      MapAutoBean.this.checkWrapped();
      boolean toReturn = MapAutoBean.this.getWrapped().containsValue(value);
      MapAutoBean.this.call("containsValue", toReturn, value);
      return toReturn;
    }
    public int size()  {
      MapAutoBean.this.checkWrapped();
      int toReturn = MapAutoBean.this.getWrapped().size();
      MapAutoBean.this.call("size", toReturn );
      return toReturn;
    }
    public java.util.Collection values()  {
      MapAutoBean.this.checkWrapped();
      java.util.Collection toReturn = MapAutoBean.this.getWrapped().values();
      if (toReturn != null) {
        if (MapAutoBean.this.isWrapped(toReturn)) {
          toReturn = MapAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.CollectionAutoBean(getFactory(), toReturn).as();
        }
      }
      MapAutoBean.this.call("values", toReturn );
      return toReturn;
    }
    public java.util.Set keySet()  {
      MapAutoBean.this.checkWrapped();
      java.util.Set toReturn = MapAutoBean.this.getWrapped().keySet();
      if (toReturn != null) {
        if (MapAutoBean.this.isWrapped(toReturn)) {
          toReturn = MapAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.SetAutoBean(getFactory(), toReturn).as();
        }
      }
      MapAutoBean.this.call("keySet", toReturn );
      return toReturn;
    }
    public java.util.Set entrySet()  {
      MapAutoBean.this.checkWrapped();
      java.util.Set toReturn = MapAutoBean.this.getWrapped().entrySet();
      if (toReturn != null) {
        if (MapAutoBean.this.isWrapped(toReturn)) {
          toReturn = MapAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.SetAutoBean(getFactory(), toReturn).as();
        }
      }
      MapAutoBean.this.call("entrySet", toReturn );
      return toReturn;
    }
    public void clear()  {
      MapAutoBean.this.checkWrapped();
      MapAutoBean.this.getWrapped().clear();
      MapAutoBean.this.call("clear", null );
    }
    public void putAll(java.util.Map t)  {
      MapAutoBean.this.checkWrapped();
      MapAutoBean.this.getWrapped().putAll(t);
      MapAutoBean.this.call("putAll", null, t);
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
  public MapAutoBean(MapAutoBean toClone, boolean deep) {
    super(toClone, deep);
  }
  public MapAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory, java.util.Map wrapped) {
    super(factory, wrapped);
  }
  public java.util.Map as() {return shim;}
  public emul.java.util.MapAutoBean clone(boolean deep) {
    return new MapAutoBean(this, deep);
  }
  public Class<java.util.Map> getType() {return java.util.Map.class;}
  @Override protected void traverseProperties(com.google.gwt.autobean.shared.AutoBeanVisitor visitor, com.google.gwt.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    class _emptyPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return false; }
      public Class<?> getType() { return boolean.class; }
      public void set(Object obj) { 
        throw new UnsupportedOperationException("No setter");
      }
    }
    {_emptyPropertyContext _emptyPropertyContext = new _emptyPropertyContext();
      Object value = as().isEmpty();
      if (visitor.visitValueProperty("empty", value, _emptyPropertyContext))
      visitor.endVisitValueProperty("empty", value, _emptyPropertyContext);
    }}
}
