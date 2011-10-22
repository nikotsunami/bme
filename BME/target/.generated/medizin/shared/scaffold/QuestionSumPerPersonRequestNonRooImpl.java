package medizin.shared.scaffold;

public class QuestionSumPerPersonRequestNonRooImpl extends com.google.gwt.requestfactory.shared.impl.AbstractRequestContext implements medizin.shared.scaffold.QuestionSumPerPersonRequestNonRoo {
  public QuestionSumPerPersonRequestNonRooImpl(com.google.gwt.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory);}
  public  com.google.gwt.requestfactory.shared.Request<java.lang.Long> countQuestionSumPerPersonByAssesmentNonRoo(final java.lang.Long assesmentId) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Long> implements com.google.gwt.requestfactory.shared.Request<java.lang.Long> {
      public X() { super(QuestionSumPerPersonRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionSumPerPersonRequestNonRoo::countQuestionSumPerPersonByAssesmentNonRoo", new Object[] {assesmentId}, propertyRefs, java.lang.Long.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionSumPerPersonProxy>> findQuestionSumPerPersonByAssesmentNonRoo(final java.lang.Long assesmentId,final int start,final int max) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.QuestionSumPerPersonProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionSumPerPersonProxy>> {
      public X() { super(QuestionSumPerPersonRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionSumPerPersonRequestNonRoo::findQuestionSumPerPersonByAssesmentNonRoo", new Object[] {assesmentId,start,max}, propertyRefs, java.util.List.class, medizin.client.managed.request.QuestionSumPerPersonProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.QuestionSumPerPersonProxy> findQuestionSumPerPersonByEventNonRoo(final java.lang.Long questionEventId) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<medizin.client.managed.request.QuestionSumPerPersonProxy> implements com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.QuestionSumPerPersonProxy> {
      public X() { super(QuestionSumPerPersonRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionSumPerPersonRequestNonRoo::findQuestionSumPerPersonByEventNonRoo", new Object[] {questionEventId}, propertyRefs, medizin.client.managed.request.QuestionSumPerPersonProxy.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.QuestionSumPerPersonProxy, java.lang.Void> moveDown() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.QuestionSumPerPersonProxy, java.lang.Void> {
      public X() { super(QuestionSumPerPersonRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionSumPerPersonRequestNonRoo::moveDown", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.QuestionSumPerPersonProxy, java.lang.Void> moveUp() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.QuestionSumPerPersonProxy, java.lang.Void> {
      public X() { super(QuestionSumPerPersonRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionSumPerPersonRequestNonRoo::moveUp", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
}
