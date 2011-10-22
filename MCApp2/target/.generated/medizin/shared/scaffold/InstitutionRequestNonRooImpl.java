package medizin.shared.scaffold;

public class InstitutionRequestNonRooImpl extends com.google.gwt.requestfactory.shared.impl.AbstractRequestContext implements medizin.shared.scaffold.InstitutionRequestNonRoo {
  public InstitutionRequestNonRooImpl(com.google.gwt.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory);}
  public  com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.InstitutionProxy> myGetInstitutionToWorkWith() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<medizin.client.managed.request.InstitutionProxy> implements com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.InstitutionProxy> {
      public X() { super(InstitutionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.InstitutionRequestNonRoo::myGetInstitutionToWorkWith", new Object[] {}, propertyRefs, medizin.client.managed.request.InstitutionProxy.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.InstitutionProxy, java.lang.Void> mySetCurrentInstitution() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.InstitutionProxy, java.lang.Void> {
      public X() { super(InstitutionRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.InstitutionRequestNonRoo::mySetCurrentInstitution", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
}
