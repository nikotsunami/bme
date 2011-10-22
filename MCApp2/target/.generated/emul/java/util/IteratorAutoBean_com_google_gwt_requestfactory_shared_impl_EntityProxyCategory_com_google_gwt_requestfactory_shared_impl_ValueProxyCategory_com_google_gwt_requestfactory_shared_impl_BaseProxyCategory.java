package emul.java.util;

public class IteratorAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory extends com.google.gwt.autobean.shared.impl.AbstractAutoBean<java.util.Iterator> {
  private final java.util.Iterator shim = new java.util.Iterator() {
    public boolean hasNext()  {
      IteratorAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this.checkWrapped();
      boolean toReturn = IteratorAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this.get("hasNext", getWrapped().hasNext());
      toReturn = com.google.gwt.requestfactory.shared.impl.BaseProxyCategory.__intercept(IteratorAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this, toReturn);
      return toReturn;
    }
    public java.lang.Object next()  {
      IteratorAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this.checkWrapped();
      java.lang.Object toReturn = IteratorAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this.getWrapped().next();
      if (toReturn != null) {
        if (IteratorAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this.isWrapped(toReturn)) {
          toReturn = IteratorAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this.getFromWrapper(toReturn);
        } else {
        }
      }
      toReturn = com.google.gwt.requestfactory.shared.impl.BaseProxyCategory.__intercept(IteratorAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this, toReturn);
      IteratorAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this.call("next", toReturn );
      return toReturn;
    }
    public void remove()  {
      IteratorAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this.checkWrapped();
      IteratorAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this.getWrapped().remove();
      IteratorAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this.call("remove", null );
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
  public IteratorAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory(IteratorAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory toClone, boolean deep) {
    super(toClone, deep);
  }
  public IteratorAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory(com.google.gwt.autobean.shared.AutoBeanFactory factory, java.util.Iterator wrapped) {
    super(factory, wrapped);
  }
  public java.util.Iterator as() {return shim;}
  public emul.java.util.IteratorAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory clone(boolean deep) {
    return new IteratorAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory(this, deep);
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
