package medizin.server.domain;

import org.apache.log4j.Logger;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.beans.factory.annotation.Value;


import com.google.gwt.requestfactory.shared.Request;

import javax.validation.constraints.NotNull;


import medizin.client.managed.request.AssesmentQuestionProxy;
import medizin.server.domain.Question;
import javax.persistence.ManyToOne;
import medizin.server.domain.Assesment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import java.util.List;
import java.util.Set;
import medizin.server.domain.AnswerToAssQuestion;
import java.util.HashSet;

import javax.persistence.EntityManager;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.TypedQuery;

@RooJavaBean
@RooToString
@RooEntity(inheritanceType = "TABLE_PER_CLASS")
public class AssesmentQuestion extends RedactionalBase {

    @Value("0")
    private Integer orderAversion;

    @Value("0")
    private Integer orderBversion;

    private Double trenschaerfe;

    private Double schwierigkeit;

    @NotNull
    @Value("false")
    private Boolean isAssQuestionAcceptedRewiever;

    @NotNull
    @Value("false")
    private Boolean isAssQuestionAcceptedAdmin;

    @NotNull
    @Value("false")
    private Boolean isAssQuestionAdminProposal;

    private Boolean isAssQuestionAcceptedAutor;

    @NotNull
    @ManyToOne
    private Question question;

    @ManyToOne
    private Assesment assesment;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "assesmentQuestion")
    private Set<AnswerToAssQuestion> answersToAssQuestion = new HashSet<AnswerToAssQuestion>();
    
    public static List<AssesmentQuestion> findAssesmentQuestionsByMc(Long id){
        Boolean isAcceptedAdmin = true;
        Boolean isActive = true;
        Mc mc = Mc.findMc(id);
        if (mc == null) throw new IllegalArgumentException("The mcs argument is required");
        EntityManager em = Question.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT assesmentauestion FROM AssesmentQuestion AS assesmentauestion " +
        		"INNER JOIN assesmentauestion.question AS quest WHERE assesmentauestion.isAssQuestionAcceptedAdmin = :isAcceptedAdmin AND"+
        		" quest.isActive = :isActive AND :mcs_item MEMBER OF quest.mcs");
        
        TypedQuery<AssesmentQuestion> q = em.createQuery(queryBuilder.toString(), AssesmentQuestion.class);
        q.setParameter("isAcceptedAdmin", isAcceptedAdmin);
        q.setParameter("isActive", isActive);

        q.setParameter("mcs_item", mc);
        
        return q.getResultList();
    }
    
    public static List<AssesmentQuestion> findAssesmentQuestionsByAssesment(Long id){
//        Boolean isAcceptedAdmin = true;
//        Boolean isActive = true;
        Assesment assesment = Assesment.findAssesment(id);
        if (assesment == null) throw new IllegalArgumentException("The assesment argument is required");
        EntityManager em = Question.entityManager();
        
        TypedQuery<AssesmentQuestion> q = em.createQuery("SELECT assesmentauestion FROM AssesmentQuestion AS assesmentauestion " +
        		"WHERE assesmentauestion.assesment = :assesment", AssesmentQuestion.class);
//        q.setParameter("isAcceptedAdmin", isAcceptedAdmin);
//        q.setParameter("isActive", isActive);

        q.setParameter("assesment", assesment);
        
        return q.getResultList();
    }
    
    public static List<AssesmentQuestion> findAssesmentQuestionsByMcProposal(Long id){
        Boolean isAssQuestionAdminProposal = true;
        Boolean isActive = true;
        Mc mc = Mc.findMc(id);
        if (mc == null) throw new IllegalArgumentException("The mcs argument is required");
        EntityManager em = Question.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT assesmentauestion FROM AssesmentQuestion AS assesmentauestion " +
        		"INNER JOIN assesmentauestion.question AS quest WHERE assesmentauestion.isAssQuestionAdminProposal = :isAssQuestionAdminProposal AND"+
        		" quest.isActive = :isActive AND :mcs_item MEMBER OF quest.mcs");
        
        TypedQuery<AssesmentQuestion> q = em.createQuery(queryBuilder.toString(), AssesmentQuestion.class);
        q.setParameter("isAssQuestionAdminProposal", isAssQuestionAdminProposal);
        q.setParameter("isActive", isActive);

         q.setParameter("mcs_item", mc);
        
        return q.getResultList();
    }
    
    public static AssesmentQuestion copyAssesmentQuestion(Long assementQuestionId, Long assementId){
    	//EntityManager em = entityManager();
    	//em.getTransaction().begin();
    	
    	AssesmentQuestion assesmentQuestionToCopyFrom = AssesmentQuestion.findAssesmentQuestion(assementQuestionId);
    	Assesment assesment = Assesment.findAssesment(assementId);
    	AssesmentQuestion assesmentQuestionNew = new AssesmentQuestion();
    	
    	Set<AnswerToAssQuestion> answersToAssementToCopy = assesmentQuestionToCopyFrom.getAnswersToAssQuestion();
    	Set<AnswerToAssQuestion> answersToAssementCopied = new HashSet<AnswerToAssQuestion>();
    	
    	Iterator<AnswerToAssQuestion> iter = answersToAssementToCopy.iterator();
    	while (iter.hasNext()){
    		AnswerToAssQuestion oldOne = iter.next();
    		AnswerToAssQuestion newOne = new AnswerToAssQuestion();
    		newOne.setAnswers(oldOne.getAnswers());
    		newOne.setAssesmentQuestion(assesmentQuestionNew);
    		newOne.setSortOrder(oldOne.getSortOrder());
    		newOne.persist();
    		answersToAssementCopied.add(newOne);
    	}
    	assesmentQuestionNew.setAnswersToAssQuestion(answersToAssementCopied);
    	assesmentQuestionNew.setAssesment(assesment);
    	assesmentQuestionNew.setAutor(assesmentQuestionToCopyFrom.getAutor());
    	assesmentQuestionNew.setDateAdded(new Date());
    	assesmentQuestionNew.setIsAssQuestionAcceptedAdmin(false);
    	assesmentQuestionNew.setIsAssQuestionAcceptedAutor(true);
    	assesmentQuestionNew.setIsAssQuestionAcceptedRewiever(false);
    	assesmentQuestionNew.setQuestion(assesmentQuestionToCopyFrom.getQuestion());
    	assesmentQuestionNew.setRewiewer(assesmentQuestionToCopyFrom.getRewiewer());
    	
    	assesmentQuestionNew.persist();
    	assesmentQuestionNew.flush();
    	
    	//em.getTransaction().commit();
    	
    	//entityManager().flush();
    	entityManager().refresh(assesmentQuestionNew);
    	
    	return assesmentQuestionNew;
    }
    
    
    public static AssesmentQuestion findAssesmentQuestionByAssesmentAndQuestion(Long questionId, Long assesmentId){
        Assesment assesment = Assesment.findAssesment(assesmentId);
        Question question = Question.findQuestion(questionId);
        if (assesment == null) throw new IllegalArgumentException("The assesment argument is required");
        if (question == null) throw new IllegalArgumentException("The question argument is required");
        EntityManager em = AssesmentQuestion.entityManager();
        
        TypedQuery<AssesmentQuestion> q = em.createQuery("SELECT assesmentauestion FROM AssesmentQuestion AS assesmentauestion " +
        		"WHERE assesmentauestion.assesment = :assesment AND assesmentauestion.question = :question", AssesmentQuestion.class);
//        q.setParameter("isAcceptedAdmin", isAcceptedAdmin);
//        q.setParameter("isActive", isActive);

        q.setParameter("assesment", assesment);
        q.setParameter("question", question);
        
        return q.getSingleResult();
	}
    
    
	public static List<AssesmentQuestion> findAssesmentQuestionsByQuestionEvent(java.lang.Long questEventId, java.lang.Long assesmentId) {
		QuestionEvent questionEvent = QuestionEvent.findQuestionEvent(questEventId);
		Assesment assesment = Assesment.findAssesment(assesmentId);
        if (questionEvent == null) throw new IllegalArgumentException("The QuestionEvent argument is required");
        if (assesment == null) throw new IllegalArgumentException("The Assesment argument is required");
        EntityManager em = AssesmentQuestion.entityManager();
        TypedQuery<AssesmentQuestion> q = em.createQuery("SELECT a FROM AssesmentQuestion a " + 
        		"INNER JOIN a.question quest WHERE quest.questEvent = :questionEvent AND a.assesment = :assesment ORDER BY a.orderAversion", AssesmentQuestion.class);
        q.setParameter("questionEvent", questionEvent);
        q.setParameter("assesment", assesment);
        return q.getResultList();
    }
	
	public static List<AssesmentQuestion> findAssesmentQuestionsByQuestionEventAssIdQuestType(java.lang.Long questEventId, java.lang.Long assesmentId,  List<Long> questionTypesId) {
		QuestionEvent questionEvent = QuestionEvent.findQuestionEvent(questEventId);
		Assesment assesment = Assesment.findAssesment(assesmentId);
		
		Iterator<Long> iter = questionTypesId.iterator();
		List<QuestionType> questionType = new ArrayList<QuestionType>();
		while (iter.hasNext()) {
			Long long1 = (Long) iter.next();
			questionType.add(QuestionType.findQuestionType(long1));
		}
		
		//QuestionType questionType = QuestionType.findQuestionType(questionTypeId);
        if (questionEvent == null) throw new IllegalArgumentException("The QuestionEvent argument is required");
        if (assesment == null) throw new IllegalArgumentException("The Assesment argument is required");
        //if (questionType == null) throw new IllegalArgumentException("The QuestionType argument is required");
        EntityManager em = AssesmentQuestion.entityManager();
        
        StringBuilder queryBuilder = new StringBuilder("SELECT a FROM AssesmentQuestion a " + 
        		"INNER JOIN a.question quest WHERE quest.questEvent = :questionEvent AND a.assesment = :assesment AND ( ");
        
        Iterator<QuestionType> iterQuestType = questionType.iterator();
        int firstTime = 0;
        log.error(questionType.size());
        while (iterQuestType.hasNext()) {
			QuestionType questionType2 = (QuestionType) iterQuestType.next();
			if(firstTime>0){
				queryBuilder.append(" OR ");
			}
			queryBuilder.append(" quest.questionType=:questiontype" + questionType2.getId());
			firstTime++;
		} 
        
        
        
        
        queryBuilder.append(  " )) ORDER BY a.orderAversion");
  
        
        
        TypedQuery<AssesmentQuestion> q = em.createQuery( queryBuilder.toString(), AssesmentQuestion.class);
       
        
        log.error(questionType.size());
        log.error(queryBuilder.toString());
        Iterator<QuestionType> iterQuestType2 = questionType.iterator();
        while (iterQuestType2.hasNext()) {
			QuestionType questionType2 = (QuestionType) iterQuestType2.next();
			q.setParameter("questiontype"+questionType2.getId(), questionType2);
		}
        
        q.setParameter("questionEvent", questionEvent);
        q.setParameter("assesment", assesment);
        //q.setParameter("questionType", questionType);
        
        
        
        
        return q.getResultList();
    }
	
	static Logger log = Logger.getLogger(AssesmentQuestion.class);
	public static List<AssesmentQuestion> findAssementQuestionForAssementBook(Long assesmentId){
		Assesment assesment = Assesment.findAssesment(assesmentId);
        
        if (assesment == null) throw new IllegalArgumentException("The Assesment argument is required");
        EntityManager em = AssesmentQuestion.entityManager();
        TypedQuery<AssesmentQuestion> q = em.createQuery("SELECT assquest FROM AssesmentQuestion assquest " + 
        		"INNER JOIN assquest.question quest WHERE assquest.assesment = :assesment ORDER BY assquest.orderAversion", AssesmentQuestion.class);

        q.setParameter("assesment", assesment);
        return q.getResultList();
	}
    

}
