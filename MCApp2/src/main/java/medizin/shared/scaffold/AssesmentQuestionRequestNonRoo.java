package medizin.shared.scaffold;

import java.util.List;

import medizin.client.managed.request.AssesmentQuestionProxy;
import medizin.server.domain.AssesmentQuestion;

import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.Service;


@Service(AssesmentQuestion.class)
public interface AssesmentQuestionRequestNonRoo extends RequestContext {

//	   abstract Request<java.lang.Long> countAssesmentQuestions();
//
//	    abstract Request<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> findAllAssesmentQuestions();
//
//	    abstract Request<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> findAssesmentQuestionEntries(int firstResult, int maxResults);
//
//	    abstract Request<medizin.client.managed.request.AssesmentQuestionProxy> findAssesmentQuestion(Long id);
//
//	    abstract InstanceRequest<medizin.client.managed.request.AssesmentQuestionProxy, java.lang.Void> remove();
//
//	    abstract InstanceRequest<medizin.client.managed.request.AssesmentQuestionProxy, java.lang.Void> persist();
//	    
    Request<java.util.List<medizin.client.managed.request.AssesmentQuestionProxy>> findAssesmentQuestionsByQuestionEvent(Long id, Long assesmentId);

	Request<List<AssesmentQuestionProxy>> findAssesmentQuestionsByMc(Long id);
	Request<List<AssesmentQuestionProxy>> findAssesmentQuestionsByMcProposal(Long id);
	Request<List<AssesmentQuestionProxy>> findAssesmentQuestionsByAssesment(Long id);
	Request<AssesmentQuestionProxy> copyAssesmentQuestion(Long assementQuestionId, Long assementId);

	Request<AssesmentQuestionProxy> findAssesmentQuestionByAssesmentAndQuestion(Long questionId,
			Long assesmentId);

	Request<List<AssesmentQuestionProxy>>  findAssementQuestionForAssementBook(Long id);
	
	Request <List<AssesmentQuestionProxy>> findAssesmentQuestionsByQuestionEventAssIdQuestType(java.lang.Long questEventId, java.lang.Long assesmentId, List<Long> questionTypesId);
	
//	QuestionTypeCountPerExamRequestNonRoo questionTypeCountPerExamRequestNonRoo();
//	QuestionSumPerPersonRequestNonRoo questionSumPerPersonRequestNonRoo();
//    AssesmentRequestNonRoo assesmentRequestNonRoo();
//	AssesmentQuestionRequestNonRoo assesmentQuestionRequestNonRoo();


}
