package medizin.shared.scaffold;

public class PersonRequestNonRooImpl extends com.google.gwt.requestfactory.shared.impl.AbstractRequestContext implements medizin.shared.scaffold.PersonRequestNonRoo {
  public PersonRequestNonRooImpl(com.google.gwt.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory);}
  public  com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.PersonProxy, java.lang.Void> loginPerson() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<medizin.client.managed.request.PersonProxy, java.lang.Void> {
      public X() { super(PersonRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.PersonRequestNonRoo::loginPerson", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.PersonProxy> myGetLoggedPerson() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<medizin.client.managed.request.PersonProxy> implements com.google.gwt.requestfactory.shared.Request<medizin.client.managed.request.PersonProxy> {
      public X() { super(PersonRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.PersonRequestNonRoo::myGetLoggedPerson", new Object[] {}, propertyRefs, medizin.client.managed.request.PersonProxy.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
}
