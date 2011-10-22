package medizin.client.managed.request;

public class AnswerToAssQuestionRequestImpl extends com.google.gwt.requestfactory.shared.impl.AbstractRequestContext implements medizin.client.managed.request.AnswerToAssQuestionRequest {
  public AnswerToAssQuestionRequestImpl(com.google.gwt.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory);}
  public  com.google.gwt.requestfactory.shared.Request<java.lang.Long> countAnswerToAssQuestions() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Long> implements com.google.gwt.requestfactory.shared.Request<java.lang.Long> {
      public X() { super(AnswerToAssQuestionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.AnswerToAssQuestionRequest::countAnswerToAssQuestions", new Object[] {}, propertyRefs, java.lang.Long.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AnswerToAssQuestionProxy>> findAllAnswerToAssQuestions() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.AnswerToAssQuestionProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AnswerToAssQuestionProxy>> {
      public X() { super(AnswerToAssQuestionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.AnswerToAssQuestionRequest::findAllAnswerToAssQuestions", new Object[] {}, propertyRefs, java.util.List.class, medizin.client.managed.request.AnswerToAssQuestionProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.AnswerToAssQuestionProxy> findAnswerToAssQuestion(final java.lang.Long id) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<medizin.client.managed.request.AnswerToAssQuestionProxy> implements com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.AnswerToAssQuestionProxy> {
      public X() { super(AnswerToAssQuestionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.AnswerToAssQuestionRequest::findAnswerToAssQuestion", new Object[] {id}, propertyRefs, medizin.client.managed.request.AnswerToAssQuestionProxy.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AnswerToAssQuestionProxy>> findAnswerToAssQuestionEntries(final int firstResult,final int maxResults) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.AnswerToAssQuestionProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AnswerToAssQuestionProxy>> {
      public X() { super(AnswerToAssQuestionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.AnswerToAssQuestionRequest::findAnswerToAssQuestionEntries", new Object[] {firstResult,maxResults}, propertyRefs, java.util.List.class, medizin.client.managed.request.AnswerToAssQuestionProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.AnswerToAssQuestionProxy, java.lang.Void> persist() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.AnswerToAssQuestionProxy, java.lang.Void> {
      public X() { super(AnswerToAssQuestionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.AnswerToAssQuestionRequest::persist", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.AnswerToAssQuestionProxy, java.lang.Void> remove() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.AnswerToAssQuestionProxy, java.lang.Void> {
      public X() { super(AnswerToAssQuestionRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.client.managed.request.AnswerToAssQuestionRequest::remove", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
}
