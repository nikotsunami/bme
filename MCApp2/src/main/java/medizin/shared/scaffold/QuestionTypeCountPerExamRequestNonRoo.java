

package medizin.shared.scaffold;

import java.util.List;

import medizin.client.managed.request.QuestionTypeCountPerExamProxy;
import medizin.server.domain.QuestionTypeCountPerExam;

import com.google.gwt.requestfactory.shared.InstanceRequest;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.Service;

@Service(QuestionTypeCountPerExam.class)
public interface QuestionTypeCountPerExamRequestNonRoo extends RequestContext {

	Request<java.lang.Long> countQuestionTypeCountByAssesmentNonRoo(Long id);
	Request<List<QuestionTypeCountPerExamProxy>> findQuestionTypeCountByAssesmentNonRoo(Long id, int start, int max);
//	InstanceRequest<medizin.client.managed.request.QuestionTypeCountPerExamProxy, java.lang.Void>  moveUp();
//	InstanceRequest<medizin.client.managed.request.QuestionTypeCountPerExamProxy, java.lang.Void>  moveDown();
	Request<QuestionTypeCountPerExamProxy> findQuestionTypeCountByAssesmentAndOrderNonRoo(Long assesmentId, int order);
	Request<List<QuestionTypeCountPerExamProxy>> findQuestionTypesCountSortedByAssesmentNonRoo(Long assesmentId);
	InstanceRequest<QuestionTypeCountPerExamProxy, Void> moveUp();
	InstanceRequest<QuestionTypeCountPerExamProxy, Void> moveDown();	    
	

//    abstract Request<java.lang.Long> countQuestionTypeCountPerExams();
//
//    abstract Request<java.util.List<medizin.client.managed.request.QuestionTypeCountPerExamProxy>> findAllQuestionTypeCountPerExams();
//
//    abstract Request<java.util.List<medizin.client.managed.request.QuestionTypeCountPerExamProxy>> findQuestionTypeCountPerExamEntries(int firstResult, int maxResults);
//
//    abstract Request<medizin.client.managed.request.QuestionTypeCountPerExamProxy> findQuestionTypeCountPerExam(Long id);
//
//    abstract InstanceRequest<medizin.client.managed.request.QuestionTypeCountPerExamProxy, java.lang.Void> remove();
//
//    abstract InstanceRequest<medizin.client.managed.request.QuestionTypeCountPerExamProxy, java.lang.Void> persist();
}
