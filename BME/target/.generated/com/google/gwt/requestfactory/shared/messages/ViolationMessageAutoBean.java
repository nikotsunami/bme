package com.google.gwt.requestfactory.shared.messages;

public class ViolationMessageAutoBean extends com.google.gwt.autobean.shared.impl.AbstractAutoBean<com.google.gwt.requestfactory.shared.messages.ViolationMessage> {
  private final com.google.gwt.requestfactory.shared.messages.ViolationMessage shim = new com.google.gwt.requestfactory.shared.messages.ViolationMessage() {
    public com.google.gwt.requestfactory.shared.messages.IdMessage.Strength getStrength()  {
      ViolationMessageAutoBean.this.checkWrapped();
      com.google.gwt.requestfactory.shared.messages.IdMessage.Strength toReturn = ViolationMessageAutoBean.this.get("getStrength", getWrapped().getStrength());
      return toReturn;
    }
    public int getClientId()  {
      ViolationMessageAutoBean.this.checkWrapped();
      int toReturn = ViolationMessageAutoBean.this.get("getClientId", getWrapped().getClientId());
      return toReturn;
    }
    public int getSyntheticId()  {
      ViolationMessageAutoBean.this.checkWrapped();
      int toReturn = ViolationMessageAutoBean.this.get("getSyntheticId", getWrapped().getSyntheticId());
      return toReturn;
    }
    public java.lang.String getMessage()  {
      ViolationMessageAutoBean.this.checkWrapped();
      java.lang.String toReturn = ViolationMessageAutoBean.this.get("getMessage", getWrapped().getMessage());
      return toReturn;
    }
    public java.lang.String getPath()  {
      ViolationMessageAutoBean.this.checkWrapped();
      java.lang.String toReturn = ViolationMessageAutoBean.this.get("getPath", getWrapped().getPath());
      return toReturn;
    }
    public java.lang.String getServerId()  {
      ViolationMessageAutoBean.this.checkWrapped();
      java.lang.String toReturn = ViolationMessageAutoBean.this.get("getServerId", getWrapped().getServerId());
      return toReturn;
    }
    public java.lang.String getTypeToken()  {
      ViolationMessageAutoBean.this.checkWrapped();
      java.lang.String toReturn = ViolationMessageAutoBean.this.get("getTypeToken", getWrapped().getTypeToken());
      return toReturn;
    }
    public void setClientId(int value)  {
      ViolationMessageAutoBean.this.checkWrapped();
      ViolationMessageAutoBean.this.checkFrozen();
      ViolationMessageAutoBean.this.getWrapped().setClientId(value);
      ViolationMessageAutoBean.this.set("setClientId", value);
    }
    public void setMessage(java.lang.String value)  {
      ViolationMessageAutoBean.this.checkWrapped();
      ViolationMessageAutoBean.this.checkFrozen();
      ViolationMessageAutoBean.this.getWrapped().setMessage(value);
      ViolationMessageAutoBean.this.set("setMessage", value);
    }
    public void setPath(java.lang.String value)  {
      ViolationMessageAutoBean.this.checkWrapped();
      ViolationMessageAutoBean.this.checkFrozen();
      ViolationMessageAutoBean.this.getWrapped().setPath(value);
      ViolationMessageAutoBean.this.set("setPath", value);
    }
    public void setServerId(java.lang.String value)  {
      ViolationMessageAutoBean.this.checkWrapped();
      ViolationMessageAutoBean.this.checkFrozen();
      ViolationMessageAutoBean.this.getWrapped().setServerId(value);
      ViolationMessageAutoBean.this.set("setServerId", value);
    }
    public void setStrength(com.google.gwt.requestfactory.shared.messages.IdMessage.Strength value)  {
      ViolationMessageAutoBean.this.checkWrapped();
      ViolationMessageAutoBean.this.checkFrozen();
      ViolationMessageAutoBean.this.getWrapped().setStrength(value);
      ViolationMessageAutoBean.this.set("setStrength", value);
    }
    public void setSyntheticId(int value)  {
      ViolationMessageAutoBean.this.checkWrapped();
      ViolationMessageAutoBean.this.checkFrozen();
      ViolationMessageAutoBean.this.getWrapped().setSyntheticId(value);
      ViolationMessageAutoBean.this.set("setSyntheticId", value);
    }
    public void setTypeToken(java.lang.String value)  {
      ViolationMessageAutoBean.this.checkWrapped();
      ViolationMessageAutoBean.this.checkFrozen();
      ViolationMessageAutoBean.this.getWrapped().setTypeToken(value);
      ViolationMessageAutoBean.this.set("setTypeToken", value);
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
  public ViolationMessageAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public ViolationMessageAutoBean(ViolationMessageAutoBean toClone, boolean deep) {
    super(toClone, deep);
  }
  public ViolationMessageAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory, com.google.gwt.requestfactory.shared.messages.ViolationMessage wrapped) {
    super(factory, wrapped);
  }
  public com.google.gwt.requestfactory.shared.messages.ViolationMessage as() {return shim;}
  public com.google.gwt.requestfactory.shared.messages.ViolationMessageAutoBean clone(boolean deep) {
    return new ViolationMessageAutoBean(this, deep);
  }
  public Class<com.google.gwt.requestfactory.shared.messages.ViolationMessage> getType() {return com.google.gwt.requestfactory.shared.messages.ViolationMessage.class;}
  @Override protected com.google.gwt.requestfactory.shared.messages.ViolationMessage createSimplePeer() {
    return new com.google.gwt.requestfactory.shared.messages.ViolationMessage() {
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
      public java.lang.String getMessage()  {
        return (java.lang.String) values.get("M");
      }
      public java.lang.String getPath()  {
        return (java.lang.String) values.get("P");
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
      public void setMessage(java.lang.String value)  {
        values.put("M", value);
      }
      public void setPath(java.lang.String value)  {
        values.put("P", value);
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
    }class _PPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getType() { return java.lang.String.class; }
      public void set(Object obj) { 
        values.put("P", obj);
      }
    }
    {_PPropertyContext _PPropertyContext = new _PPropertyContext();
      Object value = as().getPath();
      if (visitor.visitValueProperty("P", value, _PPropertyContext))
      visitor.endVisitValueProperty("P", value, _PPropertyContext);
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
