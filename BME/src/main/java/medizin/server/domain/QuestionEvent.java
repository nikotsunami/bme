package medizin.server.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

import com.google.gwt.requestfactory.shared.Request;

import javax.validation.constraints.NotNull;
import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.validation.constraints.Size;

import medizin.client.managed.request.InstitutionProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.server.domain.Institution;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooEntity(finders = { "findQuestionEventsByInstitution" })
public class QuestionEvent {

    @NotNull
    @Column(unique = true)
    @Size(min = 3, max = 60)
    private String eventName;

    @NotNull
    @ManyToOne
    private Institution institution;
    
    public static long countQuestionEventsByInstitutionNonRoo(java.lang.Long institutionId){

    	Institution inst = Institution.findInstitution(institutionId);

        if (inst == null) throw new IllegalArgumentException("The institution argument is required");
        EntityManager em = QuestionEvent.entityManager();
        TypedQuery<Long> q = em.createQuery("SELECT count(questionevent) FROM QuestionEvent AS questionevent WHERE questionevent.institution = :institution", Long.class);
        q.setParameter("institution", inst);
        return q.getSingleResult();
    }
    

	
	public static List<QuestionEvent> findAllQuestionEventsByQuestionTypeAndAssesmentID(Long assesmentId,  List<Long> questionTypesId) {
//		QuestionEvent qEvent = QuestionEvent.findQuestionEvent(assesmentId);
		
		
		
		Assesment assesment = Assesment.findAssesment(assesmentId);
		Iterator<Long> iter = questionTypesId.iterator();
		List<QuestionType> questionType = new ArrayList<QuestionType>();
		while (iter.hasNext()) {
			Long long1 = (Long) iter.next();
			questionType.add(QuestionType.findQuestionType(long1));
		}
		//QuestionType questionType = QuestionType.findQuestionType(questionTypeId);
		
        if (assesment == null) throw new IllegalArgumentException("The QuestionEvent argument is required");
        //if (questionType == null) throw new IllegalArgumentException("The QuestionT argument is required");
        EntityManager em = QuestionEvent.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT DISTINCT qevent FROM QuestionSumPerPerson AS qsum INNER JOIN qsum.questionEvent AS qevent WHERE qsum.questionEvent IN (" +
        		"SELECT DISTINCT queste FROM AssesmentQuestion" +
        		" assesq INNER JOIN assesq.question quest INNER JOIN " +
                "quest.questEvent queste WHERE assesq.assesment=:assesment AND ( ");
        
        Iterator<QuestionType> iterQuestType = questionType.iterator();
        int firstTime = 0;
        while (iterQuestType.hasNext()) {
			QuestionType questionType2 = (QuestionType) iterQuestType.next();
			if(firstTime>0){
				queryBuilder.append(" OR ");
			}
			queryBuilder.append(" quest.questionType=:questiontype" + questionType2.getId());
			firstTime++;
		} 
        
        
        
        
        queryBuilder.append(  " )) ORDER BY qsum.sort_order");
  
        
        TypedQuery<QuestionEvent> q = em.createQuery( queryBuilder.toString(), QuestionEvent.class);
        
        Iterator<QuestionType> iterQuestType2 = questionType.iterator();
        while (iterQuestType2.hasNext()) {
			QuestionType questionType2 = (QuestionType) iterQuestType2.next();
			q.setParameter("questiontype"+questionType2.getId(), questionType2);
		}
        
        q.setParameter("assesment", assesment);
        
        return q.getResultList();
    }
	

	
	

    
    
	public static List<QuestionEvent> findQuestionEventsByInstitutionNonRoo(java.lang.Long institutionId, int firstResult, int maxResults){
		Institution inst = Institution.findInstitution(institutionId);
	    if (inst == null) throw new IllegalArgumentException("The institution argument is required");
	    EntityManager em = QuestionEvent.entityManager();
	    TypedQuery<QuestionEvent> q = em.createQuery("SELECT QuestionEvent FROM QuestionEvent AS questionevent WHERE questionevent.institution = :institution", QuestionEvent.class).setFirstResult(firstResult).setMaxResults(maxResults);
	    q.setParameter("institution", inst);
	    return q.getResultList();
    }
//	public static long countQuestionEvents() {
//        return entityManager().createQuery("select count(o) from QuestionEvent o", Long.class).getSingleResult();
//    }
	
	   public static long countQuestionEventsByPersonNonRoo(java.lang.Long personId) {
	        Person person = Person.findPerson(personId);
	        if (person == null) throw new IllegalArgumentException("The institution argument is required");
	        EntityManager em = QuestionEvent.entityManager();
	        TypedQuery<Long> q = em.createQuery("SELECT count(qevent) FROM QuestionAccess qaccess " + 
	        		"INNER JOIN qaccess.questionEvent qevent WHERE qaccess.person = :person", Long.class);
	        q.setParameter("person", person);
	        return q.getSingleResult();
	    }

	    public static List<QuestionEvent> findQuestionEventsByPersonNonRoo(java.lang.Long personId, int firstResult, int maxResults) {
	        Person person = Person.findPerson(personId);
	        if (person == null) throw new IllegalArgumentException("The institution argument is required");
	        EntityManager em = QuestionEvent.entityManager();
	        TypedQuery<QuestionEvent> q = em.createQuery("SELECT qevent FROM QuestionAccess qaccess " + 
	        		"INNER JOIN qaccess.questionEvent qevent WHERE qaccess.person = :person", QuestionEvent.class).setFirstResult(firstResult).setMaxResults(maxResults);
//	        TypedQuery<QuestionEvent> q = em.createQuery("SELECT QuestionEvent FROM QuestionEvent AS questionevent ", QuestionEvent.class).setFirstResult(firstResult).setMaxResults(maxResults);
	        q.setParameter("person", person);
	        return q.getResultList();
	    }
	    
	    public static long countQuestionEventsByInstitutionOrEvent(java.lang.Long institutionId, String eventNameFilter){
	    	String queryStr = "SELECT count(qevent) FROM QuestionEvent qevent";
	    	Institution institution=null;
	    	if(institutionId!=null) {
	    		institution = Institution.findInstitution(institutionId);
	    		queryStr+=" WHERE institution = :institution";
	    	}
	    	if(!eventNameFilter.equals("")){
		    	if(institutionId==null) {
		    		queryStr+=" WHERE ";
		    	}
		    	else {
		    		queryStr+=" AND ";
		    	}
		    	queryStr+=" eventName LIKE '%" + eventNameFilter + "%'";
	    	}
	        
	        EntityManager em = QuestionEvent.entityManager();
	        TypedQuery<Long> q = em.createQuery(queryStr, Long.class);
	        if(institutionId!=null) {
	        	q.setParameter("institution", institution);
	        }
	        return q.getSingleResult();
	    }
		
	    public static List<QuestionEvent> findQuestionEventsByInstitutionOrEvent(java.lang.Long institutionId, String eventNameFilter, int firstResult, int maxResults){
	    	String queryStr = "SELECT qevent FROM QuestionEvent qevent";
	    	Institution institution=null;
	    	if(institutionId!=null) {
	    		institution = Institution.findInstitution(institutionId);
	    		queryStr+=" WHERE institution = :institution";
	    	}
	    	if(!eventNameFilter.equals("")){
		    	if(institutionId==null) {
		    		queryStr+=" WHERE ";
		    	}
		    	else {
		    		queryStr+=" AND ";
		    	}
		    	queryStr+=" eventName LIKE '%" + eventNameFilter + "%'";
	    	}
	        
	        EntityManager em = QuestionEvent.entityManager();
	        TypedQuery<QuestionEvent> q = em.createQuery( queryStr, QuestionEvent.class).setFirstResult(firstResult).setMaxResults(maxResults);
//	        TypedQuery<QuestionEvent> q = em.createQuery("SELECT QuestionEvent FROM QuestionEvent AS questionevent ", QuestionEvent.class).setFirstResult(firstResult).setMaxResults(maxResults);
	        if(institution!=null) {
	        	q.setParameter("institution", institution);
	        }
	        return q.getResultList();
	    	
	    }

}
