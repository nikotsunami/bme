package medizin.client.managed.request;

public class ApplicationRequestFactoryImpl extends com.google.gwt.requestfactory.client.impl.AbstractClientRequestFactory implements medizin.client.managed.request.ApplicationRequestFactory {
  @com.google.gwt.autobean.shared.AutoBeanFactory.Category({com.google.gwt.requestfactory.shared.impl.EntityProxyCategory.class, com.google.gwt.requestfactory.shared.impl.ValueProxyCategory.class, com.google.gwt.requestfactory.shared.impl.BaseProxyCategory.class})
  @com.google.gwt.autobean.shared.AutoBeanFactory.NoWrap(com.google.gwt.requestfactory.shared.EntityProxyId.class)
  interface Factory extends com.google.gwt.autobean.shared.AutoBeanFactory {
    com.google.gwt.autobean.shared.AutoBean<medizin.client.managed.request.CommentProxy> medizin_client_managed_request_CommentProxy();
    com.google.gwt.autobean.shared.AutoBean<medizin.client.managed.request.KeywordProxy> medizin_client_managed_request_KeywordProxy();
    com.google.gwt.autobean.shared.AutoBean<medizin.client.managed.request.McProxy> medizin_client_managed_request_McProxy();
    com.google.gwt.autobean.shared.AutoBean<medizin.client.managed.request.InstitutionProxy> medizin_client_managed_request_InstitutionProxy();
    com.google.gwt.autobean.shared.AutoBean<medizin.client.managed.request.QuestionEventProxy> medizin_client_managed_request_QuestionEventProxy();
    com.google.gwt.autobean.shared.AutoBean<medizin.client.managed.request.QuestionTypeProxy> medizin_client_managed_request_QuestionTypeProxy();
    com.google.gwt.autobean.shared.AutoBean<medizin.client.managed.request.QuestionProxy> medizin_client_managed_request_QuestionProxy();
    com.google.gwt.autobean.shared.AutoBean<medizin.client.managed.request.QuestionAccessProxy> medizin_client_managed_request_QuestionAccessProxy();
    com.google.gwt.autobean.shared.AutoBean<medizin.client.managed.request.PersonProxy> medizin_client_managed_request_PersonProxy();
    com.google.gwt.autobean.shared.AutoBean<medizin.client.managed.request.AnswerProxy> medizin_client_managed_request_AnswerProxy();
    com.google.gwt.autobean.shared.AutoBean<medizin.client.managed.request.AssesmentProxy> medizin_client_managed_request_AssesmentProxy();
    com.google.gwt.autobean.shared.AutoBean<medizin.client.managed.request.AssesmentQuestionProxy> medizin_client_managed_request_AssesmentQuestionProxy();
    com.google.gwt.autobean.shared.AutoBean<medizin.client.managed.request.AnswerToAssQuestionProxy> medizin_client_managed_request_AnswerToAssQuestionProxy();
    com.google.gwt.autobean.shared.AutoBean<medizin.client.managed.request.EventAccessProxy> medizin_client_managed_request_EventAccessProxy();
    com.google.gwt.autobean.shared.AutoBean<medizin.client.managed.request.QuestionSumPerPersonProxy> medizin_client_managed_request_QuestionSumPerPersonProxy();
    com.google.gwt.autobean.shared.AutoBean<medizin.client.managed.request.QuestionTypeCountPerExamProxy> medizin_client_managed_request_QuestionTypeCountPerExamProxy();
    com.google.gwt.autobean.shared.AutoBean<medizin.client.managed.request.StaticContentProxy> medizin_client_managed_request_StaticContentProxy();
    com.google.gwt.autobean.shared.AutoBean<medizin.client.managed.request.StaticToAssesmentProxy> medizin_client_managed_request_StaticToAssesmentProxy();
  }
  public static final Factory FACTORY=com.google.gwt.core.client.GWT.create(Factory.class);
  @Override public Factory getAutoBeanFactory() { return FACTORY; }
  public medizin.client.managed.request.AnswerRequestImpl answerRequest() {
    return new medizin.client.managed.request.AnswerRequestImpl(this);
  }
  public medizin.shared.scaffold.AnswerRequestNonRooImpl answerRequestNonRoo() {
    return new medizin.shared.scaffold.AnswerRequestNonRooImpl(this);
  }
  public medizin.client.managed.request.AnswerToAssQuestionRequestImpl answerToAssQuestionRequest() {
    return new medizin.client.managed.request.AnswerToAssQuestionRequestImpl(this);
  }
  public medizin.shared.scaffold.AnswerToAssQuestionRequestNonRooImpl answerToAssQuestionRequestNonRoo() {
    return new medizin.shared.scaffold.AnswerToAssQuestionRequestNonRooImpl(this);
  }
  public medizin.client.managed.request.AssesmentQuestionRequestImpl assesmentQuestionRequest() {
    return new medizin.client.managed.request.AssesmentQuestionRequestImpl(this);
  }
  public medizin.shared.scaffold.AssesmentQuestionRequestNonRooImpl assesmentQuestionRequestNonRoo() {
    return new medizin.shared.scaffold.AssesmentQuestionRequestNonRooImpl(this);
  }
  public medizin.client.managed.request.AssesmentRequestImpl assesmentRequest() {
    return new medizin.client.managed.request.AssesmentRequestImpl(this);
  }
  public medizin.shared.scaffold.AssesmentRequestNonRooImpl assesmentRequestNonRoo() {
    return new medizin.shared.scaffold.AssesmentRequestNonRooImpl(this);
  }
  public medizin.client.managed.request.CommentRequestImpl commentRequest() {
    return new medizin.client.managed.request.CommentRequestImpl(this);
  }
  public medizin.client.managed.request.EventAccessRequestImpl eventAccessRequest() {
    return new medizin.client.managed.request.EventAccessRequestImpl(this);
  }
  public medizin.client.managed.request.InstitutionRequestImpl institutionRequest() {
    return new medizin.client.managed.request.InstitutionRequestImpl(this);
  }
  public medizin.shared.scaffold.InstitutionRequestNonRooImpl institutionRequestNonRoo() {
    return new medizin.shared.scaffold.InstitutionRequestNonRooImpl(this);
  }
  public medizin.client.managed.request.KeywordRequestImpl keywordRequest() {
    return new medizin.client.managed.request.KeywordRequestImpl(this);
  }
  public com.google.gwt.requestfactory.shared.LoggingRequestImpl loggingRequest() {
    return new com.google.gwt.requestfactory.shared.LoggingRequestImpl(this);
  }
  public medizin.client.managed.request.McRequestImpl mcRequest() {
    return new medizin.client.managed.request.McRequestImpl(this);
  }
  public medizin.client.managed.request.PersonRequestImpl personRequest() {
    return new medizin.client.managed.request.PersonRequestImpl(this);
  }
  public medizin.shared.scaffold.PersonRequestNonRooImpl personRequestNonRoo() {
    return new medizin.shared.scaffold.PersonRequestNonRooImpl(this);
  }
  public medizin.client.managed.request.QuestionAccessRequestImpl questionAccessRequest() {
    return new medizin.client.managed.request.QuestionAccessRequestImpl(this);
  }
  public medizin.shared.scaffold.QuestionAccessRequestNonRooImpl questionAccessRequestNonRoo() {
    return new medizin.shared.scaffold.QuestionAccessRequestNonRooImpl(this);
  }
  public medizin.client.managed.request.QuestionEventRequestImpl questionEventRequest() {
    return new medizin.client.managed.request.QuestionEventRequestImpl(this);
  }
  public medizin.shared.scaffold.QuestionEventRequestNonRooImpl questionEventRequestNonRoo() {
    return new medizin.shared.scaffold.QuestionEventRequestNonRooImpl(this);
  }
  public medizin.client.managed.request.QuestionRequestImpl questionRequest() {
    return new medizin.client.managed.request.QuestionRequestImpl(this);
  }
  public medizin.shared.scaffold.QuestionRequestNonRooImpl questionRequestNonRoo() {
    return new medizin.shared.scaffold.QuestionRequestNonRooImpl(this);
  }
  public medizin.client.managed.request.QuestionSumPerPersonRequestImpl questionSumPerPersonRequest() {
    return new medizin.client.managed.request.QuestionSumPerPersonRequestImpl(this);
  }
  public medizin.shared.scaffold.QuestionSumPerPersonRequestNonRooImpl questionSumPerPersonRequestNonRoo() {
    return new medizin.shared.scaffold.QuestionSumPerPersonRequestNonRooImpl(this);
  }
  public medizin.client.managed.request.QuestionTypeCountPerExamRequestImpl questionTypeCountPerExamRequest() {
    return new medizin.client.managed.request.QuestionTypeCountPerExamRequestImpl(this);
  }
  public medizin.shared.scaffold.QuestionTypeCountPerExamRequestNonRooImpl questionTypeCountPerExamRequestNonRoo() {
    return new medizin.shared.scaffold.QuestionTypeCountPerExamRequestNonRooImpl(this);
  }
  public medizin.client.managed.request.QuestionTypeRequestImpl questionTypeRequest() {
    return new medizin.client.managed.request.QuestionTypeRequestImpl(this);
  }
  public medizin.shared.scaffold.QuestionTypeRequestNonRooImpl questionTypeRequestNonRoo() {
    return new medizin.shared.scaffold.QuestionTypeRequestNonRooImpl(this);
  }
  public medizin.client.managed.request.StaticContentRequestImpl staticContentRequest() {
    return new medizin.client.managed.request.StaticContentRequestImpl(this);
  }
  public medizin.client.managed.request.StaticToAssesmentRequestImpl staticToAssesmentRequest() {
    return new medizin.client.managed.request.StaticToAssesmentRequestImpl(this);
  }
  public medizin.shared.scaffold.SystemOverviewRequestNonRooImpl systemOverviewRequestNonRoo() {
    return new medizin.shared.scaffold.SystemOverviewRequestNonRooImpl(this);
  }
  private static final java.util.HashMap<String, Class<?>> tokensToTypes = new java.util.HashMap<String, Class<?>>();
  private static final java.util.HashMap<Class<?>, String> typesToTokens = new java.util.HashMap<Class<?>, String>();
  private static final java.util.HashSet<Class<?>> entityProxyTypes = new java.util.HashSet<Class<?>>();
  private static final java.util.HashSet<Class<?>> valueProxyTypes = new java.util.HashSet<Class<?>>();
  static {
    tokensToTypes.put("medizin.client.managed.request.CommentProxy", medizin.client.managed.request.CommentProxy.class);
    typesToTokens.put(medizin.client.managed.request.CommentProxy.class, "medizin.client.managed.request.CommentProxy");
    entityProxyTypes.add(medizin.client.managed.request.CommentProxy.class);
    tokensToTypes.put("medizin.client.managed.request.KeywordProxy", medizin.client.managed.request.KeywordProxy.class);
    typesToTokens.put(medizin.client.managed.request.KeywordProxy.class, "medizin.client.managed.request.KeywordProxy");
    entityProxyTypes.add(medizin.client.managed.request.KeywordProxy.class);
    tokensToTypes.put("medizin.client.managed.request.McProxy", medizin.client.managed.request.McProxy.class);
    typesToTokens.put(medizin.client.managed.request.McProxy.class, "medizin.client.managed.request.McProxy");
    entityProxyTypes.add(medizin.client.managed.request.McProxy.class);
    tokensToTypes.put("medizin.client.managed.request.InstitutionProxy", medizin.client.managed.request.InstitutionProxy.class);
    typesToTokens.put(medizin.client.managed.request.InstitutionProxy.class, "medizin.client.managed.request.InstitutionProxy");
    entityProxyTypes.add(medizin.client.managed.request.InstitutionProxy.class);
    tokensToTypes.put("medizin.client.managed.request.QuestionEventProxy", medizin.client.managed.request.QuestionEventProxy.class);
    typesToTokens.put(medizin.client.managed.request.QuestionEventProxy.class, "medizin.client.managed.request.QuestionEventProxy");
    entityProxyTypes.add(medizin.client.managed.request.QuestionEventProxy.class);
    tokensToTypes.put("medizin.client.managed.request.QuestionTypeProxy", medizin.client.managed.request.QuestionTypeProxy.class);
    typesToTokens.put(medizin.client.managed.request.QuestionTypeProxy.class, "medizin.client.managed.request.QuestionTypeProxy");
    entityProxyTypes.add(medizin.client.managed.request.QuestionTypeProxy.class);
    tokensToTypes.put("medizin.client.managed.request.QuestionProxy", medizin.client.managed.request.QuestionProxy.class);
    typesToTokens.put(medizin.client.managed.request.QuestionProxy.class, "medizin.client.managed.request.QuestionProxy");
    entityProxyTypes.add(medizin.client.managed.request.QuestionProxy.class);
    tokensToTypes.put("medizin.client.managed.request.QuestionAccessProxy", medizin.client.managed.request.QuestionAccessProxy.class);
    typesToTokens.put(medizin.client.managed.request.QuestionAccessProxy.class, "medizin.client.managed.request.QuestionAccessProxy");
    entityProxyTypes.add(medizin.client.managed.request.QuestionAccessProxy.class);
    tokensToTypes.put("medizin.client.managed.request.PersonProxy", medizin.client.managed.request.PersonProxy.class);
    typesToTokens.put(medizin.client.managed.request.PersonProxy.class, "medizin.client.managed.request.PersonProxy");
    entityProxyTypes.add(medizin.client.managed.request.PersonProxy.class);
    tokensToTypes.put("medizin.client.managed.request.AnswerProxy", medizin.client.managed.request.AnswerProxy.class);
    typesToTokens.put(medizin.client.managed.request.AnswerProxy.class, "medizin.client.managed.request.AnswerProxy");
    entityProxyTypes.add(medizin.client.managed.request.AnswerProxy.class);
    tokensToTypes.put("medizin.client.managed.request.AssesmentProxy", medizin.client.managed.request.AssesmentProxy.class);
    typesToTokens.put(medizin.client.managed.request.AssesmentProxy.class, "medizin.client.managed.request.AssesmentProxy");
    entityProxyTypes.add(medizin.client.managed.request.AssesmentProxy.class);
    tokensToTypes.put("medizin.client.managed.request.AssesmentQuestionProxy", medizin.client.managed.request.AssesmentQuestionProxy.class);
    typesToTokens.put(medizin.client.managed.request.AssesmentQuestionProxy.class, "medizin.client.managed.request.AssesmentQuestionProxy");
    entityProxyTypes.add(medizin.client.managed.request.AssesmentQuestionProxy.class);
    tokensToTypes.put("medizin.client.managed.request.AnswerToAssQuestionProxy", medizin.client.managed.request.AnswerToAssQuestionProxy.class);
    typesToTokens.put(medizin.client.managed.request.AnswerToAssQuestionProxy.class, "medizin.client.managed.request.AnswerToAssQuestionProxy");
    entityProxyTypes.add(medizin.client.managed.request.AnswerToAssQuestionProxy.class);
    tokensToTypes.put("medizin.client.managed.request.EventAccessProxy", medizin.client.managed.request.EventAccessProxy.class);
    typesToTokens.put(medizin.client.managed.request.EventAccessProxy.class, "medizin.client.managed.request.EventAccessProxy");
    entityProxyTypes.add(medizin.client.managed.request.EventAccessProxy.class);
    tokensToTypes.put("medizin.client.managed.request.QuestionSumPerPersonProxy", medizin.client.managed.request.QuestionSumPerPersonProxy.class);
    typesToTokens.put(medizin.client.managed.request.QuestionSumPerPersonProxy.class, "medizin.client.managed.request.QuestionSumPerPersonProxy");
    entityProxyTypes.add(medizin.client.managed.request.QuestionSumPerPersonProxy.class);
    tokensToTypes.put("medizin.client.managed.request.QuestionTypeCountPerExamProxy", medizin.client.managed.request.QuestionTypeCountPerExamProxy.class);
    typesToTokens.put(medizin.client.managed.request.QuestionTypeCountPerExamProxy.class, "medizin.client.managed.request.QuestionTypeCountPerExamProxy");
    entityProxyTypes.add(medizin.client.managed.request.QuestionTypeCountPerExamProxy.class);
    tokensToTypes.put("medizin.client.managed.request.StaticContentProxy", medizin.client.managed.request.StaticContentProxy.class);
    typesToTokens.put(medizin.client.managed.request.StaticContentProxy.class, "medizin.client.managed.request.StaticContentProxy");
    entityProxyTypes.add(medizin.client.managed.request.StaticContentProxy.class);
    tokensToTypes.put("medizin.client.managed.request.StaticToAssesmentProxy", medizin.client.managed.request.StaticToAssesmentProxy.class);
    typesToTokens.put(medizin.client.managed.request.StaticToAssesmentProxy.class, "medizin.client.managed.request.StaticToAssesmentProxy");
    entityProxyTypes.add(medizin.client.managed.request.StaticToAssesmentProxy.class);
  }
  @Override protected Class getTypeFromToken(String typeToken) {
    return tokensToTypes.get(typeToken);
  }
  @Override protected String getTypeToken(Class type) {
    return typesToTokens.get(type);
  }
  @Override public boolean isEntityType(Class<?> type) {
    return entityProxyTypes.contains(type);
  }
  @Override public boolean isValueType(Class<?> type) {
    return valueProxyTypes.contains(type);
  }
}
