package medizin.shared.scaffold;

import com.google.gwt.requestfactory.shared.LoggingRequest;
import com.google.gwt.requestfactory.shared.RequestFactory;

/**
 * The base request factory interface for this app. Add
 * new custom request types here without fear of them
 * being managed away by Roo.
 */
public interface ScaffoldRequestFactory extends RequestFactory {
	/**
	 * Return a GWT logging request.
	 */
	LoggingRequest loggingRequest();
	
	QuestionEventRequestNonRoo questionEventRequestNonRoo();
	QuestionRequestNonRoo questionRequestNonRoo();
	QuestionAccessRequestNonRoo questionAccessRequestNonRoo();
	QuestionTypeRequestNonRoo questionTypeRequestNonRoo();
	AnswerToAssQuestionRequestNonRoo answerToAssQuestionRequestNonRoo();
	QuestionTypeCountPerExamRequestNonRoo questionTypeCountPerExamRequestNonRoo();
	QuestionSumPerPersonRequestNonRoo questionSumPerPersonRequestNonRoo();
    AssesmentRequestNonRoo assesmentRequestNonRoo();
	AssesmentQuestionRequestNonRoo assesmentQuestionRequestNonRoo();
	
	SystemOverviewRequestNonRoo systemOverviewRequestNonRoo();
	
	AnswerRequestNonRoo answerRequestNonRoo();
	
	PersonRequestNonRoo personRequestNonRoo();
	InstitutionRequestNonRoo institutionRequestNonRoo();

}
