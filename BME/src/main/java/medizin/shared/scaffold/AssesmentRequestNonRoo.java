package medizin.shared.scaffold;

import java.util.List;

import medizin.client.managed.request.AssesmentProxy;
import medizin.server.domain.Assesment;

import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.Service;


@Service(Assesment.class)
public interface AssesmentRequestNonRoo extends RequestContext {

	Request<List<AssesmentProxy>> findAssesmentsOpenBetween();
	Request<List<AssesmentProxy>> findActiveAssesments();

	
}
