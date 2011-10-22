package com.google.gwt.requestfactory.shared.messages;

public class ServerFailureMessageAutoBean extends com.google.gwt.autobean.shared.impl.AbstractAutoBean<com.google.gwt.requestfactory.shared.messages.ServerFailureMessage> {
  private final com.google.gwt.requestfactory.shared.messages.ServerFailureMessage shim = new com.google.gwt.requestfactory.shared.messages.ServerFailureMessage() {
    public boolean isFatal()  {
      ServerFailureMessageAutoBean.this.checkWrapped();
      boolean toReturn = ServerFailureMessageAutoBean.this.get("isFatal", getWrapped().isFatal());
      return toReturn;
    }
    public java.lang.String getExceptionType()  {
      ServerFailureMessageAutoBean.this.checkWrapped();
      java.lang.String toReturn = ServerFailureMessageAutoBean.this.get("getExceptionType", getWrapped().getExceptionType());
      return toReturn;
    }
    public java.lang.String getMessage()  {
      ServerFailureMessageAutoBean.this.checkWrapped();
      java.lang.String toReturn = ServerFailureMessageAutoBean.this.get("getMessage", getWrapped().getMessage());
      return toReturn;
    }
    public java.lang.String getStackTrace()  {
      ServerFailureMessageAutoBean.this.checkWrapped();
      java.lang.String toReturn = ServerFailureMessageAutoBean.this.get("getStackTrace", getWrapped().getStackTrace());
      return toReturn;
    }
    public void setExceptionType(java.lang.String exceptionType)  {
      ServerFailureMessageAutoBean.this.checkWrapped();
      ServerFailureMessageAutoBean.this.checkFrozen();
      ServerFailureMessageAutoBean.this.getWrapped().setExceptionType(exceptionType);
      ServerFailureMessageAutoBean.this.set("setExceptionType", exceptionType);
    }
    public void setFatal(boolean significant)  {
      ServerFailureMessageAutoBean.this.checkWrapped();
      ServerFailureMessageAutoBean.this.checkFrozen();
      ServerFailureMessageAutoBean.this.getWrapped().setFatal(significant);
      ServerFailureMessageAutoBean.this.set("setFatal", significant);
    }
    public void setMessage(java.lang.String message)  {
      ServerFailureMessageAutoBean.this.checkWrapped();
      ServerFailureMessageAutoBean.this.checkFrozen();
      ServerFailureMessageAutoBean.this.getWrapped().setMessage(message);
      ServerFailureMessageAutoBean.this.set("setMessage", message);
    }
    public void setStackTrace(java.lang.String stackTrace)  {
      ServerFailureMessageAutoBean.this.checkWrapped();
      ServerFailureMessageAutoBean.this.checkFrozen();
      ServerFailureMessageAutoBean.this.getWrapped().setStackTrace(stackTrace);
      ServerFailureMessageAutoBean.this.set("setStackTrace", stackTrace);
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
  public ServerFailureMessageAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public ServerFailureMessageAutoBean(ServerFailureMessageAutoBean toClone, boolean deep) {
    super(toClone, deep);
  }
  public ServerFailureMessageAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory, com.google.gwt.requestfactory.shared.messages.ServerFailureMessage wrapped) {
    super(factory, wrapped);
  }
  public com.google.gwt.requestfactory.shared.messages.ServerFailureMessage as() {return shim;}
  public com.google.gwt.requestfactory.shared.messages.ServerFailureMessageAutoBean clone(boolean deep) {
    return new ServerFailureMessageAutoBean(this, deep);
  }
  public Class<com.google.gwt.requestfactory.shared.messages.ServerFailureMessage> getType() {return com.google.gwt.requestfactory.shared.messages.ServerFailureMessage.class;}
  @Override protected com.google.gwt.requestfactory.shared.messages.ServerFailureMessage createSimplePeer() {
    return new com.google.gwt.requestfactory.shared.messages.ServerFailureMessage() {
      public boolean isFatal()  {
        Object toReturn = values.get("F");
        if (toReturn == null) {
          return false;
        } else {
          return (java.lang.Boolean) toReturn;
        }
      }
      public java.lang.String getExceptionType()  {
        return (java.lang.String) values.get("X");
      }
      public java.lang.String getMessage()  {
        return (java.lang.String) values.get("M");
      }
      public java.lang.String getStackTrace()  {
        return (java.lang.String) values.get("S");
      }
      public void setExceptionType(java.lang.String exceptionType)  {
        values.put("X", exceptionType);
      }
      public void setFatal(boolean significant)  {
        values.put("F", significant);
      }
      public void setMessage(java.lang.String message)  {
        values.put("M", message);
      }
      public void setStackTrace(java.lang.String stackTrace)  {
        values.put("S", stackTrace);
      }
    };
  }
  @Override protected void traverseProperties(com.google.gwt.autobean.shared.AutoBeanVisitor visitor, com.google.gwt.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    class _FPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getType() { return boolean.class; }
      public void set(Object obj) { 
        values.put("F", obj);
      }
    }
    {_FPropertyContext _FPropertyContext = new _FPropertyContext();
      Object value = as().isFatal();
      if (visitor.visitValueProperty("F", value, _FPropertyContext))
      visitor.endVisitValueProperty("F", value, _FPropertyContext);
    }class _XPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getType() { return java.lang.String.class; }
      public void set(Object obj) { 
        values.put("X", obj);
      }
    }
    {_XPropertyContext _XPropertyContext = new _XPropertyContext();
      Object value = as().getExceptionType();
      if (visitor.visitValueProperty("X", value, _XPropertyContext))
      visitor.endVisitValueProperty("X", value, _XPropertyContext);
    }class _MPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getType() { return java.lang.String.class; }
      public void set(Object obj) { 
        values.put("M", obj);
      }
    }
    {_MPropertyContext _MPropertyContext = new _MPropertyContext();
      Object value = as().getMessage();
      if (visitor.visitValueProperty("M", value, _MPropertyContext))
      visitor.endVisitValueProperty("M", value, _MPropertyContext);
    }class _SPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getType() { return java.lang.String.class; }
      public void set(Object obj) { 
        values.put("S", obj);
      }
    }
    {_SPropertyContext _SPropertyContext = new _SPropertyContext();
      Object value = as().getStackTrace();
      if (visitor.visitValueProperty("S", value, _SPropertyContext))
      visitor.endVisitValueProperty("S", value, _SPropertyContext);
    }}
}
