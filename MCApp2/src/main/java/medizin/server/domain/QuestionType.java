package medizin.server.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


import org.hibernate.annotations.Cascade;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.ManyToMany;
import javax.persistence.TypedQuery;
import javax.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Value;

import com.google.gwt.requestfactory.shared.Request;

import javax.validation.constraints.Min;
import javax.validation.constraints.Max;

@RooJavaBean
@RooToString
@RooEntity
public class QuestionType {

    @NotNull
    @Column(unique = true)
    @Size(min = 1, max = 20)
    private String questionTypeName;

    @Value("false")
    private Boolean isWeil;

    @NotNull
    @Min(0L)
    @Max(99L)
    private Integer trueAnswers;

    @NotNull
    @Min(0L)
    @Max(99L)
    private Integer falseAnswers;

    @NotNull
    @Min(0L)
    @Max(99L)
    private Integer sumAnswers;

    @NotNull
    @Min(0L)
    @Max(999L)
    private Integer maxLetters;
    
//    @ManyToMany(mappedBy = "questionTypesAssigned")
//    @Cascade (value = org.hibernate.annotations.CascadeType.ALL)
//    private Set<QuestionTypeCountPerExam> questionTypeCountPerExam = new HashSet<QuestionTypeCountPerExam>();
    
	public static List<QuestionType> findAllQuestionTypesByAssesment(Long assesmentId) {
		Assesment assesment = Assesment.findAssesment(assesmentId);
        if (assesment == null) throw new IllegalArgumentException("The institution argument is required");
        EntityManager em = QuestionEvent.entityManager();
        TypedQuery<QuestionType> q = em.createQuery("SELECT DISTINCT questtype FROM AssesmentQuestion assquests " + 
        		"INNER JOIN assquests.question quest INNER JOIN quest.questionType questtype WHERE assquests.assesment = :assesment", QuestionType.class);
        q.setParameter("assesment", assesment);
        return q.getResultList();
    }
}
