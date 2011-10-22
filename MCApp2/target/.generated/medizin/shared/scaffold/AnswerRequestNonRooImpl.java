package medizin.shared.scaffold;

public class AnswerRequestNonRooImpl extends com.google.gwt.requestfactory.shared.impl.AbstractRequestContext implements medizin.shared.scaffold.AnswerRequestNonRoo {
  public AnswerRequestNonRooImpl(com.google.gwt.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory);}
  public  com.google.gwt.requestfactory.shared.Request<java.lang.Long> contAnswersByQuestion(final java.lang.Long id) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Long> implements com.google.gwt.requestfactory.shared.Request<java.lang.Long> {
      public X() { super(AnswerRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.AnswerRequestNonRoo::contAnswersByQuestion", new Object[] {id}, propertyRefs, java.lang.Long.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.lang.Long> countAnswersNonAcceptedAdminByQuestion(final java.lang.Long id) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Long> implements com.google.gwt.requestfactory.shared.Request<java.lang.Long> {
      public X() { super(AnswerRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.AnswerRequestNonRoo::countAnswersNonAcceptedAdminByQuestion", new Object[] {id}, propertyRefs, java.lang.Long.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.AnswerProxy, java.lang.Void> eliminateAnswer() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.AnswerProxy, java.lang.Void> {
      public X() { super(AnswerRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.AnswerRequestNonRoo::eliminateAnswer", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AnswerProxy>> findAnswersByQuestion(final java.lang.Long id) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.AnswerProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AnswerProxy>> {
      public X() { super(AnswerRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.AnswerRequestNonRoo::findAnswersByQuestion", new Object[] {id}, propertyRefs, java.util.List.class, medizin.client.managed.request.AnswerProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AnswerProxy>> findAnswersEntriesByQuestion(final java.lang.Long id,final int start,final int max) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.AnswerProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AnswerProxy>> {
      public X() { super(AnswerRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.AnswerRequestNonRoo::findAnswersEntriesByQuestion", new Object[] {id,start,max}, propertyRefs, java.util.List.class, medizin.client.managed.request.AnswerProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AnswerProxy>> findAnswersEntriesNonAcceptedAdminByQuestion(final java.lang.Long questionId,final java.lang.Integer start,final java.lang.Integer length) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.AnswerProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AnswerProxy>> {
      public X() { super(AnswerRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.AnswerRequestNonRoo::findAnswersEntriesNonAcceptedAdminByQuestion", new Object[] {questionId,start,length}, propertyRefs, java.util.List.class, medizin.client.managed.request.AnswerProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
}
