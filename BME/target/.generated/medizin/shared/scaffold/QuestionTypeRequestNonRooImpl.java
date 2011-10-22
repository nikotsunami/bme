package medizin.shared.scaffold;

public class QuestionTypeRequestNonRooImpl extends com.google.gwt.requestfactory.shared.impl.AbstractRequestContext implements medizin.shared.scaffold.QuestionTypeRequestNonRoo {
  public QuestionTypeRequestNonRooImpl(com.google.gwt.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory);}
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionTypeProxy>> findAllQuestionTypesByAssesment(final java.lang.Long assesmentId) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.QuestionTypeProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionTypeProxy>> {
      public X() { super(QuestionTypeRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionTypeRequestNonRoo::findAllQuestionTypesByAssesment", new Object[] {assesmentId}, propertyRefs, java.util.List.class, medizin.client.managed.request.QuestionTypeProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
}
