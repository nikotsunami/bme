package medizin.client.managed.request;

public class InstitutionRequestImpl extends com.google.gwt.requestfactory.shared.impl.AbstractRequestContext implements medizin.client.managed.request.InstitutionRequest {
  public InstitutionRequestImpl(com.google.gwt.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory);}
  public  com.google.gwt.requestfactory.shared.Request<java.lang.Long> countInstitutions() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Long> implements com.google.gwt.requestfactory.shared.Request<java.lang.Long> {
      public X() { super(InstitutionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.InstitutionRequest::countInstitutions", new Object[] {}, propertyRefs, java.lang.Long.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.InstitutionProxy>> findAllInstitutions() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.InstitutionProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.InstitutionProxy>> {
      public X() { super(InstitutionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.InstitutionRequest::findAllInstitutions", new Object[] {}, propertyRefs, java.util.List.class, medizin.client.managed.request.InstitutionProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.InstitutionProxy> findInstitution(final java.lang.Long id) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<medizin.client.managed.request.InstitutionProxy> implements com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.InstitutionProxy> {
      public X() { super(InstitutionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.InstitutionRequest::findInstitution", new Object[] {id}, propertyRefs, medizin.client.managed.request.InstitutionProxy.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.InstitutionProxy>> findInstitutionEntries(final int firstResult,final int maxResults) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.InstitutionProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.InstitutionProxy>> {
      public X() { super(InstitutionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.InstitutionRequest::findInstitutionEntries", new Object[] {firstResult,maxResults}, propertyRefs, java.util.List.class, medizin.client.managed.request.InstitutionProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.InstitutionProxy, java.lang.Void> persist() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.InstitutionProxy, java.lang.Void> {
      public X() { super(InstitutionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.InstitutionRequest::persist", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.InstitutionProxy, java.lang.Void> remove() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.InstitutionProxy, java.lang.Void> {
      public X() { super(InstitutionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.InstitutionRequest::remove", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
}
