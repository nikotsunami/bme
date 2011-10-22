package com.allen_sauer.gwt.log.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class UnwrappedClientThrowable_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable getCause(com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable instance) /*-{
    return instance.@com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable::cause;
  }-*/;
  
  private static native void  setCause(com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable instance, com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable value) /*-{
    instance.@com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable::cause = value;
  }-*/;
  
  private static native java.lang.String getMessage(com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable instance) /*-{
    return instance.@com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable::message;
  }-*/;
  
  private static native void  setMessage(com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable instance, java.lang.String value) /*-{
    instance.@com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable::message = value;
  }-*/;
  
  private static native java.lang.String getOriginalToString(com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable instance) /*-{
    return instance.@com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable::originalToString;
  }-*/;
  
  private static native void  setOriginalToString(com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable instance, java.lang.String value) /*-{
    instance.@com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable::originalToString = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable instance) throws SerializationException {
    setCause(instance, (com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable) streamReader.readObject());
    setMessage(instance, streamReader.readString());
    setOriginalToString(instance, streamReader.readString());
    
    com.google.gwt.user.client.rpc.core.java.lang.Throwable_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable instantiate(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable::new()();
  }-*/;
  
  public static void serialize(SerializationStreamWriter streamWriter, com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable instance) throws SerializationException {
    streamWriter.writeObject(getCause(instance));
    streamWriter.writeString(getMessage(instance));
    streamWriter.writeString(getOriginalToString(instance));
    
    com.google.gwt.user.client.rpc.core.java.lang.Throwable_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable_FieldSerializer.deserialize(reader, (com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable_FieldSerializer.serialize(writer, (com.allen_sauer.gwt.log.shared.UnwrappedClientThrowable)object);
  }
  
}
