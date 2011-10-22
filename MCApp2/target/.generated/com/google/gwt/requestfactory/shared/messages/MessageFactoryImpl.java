package com.google.gwt.requestfactory.shared.messages;

public class MessageFactoryImpl extends com.google.gwt.autobean.client.impl.AbstractAutoBeanFactory implements com.google.gwt.requestfactory.shared.messages.MessageFactory {
  {
    creators.put(com.google.gwt.requestfactory.shared.messages.ResponseMessage.class, new Creator() {
      public com.google.gwt.requestfactory.shared.messages.ResponseMessageAutoBean create() { return new com.google.gwt.requestfactory.shared.messages.ResponseMessageAutoBean(MessageFactoryImpl.this); }
      public com.google.gwt.requestfactory.shared.messages.ResponseMessageAutoBean create(Object delegate) { return new com.google.gwt.requestfactory.shared.messages.ResponseMessageAutoBean(MessageFactoryImpl.this, (com.google.gwt.requestfactory.shared.messages.ResponseMessage) delegate); }
    });
    creators.put(java.util.Map.Entry.class, new Creator() {
      public emul.java.util.Map_EntryAutoBean create() { return null; }
      public emul.java.util.Map_EntryAutoBean create(Object delegate) { return new emul.java.util.Map_EntryAutoBean(MessageFactoryImpl.this, (java.util.Map.Entry) delegate); }
    });
    creators.put(java.util.Collection.class, new Creator() {
      public emul.java.util.CollectionAutoBean create() { return null; }
      public emul.java.util.CollectionAutoBean create(Object delegate) { return new emul.java.util.CollectionAutoBean(MessageFactoryImpl.this, (java.util.Collection) delegate); }
    });
    creators.put(com.google.gwt.requestfactory.shared.messages.InvocationMessage.class, new Creator() {
      public com.google.gwt.requestfactory.shared.messages.InvocationMessageAutoBean create() { return new com.google.gwt.requestfactory.shared.messages.InvocationMessageAutoBean(MessageFactoryImpl.this); }
      public com.google.gwt.requestfactory.shared.messages.InvocationMessageAutoBean create(Object delegate) { return new com.google.gwt.requestfactory.shared.messages.InvocationMessageAutoBean(MessageFactoryImpl.this, (com.google.gwt.requestfactory.shared.messages.InvocationMessage) delegate); }
    });
    creators.put(com.google.gwt.requestfactory.shared.messages.OperationMessage.class, new Creator() {
      public com.google.gwt.requestfactory.shared.messages.OperationMessageAutoBean create() { return new com.google.gwt.requestfactory.shared.messages.OperationMessageAutoBean(MessageFactoryImpl.this); }
      public com.google.gwt.requestfactory.shared.messages.OperationMessageAutoBean create(Object delegate) { return new com.google.gwt.requestfactory.shared.messages.OperationMessageAutoBean(MessageFactoryImpl.this, (com.google.gwt.requestfactory.shared.messages.OperationMessage) delegate); }
    });
    creators.put(java.util.Map.class, new Creator() {
      public emul.java.util.MapAutoBean create() { return null; }
      public emul.java.util.MapAutoBean create(Object delegate) { return new emul.java.util.MapAutoBean(MessageFactoryImpl.this, (java.util.Map) delegate); }
    });
    creators.put(com.google.gwt.requestfactory.shared.messages.ViolationMessage.class, new Creator() {
      public com.google.gwt.requestfactory.shared.messages.ViolationMessageAutoBean create() { return new com.google.gwt.requestfactory.shared.messages.ViolationMessageAutoBean(MessageFactoryImpl.this); }
      public com.google.gwt.requestfactory.shared.messages.ViolationMessageAutoBean create(Object delegate) { return new com.google.gwt.requestfactory.shared.messages.ViolationMessageAutoBean(MessageFactoryImpl.this, (com.google.gwt.requestfactory.shared.messages.ViolationMessage) delegate); }
    });
    creators.put(com.google.gwt.requestfactory.shared.messages.RequestMessage.class, new Creator() {
      public com.google.gwt.requestfactory.shared.messages.RequestMessageAutoBean create() { return new com.google.gwt.requestfactory.shared.messages.RequestMessageAutoBean(MessageFactoryImpl.this); }
      public com.google.gwt.requestfactory.shared.messages.RequestMessageAutoBean create(Object delegate) { return new com.google.gwt.requestfactory.shared.messages.RequestMessageAutoBean(MessageFactoryImpl.this, (com.google.gwt.requestfactory.shared.messages.RequestMessage) delegate); }
    });
    creators.put(com.google.gwt.autobean.shared.Splittable.class, new Creator() {
      public com.google.gwt.autobean.shared.SplittableAutoBean create() { return null; }
      public com.google.gwt.autobean.shared.SplittableAutoBean create(Object delegate) { return new com.google.gwt.autobean.shared.SplittableAutoBean(MessageFactoryImpl.this, (com.google.gwt.autobean.shared.Splittable) delegate); }
    });
    creators.put(java.util.List.class, new Creator() {
      public emul.java.util.ListAutoBean create() { return null; }
      public emul.java.util.ListAutoBean create(Object delegate) { return new emul.java.util.ListAutoBean(MessageFactoryImpl.this, (java.util.List) delegate); }
    });
    creators.put(java.util.ListIterator.class, new Creator() {
      public emul.java.util.ListIteratorAutoBean create() { return null; }
      public emul.java.util.ListIteratorAutoBean create(Object delegate) { return new emul.java.util.ListIteratorAutoBean(MessageFactoryImpl.this, (java.util.ListIterator) delegate); }
    });
    creators.put(com.google.gwt.requestfactory.shared.messages.IdMessage.class, new Creator() {
      public com.google.gwt.requestfactory.shared.messages.IdMessageAutoBean create() { return new com.google.gwt.requestfactory.shared.messages.IdMessageAutoBean(MessageFactoryImpl.this); }
      public com.google.gwt.requestfactory.shared.messages.IdMessageAutoBean create(Object delegate) { return new com.google.gwt.requestfactory.shared.messages.IdMessageAutoBean(MessageFactoryImpl.this, (com.google.gwt.requestfactory.shared.messages.IdMessage) delegate); }
    });
    creators.put(java.util.Set.class, new Creator() {
      public emul.java.util.SetAutoBean create() { return null; }
      public emul.java.util.SetAutoBean create(Object delegate) { return new emul.java.util.SetAutoBean(MessageFactoryImpl.this, (java.util.Set) delegate); }
    });
    creators.put(com.google.gwt.requestfactory.shared.messages.ServerFailureMessage.class, new Creator() {
      public com.google.gwt.requestfactory.shared.messages.ServerFailureMessageAutoBean create() { return new com.google.gwt.requestfactory.shared.messages.ServerFailureMessageAutoBean(MessageFactoryImpl.this); }
      public com.google.gwt.requestfactory.shared.messages.ServerFailureMessageAutoBean create(Object delegate) { return new com.google.gwt.requestfactory.shared.messages.ServerFailureMessageAutoBean(MessageFactoryImpl.this, (com.google.gwt.requestfactory.shared.messages.ServerFailureMessage) delegate); }
    });
    creators.put(java.util.Iterator.class, new Creator() {
      public emul.java.util.IteratorAutoBean create() { return null; }
      public emul.java.util.IteratorAutoBean create(Object delegate) { return new emul.java.util.IteratorAutoBean(MessageFactoryImpl.this, (java.util.Iterator) delegate); }
    });
  }
  @Override protected void initializeEnumMap() {
    enumToStringMap.put(com.google.gwt.requestfactory.shared.messages.IdMessage.Strength.PERSISTED, "0");
    enumToStringMap.put(com.google.gwt.requestfactory.shared.messages.IdMessage.Strength.EPHEMERAL, "1");
    enumToStringMap.put(com.google.gwt.requestfactory.shared.messages.IdMessage.Strength.SYNTHETIC, "2");
    enumToStringMap.put(com.google.gwt.requestfactory.shared.WriteOperation.PERSIST, "PERSIST");
    enumToStringMap.put(com.google.gwt.requestfactory.shared.WriteOperation.UPDATE, "UPDATE");
    enumToStringMap.put(com.google.gwt.requestfactory.shared.WriteOperation.DELETE, "DELETE");
    stringsToEnumsMap.put("UPDATE", java.util.Collections.<java.lang.Enum<?>> singletonList(com.google.gwt.requestfactory.shared.WriteOperation.UPDATE));
    stringsToEnumsMap.put("2", java.util.Collections.<java.lang.Enum<?>> singletonList(com.google.gwt.requestfactory.shared.messages.IdMessage.Strength.SYNTHETIC));
    stringsToEnumsMap.put("1", java.util.Collections.<java.lang.Enum<?>> singletonList(com.google.gwt.requestfactory.shared.messages.IdMessage.Strength.EPHEMERAL));
    stringsToEnumsMap.put("0", java.util.Collections.<java.lang.Enum<?>> singletonList(com.google.gwt.requestfactory.shared.messages.IdMessage.Strength.PERSISTED));
    stringsToEnumsMap.put("DELETE", java.util.Collections.<java.lang.Enum<?>> singletonList(com.google.gwt.requestfactory.shared.WriteOperation.DELETE));
    stringsToEnumsMap.put("PERSIST", java.util.Collections.<java.lang.Enum<?>> singletonList(com.google.gwt.requestfactory.shared.WriteOperation.PERSIST));
  }
  public com.google.gwt.autobean.shared.AutoBean failure() {
    return new com.google.gwt.requestfactory.shared.messages.ServerFailureMessageAutoBean(MessageFactoryImpl.this);
  }
  public com.google.gwt.autobean.shared.AutoBean id() {
    return new com.google.gwt.requestfactory.shared.messages.IdMessageAutoBean(MessageFactoryImpl.this);
  }
  public com.google.gwt.autobean.shared.AutoBean invocation() {
    return new com.google.gwt.requestfactory.shared.messages.InvocationMessageAutoBean(MessageFactoryImpl.this);
  }
  public com.google.gwt.autobean.shared.AutoBean operation() {
    return new com.google.gwt.requestfactory.shared.messages.OperationMessageAutoBean(MessageFactoryImpl.this);
  }
  public com.google.gwt.autobean.shared.AutoBean request() {
    return new com.google.gwt.requestfactory.shared.messages.RequestMessageAutoBean(MessageFactoryImpl.this);
  }
  public com.google.gwt.autobean.shared.AutoBean response() {
    return new com.google.gwt.requestfactory.shared.messages.ResponseMessageAutoBean(MessageFactoryImpl.this);
  }
  public com.google.gwt.autobean.shared.AutoBean violation() {
    return new com.google.gwt.requestfactory.shared.messages.ViolationMessageAutoBean(MessageFactoryImpl.this);
  }
}
