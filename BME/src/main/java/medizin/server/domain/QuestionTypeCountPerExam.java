package medizin.server.domain;

import org.hibernate.annotations.Cascade;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.transaction.annotation.Transactional;

import com.google.gwt.requestfactory.shared.Request;

import java.util.List;
import java.util.Set;
import medizin.server.domain.QuestionType;
import java.util.HashSet;


import javax.persistence.EntityManager;
import javax.persistence.ManyToMany;
import javax.persistence.CascadeType;
import javax.persistence.TypedQuery;

import medizin.server.domain.Assesment;
import javax.validation.constraints.NotNull;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooEntity
public class QuestionTypeCountPerExam {

    @ManyToMany(cascade = CascadeType.DETACH)
    private Set<QuestionType> questionTypesAssigned = new HashSet<QuestionType>();

    @NotNull
    @ManyToOne
    private Assesment assesment;

    @NotNull
    private Integer questionTypeCount;
    
    @NotNull
    private Integer sort_order;
    
    public static long countQuestionTypeCountByAssesmentNonRoo(Long id){
    	Assesment asses = Assesment.findAssesment(id);
	    if (asses == null) throw new IllegalArgumentException("The asses argument is required");
	    EntityManager em = QuestionType.entityManager();
	    TypedQuery<Long> q = em.createQuery("SELECT COUNT(questTypePerExam) FROM QuestionTypeCountPerExam AS questTypePerExam WHERE questTypePerExam.assesment = :asses", Long.class);
	    q.setParameter("asses", asses);
	    return q.getSingleResult();
    }
    public static List<QuestionTypeCountPerExam> findQuestionTypeCountByAssesmentNonRoo(Long id, int start, int max){
    	Assesment asses = Assesment.findAssesment(id);
	    if (asses == null) throw new IllegalArgumentException("The asses argument is required");
	    EntityManager em = QuestionType.entityManager();
	    TypedQuery<QuestionTypeCountPerExam> q = em.createQuery("SELECT questTypePerExam FROM QuestionTypeCountPerExam AS questTypePerExam WHERE questTypePerExam.assesment = :asses ORDER BY questTypePerExam.sort_order", QuestionTypeCountPerExam.class).setFirstResult(start).setMaxResults(max);
	    q.setParameter("asses", asses);
	    return q.getResultList();
    }
    
    public static QuestionTypeCountPerExam findQuestionTypeCountByAssesmentAndOrderNonRoo(Long assesmentId, int order){
	    EntityManager em = QuestionType.entityManager();
	    Assesment asses = Assesment.findAssesment(assesmentId);
	    TypedQuery<QuestionTypeCountPerExam> q = em.createQuery("SELECT questTypePerExam FROM QuestionTypeCountPerExam AS questTypePerExam WHERE questTypePerExam.assesment = :asses AND sort_order=" + Integer.toString(order), QuestionTypeCountPerExam.class);
	    q.setParameter("asses", asses);
	    return q.getSingleResult();
    }
    public static List<QuestionTypeCountPerExam> findQuestionTypesCountSortedByAssesmentNonRoo(Long id){
    	Assesment asses = Assesment.findAssesment(id);
	    if (asses == null) throw new IllegalArgumentException("The asses argument is required");
	    EntityManager em = QuestionType.entityManager();
	    TypedQuery<QuestionTypeCountPerExam> q = em.createQuery("SELECT questTypePerExam FROM QuestionTypeCountPerExam AS questTypePerExam WHERE questTypePerExam.assesment = :asses ORDER BY questTypePerExam.sort_order", QuestionTypeCountPerExam.class);
	    q.setParameter("asses", asses);
	    return q.getResultList();
    }
    
    public void moveUp(){
  	  if (this.entityManager == null) this.entityManager = entityManager();
  	QuestionTypeCountPerExam questionTypeCountPerExam = findQuestionTypeCountByAssesmentAndOrder(this.assesment, this.sort_order+1);
  	  if (questionTypeCountPerExam==null) return;
  	questionTypeCountPerExam.setSort_order(sort_order);
  	questionTypeCountPerExam.persist();
  	  setSort_order(sort_order+1);
  	  this.persist();       
  }
    
    public void moveDown(){
    	  if (this.entityManager == null) this.entityManager = entityManager();
    	  QuestionTypeCountPerExam questionTypeCountPerExam = findQuestionTypeCountByAssesmentAndOrder(this.assesment, this.sort_order-1);
    	  if (questionTypeCountPerExam==null) return;
    	  questionTypeCountPerExam.setSort_order(sort_order);
    	  questionTypeCountPerExam.persist();
    	  setSort_order(sort_order-1);
    	  this.persist();
    	  //Log.debug("moveDown in QuestionTypeCountPerExam Domain gemacht");
       
    }  
    
	public static QuestionTypeCountPerExam findQuestionTypeCountByAssesmentAndOrder(Assesment assesment, int sort_order) {
		if (assesment == null) throw new IllegalArgumentException("The assesment argument is required");
        EntityManager em = QuestionSumPerPerson.entityManager();
        TypedQuery<QuestionTypeCountPerExam> q = em.createQuery("SELECT questTypePerExam FROM QuestionTypeCountPerExam AS questTypePerExam WHERE questTypePerExam.assesment = :assesment AND sort_order=" + sort_order, QuestionTypeCountPerExam.class);
        q.setParameter("assesment", assesment);

        return q.getSingleResult();
	}  
           
}
