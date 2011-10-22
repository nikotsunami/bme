// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.shared.scaffold;

import java.util.List;

import com.google.gwt.requestfactory.shared.InstanceRequest;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.Service;
import com.google.gwt.requestfactory.shared.ServiceName;

import medizin.client.managed.request.AnswerToAssQuestionProxy;
import medizin.client.managed.request.AssesmentQuestionProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.server.domain.AnswerToAssQuestion;
import medizin.server.domain.AssesmentQuestion;

import org.springframework.roo.addon.gwt.RooGwtMirroredFrom;

//@RooGwtMirroredFrom("medizin.server.domain.AnswerToAssQuestion")
//@ServiceName("medizin.server.domain.AnswerToAssQuestion")
@Service(AnswerToAssQuestion.class)
public interface AnswerToAssQuestionRequestNonRoo extends RequestContext {

    Request<List<AnswerToAssQuestionProxy>> findAnswerToAssQuestionByAnswer(java.lang.Long answerId);
	
	abstract Request<java.lang.Long> countAnswerToAssQuestions();

    abstract Request<java.util.List<medizin.client.managed.request.AnswerToAssQuestionProxy>> findAllAnswerToAssQuestions();

    abstract Request<java.util.List<medizin.client.managed.request.AnswerToAssQuestionProxy>> findAnswerToAssQuestionEntries(int firstResult, int maxResults);

    abstract Request<medizin.client.managed.request.AnswerToAssQuestionProxy> findAnswerToAssQuestion(Long id);

    abstract InstanceRequest<medizin.client.managed.request.AnswerToAssQuestionProxy, java.lang.Void> remove();

    abstract InstanceRequest<medizin.client.managed.request.AnswerToAssQuestionProxy, java.lang.Void> persist();

	Request<List<AnswerToAssQuestionProxy>> findAnswerToAssQuestionByAssesmentQuestion(	Long id);
}