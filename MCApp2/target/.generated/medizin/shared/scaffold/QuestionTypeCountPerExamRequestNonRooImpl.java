package medizin.shared.scaffold;

public class QuestionTypeCountPerExamRequestNonRooImpl extends com.google.gwt.requestfactory.shared.impl.AbstractRequestContext implements medizin.shared.scaffold.QuestionTypeCountPerExamRequestNonRoo {
  public QuestionTypeCountPerExamRequestNonRooImpl(com.google.gwt.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory);}
  public  com.google.gwt.requestfactory.shared.Request<java.lang.Long> countQuestionTypeCountByAssesmentNonRoo(final java.lang.Long id) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Long> implements com.google.gwt.requestfactory.shared.Request<java.lang.Long> {
      public X() { super(QuestionTypeCountPerExamRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionTypeCountPerExamRequestNonRoo::countQuestionTypeCountByAssesmentNonRoo", new Object[] {id}, propertyRefs, java.lang.Long.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.QuestionTypeCountPerExamProxy> findQuestionTypeCountByAssesmentAndOrderNonRoo(final java.lang.Long assesmentId,final int order) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<medizin.client.managed.request.QuestionTypeCountPerExamProxy> implements com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.QuestionTypeCountPerExamProxy> {
      public X() { super(QuestionTypeCountPerExamRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionTypeCountPerExamRequestNonRoo::findQuestionTypeCountByAssesmentAndOrderNonRoo", new Object[] {assesmentId,order}, propertyRefs, medizin.client.managed.request.QuestionTypeCountPerExamProxy.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionTypeCountPerExamProxy>> findQuestionTypeCountByAssesmentNonRoo(final java.lang.Long id,final int start,final int max) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.QuestionTypeCountPerExamProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionTypeCountPerExamProxy>> {
      public X() { super(QuestionTypeCountPerExamRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionTypeCountPerExamRequestNonRoo::findQuestionTypeCountByAssesmentNonRoo", new Object[] {id,start,max}, propertyRefs, java.util.List.class, medizin.client.managed.request.QuestionTypeCountPerExamProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionTypeCountPerExamProxy>> findQuestionTypesCountSortedByAssesmentNonRoo(final java.lang.Long assesmentId) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.QuestionTypeCountPerExamProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionTypeCountPerExamProxy>> {
      public X() { super(QuestionTypeCountPerExamRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionTypeCountPerExamRequestNonRoo::findQuestionTypesCountSortedByAssesmentNonRoo", new Object[] {assesmentId}, propertyRefs, java.util.List.class, medizin.client.managed.request.QuestionTypeCountPerExamProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.QuestionTypeCountPerExamProxy, java.lang.Void> moveDown() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.QuestionTypeCountPerExamProxy, java.lang.Void> {
      public X() { super(QuestionTypeCountPerExamRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionTypeCountPerExamRequestNonRoo::moveDown", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.QuestionTypeCountPerExamProxy, java.lang.Void> moveUp() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.QuestionTypeCountPerExamProxy, java.lang.Void> {
      public X() { super(QuestionTypeCountPerExamRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionTypeCountPerExamRequestNonRoo::moveUp", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
}
