package emul.java.util;

public class SetAutoBean extends com.google.gwt.autobean.shared.impl.AbstractAutoBean<java.util.Set> {
  private final java.util.Set shim = new java.util.Set() {
    public boolean isEmpty()  {
      SetAutoBean.this.checkWrapped();
      boolean toReturn = SetAutoBean.this.get("isEmpty", getWrapped().isEmpty());
      return toReturn;
    }
    public java.lang.Object[] toArray(java.lang.Object[] a)  {
      SetAutoBean.this.checkWrapped();
      java.lang.Object[] toReturn = SetAutoBean.this.getWrapped().toArray(a);
      SetAutoBean.this.call("toArray", toReturn, a);
      return toReturn;
    }
    public boolean add(java.lang.Object o)  {
      SetAutoBean.this.checkWrapped();
      boolean toReturn = SetAutoBean.this.getWrapped().add(o);
      SetAutoBean.this.call("add", toReturn, o);
      return toReturn;
    }
    public boolean addAll(java.util.Collection c)  {
      SetAutoBean.this.checkWrapped();
      boolean toReturn = SetAutoBean.this.getWrapped().addAll(c);
      SetAutoBean.this.call("addAll", toReturn, c);
      return toReturn;
    }
    public boolean contains(java.lang.Object o)  {
      SetAutoBean.this.checkWrapped();
      boolean toReturn = SetAutoBean.this.getWrapped().contains(o);
      SetAutoBean.this.call("contains", toReturn, o);
      return toReturn;
    }
    public boolean containsAll(java.util.Collection c)  {
      SetAutoBean.this.checkWrapped();
      boolean toReturn = SetAutoBean.this.getWrapped().containsAll(c);
      SetAutoBean.this.call("containsAll", toReturn, c);
      return toReturn;
    }
    public boolean remove(java.lang.Object o)  {
      SetAutoBean.this.checkWrapped();
      boolean toReturn = SetAutoBean.this.getWrapped().remove(o);
      SetAutoBean.this.call("remove", toReturn, o);
      return toReturn;
    }
    public boolean removeAll(java.util.Collection c)  {
      SetAutoBean.this.checkWrapped();
      boolean toReturn = SetAutoBean.this.getWrapped().removeAll(c);
      SetAutoBean.this.call("removeAll", toReturn, c);
      return toReturn;
    }
    public boolean retainAll(java.util.Collection c)  {
      SetAutoBean.this.checkWrapped();
      boolean toReturn = SetAutoBean.this.getWrapped().retainAll(c);
      SetAutoBean.this.call("retainAll", toReturn, c);
      return toReturn;
    }
    public int size()  {
      SetAutoBean.this.checkWrapped();
      int toReturn = SetAutoBean.this.getWrapped().size();
      SetAutoBean.this.call("size", toReturn );
      return toReturn;
    }
    public java.lang.Object[] toArray()  {
      SetAutoBean.this.checkWrapped();
      java.lang.Object[] toReturn = SetAutoBean.this.getWrapped().toArray();
      SetAutoBean.this.call("toArray", toReturn );
      return toReturn;
    }
    public java.util.Iterator iterator()  {
      SetAutoBean.this.checkWrapped();
      java.util.Iterator toReturn = SetAutoBean.this.getWrapped().iterator();
      if (toReturn != null) {
        if (SetAutoBean.this.isWrapped(toReturn)) {
          toReturn = SetAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.IteratorAutoBean(getFactory(), toReturn).as();
        }
      }
      SetAutoBean.this.call("iterator", toReturn );
      return toReturn;
    }
    public void clear()  {
      SetAutoBean.this.checkWrapped();
      SetAutoBean.this.getWrapped().clear();
      SetAutoBean.this.call("clear", null );
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
  public SetAutoBean(SetAutoBean toClone, boolean deep) {
    super(toClone, deep);
  }
  public SetAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory, java.util.Set wrapped) {
    super(factory, wrapped);
  }
  public java.util.Set as() {return shim;}
  public emul.java.util.SetAutoBean clone(boolean deep) {
    return new SetAutoBean(this, deep);
  }
  public Class<java.util.Set> getType() {return java.util.Set.class;}
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
