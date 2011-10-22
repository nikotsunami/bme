package medizin.shared.scaffold;

public class QuestionAccessRequestNonRooImpl extends com.google.gwt.requestfactory.shared.impl.AbstractRequestContext implements medizin.shared.scaffold.QuestionAccessRequestNonRoo {
  public QuestionAccessRequestNonRooImpl(com.google.gwt.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory);}
  public  com.google.gwt.requestfactory.shared.Request<java.lang.Long> countQuestionAccessQuestionByPersonNonRoo(final java.lang.Long personId) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Long> implements com.google.gwt.requestfactory.shared.Request<java.lang.Long> {
      public X() { super(QuestionAccessRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionAccessRequestNonRoo::countQuestionAccessQuestionByPersonNonRoo", new Object[] {personId}, propertyRefs, java.lang.Long.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.lang.Long> countQuestionEventAccessByPersonNonRoo(final java.lang.Long personId) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Long> implements com.google.gwt.requestfactory.shared.Request<java.lang.Long> {
      public X() { super(QuestionAccessRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionAccessRequestNonRoo::countQuestionEventAccessByPersonNonRoo", new Object[] {personId}, propertyRefs, java.lang.Long.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionAccessProxy>> findQuestionAccessQuestionByPersonNonRoo(final java.lang.Long personId,final int firstResult,final int maxResults) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.QuestionAccessProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionAccessProxy>> {
      public X() { super(QuestionAccessRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionAccessRequestNonRoo::findQuestionAccessQuestionByPersonNonRoo", new Object[] {personId,firstResult,maxResults}, propertyRefs, java.util.List.class, medizin.client.managed.request.QuestionAccessProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionAccessProxy>> findQuestionEventAccessByPersonNonRooNonRoo(final java.lang.Long personId,final int firstResult,final int maxResults) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.QuestionAccessProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionAccessProxy>> {
      public X() { super(QuestionAccessRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionAccessRequestNonRoo::findQuestionEventAccessByPersonNonRooNonRoo", new Object[] {personId,firstResult,maxResults}, propertyRefs, java.util.List.class, medizin.client.managed.request.QuestionAccessProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
}
