package com.google.gwt.requestfactory.shared;

public class LoggingRequestImpl extends com.google.gwt.requestfactory.shared.impl.AbstractRequestContext implements com.google.gwt.requestfactory.shared.LoggingRequest {
  public LoggingRequestImpl(com.google.gwt.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory);}
  public  com.google.gwt.requestfactory.shared.Request<java.lang.Void> logMessage(final java.lang.String serializedLogRecordString) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.Request<java.lang.Void> {
      public X() { super(LoggingRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("com.google.gwt.requestfactory.shared.LoggingRequest::logMessage", new Object[] {serializedLogRecordString}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
}
