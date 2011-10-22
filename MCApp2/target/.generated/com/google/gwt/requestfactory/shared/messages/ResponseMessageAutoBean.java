package com.google.gwt.requestfactory.shared.messages;

public class ResponseMessageAutoBean extends com.google.gwt.autobean.shared.impl.AbstractAutoBean<com.google.gwt.requestfactory.shared.messages.ResponseMessage> {
  private final com.google.gwt.requestfactory.shared.messages.ResponseMessage shim = new com.google.gwt.requestfactory.shared.messages.ResponseMessage() {
    public com.google.gwt.requestfactory.shared.messages.ServerFailureMessage getGeneralFailure()  {
      ResponseMessageAutoBean.this.checkWrapped();
      com.google.gwt.requestfactory.shared.messages.ServerFailureMessage toReturn = ResponseMessageAutoBean.this.get("getGeneralFailure", getWrapped().getGeneralFailure());
      if (toReturn != null) {
        if (ResponseMessageAutoBean.this.isWrapped(toReturn)) {
          toReturn = ResponseMessageAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new com.google.gwt.requestfactory.shared.messages.ServerFailureMessageAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.lang.String getVersion()  {
      ResponseMessageAutoBean.this.checkWrapped();
      java.lang.String toReturn = ResponseMessageAutoBean.this.get("getVersion", getWrapped().getVersion());
      return toReturn;
    }
    public java.util.List getInvocationResults()  {
      ResponseMessageAutoBean.this.checkWrapped();
      java.util.List toReturn = ResponseMessageAutoBean.this.get("getInvocationResults", getWrapped().getInvocationResults());
      if (toReturn != null) {
        if (ResponseMessageAutoBean.this.isWrapped(toReturn)) {
          toReturn = ResponseMessageAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getOperations()  {
      ResponseMessageAutoBean.this.checkWrapped();
      java.util.List toReturn = ResponseMessageAutoBean.this.get("getOperations", getWrapped().getOperations());
      if (toReturn != null) {
        if (ResponseMessageAutoBean.this.isWrapped(toReturn)) {
          toReturn = ResponseMessageAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getViolations()  {
      ResponseMessageAutoBean.this.checkWrapped();
      java.util.List toReturn = ResponseMessageAutoBean.this.get("getViolations", getWrapped().getViolations());
      if (toReturn != null) {
        if (ResponseMessageAutoBean.this.isWrapped(toReturn)) {
          toReturn = ResponseMessageAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getStatusCodes()  {
      ResponseMessageAutoBean.this.checkWrapped();
      java.util.List toReturn = ResponseMessageAutoBean.this.get("getStatusCodes", getWrapped().getStatusCodes());
      if (toReturn != null) {
        if (ResponseMessageAutoBean.this.isWrapped(toReturn)) {
          toReturn = ResponseMessageAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public void setGeneralFailure(com.google.gwt.requestfactory.shared.messages.ServerFailureMessage failure)  {
      ResponseMessageAutoBean.this.checkWrapped();
      ResponseMessageAutoBean.this.checkFrozen();
      ResponseMessageAutoBean.this.getWrapped().setGeneralFailure(failure);
      ResponseMessageAutoBean.this.set("setGeneralFailure", failure);
    }
    public void setInvocationResults(java.util.List value)  {
      ResponseMessageAutoBean.this.checkWrapped();
      ResponseMessageAutoBean.this.checkFrozen();
      ResponseMessageAutoBean.this.getWrapped().setInvocationResults(value);
      ResponseMessageAutoBean.this.set("setInvocationResults", value);
    }
    public void setOperations(java.util.List value)  {
      ResponseMessageAutoBean.this.checkWrapped();
      ResponseMessageAutoBean.this.checkFrozen();
      ResponseMessageAutoBean.this.getWrapped().setOperations(value);
      ResponseMessageAutoBean.this.set("setOperations", value);
    }
    public void setStatusCodes(java.util.List value)  {
      ResponseMessageAutoBean.this.checkWrapped();
      ResponseMessageAutoBean.this.checkFrozen();
      ResponseMessageAutoBean.this.getWrapped().setStatusCodes(value);
      ResponseMessageAutoBean.this.set("setStatusCodes", value);
    }
    public void setVersion(java.lang.String version)  {
      ResponseMessageAutoBean.this.checkWrapped();
      ResponseMessageAutoBean.this.checkFrozen();
      ResponseMessageAutoBean.this.getWrapped().setVersion(version);
      ResponseMessageAutoBean.this.set("setVersion", version);
    }
    public void setViolations(java.util.List value)  {
      ResponseMessageAutoBean.this.checkWrapped();
      ResponseMessageAutoBean.this.checkFrozen();
      ResponseMessageAutoBean.this.getWrapped().setViolations(value);
      ResponseMessageAutoBean.this.set("setViolations", value);
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
  public ResponseMessageAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public ResponseMessageAutoBean(ResponseMessageAutoBean toClone, boolean deep) {
    super(toClone, deep);
  }
  public ResponseMessageAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory, com.google.gwt.requestfactory.shared.messages.ResponseMessage wrapped) {
    super(factory, wrapped);
  }
  public com.google.gwt.requestfactory.shared.messages.ResponseMessage as() {return shim;}
  public com.google.gwt.requestfactory.shared.messages.ResponseMessageAutoBean clone(boolean deep) {
    return new ResponseMessageAutoBean(this, deep);
  }
  public Class<com.google.gwt.requestfactory.shared.messages.ResponseMessage> getType() {return com.google.gwt.requestfactory.shared.messages.ResponseMessage.class;}
  @Override protected com.google.gwt.requestfactory.shared.messages.ResponseMessage createSimplePeer() {
    return new com.google.gwt.requestfactory.shared.messages.ResponseMessage() {
      public com.google.gwt.requestfactory.shared.messages.ServerFailureMessage getGeneralFailure()  {
        return (com.google.gwt.requestfactory.shared.messages.ServerFailureMessage) values.get("F");
      }
      public java.lang.String getVersion()  {
        return (java.lang.String) values.get("V");
      }
      public java.util.List getInvocationResults()  {
        return (java.util.List) values.get("I");
      }
      public java.util.List getOperations()  {
        return (java.util.List) values.get("O");
      }
      public java.util.List getViolations()  {
        return (java.util.List) values.get("X");
      }
      public java.util.List getStatusCodes()  {
        return (java.util.List) values.get("S");
      }
      public void setGeneralFailure(com.google.gwt.requestfactory.shared.messages.ServerFailureMessage failure)  {
        values.put("F", failure);
      }
      public void setInvocationResults(java.util.List value)  {
        values.put("I", value);
      }
      public void setOperations(java.util.List value)  {
        values.put("O", value);
      }
      public void setStatusCodes(java.util.List value)  {
        values.put("S", value);
      }
      public void setVersion(java.lang.String version)  {
        values.put("V", version);
      }
      public void setViolations(java.util.List value)  {
        values.put("X", value);
      }
    };
  }
  @Override protected void traverseProperties(com.google.gwt.autobean.shared.AutoBeanVisitor visitor, com.google.gwt.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    class _FPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getType() { return com.google.gwt.requestfactory.shared.messages.ServerFailureMessage.class; }
      public void set(Object obj) { 
        values.put("F", obj);
      }
    }
    {_FPropertyContext _FPropertyContext = new _FPropertyContext();
      com.google.gwt.autobean.shared.impl.AbstractAutoBean value = (com.google.gwt.autobean.shared.impl.AbstractAutoBean) com.google.gwt.autobean.shared.AutoBeanUtils.getAutoBean(as().getGeneralFailure());
      if (visitor.visitReferenceProperty("F", value, _FPropertyContext))
        if (value != null) { value.traverse(visitor, ctx); }
      visitor.endVisitReferenceProperty("F", value, _FPropertyContext);
    }class _VPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getType() { return java.lang.String.class; }
      public void set(Object obj) { 
        values.put("V", obj);
      }
    }
    {_VPropertyContext _VPropertyContext = new _VPropertyContext();
      Object value = as().getVersion();
      if (visitor.visitValueProperty("V", value, _VPropertyContext))
      visitor.endVisitValueProperty("V", value, _VPropertyContext);
    }class _IPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.CollectionPropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getElementType() { return com.google.gwt.autobean.shared.Splittable.class; }
      public Class<?> getType() { return java.util.List.class; }
      public void set(Object obj) { 
        values.put("I", obj);
      }
    }
    {_IPropertyContext _IPropertyContext = new _IPropertyContext();
      com.google.gwt.autobean.shared.impl.AbstractAutoBean value = (com.google.gwt.autobean.shared.impl.AbstractAutoBean) com.google.gwt.autobean.shared.AutoBeanUtils.getAutoBean(as().getInvocationResults());
      if (visitor.visitCollectionProperty("I", value, _IPropertyContext))
        if (value != null) { value.traverse(visitor, ctx); }
      visitor.endVisitCollectionProperty("I", value, _IPropertyContext);
    }class _OPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.CollectionPropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getElementType() { return com.google.gwt.requestfactory.shared.messages.OperationMessage.class; }
      public Class<?> getType() { return java.util.List.class; }
      public void set(Object obj) { 
        values.put("O", obj);
      }
    }
    {_OPropertyContext _OPropertyContext = new _OPropertyContext();
      com.google.gwt.autobean.shared.impl.AbstractAutoBean value = (com.google.gwt.autobean.shared.impl.AbstractAutoBean) com.google.gwt.autobean.shared.AutoBeanUtils.getAutoBean(as().getOperations());
      if (visitor.visitCollectionProperty("O", value, _OPropertyContext))
        if (value != null) { value.traverse(visitor, ctx); }
      visitor.endVisitCollectionProperty("O", value, _OPropertyContext);
    }class _XPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.CollectionPropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getElementType() { return com.google.gwt.requestfactory.shared.messages.ViolationMessage.class; }
      public Class<?> getType() { return java.util.List.class; }
      public void set(Object obj) { 
        values.put("X", obj);
      }
    }
    {_XPropertyContext _XPropertyContext = new _XPropertyContext();
      com.google.gwt.autobean.shared.impl.AbstractAutoBean value = (com.google.gwt.autobean.shared.impl.AbstractAutoBean) com.google.gwt.autobean.shared.AutoBeanUtils.getAutoBean(as().getViolations());
      if (visitor.visitCollectionProperty("X", value, _XPropertyContext))
        if (value != null) { value.traverse(visitor, ctx); }
      visitor.endVisitCollectionProperty("X", value, _XPropertyContext);
    }class _SPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.CollectionPropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getElementType() { return java.lang.Boolean.class; }
      public Class<?> getType() { return java.util.List.class; }
      public void set(Object obj) { 
        values.put("S", obj);
      }
    }
    {_SPropertyContext _SPropertyContext = new _SPropertyContext();
      com.google.gwt.autobean.shared.impl.AbstractAutoBean value = (com.google.gwt.autobean.shared.impl.AbstractAutoBean) com.google.gwt.autobean.shared.AutoBeanUtils.getAutoBean(as().getStatusCodes());
      if (visitor.visitCollectionProperty("S", value, _SPropertyContext))
        if (value != null) { value.traverse(visitor, ctx); }
      visitor.endVisitCollectionProperty("S", value, _SPropertyContext);
    }}
}
