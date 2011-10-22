package medizin.shared.scaffold;

import java.util.List;

import medizin.client.managed.request.InstitutionProxy;
import medizin.client.managed.request.InstitutionRequest;
import medizin.client.managed.request.McProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.server.domain.Mc;
import medizin.server.domain.Question;
import medizin.server.domain.QuestionEvent;

import com.google.gwt.requestfactory.shared.InstanceRequest;
import com.google.gwt.requestfactory.shared.ProxyFor;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.Service;
import com.google.gwt.requestfactory.shared.ServiceName;

@Service(Mc.class)
public interface SystemOverviewRequestNonRoo extends RequestContext {


	Request<List<McProxy>>  getAllMcs();



}
