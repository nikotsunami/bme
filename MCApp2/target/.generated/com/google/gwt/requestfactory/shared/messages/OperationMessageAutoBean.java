package com.google.gwt.requestfactory.shared.messages;

public class OperationMessageAutoBean extends com.google.gwt.autobean.shared.impl.AbstractAutoBean<com.google.gwt.requestfactory.shared.messages.OperationMessage> {
  private final com.google.gwt.requestfactory.shared.messages.OperationMessage shim = new com.google.gwt.requestfactory.shared.messages.OperationMessage() {
    public com.google.gwt.requestfactory.shared.WriteOperation getOperation()  {
      OperationMessageAutoBean.this.checkWrapped();
      com.google.gwt.requestfactory.shared.WriteOperation toReturn = OperationMessageAutoBean.this.get("getOperation", getWrapped().getOperation());
      return toReturn;
    }
    public com.google.gwt.requestfactory.shared.messages.IdMessage.Strength getStrength()  {
      OperationMessageAutoBean.this.checkWrapped();
      com.google.gwt.requestfactory.shared.messages.IdMessage.Strength toReturn = OperationMessageAutoBean.this.get("getStrength", getWrapped().getStrength());
      return toReturn;
    }
    public int getClientId()  {
      OperationMessageAutoBean.this.checkWrapped();
      int toReturn = OperationMessageAutoBean.this.get("getClientId", getWrapped().getClientId());
      return toReturn;
    }
    public int getSyntheticId()  {
      OperationMessageAutoBean.this.checkWrapped();
      int toReturn = OperationMessageAutoBean.this.get("getSyntheticId", getWrapped().getSyntheticId());
      return toReturn;
    }
    public java.lang.String getServerId()  {
      OperationMessageAutoBean.this.checkWrapped();
      java.lang.String toReturn = OperationMessageAutoBean.this.get("getServerId", getWrapped().getServerId());
      return toReturn;
    }
    public java.lang.String getTypeToken()  {
      OperationMessageAutoBean.this.checkWrapped();
      java.lang.String toReturn = OperationMessageAutoBean.this.get("getTypeToken", getWrapped().getTypeToken());
      return toReturn;
    }
    public java.lang.String getVersion()  {
      OperationMessageAutoBean.this.checkWrapped();
      java.lang.String toReturn = OperationMessageAutoBean.this.get("getVersion", getWrapped().getVersion());
      return toReturn;
    }
    public java.util.Map getPropertyMap()  {
      OperationMessageAutoBean.this.checkWrapped();
      java.util.Map toReturn = OperationMessageAutoBean.this.get("getPropertyMap", getWrapped().getPropertyMap());
      if (toReturn != null) {
        if (OperationMessageAutoBean.this.isWrapped(toReturn)) {
          toReturn = OperationMessageAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.MapAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public void setClientId(int value)  {
      OperationMessageAutoBean.this.checkWrapped();
      OperationMessageAutoBean.this.checkFrozen();
      OperationMessageAutoBean.this.getWrapped().setClientId(value);
      OperationMessageAutoBean.this.set("setClientId", value);
    }
    public void setOperation(com.google.gwt.requestfactory.shared.WriteOperation value)  {
      OperationMessageAutoBean.this.checkWrapped();
      OperationMessageAutoBean.this.checkFrozen();
      OperationMessageAutoBean.this.getWrapped().setOperation(value);
      OperationMessageAutoBean.this.set("setOperation", value);
    }
    public void setPropertyMap(java.util.Map map)  {
      OperationMessageAutoBean.this.checkWrapped();
      OperationMessageAutoBean.this.checkFrozen();
      OperationMessageAutoBean.this.getWrapped().setPropertyMap(map);
      OperationMessageAutoBean.this.set("setPropertyMap", map);
    }
    public void setServerId(java.lang.String value)  {
      OperationMessageAutoBean.this.checkWrapped();
      OperationMessageAutoBean.this.checkFrozen();
      OperationMessageAutoBean.this.getWrapped().setServerId(value);
      OperationMessageAutoBean.this.set("setServerId", value);
    }
    public void setStrength(com.google.gwt.requestfactory.shared.messages.IdMessage.Strength value)  {
      OperationMessageAutoBean.this.checkWrapped();
      OperationMessageAutoBean.this.checkFrozen();
      OperationMessageAutoBean.this.getWrapped().setStrength(value);
      OperationMessageAutoBean.this.set("setStrength", value);
    }
    public void setSyntheticId(int value)  {
      OperationMessageAutoBean.this.checkWrapped();
      OperationMessageAutoBean.this.checkFrozen();
      OperationMessageAutoBean.this.getWrapped().setSyntheticId(value);
      OperationMessageAutoBean.this.set("setSyntheticId", value);
    }
    public void setTypeToken(java.lang.String value)  {
      OperationMessageAutoBean.this.checkWrapped();
      OperationMessageAutoBean.this.checkFrozen();
      OperationMessageAutoBean.this.getWrapped().setTypeToken(value);
      OperationMessageAutoBean.this.set("setTypeToken", value);
    }
    public void setVersion(java.lang.String version)  {
      OperationMessageAutoBean.this.checkWrapped();
      OperationMessageAutoBean.this.checkFrozen();
      OperationMessageAutoBean.this.getWrapped().setVersion(version);
      OperationMessageAutoBean.this.set("setVersion", version);
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
  public OperationMessageAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public OperationMessageAutoBean(OperationMessageAutoBean toClone, boolean deep) {
    super(toClone, deep);
  }
  public OperationMessageAutoBean(com.google.gwt.autobean.shared.AutoBeanFactory factory, com.google.gwt.requestfactory.shared.messages.OperationMessage wrapped) {
    super(factory, wrapped);
  }
  public com.google.gwt.requestfactory.shared.messages.OperationMessage as() {return shim;}
  public com.google.gwt.requestfactory.shared.messages.OperationMessageAutoBean clone(boolean deep) {
    return new OperationMessageAutoBean(this, deep);
  }
  public Class<com.google.gwt.requestfactory.shared.messages.OperationMessage> getType() {return com.google.gwt.requestfactory.shared.messages.OperationMessage.class;}
  @Override protected com.google.gwt.requestfactory.shared.messages.OperationMessage createSimplePeer() {
    return new com.google.gwt.requestfactory.shared.messages.OperationMessage() {
      public com.google.gwt.requestfactory.shared.WriteOperation getOperation()  {
        return (com.google.gwt.requestfactory.shared.WriteOperation) values.get("O");
      }
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
      public java.lang.String getVersion()  {
        return (java.lang.String) values.get("V");
      }
      public java.util.Map getPropertyMap()  {
        return (java.util.Map) values.get("P");
      }
      public void setClientId(int value)  {
        values.put("C", value);
      }
      public void setOperation(com.google.gwt.requestfactory.shared.WriteOperation value)  {
        values.put("O", value);
      }
      public void setPropertyMap(java.util.Map map)  {
        values.put("P", map);
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
      public void setVersion(java.lang.String version)  {
        values.put("V", version);
      }
    };
  }
  @Override protected void traverseProperties(com.google.gwt.autobean.shared.AutoBeanVisitor visitor, com.google.gwt.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    class _OPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getType() { return com.google.gwt.requestfactory.shared.WriteOperation.class; }
      public void set(Object obj) { 
        values.put("O", obj);
      }
    }
    {_OPropertyContext _OPropertyContext = new _OPropertyContext();
      Object value = as().getOperation();
      if (visitor.visitValueProperty("O", value, _OPropertyContext))
      visitor.endVisitValueProperty("O", value, _OPropertyContext);
    }class _RPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
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
    }class _PPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.MapPropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getValueType() { return com.google.gwt.autobean.shared.Splittable.class; }
      public Class<?> getKeyType() { return java.lang.String.class; }
      public Class<?> getType() { return java.util.Map.class; }
      public void set(Object obj) { 
        values.put("P", obj);
      }
    }
    {_PPropertyContext _PPropertyContext = new _PPropertyContext();
      com.google.gwt.autobean.shared.impl.AbstractAutoBean value = (com.google.gwt.autobean.shared.impl.AbstractAutoBean) com.google.gwt.autobean.shared.AutoBeanUtils.getAutoBean(as().getPropertyMap());
      if (visitor.visitMapProperty("P", value, _PPropertyContext))
        if (value != null) { value.traverse(visitor, ctx); }
      visitor.endVisitMapProperty("P", value, _PPropertyContext);
    }}
}
