package medizin.shared.scaffold;

public class AssesmentRequestNonRooImpl extends com.google.gwt.requestfactory.shared.impl.AbstractRequestContext implements medizin.shared.scaffold.AssesmentRequestNonRoo {
  public AssesmentRequestNonRooImpl(com.google.gwt.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory);}
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AssesmentProxy>> findActiveAssesments() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.AssesmentProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AssesmentProxy>> {
      public X() { super(AssesmentRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.AssesmentRequestNonRoo::findActiveAssesments", new Object[] {}, propertyRefs, java.util.List.class, medizin.client.managed.request.AssesmentProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AssesmentProxy>> findAssesmentsOpenBetween() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.AssesmentProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.AssesmentProxy>> {
      public X() { super(AssesmentRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.AssesmentRequestNonRoo::findAssesmentsOpenBetween", new Object[] {}, propertyRefs, java.util.List.class, medizin.client.managed.request.AssesmentProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
}
