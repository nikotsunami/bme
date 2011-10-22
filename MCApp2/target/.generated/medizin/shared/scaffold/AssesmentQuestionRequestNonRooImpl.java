package medizin.shared.scaffold;

public class AssesmentQuestionRequestNonRooImpl extends com.google.gwt.requestfactory.shared.impl.AbstractRequestContext implements medizin.shared.scaffold.AssesmentQuestionRequestNonRoo {
  public AssesmentQuestionRequestNonRooImpl(com.google.gwt.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory);}
  public  com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.AssesmentQuestionProxy> copyAssesmentQuestion(final java.lang.Long assementQuestionId,final java.lang.Long assementId) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<medizin.client.managed.request.AssesmentQuestionProxy> implements com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.AssesmentQuestionProxy> {
      public X() { super(AssesmentQuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.AssesmentQuestionRequestNonRoo::copyAssesmentQuestion", new Object[] {assementQuestionId,assementId}, propertyRefs, medizin.client.managed.request.AssesmentQuestionProxy.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> findAssementQuestionForAssementBook(final java.lang.Long id) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> {
      public X() { super(AssesmentQuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.AssesmentQuestionRequestNonRoo::findAssementQuestionForAssementBook", new Object[] {id}, propertyRefs, java.util.List.class, medizin.client.managed.request.AssesmentQuestionProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.AssesmentQuestionProxy> findAssesmentQuestionByAssesmentAndQuestion(final java.lang.Long questionId,final java.lang.Long assesmentId) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<medizin.client.managed.request.AssesmentQuestionProxy> implements com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.AssesmentQuestionProxy> {
      public X() { super(AssesmentQuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.AssesmentQuestionRequestNonRoo::findAssesmentQuestionByAssesmentAndQuestion", new Object[] {questionId,assesmentId}, propertyRefs, medizin.client.managed.request.AssesmentQuestionProxy.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> findAssesmentQuestionsByAssesment(final java.lang.Long id) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> {
      public X() { super(AssesmentQuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.AssesmentQuestionRequestNonRoo::findAssesmentQuestionsByAssesment", new Object[] {id}, propertyRefs, java.util.List.class, medizin.client.managed.request.AssesmentQuestionProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> findAssesmentQuestionsByMc(final java.lang.Long id) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> {
      public X() { super(AssesmentQuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.AssesmentQuestionRequestNonRoo::findAssesmentQuestionsByMc", new Object[] {id}, propertyRefs, java.util.List.class, medizin.client.managed.request.AssesmentQuestionProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> findAssesmentQuestionsByMcProposal(final java.lang.Long id) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> {
      public X() { super(AssesmentQuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.AssesmentQuestionRequestNonRoo::findAssesmentQuestionsByMcProposal", new Object[] {id}, propertyRefs, java.util.List.class, medizin.client.managed.request.AssesmentQuestionProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> findAssesmentQuestionsByQuestionEvent(final java.lang.Long id,final java.lang.Long assesmentId) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> {
      public X() { super(AssesmentQuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.AssesmentQuestionRequestNonRoo::findAssesmentQuestionsByQuestionEvent", new Object[] {id,assesmentId}, propertyRefs, java.util.List.class, medizin.client.managed.request.AssesmentQuestionProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> findAssesmentQuestionsByQuestionEventAssIdQuestType(final java.lang.Long questEventId,final java.lang.Long assesmentId,final java.util.List<java.lang.Long> questionTypesId) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> {
      public X() { super(AssesmentQuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.AssesmentQuestionRequestNonRoo::findAssesmentQuestionsByQuestionEventAssIdQuestType", new Object[] {questEventId,assesmentId,questionTypesId}, propertyRefs, java.util.List.class, medizin.client.managed.request.AssesmentQuestionProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
}
