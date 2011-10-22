package medizin.server.domain;

import java.util.List;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import medizin.server.domain.Answer;

import javax.persistence.EntityManager;
import javax.persistence.ManyToOne;
import javax.persistence.TypedQuery;

import medizin.server.domain.AssesmentQuestion;

@RooJavaBean
@RooToString
@RooEntity
public class AnswerToAssQuestion {

    @NotNull
    private Integer sortOrder;

    @NotNull
    @ManyToOne
    private Answer answers;

    @NotNull
    @ManyToOne
    private AssesmentQuestion assesmentQuestion;
    
    
	public static List<AnswerToAssQuestion> findAnswerToAssQuestionByAnswer(java.lang.Long answerId) {
		Answer answer = Answer.findAnswer(answerId);
        if (answer == null) throw new IllegalArgumentException("The Answer argument is required");
        EntityManager em = QuestionEvent.entityManager();
        TypedQuery<AnswerToAssQuestion> q = em.createQuery("SELECT a FROM AnswerToAssQuestion a " + 
        		"WHERE a.answers = :answer", AnswerToAssQuestion.class);
        q.setParameter("answer", answer);
        return q.getResultList();
    }
    
	public static List<AnswerToAssQuestion> findAnswerToAssQuestionByAssesmentQuestion(java.lang.Long assQuestId) {
		AssesmentQuestion assesmentQuestion = AssesmentQuestion.findAssesmentQuestion(assQuestId);
        if (assesmentQuestion == null) throw new IllegalArgumentException("The AssesmentQuestion argument is required");
        EntityManager em = QuestionEvent.entityManager();
        TypedQuery<AnswerToAssQuestion> q = em.createQuery("SELECT a FROM AnswerToAssQuestion a " + 
        		"WHERE a.assesmentQuestion = :assesmentQuestion ORDER BY a.sortOrder", AnswerToAssQuestion.class);
        q.setParameter("assesmentQuestion", assesmentQuestion);
        return q.getResultList();
    }
	
	
//	public static List<AnswerToAssQuestion> findAnswerToAssQuestionByAnswer(java.lang.Long answerId) {
//		Answer answer = Answer.findAnswer(answerId);
//        if (answer == null) throw new IllegalArgumentException("The Answer argument is required");
//        EntityManager em = QuestionEvent.entityManager();
//        TypedQuery<AnswerToAssQuestion> q = em.createQuery("SELECT answerToAssQuestion FROM AnswerToAssQuestion answerToAssQs " + 
//        		"INNER JOIN answerToAssQs.answers answers WHERE answerToAssQs.answers = :answerId", AnswerToAssQuestion.class);
//        q.setParameter("answer", answer);
//        return q.getResultList();
//    }
//    
    
    
}
