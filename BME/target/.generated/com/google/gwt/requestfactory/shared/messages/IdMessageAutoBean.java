package com.google.gwt.requestfactory.shared.messages;

public class IdMessageAutoBean extends com.google.gwt.autobean.shared.impl.AbstractAutoBean<com.google.gwt.requestfactory.shared.messages.IdMessage> {
  private final com.google.gwt.requestfactory.shared.messages.IdMessage shim = new com.google.gwt.requestfactory.shared.messages.IdMessage() {
    public com.google.gwt.requestfactory.shared.messages.IdMessage.Strength getStrength()  {
      IdMessageAutoBean.this.checkWrapped();
      com.google.gwt.requestfactory.shared.messages.IdMessage.Strength toReturn = IdMessageAutoBean.this.get("getStrength", getWrapped().getStrength());
      return toReturn;
    }
    public int getClientId()  {
      IdMessageAutoBean.this.checkWrapped();
      int toReturn = IdMessageAutoBean.this.get("getClientId", getWrapped().getClientId());
      return toReturn;
    }
    public int getSyntheticId()  {
      IdMessageAutoBean.this.checkWrapped();
      int toReturn = IdMessageAutoBean.this.get("getSyntheticId", getWrapped().getSyntheticId());
      return toReturn;
    }
    public java.lang.String getServerId()  {
      IdMessageAutoBean.this.checkWrapped();
      java.lang.String toReturn = IdMessageAutoBean.this.get("getServerId", getWrapped().getServerId());
      return toReturn;
    }
    public java.lang.String getTypeToken()  {
      IdMessageAutoBean.this.checkWrapped();
      java.lang.String toReturn = IdMessageAutoBean.this.get("getTypeToken", getWrapped().getTypeToken());
      return toReturn;
    }
    public void setClientId(int value)  {
      IdMessageAutoBean.this.checkWrapped();
      IdMessageAutoBean.this.checkFrozen();
      IdMessageAutoBean.this.getWrapped().setClientId(value);
      IdMessageAutoBean.this.set("setClientId", value);
    }
    public void setServerId(java.lang.String value)  {
      IdMessageAutoBean.this.checkWrapped();
      IdMessageAutoBean.this.checkFrozen();
      IdMessageAutoBean.this.getWrapped().setServerId(value);
      IdMessageAutoBean.this.set("setServerId", value);
    }
    public void setStrength(com.google.gwt.requestfactory.shared.messages.IdMessage.Strength value)  {
      IdMessageAutoBean.this.checkWrapped();
      IdMessageAutoBean.this.checkFrozen();
      IdMessageAutoBean.this.getWrapped().setStrength(value);
      IdMessageAutoBean.this.set("setStrength", value);
    }
    public void setSyntheticId(int value)  {
      IdMessageAutoBean.this.checkWrapped();
      IdMessageAutoBean.this.checkFrozen();
      IdMessageAutoBean.this.getWrapped().setSyntheticId(value);
      IdMessageAutoBean.this.set("setSyntheticId", value);
    }
    public void setTypeToken(java.lang.String value)  {
      IdMessageAutoBean.this.checkWrapped();
      IdMessageAutoBean.this.checkFrozen();
      IdMessageAutoBean.this.getWrapped().setTypeToken(value);
      IdMessageAutoBean.this.set("setTypeToken", value);
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
  public IdMessageAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public IdMessageAutoBean(IdMessageAutoBean toClone, boolean deep) {
    super(toClone, deep);
  }
  public IdMessageAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory, com.google.gwt.requestfactory.shared.messages.IdMessage wrapped) {
    super(factory, wrapped);
  }
  public com.google.gwt.requestfactory.shared.messages.IdMessage as() {return shim;}
  public com.google.gwt.requestfactory.shared.messages.IdMessageAutoBean clone(boolean deep) {
    return new IdMessageAutoBean(this, deep);
  }
  public Class<com.google.gwt.requestfactory.shared.messages.IdMessage> getType() {return com.google.gwt.requestfactory.shared.messages.IdMessage.class;}
  @Override protected com.google.gwt.requestfactory.shared.messages.IdMessage createSimplePeer() {
    return new com.google.gwt.requestfactory.shared.messages.IdMessage() {
      public com.google.gwt.requestfactory.shared.messages.IdMessage.Strength getStrength()  {
        return (com.google.gwt.requestfactory.shared.messages.IdMessage.Strength) values.get("R");
      }
      public int getClientId()  {
        Object toReturn = values.get("C");
        if (toReturn == null) {
          return 0;
        } else {
          return (java.lang.Integer) toReturn;
        }
      }
      public int getSyntheticId()  {
        Object toReturn = values.get("Y");
        if (toReturn == null) {
          return 0;
        } else {
          return (java.lang.Integer) toReturn;
        }
      }
      public java.lang.String getServerId()  {
        return (java.lang.String) values.get("S");
      }
      public java.lang.String getTypeToken()  {
        return (java.lang.String) values.get("T");
      }
      public void setClientId(int value)  {
        values.put("C", value);
      }
      public void setServerId(java.lang.String value)  {
        values.put("S", value);
      }
      public void setStrength(com.google.gwt.requestfactory.shared.messages.IdMessage.Strength value)  {
        values.put("R", value);
      }
      public void setSyntheticId(int value)  {
        values.put("Y", value);
      }
      public void setTypeToken(java.lang.String value)  {
        values.put("T", value);
      }
    };
  }
  @Override protected void traverseProperties(com.google.gwt.autobean.shared.AutoBeanVisitor visitor, com.google.gwt.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    class _RPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getType() { return com.google.gwt.requestfactory.shared.messages.IdMessage.Strength.class; }
      public void set(Object obj) { 
        values.put("R", obj);
      }
    }
    {_RPropertyContext _RPropertyContext = new _RPropertyContext();
      Object value = as().getStrength();
      if (visitor.visitValueProperty("R", value, _RPropertyContext))
      visitor.endVisitValueProperty("R", value, _RPropertyContext);
    }class _CPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getType() { return int.class; }
      public void set(Object obj) { 
        values.put("C", obj);
      }
    }
    {_CPropertyContext _CPropertyContext = new _CPropertyContext();
      Object value = as().getClientId();
      if (visitor.visitValueProperty("C", value, _CPropertyContext))
      visitor.endVisitValueProperty("C", value, _CPropertyContext);
    }class _YPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getType() { return int.class; }
      public void set(Object obj) { 
        values.put("Y", obj);
      }
    }
    {_YPropertyContext _YPropertyContext = new _YPropertyContext();
      Object value = as().getSyntheticId();
      if (visitor.visitValueProperty("Y", value, _YPropertyContext))
      visitor.endVisitValueProperty("Y", value, _YPropertyContext);
    }class _SPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getType() { return java.lang.String.class; }
      public void set(Object obj) { 
        values.put("S", obj);
      }
    }
    {_SPropertyContext _SPropertyContext = new _SPropertyContext();
      Object value = as().getServerId();
      if (visitor.visitValueProperty("S", value, _SPropertyContext))
      visitor.endVisitValueProperty("S", value, _SPropertyContext);
    }class _TPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getType() { return java.lang.String.class; }
      public void set(Object obj) { 
        values.put("T", obj);
      }
    }
    {_TPropertyContext _TPropertyContext = new _TPropertyContext();
      Object value = as().getTypeToken();
      if (visitor.visitValueProperty("T", value, _TPropertyContext))
      visitor.endVisitValueProperty("T", value, _TPropertyContext);
    }}
}
