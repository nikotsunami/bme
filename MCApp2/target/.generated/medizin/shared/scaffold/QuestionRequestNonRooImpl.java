package medizin.shared.scaffold;

public class QuestionRequestNonRooImpl extends com.google.gwt.requestfactory.shared.impl.AbstractRequestContext implements medizin.shared.scaffold.QuestionRequestNonRoo {
  public QuestionRequestNonRooImpl(com.google.gwt.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory);}
  public  com.google.gwt.requestfactory.shared.Request<java.lang.Long> countQuestionAccessByPersonNonRoo(final java.lang.Long id) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Long> implements com.google.gwt.requestfactory.shared.Request<java.lang.Long> {
      public X() { super(QuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionRequestNonRoo::countQuestionAccessByPersonNonRoo", new Object[] {id}, propertyRefs, java.lang.Long.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.lang.Long> countQuestionByInstitutionOrEventOrQuestionNameOrKeyword(final java.lang.Long institutionId,final java.lang.Long eventId,final java.lang.String questiuonStringFilter,final java.lang.Boolean filterQuestionText,final java.lang.Boolean filterKeywords) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Long> implements com.google.gwt.requestfactory.shared.Request<java.lang.Long> {
      public X() { super(QuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionRequestNonRoo::countQuestionByInstitutionOrEventOrQuestionNameOrKeyword", new Object[] {institutionId,eventId,questiuonStringFilter,filterQuestionText,filterKeywords}, propertyRefs, java.lang.Long.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.lang.Long> countQuestionsByPerson(final java.lang.String string,final java.lang.Long institutionId) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Long> implements com.google.gwt.requestfactory.shared.Request<java.lang.Long> {
      public X() { super(QuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionRequestNonRoo::countQuestionsByPerson", new Object[] {string,institutionId}, propertyRefs, java.lang.Long.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.lang.Long> countQuestionsNonAcceptedAdmin() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Long> implements com.google.gwt.requestfactory.shared.Request<java.lang.Long> {
      public X() { super(QuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionRequestNonRoo::countQuestionsNonAcceptedAdmin", new Object[] {}, propertyRefs, java.lang.Long.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionProxy>> findQuestionAccessByPersonNonRoo(final java.lang.Long id,final int start,final int length) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.QuestionProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionProxy>> {
      public X() { super(QuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionRequestNonRoo::findQuestionAccessByPersonNonRoo", new Object[] {id,start,length}, propertyRefs, java.util.List.class, medizin.client.managed.request.QuestionProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionProxy>> findQuestionByInstitutionOrEventOrQuestionNameOrKeyword(final java.lang.Long institutionId,final java.lang.Long eventId,final java.lang.String questiuonStringFilter,final java.lang.Boolean filterQuestionText,final java.lang.Boolean filterKeywords,final int start,final int length) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.QuestionProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionProxy>> {
      public X() { super(QuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionRequestNonRoo::findQuestionByInstitutionOrEventOrQuestionNameOrKeyword", new Object[] {institutionId,eventId,questiuonStringFilter,filterQuestionText,filterKeywords,start,length}, propertyRefs, java.util.List.class, medizin.client.managed.request.QuestionProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionProxy>> findQuestionEntriesByPerson(final java.lang.String string,final java.lang.Long institutionId,final int start,final int length) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.QuestionProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionProxy>> {
      public X() { super(QuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionRequestNonRoo::findQuestionEntriesByPerson", new Object[] {string,institutionId,start,length}, propertyRefs, java.util.List.class, medizin.client.managed.request.QuestionProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionProxy>> findQuestionsAnswersNonAcceptedAdmin() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.QuestionProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionProxy>> {
      public X() { super(QuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionRequestNonRoo::findQuestionsAnswersNonAcceptedAdmin", new Object[] {}, propertyRefs, java.util.List.class, medizin.client.managed.request.QuestionProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionProxy>> findQuestionsByMc(final java.lang.Long mcId) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.QuestionProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionProxy>> {
      public X() { super(QuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionRequestNonRoo::findQuestionsByMc", new Object[] {mcId}, propertyRefs, java.util.List.class, medizin.client.managed.request.QuestionProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionProxy>> findQuestionsEntriesNonAcceptedAdmin(final int start,final int length) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.QuestionProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.QuestionProxy>> {
      public X() { super(QuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionRequestNonRoo::findQuestionsEntriesNonAcceptedAdmin", new Object[] {start,length}, propertyRefs, java.util.List.class, medizin.client.managed.request.QuestionProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.QuestionProxy, java.lang.Void> generateNewVersion() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.QuestionProxy, java.lang.Void> {
      public X() { super(QuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionRequestNonRoo::generateNewVersion", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.QuestionProxy, java.lang.Void> persistAndSetPreviousInactive() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.QuestionProxy, java.lang.Void> {
      public X() { super(QuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionRequestNonRoo::persistAndSetPreviousInactive", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.QuestionProxy, java.lang.Void> persistNonRoo() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.QuestionProxy, java.lang.Void> {
      public X() { super(QuestionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.QuestionRequestNonRoo::persistNonRoo", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
}
