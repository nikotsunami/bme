package emul.java.util;

public class CollectionAutoBean extends com.google.gwt.autobean.shared.impl.AbstractAutoBean<java.util.Collection> {
  private final java.util.Collection shim = new java.util.Collection() {
    public boolean isEmpty()  {
      CollectionAutoBean.this.checkWrapped();
      boolean toReturn = CollectionAutoBean.this.get("isEmpty", getWrapped().isEmpty());
      return toReturn;
    }
    public java.lang.Object[] toArray(java.lang.Object[] a)  {
      CollectionAutoBean.this.checkWrapped();
      java.lang.Object[] toReturn = CollectionAutoBean.this.getWrapped().toArray(a);
      CollectionAutoBean.this.call("toArray", toReturn, a);
      return toReturn;
    }
    public boolean add(java.lang.Object o)  {
      CollectionAutoBean.this.checkWrapped();
      boolean toReturn = CollectionAutoBean.this.getWrapped().add(o);
      CollectionAutoBean.this.call("add", toReturn, o);
      return toReturn;
    }
    public boolean addAll(java.util.Collection c)  {
      CollectionAutoBean.this.checkWrapped();
      boolean toReturn = CollectionAutoBean.this.getWrapped().addAll(c);
      CollectionAutoBean.this.call("addAll", toReturn, c);
      return toReturn;
    }
    public boolean contains(java.lang.Object o)  {
      CollectionAutoBean.this.checkWrapped();
      boolean toReturn = CollectionAutoBean.this.getWrapped().contains(o);
      CollectionAutoBean.this.call("contains", toReturn, o);
      return toReturn;
    }
    public boolean containsAll(java.util.Collection c)  {
      CollectionAutoBean.this.checkWrapped();
      boolean toReturn = CollectionAutoBean.this.getWrapped().containsAll(c);
      CollectionAutoBean.this.call("containsAll", toReturn, c);
      return toReturn;
    }
    public boolean remove(java.lang.Object o)  {
      CollectionAutoBean.this.checkWrapped();
      boolean toReturn = CollectionAutoBean.this.getWrapped().remove(o);
      CollectionAutoBean.this.call("remove", toReturn, o);
      return toReturn;
    }
    public boolean removeAll(java.util.Collection c)  {
      CollectionAutoBean.this.checkWrapped();
      boolean toReturn = CollectionAutoBean.this.getWrapped().removeAll(c);
      CollectionAutoBean.this.call("removeAll", toReturn, c);
      return toReturn;
    }
    public boolean retainAll(java.util.Collection c)  {
      CollectionAutoBean.this.checkWrapped();
      boolean toReturn = CollectionAutoBean.this.getWrapped().retainAll(c);
      CollectionAutoBean.this.call("retainAll", toReturn, c);
      return toReturn;
    }
    public int size()  {
      CollectionAutoBean.this.checkWrapped();
      int toReturn = CollectionAutoBean.this.getWrapped().size();
      CollectionAutoBean.this.call("size", toReturn );
      return toReturn;
    }
    public java.lang.Object[] toArray()  {
      CollectionAutoBean.this.checkWrapped();
      java.lang.Object[] toReturn = CollectionAutoBean.this.getWrapped().toArray();
      CollectionAutoBean.this.call("toArray", toReturn );
      return toReturn;
    }
    public java.util.Iterator iterator()  {
      CollectionAutoBean.this.checkWrapped();
      java.util.Iterator toReturn = CollectionAutoBean.this.getWrapped().iterator();
      if (toReturn != null) {
        if (CollectionAutoBean.this.isWrapped(toReturn)) {
          toReturn = CollectionAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.IteratorAutoBean(getFactory(), toReturn).as();
        }
      }
      CollectionAutoBean.this.call("iterator", toReturn );
      return toReturn;
    }
    public void clear()  {
      CollectionAutoBean.this.checkWrapped();
      CollectionAutoBean.this.getWrapped().clear();
      CollectionAutoBean.this.call("clear", null );
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
  public CollectionAutoBean(CollectionAutoBean toClone, boolean deep) {
    super(toClone, deep);
  }
  public CollectionAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory, java.util.Collection wrapped) {
    super(factory, wrapped);
  }
  public java.util.Collection as() {return shim;}
  public emul.java.util.CollectionAutoBean clone(boolean deep) {
    return new CollectionAutoBean(this, deep);
  }
  public Class<java.util.Collection> getType() {return java.util.Collection.class;}
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
