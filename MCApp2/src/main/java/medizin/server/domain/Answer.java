package medizin.server.domain;

import java.util.Collections;
import java.util.List;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

import javax.servlet.http.HttpSession;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Value;

import com.google.gwt.requestfactory.server.RequestFactoryServlet;
import com.google.gwt.requestfactory.shared.InstanceRequest;
import com.google.gwt.requestfactory.shared.Request;

import medizin.client.managed.request.AnswerProxy;
import medizin.client.shared.Validity;

import javax.persistence.EntityManager;
import javax.persistence.Enumerated;
import javax.persistence.TypedQuery;

import medizin.server.domain.Question;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooEntity(inheritanceType = "TABLE_PER_CLASS")
public class Answer extends RedactionalBase {

    @Size(min = 1, max = 999)
    private String answerText;

    @NotNull
    private Boolean isAnswerActive;

    @NotNull
    @Value("false")
    private Boolean isPicture;

    @NotNull
    @Value("false")
    private Boolean isAnswerAcceptedReviewWahrer;

    @NotNull
    @Value("false")
    private Boolean isAnswerAcceptedAutor;

    @NotNull
    @Value("false")
    private Boolean isAnswerAcceptedAdmin;

    @NotNull
    @Enumerated
    private Validity validity;

    @Size(min = 3, max = 255)
    private String picturePath;

    @ManyToOne
    private Question question;
    
	public static List<Answer> findAnswersEntriesByQuestion(Long id, int start, int max){
        Question question = Question.findQuestion(id);
        if (question == null) throw new IllegalArgumentException("The question argument is required");
        EntityManager em = QuestionEvent.entityManager();
        TypedQuery<Answer> q = em.createQuery("SELECT ans FROM Answer ans " + 
        		" WHERE ans.question = :question", Answer.class).setFirstResult(start).setMaxResults(max);
        q.setParameter("question", question);
        return q.getResultList();		
	}
	public static List<Answer> findAnswersByQuestion(Long id){
        Question question = Question.findQuestion(id);
        if (question == null) throw new IllegalArgumentException("The question argument is required");
        EntityManager em = QuestionEvent.entityManager();
        TypedQuery<Answer> q = em.createQuery("SELECT ans FROM Answer ans " + 
        		" WHERE ans.question = :question", Answer.class);
        q.setParameter("question", question);
        return q.getResultList();		
	}
	public static long contAnswersByQuestion(Long id){
        Question question = Question.findQuestion(id);
        if (question == null) throw new IllegalArgumentException("The question argument is required");
        EntityManager em = QuestionEvent.entityManager();
        TypedQuery<Long> q = em.createQuery("SELECT count(ans) FROM Answer ans " + 
        		" WHERE ans.question = :question", Long.class);
        q.setParameter("question", question);
        return q.getSingleResult();
	}
	public void eliminateAnswer(){
  	  if (this.entityManager == null) this.entityManager = entityManager();
  	  List<AnswerToAssQuestion> answerToAssQuestion = Collections.emptyList();
	  answerToAssQuestion = AnswerToAssQuestion.findAnswerToAssQuestionByAnswer(this.getId());
	  if (answerToAssQuestion.size()>0){
		  this.isAnswerActive = false;
		  this.persist();
	  }
	  else{

		  this.remove();
	  }
	  this.flush();
	}
	
	public static long countAnswersNonAcceptedAdminByQuestion(Long questionId){
		
		HttpSession session = RequestFactoryServlet.getThreadLocalRequest().getSession();
		
		String shibdId2 = (String) session.getAttribute("shibdId");
		long institutionId2 = (Long) session.getAttribute("institutionId");
		Question question = Question.findQuestion(questionId);
		
		Person loggedUser = Person.findPersonByShibId(shibdId2);
		Institution institution = Institution.findInstitution(institutionId2);
		if (loggedUser == null || institution == null) throw new IllegalArgumentException("The person and institution arguments are required");
		// End filter fuctionality
		
		 StringBuilder queryBuilder = new StringBuilder("SELECT count(ans) FROM Answer ans INNER JOIN ans.question as question  WHERE  ans.question = :question  AND  ");
		 
		 Boolean isAccepted = false;
		 
		if(loggedUser.getIsAdmin()){
			
			queryBuilder.append("ans.isAnswerAcceptedAdmin = :isAccepted ");
			
			
		} else {
			queryBuilder.append("((ans.isAnswerAcceptedReviewWahrer = :isAccepted AND ans.rewiewer = :person) OR (ans.isAnswerAcceptedAutor = :isAccepted AND ans.autor = :person) )");
		}
		
		EntityManager em = Question.entityManager();
       
        
        TypedQuery<Long> q = em.createQuery(queryBuilder.toString(), Long.class);
   	 q.setParameter("question", question);
        if(!loggedUser.getIsAdmin()){
        	 q.setParameter("person", loggedUser);
        }
        
        q.setParameter("isAccepted", isAccepted);
        
        return q.getSingleResult();

//		
//		
//			boolean isAnswerAcceptedAdmin = false;
//			Question question = Question.findQuestion(questionId);
//	        if (question == null) throw new IllegalArgumentException("The question argument is required");
//	        EntityManager em = QuestionEvent.entityManager();
//	        TypedQuery<Long> q = em.createQuery("SELECT count(ans) FROM Answer ans INNER JOIN ans.question as question INNER JOIN  question.questEvent AS queEvent " + 
//	        		" WHERE ans.question = :question AND queEvent.institution = :institution AND ans.isAnswerAcceptedAdmin=:isAnswerAcceptedAdmin", Long.class);
//	        q.setParameter("question", question);
//	        q.setParameter("isAnswerAcceptedAdmin", isAnswerAcceptedAdmin);
//	        return q.getSingleResult();
	}
	public static List<Answer> findAnswersEntriesNonAcceptedAdminByQuestion(
			Long questionId, Integer start, Integer length){
//		boolean isAnswerAcceptedAdmin = false;
//		 Question question = Question.findQuestion(questionId);
//	        if (question == null) throw new IllegalArgumentException("The question argument is required");
//	        EntityManager em = QuestionEvent.entityManager();
//	        TypedQuery<Answer> q = em.createQuery("SELECT ans FROM Answer ans " + 
//	        		" WHERE ans.question = :question AND ans.isAnswerAcceptedAdmin=:isAnswerAcceptedAdmin", Answer.class);
//	        q.setParameter("question", question);
//	        q.setParameter("isAnswerAcceptedAdmin", isAnswerAcceptedAdmin);
		
HttpSession session = RequestFactoryServlet.getThreadLocalRequest().getSession();
		
		String shibdId2 = (String) session.getAttribute("shibdId");
		long institutionId2 = (Long) session.getAttribute("institutionId");
		Question question = Question.findQuestion(questionId);
		
		Person loggedUser = Person.findPersonByShibId(shibdId2);
		Institution institution = Institution.findInstitution(institutionId2);
		if (loggedUser == null || institution == null) throw new IllegalArgumentException("The person and institution arguments are required");
		// End filter fuctionality
		
		 StringBuilder queryBuilder = new StringBuilder("SELECT ans FROM Answer ans INNER JOIN ans.question as question  WHERE  ans.question = :question  AND  ");
		 
		 Boolean isAccepted = false;
		 
		if(loggedUser.getIsAdmin()){
			
			queryBuilder.append("ans.isAnswerAcceptedAdmin = :isAccepted ");
			
			
		} else {
			queryBuilder.append("((ans.isAnswerAcceptedReviewWahrer = :isAccepted AND ans.rewiewer = :person) OR (ans.isAnswerAcceptedAutor = :isAccepted AND ans.autor = :person) )");
		}
		
		EntityManager em = Question.entityManager();
       
	
        TypedQuery<Answer> q = em.createQuery(queryBuilder.toString(), Answer.class);
   	 q.setParameter("question", question);
        if(!loggedUser.getIsAdmin()){
        	 q.setParameter("person", loggedUser);
        }
        
        q.setParameter("isAccepted", isAccepted);
	        return q.getResultList();		
	}

}
