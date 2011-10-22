package com.allen_sauer.gwt.dnd.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class VetoDragException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.allen_sauer.gwt.dnd.client.VetoDragException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.allen_sauer.gwt.dnd.client.VetoDragException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.allen_sauer.gwt.dnd.client.VetoDragException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.allen_sauer.gwt.dnd.client.VetoDragException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.allen_sauer.gwt.dnd.client.VetoDragException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.allen_sauer.gwt.dnd.client.VetoDragException_FieldSerializer.deserialize(reader, (com.allen_sauer.gwt.dnd.client.VetoDragException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.allen_sauer.gwt.dnd.client.VetoDragException_FieldSerializer.serialize(writer, (com.allen_sauer.gwt.dnd.client.VetoDragException)object);
  }
  
}
