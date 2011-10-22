package medizin.shared.scaffold;

public class SystemOverviewRequestNonRooImpl extends com.google.gwt.requestfactory.shared.impl.AbstractRequestContext implements medizin.shared.scaffold.SystemOverviewRequestNonRoo {
  public SystemOverviewRequestNonRooImpl(com.google.gwt.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory);}
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.McProxy>> getAllMcs() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<medizin.client.managed.request.McProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<medizin.client.managed.request.McProxy>> {
      public X() { super(SystemOverviewRequestNonRooImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("medizin.shared.scaffold.SystemOverviewRequestNonRoo::getAllMcs", new Object[] {}, propertyRefs, java.util.List.class, medizin.client.managed.request.McProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
}
