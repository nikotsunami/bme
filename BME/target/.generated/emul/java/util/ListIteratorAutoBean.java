package emul.java.util;

public class ListIteratorAutoBean extends com.google.gwt.autobean.shared.impl.AbstractAutoBean<java.util.ListIterator> {
  private final java.util.ListIterator shim = new java.util.ListIterator() {
    public boolean hasNext()  {
      ListIteratorAutoBean.this.checkWrapped();
      boolean toReturn = ListIteratorAutoBean.this.get("hasNext", getWrapped().hasNext());
      return toReturn;
    }
    public boolean hasPrevious()  {
      ListIteratorAutoBean.this.checkWrapped();
      boolean toReturn = ListIteratorAutoBean.this.get("hasPrevious", getWrapped().hasPrevious());
      return toReturn;
    }
    public java.lang.Object next()  {
      ListIteratorAutoBean.this.checkWrapped();
      java.lang.Object toReturn = ListIteratorAutoBean.this.getWrapped().next();
      if (toReturn != null) {
        if (ListIteratorAutoBean.this.isWrapped(toReturn)) {
          toReturn = ListIteratorAutoBean.this.getFromWrapper(toReturn);
        } else {
        }
      }
      ListIteratorAutoBean.this.call("next", toReturn );
      return toReturn;
    }
    public java.lang.Object previous()  {
      ListIteratorAutoBean.this.checkWrapped();
      java.lang.Object toReturn = ListIteratorAutoBean.this.getWrapped().previous();
      if (toReturn != null) {
        if (ListIteratorAutoBean.this.isWrapped(toReturn)) {
          toReturn = ListIteratorAutoBean.this.getFromWrapper(toReturn);
        } else {
        }
      }
      ListIteratorAutoBean.this.call("previous", toReturn );
      return toReturn;
    }
    public int nextIndex()  {
      ListIteratorAutoBean.this.checkWrapped();
      int toReturn = ListIteratorAutoBean.this.getWrapped().nextIndex();
      ListIteratorAutoBean.this.call("nextIndex", toReturn );
      return toReturn;
    }
    public int previousIndex()  {
      ListIteratorAutoBean.this.checkWrapped();
      int toReturn = ListIteratorAutoBean.this.getWrapped().previousIndex();
      ListIteratorAutoBean.this.call("previousIndex", toReturn );
      return toReturn;
    }
    public void add(java.lang.Object o)  {
      ListIteratorAutoBean.this.checkWrapped();
      ListIteratorAutoBean.this.getWrapped().add(o);
      ListIteratorAutoBean.this.call("add", null, o);
    }
    public void remove()  {
      ListIteratorAutoBean.this.checkWrapped();
      ListIteratorAutoBean.this.getWrapped().remove();
      ListIteratorAutoBean.this.call("remove", null );
    }
    public void set(java.lang.Object o)  {
      ListIteratorAutoBean.this.checkWrapped();
      ListIteratorAutoBean.this.getWrapped().set(o);
      ListIteratorAutoBean.this.call("set", null, o);
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
  public ListIteratorAutoBean(ListIteratorAutoBean toClone, boolean deep) {
    super(toClone, deep);
  }
  public ListIteratorAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory, java.util.ListIterator wrapped) {
    super(factory, wrapped);
  }
  public java.util.ListIterator as() {return shim;}
  public emul.java.util.ListIteratorAutoBean clone(boolean deep) {
    return new ListIteratorAutoBean(this, deep);
  }
  public Class<java.util.ListIterator> getType() {return java.util.ListIterator.class;}
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
    }class _previousPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return false; }
      public Class<?> getType() { return boolean.class; }
      public void set(Object obj) { 
        throw new UnsupportedOperationException("No setter");
      }
    }
    {_previousPropertyContext _previousPropertyContext = new _previousPropertyContext();
      Object value = as().hasPrevious();
      if (visitor.visitValueProperty("previous", value, _previousPropertyContext))
      visitor.endVisitValueProperty("previous", value, _previousPropertyContext);
    }}
}
