package medizin.server.domain;

import java.util.List;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import com.google.gwt.requestfactory.shared.Request;
import medizin.server.domain.Person;
import javax.validation.constraints.NotNull;
import javax.persistence.EntityManager;
import javax.persistence.ManyToOne;
import javax.persistence.TypedQuery;

import medizin.server.domain.QuestionEvent;
import medizin.server.domain.Assesment;

@RooJavaBean
@RooToString
@RooEntity(finders = { "findQuestionSumPerpeopleByAssesmentAndSort_order" })
public class QuestionSumPerPerson {

    @NotNull
    @ManyToOne
    private Person responsiblePerson;

    @NotNull
    @ManyToOne
    private QuestionEvent questionEvent;

    @NotNull
    @ManyToOne
    private Assesment assesment;

    @NotNull
    private Integer questionSum;

    @NotNull
    private Integer sort_order;

    public static long countQuestionSumPerPersonByAssesmentNonRoo(Long assesmentId) {
    	 Assesment assesment = Assesment.findAssesment(assesmentId);
	        if (assesment == null) throw new IllegalArgumentException("The assesment argument is required");
	        EntityManager em = QuestionSumPerPerson.entityManager();
	        TypedQuery<Long> q = em.createQuery("SELECT count(qsum) FROM QuestionSumPerPerson qsum " + 
	        		" WHERE qsum.assesment = :assesment", Long.class);
	        q.setParameter("assesment", assesment);
	        
	        return q.getSingleResult();
    }
    
    public static List<QuestionSumPerPerson> findQuestionSumPerPersonByAssesmentNonRoo(Long assesmentId, int start, int max) {
   	 Assesment assesment = Assesment.findAssesment(assesmentId);
	        if (assesment == null) throw new IllegalArgumentException("The assesment argument is required");
	        EntityManager em = QuestionSumPerPerson.entityManager();
	        TypedQuery<QuestionSumPerPerson> q = em.createQuery("SELECT qsum FROM QuestionSumPerPerson qsum " + 
	        		" WHERE qsum.assesment = :assesment ORDER BY qsum.sort_order", QuestionSumPerPerson.class).setFirstResult(start).setMaxResults(max);
	        q.setParameter("assesment", assesment);
	        
	        return q.getResultList();
   }
    
    public void moveUp(){
    	  if (this.entityManager == null) this.entityManager = entityManager();
    	  QuestionSumPerPerson questionSumPerPerson = findQuestionSumPerPersonByAssesmentAndSortorde(this.assesment, this.sort_order+1);
    	  if (questionSumPerPerson==null) return;
    	  questionSumPerPerson.setSort_order(sort_order);
    	  questionSumPerPerson.persist();
    	  setSort_order(sort_order+1);
    	  this.persist();
         // this.entityManager.persist(this);
    }

    public void moveDown(){
  	  if (this.entityManager == null) this.entityManager = entityManager();
  	  QuestionSumPerPerson questionSumPerPerson = findQuestionSumPerPersonByAssesmentAndSortorde(this.assesment, this.sort_order-1);
  	  if (questionSumPerPerson==null) return;
  	  questionSumPerPerson.setSort_order(sort_order);
  	  questionSumPerPerson.persist();
  	  setSort_order(sort_order-1);
  	  this.persist();
       // this.entityManager.persist(this);
  }
    
	public static QuestionSumPerPerson findQuestionSumPerPersonByAssesmentAndSortorde(Assesment assesment, int sort_order) {
		if (assesment == null) throw new IllegalArgumentException("The assesment argument is required");
        EntityManager em = QuestionSumPerPerson.entityManager();
        TypedQuery<QuestionSumPerPerson> q = em.createQuery("SELECT qsum FROM QuestionSumPerPerson qsum " + 
        		" WHERE qsum.assesment = :assesment AND qsum.sort_order = " + sort_order, QuestionSumPerPerson.class);
        q.setParameter("assesment", assesment);

        return q.getSingleResult();
	}

	public static QuestionSumPerPerson findQuestionSumPerPersonByEventNonRoo(Long eventId) {
		
		QuestionEvent questionEvent = QuestionEvent.findQuestionEvent(eventId);

		if (questionEvent == null) throw new IllegalArgumentException("The questionEvent argument is required");
        EntityManager em = QuestionSumPerPerson.entityManager();
        TypedQuery<QuestionSumPerPerson> q = em.createQuery("SELECT qsum FROM QuestionSumPerPerson qsum " + 
        		" WHERE qsum.questionEvent = :questionEvent",  QuestionSumPerPerson.class);
        q.setParameter("questionEvent", questionEvent);
    

        return q.getSingleResult();
	}
	

	
	
}
