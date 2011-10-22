package medizin.shared.scaffold;

import java.util.List;

import medizin.client.managed.request.QuestionAccessProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.server.domain.QuestionAccess;
import medizin.server.domain.QuestionEvent;

import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.Service;


@Service(QuestionAccess.class)
public interface QuestionAccessRequestNonRoo extends RequestContext {

	Request<java.lang.Long> countQuestionEventAccessByPersonNonRoo(Long personId);
    Request<List<QuestionAccessProxy>> findQuestionEventAccessByPersonNonRooNonRoo(java.lang.Long personId, int firstResult, int maxResults);
	Request<List<QuestionAccessProxy>> findQuestionAccessQuestionByPersonNonRoo(Long personId, int firstResult, int maxResults);
	Request<java.lang.Long>  countQuestionAccessQuestionByPersonNonRoo(Long personId);


}
