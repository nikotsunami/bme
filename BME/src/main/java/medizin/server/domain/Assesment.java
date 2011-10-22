package medizin.server.domain;

import org.apache.log4j.Logger;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.beans.factory.annotation.Value;
import medizin.server.domain.Mc;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@RooJavaBean
@RooToString
@RooEntity(finders = { "findAssesmentsByDateClosedLessThanEqualsAndDateOpenGreaterThanEqualsAndIsClosedNot" })
public class Assesment {

    @NotNull
    @Size(min = 5, max = 255)
    private String name;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "S-")
    private Date dateOfAssesment;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "S-")
    private Date dateOpen;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "S-")
    private Date dateClosed;

    @NotNull
    @Size(min = 5, max = 100)
    private String place;

    @NotNull
    @Size(min = 5, max = 255)
    private String logo;

    @NotNull
    @Value("false")
    private Boolean isClosed;

    @NotNull
    @Value("1")
    private Integer assesmentVersion;

    @NotNull
    @ManyToOne
    private Mc mc;

    @OneToOne
    private medizin.server.domain.Assesment repeFor;

    private Integer percentSameQuestion;
    
    public static List<Assesment> findAssesmentsOpenBetween() {
    	Date dateClosed =new Date();
    	Date dateOpen = new Date(); 
    	Boolean isClosed=false;
    	
    	Logger log = Logger.getLogger(Assesment.class);
    	log.debug("Datum geschlossen: " + dateClosed);

        EntityManager em = Assesment.entityManager();
        TypedQuery<Assesment> q = em.createQuery("SELECT Assesment FROM Assesment AS assesment WHERE assesment.dateClosed >= :dateClosed  AND assesment.dateOpen <= :dateOpen  AND assesment.isClosed IS :isClosed", Assesment.class);
        q.setParameter("dateClosed", dateClosed);
        q.setParameter("dateOpen", dateOpen);
        q.setParameter("isClosed", isClosed);
        return q.getResultList();
    }
    
    public static List<Assesment> findActiveAssesments() {
    	Date dateOfAssesment =new Date();
    	Date dateOpen = new Date(); 
    	//Boolean isClosed=false;
    	
    	//Logger log = Logger.getLogger(Assesment.class);
    	//log.debug("Datum geschlossen: " + dateClosed);

        EntityManager em = Assesment.entityManager();
        TypedQuery<Assesment> q = em.createQuery("SELECT Assesment FROM Assesment AS assesment WHERE assesment.dateOfAssesment >= :dateOfAssesment  AND assesment.dateOpen <= :dateOpen", Assesment.class);
        q.setParameter("dateOfAssesment", dateOfAssesment);
        q.setParameter("dateOpen", dateOpen);
      //  q.setParameter("isClosed", isClosed);
        return q.getResultList();
    }
}
