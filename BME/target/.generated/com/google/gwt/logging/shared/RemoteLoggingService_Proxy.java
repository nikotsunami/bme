package com.google.gwt.logging.shared;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.RpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class RemoteLoggingService_Proxy extends RemoteServiceProxy implements com.google.gwt.logging.shared.RemoteLoggingServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.google.gwt.logging.shared.RemoteLoggingService";
  private static final String SERIALIZATION_POLICY ="11165BD5CC1887EAF30DF69B4F2CF746";
  private static final com.google.gwt.logging.shared.RemoteLoggingService_TypeSerializer SERIALIZER = new com.google.gwt.logging.shared.RemoteLoggingService_TypeSerializer();
  
  public RemoteLoggingService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "remote_logging", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void logOnServer(java.util.logging.LogRecord record, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("RemoteLoggingService_Proxy.logOnServer", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("logOnServer");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.logging.LogRecord/2492345967");
      streamWriter.writeObject(record);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("RemoteLoggingService_Proxy.logOnServer",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "RemoteLoggingService_Proxy.logOnServer", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  @Override
  public SerializationStreamWriter createStreamWriter() {
    ClientSerializationStreamWriter toReturn =
      (ClientSerializationStreamWriter) super.createStreamWriter();
    if (getRpcToken() != null) {
      toReturn.addFlags(ClientSerializationStreamWriter.FLAG_RPC_TOKEN_INCLUDED);
    }
    return toReturn;
  }
}
