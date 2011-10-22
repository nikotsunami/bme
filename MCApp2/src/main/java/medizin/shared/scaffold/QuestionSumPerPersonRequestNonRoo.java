package medizin.shared.scaffold;

import java.util.List;

import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.QuestionSumPerPersonProxy;
import medizin.server.domain.QuestionEvent;
import medizin.server.domain.QuestionSumPerPerson;

import com.google.gwt.requestfactory.shared.InstanceRequest;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.Service;


@Service(QuestionSumPerPerson.class)
public interface QuestionSumPerPersonRequestNonRoo  extends RequestContext{

	Request<java.lang.Long>  countQuestionSumPerPersonByAssesmentNonRoo(Long assesmentId);
	Request<List<QuestionSumPerPersonProxy>>  findQuestionSumPerPersonByAssesmentNonRoo(Long assesmentId, int start, int max);
	InstanceRequest<QuestionSumPerPersonProxy, Void> moveUp();
	InstanceRequest<QuestionSumPerPersonProxy, Void> moveDown();
	Request<QuestionSumPerPersonProxy>  findQuestionSumPerPersonByEventNonRoo(Long questionEventId);
	

}
