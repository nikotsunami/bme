package medizin.client.managed.request;

public class StaticToAssesmentRequestImpl extends com.google.gwt.requestfactory.shared.impl.AbstractRequestContext implements medizin.client.managed.request.StaticToAssesmentRequest {
  public StaticToAssesmentRequestImpl(com.google.gwt.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory);}
  public  com.google.gwt.requestfactory.shared.Request<java.lang.Long> countStaticToAssesments() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Long> implements com.google.gwt.requestfactory.shared.Request<java.lang.Long> {
      public X() { super(StaticToAssesmentRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.StaticToAssesmentRequest::countStaticToAssesments", new Object[] {}, propertyRefs, java.lang.Long.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.StaticToAssesmentProxy>> findAllStaticToAssesments() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.StaticToAssesmentProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.StaticToAssesmentProxy>> {
      public X() { super(StaticToAssesmentRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.StaticToAssesmentRequest::findAllStaticToAssesments", new Object[] {}, propertyRefs, java.util.List.class, medizin.client.managed.request.StaticToAssesmentProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.StaticToAssesmentProxy> findStaticToAssesment(final java.lang.Long id) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<medizin.client.managed.request.StaticToAssesmentProxy> implements com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.StaticToAssesmentProxy> {
      public X() { super(StaticToAssesmentRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.StaticToAssesmentRequest::findStaticToAssesment", new Object[] {id}, propertyRefs, medizin.client.managed.request.StaticToAssesmentProxy.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.StaticToAssesmentProxy>> findStaticToAssesmentEntries(final int firstResult,final int maxResults) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.StaticToAssesmentProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.StaticToAssesmentProxy>> {
      public X() { super(StaticToAssesmentRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.StaticToAssesmentRequest::findStaticToAssesmentEntries", new Object[] {firstResult,maxResults}, propertyRefs, java.util.List.class, medizin.client.managed.request.StaticToAssesmentProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.StaticToAssesmentProxy, java.lang.Void> persist() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.StaticToAssesmentProxy, java.lang.Void> {
      public X() { super(StaticToAssesmentRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.StaticToAssesmentRequest::persist", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.StaticToAssesmentProxy, java.lang.Void> remove() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.StaticToAssesmentProxy, java.lang.Void> {
      public X() { super(StaticToAssesmentRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.StaticToAssesmentRequest::remove", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
}
