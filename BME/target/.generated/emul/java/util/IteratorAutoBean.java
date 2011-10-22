package emul.java.util;

public class IteratorAutoBean extends com.google.gwt.autobean.shared.impl.AbstractAutoBean<java.util.Iterator> {
  private final java.util.Iterator shim = new java.util.Iterator() {
    public boolean hasNext()  {
      IteratorAutoBean.this.checkWrapped();
      boolean toReturn = IteratorAutoBean.this.get("hasNext", getWrapped().hasNext());
      return toReturn;
    }
    public java.lang.Object next()  {
      IteratorAutoBean.this.checkWrapped();
      java.lang.Object toReturn = IteratorAutoBean.this.getWrapped().next();
      if (toReturn != null) {
        if (IteratorAutoBean.this.isWrapped(toReturn)) {
          toReturn = IteratorAutoBean.this.getFromWrapper(toReturn);
        } else {
        }
      }
      IteratorAutoBean.this.call("next", toReturn );
      return toReturn;
    }
    public void remove()  {
      IteratorAutoBean.this.checkWrapped();
      IteratorAutoBean.this.getWrapped().remove();
      IteratorAutoBean.this.call("remove", null );
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
  public IteratorAutoBean(IteratorAutoBean toClone, boolean deep) {
    super(toClone, deep);
  }
  public IteratorAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory, java.util.Iterator wrapped) {
    super(factory, wrapped);
  }
  public java.util.Iterator as() {return shim;}
  public emul.java.util.IteratorAutoBean clone(boolean deep) {
    return new IteratorAutoBean(this, deep);
  }
  public Class<java.util.Iterator> getType() {return java.util.Iterator.class;}
  @Override protected void traverseProperties(com.google.gwt.autobean.shared.AutoBeanVisitor visitor, com.google.gwt.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    class _nextPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return false; }
      public Class<?> getType() { return boolean.class; }
      public void set(Object obj) { 
        throw new UnsupportedOperationException("No setter");
      }
    }
    {_nextPropertyContext _nextPropertyContext = new _nextPropertyContext();
      Object value = as().hasNext();
      if (visitor.visitValueProperty("next", value, _nextPropertyContext))
      visitor.endVisitValueProperty("next", value, _nextPropertyContext);
    }}
}
