package medizin.client.managed.request;

public class AssesmentQuestionRequestImpl extends com.google.gwt.requestfactory.shared.impl.AbstractRequestContext implements medizin.client.managed.request.AssesmentQuestionRequest {
  public AssesmentQuestionRequestImpl(com.google.gwt.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory);}
  public  com.google.gwt.requestfactory.shared.Request<java.lang.Long> countAssesmentQuestions() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Long> implements com.google.gwt.requestfactory.shared.Request<java.lang.Long> {
      public X() { super(AssesmentQuestionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.AssesmentQuestionRequest::countAssesmentQuestions", new Object[] {}, propertyRefs, java.lang.Long.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.AssesmentQuestionProxy, java.lang.Void> countRedactionalBases() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.AssesmentQuestionProxy, java.lang.Void> {
      public X() { super(AssesmentQuestionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.AssesmentQuestionRequest::countRedactionalBases", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> findAllAssesmentQuestions() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> {
      public X() { super(AssesmentQuestionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.AssesmentQuestionRequest::findAllAssesmentQuestions", new Object[] {}, propertyRefs, java.util.List.class, medizin.client.managed.request.AssesmentQuestionProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.AssesmentQuestionProxy, java.lang.Void> findAllRedactionalBases() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.AssesmentQuestionProxy, java.lang.Void> {
      public X() { super(AssesmentQuestionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.AssesmentQuestionRequest::findAllRedactionalBases", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.AssesmentQuestionProxy> findAssesmentQuestion(final java.lang.Long id) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<medizin.client.managed.request.AssesmentQuestionProxy> implements com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.AssesmentQuestionProxy> {
      public X() { super(AssesmentQuestionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.AssesmentQuestionRequest::findAssesmentQuestion", new Object[] {id}, propertyRefs, medizin.client.managed.request.AssesmentQuestionProxy.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> findAssesmentQuestionEntries(final int firstResult,final int maxResults) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> {
      public X() { super(AssesmentQuestionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.AssesmentQuestionRequest::findAssesmentQuestionEntries", new Object[] {firstResult,maxResults}, propertyRefs, java.util.List.class, medizin.client.managed.request.AssesmentQuestionProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.AssesmentQuestionProxy, java.lang.Void> findRedactionalBase(final java.lang.Long id) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.AssesmentQuestionProxy, java.lang.Void> {
      public X() { super(AssesmentQuestionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.AssesmentQuestionRequest::findRedactionalBase", new Object[] {null,id}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.AssesmentQuestionProxy, java.lang.Void> findRedactionalBaseEntries(final int firstResult,final int maxResults) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.AssesmentQuestionProxy, java.lang.Void> {
      public X() { super(AssesmentQuestionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.AssesmentQuestionRequest::findRedactionalBaseEntries", new Object[] {null,firstResult,maxResults}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.AssesmentQuestionProxy, java.lang.Void> persist() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.AssesmentQuestionProxy, java.lang.Void> {
      public X() { super(AssesmentQuestionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.AssesmentQuestionRequest::persist", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.AssesmentQuestionProxy, java.lang.Void> remove() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.AssesmentQuestionProxy, java.lang.Void> {
      public X() { super(AssesmentQuestionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.AssesmentQuestionRequest::remove", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
}
