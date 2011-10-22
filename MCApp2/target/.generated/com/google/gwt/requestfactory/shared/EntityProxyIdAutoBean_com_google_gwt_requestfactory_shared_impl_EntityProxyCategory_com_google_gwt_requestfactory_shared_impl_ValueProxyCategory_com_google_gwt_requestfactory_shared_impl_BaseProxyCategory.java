package com.google.gwt.requestfactory.shared;

public class EntityProxyIdAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory extends com.google.gwt.autobean.shared.impl.AbstractAutoBean<com.google.gwt.requestfactory.shared.EntityProxyId> {
  private final com.google.gwt.requestfactory.shared.EntityProxyId shim = new com.google.gwt.requestfactory.shared.EntityProxyId() {
    public java.lang.Class getProxyClass()  {
      EntityProxyIdAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this.checkWrapped();
      java.lang.Class toReturn = EntityProxyIdAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this.get("getProxyClass", getWrapped().getProxyClass());
      if (toReturn != null) {
        if (EntityProxyIdAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this.isWrapped(toReturn)) {
          toReturn = EntityProxyIdAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this.getFromWrapper(toReturn);
        } else {
        }
      }
      toReturn = com.google.gwt.requestfactory.shared.impl.BaseProxyCategory.__intercept(EntityProxyIdAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this, toReturn);
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
  public EntityProxyIdAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory(com.google.gwt.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public EntityProxyIdAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory(EntityProxyIdAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory toClone, boolean deep) {
    super(toClone, deep);
  }
  public EntityProxyIdAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory(com.google.gwt.autobean.shared.AutoBeanFactory factory, com.google.gwt.requestfactory.shared.EntityProxyId wrapped) {
    super(factory, wrapped);
  }
  public com.google.gwt.requestfactory.shared.EntityProxyId as() {return shim;}
  public com.google.gwt.requestfactory.shared.EntityProxyIdAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory clone(boolean deep) {
    return new EntityProxyIdAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory(this, deep);
  }
  public Class<com.google.gwt.requestfactory.shared.EntityProxyId> getType() {return com.google.gwt.requestfactory.shared.EntityProxyId.class;}
  @Override protected com.google.gwt.requestfactory.shared.EntityProxyId createSimplePeer() {
    return new com.google.gwt.requestfactory.shared.EntityProxyId() {
      public java.lang.Class getProxyClass()  {
        return (java.lang.Class) values.get("proxyClass");
      }
    };
  }
  @Override protected void traverseProperties(com.google.gwt.autobean.shared.AutoBeanVisitor visitor, com.google.gwt.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    class _proxyClassPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getType() { return java.lang.Class.class; }
      public void set(Object obj) { 
        values.put("proxyClass", obj);
      }
    }
    {_proxyClassPropertyContext _proxyClassPropertyContext = new _proxyClassPropertyContext();
      com.google.gwt.autobean.shared.impl.AbstractAutoBean value = (com.google.gwt.autobean.shared.impl.AbstractAutoBean) com.google.gwt.autobean.shared.AutoBeanUtils.getAutoBean(as().getProxyClass());
      if (visitor.visitReferenceProperty("proxyClass", value, _proxyClassPropertyContext))
        if (value != null) { value.traverse(visitor, ctx); }
      visitor.endVisitReferenceProperty("proxyClass", value, _proxyClassPropertyContext);
    }}
}
