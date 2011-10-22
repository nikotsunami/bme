package medizin.client.managed.request;

public class QuestionTypeRequestImpl extends com.google.gwt.requestfactory.shared.impl.AbstractRequestContext implements medizin.client.managed.request.QuestionTypeRequest {
  public QuestionTypeRequestImpl(com.google.gwt.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory);}
  public  com.google.gwt.requestfactory.shared.Request<java.lang.Long> countQuestionTypes() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Long> implements com.google.gwt.requestfactory.shared.Request<java.lang.Long> {
      public X() { super(QuestionTypeRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.QuestionTypeRequest::countQuestionTypes", new Object[] {}, propertyRefs, java.lang.Long.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionTypeProxy>> findAllQuestionTypes() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.QuestionTypeProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionTypeProxy>> {
      public X() { super(QuestionTypeRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.QuestionTypeRequest::findAllQuestionTypes", new Object[] {}, propertyRefs, java.util.List.class, medizin.client.managed.request.QuestionTypeProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.QuestionTypeProxy> findQuestionType(final java.lang.Long id) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<medizin.client.managed.request.QuestionTypeProxy> implements com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.QuestionTypeProxy> {
      public X() { super(QuestionTypeRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.QuestionTypeRequest::findQuestionType", new Object[] {id}, propertyRefs, medizin.client.managed.request.QuestionTypeProxy.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionTypeProxy>> findQuestionTypeEntries(final int firstResult,final int maxResults) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.QuestionTypeProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionTypeProxy>> {
      public X() { super(QuestionTypeRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.QuestionTypeRequest::findQuestionTypeEntries", new Object[] {firstResult,maxResults}, propertyRefs, java.util.List.class, medizin.client.managed.request.QuestionTypeProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.QuestionTypeProxy, java.lang.Void> persist() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.QuestionTypeProxy, java.lang.Void> {
      public X() { super(QuestionTypeRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.QuestionTypeRequest::persist", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.QuestionTypeProxy, java.lang.Void> remove() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.QuestionTypeProxy, java.lang.Void> {
      public X() { super(QuestionTypeRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.QuestionTypeRequest::remove", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
}
