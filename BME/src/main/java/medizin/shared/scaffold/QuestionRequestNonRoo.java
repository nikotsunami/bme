package medizin.shared.scaffold;

import java.util.List;

import medizin.client.managed.request.InstitutionProxy;
import medizin.client.managed.request.InstitutionRequest;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.server.domain.Question;
import medizin.server.domain.QuestionEvent;

import com.google.gwt.requestfactory.shared.InstanceRequest;
import com.google.gwt.requestfactory.shared.ProxyFor;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.Service;
import com.google.gwt.requestfactory.shared.ServiceName;
import com.google.gwt.view.client.SelectionChangeEvent;

@Service(Question.class)
public interface QuestionRequestNonRoo extends RequestContext {

	Request<List<QuestionProxy>> findQuestionAccessByPersonNonRoo(Long id,
			int start, int length);

	Request<java.lang.Long>  countQuestionAccessByPersonNonRoo(Long id);

	Request<java.lang.Long> countQuestionByInstitutionOrEventOrQuestionNameOrKeyword(
			Long institutionId, Long eventId, String questiuonStringFilter,
			Boolean filterQuestionText, Boolean filterKeywords);
	
	Request<List<QuestionProxy>>  findQuestionByInstitutionOrEventOrQuestionNameOrKeyword(
			Long institutionId, Long eventId, String questiuonStringFilter,
			Boolean filterQuestionText, Boolean filterKeywords, int start, int length);
	
	Request<List<QuestionProxy>> findQuestionsByMc(Long mcId);

	Request<java.lang.Long> countQuestionsNonAcceptedAdmin();

	Request<List<QuestionProxy>> findQuestionsEntriesNonAcceptedAdmin(
			int start, int length);

	Request<List<QuestionProxy>> findQuestionsAnswersNonAcceptedAdmin();

	Request<Long>  countQuestionsByPerson(String string, Long institutionId);

	Request<List<QuestionProxy>>  findQuestionEntriesByPerson(String string, Long institutionId, int start, int length);

	InstanceRequest<QuestionProxy, Void> persistAndSetPreviousInactive();

	InstanceRequest<QuestionProxy, Void>  persistNonRoo();

	InstanceRequest<QuestionProxy, Void>  generateNewVersion();


}
