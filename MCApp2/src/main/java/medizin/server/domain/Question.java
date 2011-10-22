package medizin.server.domain;

import org.apache.log4j.Logger;
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

import javax.persistence.OneToOne;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import medizin.client.managed.request.QuestionProxy;
import medizin.server.domain.Keyword;
import java.util.HashSet;

import javax.persistence.EntityManager;
import javax.persistence.ManyToMany;
import javax.persistence.CascadeType;
import javax.persistence.TypedQuery;

import medizin.server.domain.QuestionEvent;
import javax.persistence.ManyToOne;
import medizin.server.domain.Comment;
import medizin.server.domain.QuestionType;
import medizin.server.domain.Mc;
import medizin.server.domain.Answer;
import javax.persistence.OneToMany;

@RooJavaBean
@RooToString
@RooEntity(inheritanceType = "TABLE_PER_CLASS")
public class Question extends RedactionalBase {

    @Size(min = 10, max = 600)
    private String questionText;

    @Size(min = 2, max = 255)
    private String picturePath;

    @NotNull
    private Double questionVersion;

    @NotNull
    @Value("false")
    private Boolean isAcceptedRewiever;

    @NotNull
    @Value("false")
    private Boolean isAcceptedAdmin;

    @NotNull
    @Value("false")
    private Boolean isActive;

    @OneToOne
    private medizin.server.domain.Question previousVersion;

    @ManyToMany(cascade = CascadeType.DETACH)
    private Set<Keyword> keywords = new HashSet<Keyword>();

    @NotNull
    @ManyToOne
    private QuestionEvent questEvent;

    @OneToOne
    private Comment comment;

    @NotNull
    @ManyToOne
    private QuestionType questionType;

    @NotNull
    @ManyToMany(cascade = CascadeType.DETACH)
    private Set<Mc> mcs = new HashSet<Mc>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
    private Set<Answer> answers = new HashSet<Answer>();
    
	   public static long countQuestionAccessByPersonNonRoo(java.lang.Long personId) {
	        Person person = Person.findPerson(personId);
	        if (person == null) throw new IllegalArgumentException("The institution argument is required");
	        EntityManager em = QuestionEvent.entityManager();
	        TypedQuery<Long> q = em.createQuery("SELECT count(quest) FROM QuestionAccess qaccess " + 
	        		"INNER JOIN qaccess.question quest WHERE qaccess.person = :person", Long.class);
	        q.setParameter("person", person);
	        return q.getSingleResult();
	    }

	    public static List<Question> findQuestionAccessByPersonNonRoo(java.lang.Long personId, int firstResult, int maxResults) {
	        Person person = Person.findPerson(personId);
	        if (person == null) throw new IllegalArgumentException("The institution argument is required");
	        EntityManager em = QuestionEvent.entityManager();
	        TypedQuery<Question> q = em.createQuery("SELECT quest FROM QuestionAccess qaccess " + 
	        		"INNER JOIN qaccess.question quest WHERE qaccess.person = :person", Question.class).setFirstResult(firstResult).setMaxResults(maxResults);
//	        TypedQuery<QuestionEvent> q = em.createQuery("SELECT QuestionEvent FROM QuestionEvent AS questionevent ", QuestionEvent.class).setFirstResult(firstResult).setMaxResults(maxResults);
	        q.setParameter("person", person);
	        return q.getResultList();
	    }
	    
	    public static long countQuestionByInstitutionOrEventOrQuestionNameOrKeyword(
				Long institutionId, Long eventId, String questiuonStringFilter,
				Boolean filterQuestionText, Boolean filterKeywords) {
	    	
	    	Institution inst=null;
	    	QuestionEvent event=null;
	    	String queryString = "SELECT COUNT(quest) FROM Question quest INNER JOIN quest.questEvent queEvent LEFT JOIN quest.keywords keyw ";
	    	 if (institutionId!=null || eventId!=null || !questiuonStringFilter.equals("")){
	    		 queryString+="WHERE ";
	    	 }
	    	
	    	if(institutionId!=null){
	    		inst = Institution.findInstitution(institutionId);
	    		 queryString+="queEvent.institution= :institution ";
	    	}
	    	if(eventId!=null){
	    		if(institutionId!=null){
		    		
		    		 queryString+="OR ";
		    	}
	    		event = QuestionEvent.findQuestionEvent(eventId);
	    		 queryString+="quest.questEvent= :event ";
	    	}
	    	if(!questiuonStringFilter.equals("")){
	    		if(institutionId!=null||eventId!=null){
		    		
		    		 queryString+="OR ";
		    	}
	    		if (filterQuestionText){
	    			queryString+="quest.questionText LIKE '%" + questiuonStringFilter + "%' ";
	    		}
	    		if (filterKeywords){
	    			if (filterQuestionText) queryString+="OR ";
		    	
	    			queryString+="keyw.name LIKE '%" + questiuonStringFilter + "%' ";
	    			
	    		}
	    	}
	    	EntityManager em = QuestionEvent.entityManager();
	        TypedQuery<Long> q = em.createQuery(queryString, Long.class);
	    	if(inst!=null){
	    		 q.setParameter("institution", inst);
	    		 
	    	}
	    	if(event!=null){
	    	
	    		 q.setParameter("event", event); 
	    		 
	    	}
	       
	        return q.getSingleResult();	    	
	    }
	    
	    
	    public static List<Question> findQuestionByInstitutionOrEventOrQuestionNameOrKeyword(
				Long institutionId, Long eventId, String questiuonStringFilter,
				Boolean filterQuestionText, Boolean filterKeywords, int start, int length) {
	    	Institution inst=null;
	    	QuestionEvent event=null;
	    	String queryString = "SELECT quest FROM Question quest INNER JOIN quest.questEvent queEvent LEFT JOIN quest.keywords keyw  ";
	    	 if (institutionId!=null || eventId!=null || !questiuonStringFilter.equals("")){
	    		 queryString+="WHERE ";
	    	 }
	    	
	    	if(institutionId!=null){
	    		inst = Institution.findInstitution(institutionId);
	    		 queryString+="queEvent.institution= :institution ";
	    	}
	    	if(eventId!=null){
	    		if(institutionId!=null){
		    		
		    		 queryString+="OR ";
		    	}
	    		event = QuestionEvent.findQuestionEvent(eventId);
	    		 queryString+="quest.questEvent= :event ";
	    	}
	    	if(!questiuonStringFilter.equals("")){
	    		if(institutionId!=null||eventId!=null){
		    		
		    		 queryString+="OR ";
		    	}
	    		if (filterQuestionText){
	    			queryString+="quest.questionText LIKE '%" + questiuonStringFilter + "%' ";
	    		}
	    		if (filterKeywords){
	    			if (filterQuestionText) queryString+="OR ";
		    	
	    			queryString+="keyw.name LIKE '%" + questiuonStringFilter + "%' ";
	    			
	    		}
	    	}
	    	EntityManager em = QuestionEvent.entityManager();
	        TypedQuery<Question> q = em.createQuery(queryString,  Question.class).setFirstResult(start).setMaxResults(length);
	    	if(inst!=null){
	    		 q.setParameter("institution", inst);
	    		 
	    	}
	    	if(event!=null){
	    	
	    		 q.setParameter("event", event); 
	    		 
	    	}
	       
	        return q.getResultList();	 
					
	    	
	    }
	    
	    public static List<Question> findQuestionsByMc(Long mcId) {
	        Boolean isAcceptedAdmin = true;
	        Boolean isActive = true;
	        Mc mc = Mc.findMc(mcId);
	        if (mc == null) throw new IllegalArgumentException("The mcs argument is required");
	        EntityManager em = Question.entityManager();
	        StringBuilder queryBuilder = new StringBuilder("SELECT Question FROM Question AS question WHERE question.isAcceptedAdmin = :isAcceptedAdmin AND question.isActive = :isActive AND"+
	        		" :mcs_item MEMBER OF question.mcs");
	        
	        TypedQuery<Question> q = em.createQuery(queryBuilder.toString(), Question.class);
	        q.setParameter("isAcceptedAdmin", isAcceptedAdmin);
	        q.setParameter("isActive", isActive);
	
	         q.setParameter("mcs_item", mc);
	        
	        return q.getResultList();
	    }
	    
		public static Long countQuestionsNonAcceptedAdmin(){
			// Gets the Sessionattributes
			HttpSession session = RequestFactoryServlet.getThreadLocalRequest().getSession();
			log.info(session.getAttribute("shibdId"));
			log.info(session.getAttribute("institutionId"));
			String shibdId2 = (String) session.getAttribute("shibdId");
			long institutionId2 = (Long) session.getAttribute("institutionId");
			
			Person loggedUser = Person.findPersonByShibId(shibdId2);
			Institution institution = Institution.findInstitution(institutionId2);
			if (loggedUser == null || institution == null) throw new IllegalArgumentException("The person and institution arguments are required");
			// End filter fuctionality
			
			 StringBuilder queryBuilder = new StringBuilder("SELECT count(Question) FROM Question AS question WHERE ");
			 
			 Boolean isAccepted = false;
			 
			if(loggedUser.getIsAdmin()){
				
				queryBuilder.append("question.isAcceptedAdmin = :isAccepted ");
				
				
			} else {
				queryBuilder.append("question.isAcceptedRewiever = :isAccepted AND question.rewiewer = :person");
			}
			
			EntityManager em = Question.entityManager();
	       
	        
	        TypedQuery<Long> q = em.createQuery(queryBuilder.toString(), Long.class);

	        if(!loggedUser.getIsAdmin()){
	        	 q.setParameter("person", loggedUser);
	        }
	        
	        q.setParameter("isAccepted", isAccepted);
	        
	        return q.getSingleResult();
		}

		public static List<Question> findQuestionsEntriesNonAcceptedAdmin(
				int start, int length){
			// Gets the Sessionattributes
			HttpSession session = RequestFactoryServlet.getThreadLocalRequest().getSession();
			log.info(session.getAttribute("shibdId"));
			log.info(session.getAttribute("institutionId"));
			String shibdId2 = (String) session.getAttribute("shibdId");
			long institutionId2 = (Long) session.getAttribute("institutionId");
			
			Person loggedUser = Person.findPersonByShibId(shibdId2);
			Institution institution = Institution.findInstitution(institutionId2);
			if (loggedUser == null || institution == null) throw new IllegalArgumentException("The person and institution arguments are required");
			// End filter fuctionality
			
			 StringBuilder queryBuilder = new StringBuilder("SELECT Question FROM Question AS question WHERE ");
			 
			 Boolean isAccepted = false;
			 
			if(loggedUser.getIsAdmin()){
				
				queryBuilder.append("question.isAcceptedAdmin = :isAccepted ");
				
				
			} else {
				queryBuilder.append("question.isAcceptedRewiever = :isAccepted AND question.rewiewer = :person");
			}
			
			EntityManager em = Question.entityManager();
	       
	        
	        TypedQuery<Question> q = em.createQuery(queryBuilder.toString(), Question.class);

	        if(!loggedUser.getIsAdmin()){
	        	 q.setParameter("person", loggedUser);
	        }
	        
	        q.setParameter("isAccepted", isAccepted);
	        
	        return q.getResultList();
		}
		
		public static List<Question> findQuestionsAnswersNonAcceptedAdmin(){
			Boolean isAcceptedAdmin = false;
			
			HttpSession session = RequestFactoryServlet.getThreadLocalRequest().getSession();
;
			String shibdId2 = (String) session.getAttribute("shibdId");
			long institutionId2 = (Long) session.getAttribute("institutionId");
			
			Person loggedUser = Person.findPersonByShibId(shibdId2);
			Institution institution = Institution.findInstitution(institutionId2);
			if (loggedUser == null || institution == null) throw new IllegalArgumentException("The person and institution arguments are required");

			
			EntityManager em = Question.entityManager();
			StringBuilder queryBuilder;
			
			if(loggedUser.getIsAdmin()) {
				queryBuilder = new StringBuilder("SELECT DISTINCT Question FROM Question AS question INNER JOIN question.answers AS answ WHERE answ.isAnswerAcceptedAdmin = :isAccepted");
			}
			else {
				queryBuilder = new StringBuilder("SELECT DISTINCT Question FROM Question AS question INNER JOIN question.answers AS answ " +
						"WHERE (answ.isAcceptedRewiever = :isAccepted AND answ.rewiewer=:person ) OR (answ.autor=:person AND answ.isAcceptedAutor = :isAccepted) ");

			}
	        
	        TypedQuery<Question> q = em.createQuery(queryBuilder.toString(), Question.class);
	        q.setParameter("isAccepted", isAcceptedAdmin);
	        if(!loggedUser.getIsAdmin()) {
	        	q.setParameter("person", loggedUser);
	        }
	        
	        return q.getResultList();
		}
		
		private static Logger log = Logger.getLogger(Question.class);
	
		
		public static Long  countQuestionsByPerson(String shibdId, Long institutionId){
			
			HttpSession session = RequestFactoryServlet.getThreadLocalRequest().getSession();
			log.info(session.getAttribute("shibdId"));
			log.info(session.getAttribute("institutionId"));
			String shibdId2 = (String) session.getAttribute("shibdId");
			long institutionId2 = (Long) session.getAttribute("institutionId");
			
			Person loggedUser = Person.findPersonByShibId(shibdId2);
			Institution institution = Institution.findInstitution(institutionId2);
			if (loggedUser == null || institution == null) throw new IllegalArgumentException("The person and institution arguments are required");
			TypedQuery<Long> q;

			EntityManager em = Question.entityManager();
			
			
			if(!loggedUser.getIsAdmin()){
				StringBuilder queryBuilder = new StringBuilder("SELECT count(question) FROM Question AS question INNER JOIN question.questEvent AS queEvent " +
		        		"WHERE queEvent.institution = :institution AND (question IN (SELECT questAccess.question FROM QuestionAccess AS questAccess WHERE questAccess.person = :loggedUser)" +
		        		" OR question.questEvent IN (SELECT questAccess2.questionEvent FROM QuestionAccess AS questAccess2 WHERE questAccess2.person = :loggedUser))");
		        
		        q = em.createQuery(queryBuilder.toString(), Long.class);
		        q.setParameter("institution", institution);
		        q.setParameter("loggedUser", loggedUser);
			}
			else{
				StringBuilder queryBuilder = new StringBuilder("SELECT count(question) FROM Question AS question INNER JOIN question.questEvent AS queEvent " +
		        		"WHERE queEvent.institution = :institution ");
		        
		        q = em.createQuery(queryBuilder.toString(), Long.class);
		        q.setParameter("institution", institution);

			}
	        
	        
	        return q.getSingleResult();
		}

		public static List<Question>   findQuestionEntriesByPerson(String shibdId, Long institutionId, int start, int length){
			Person loggedUser = Person.findPersonByShibId(shibdId);
			Institution institution = Institution.findInstitution(institutionId);
			if (loggedUser == null || institution == null) throw new IllegalArgumentException("The person and institution arguments are required");
			EntityManager em = Question.entityManager();
			TypedQuery<Question> q;
			
			if(!loggedUser.getIsAdmin()){
		        StringBuilder queryBuilder = new StringBuilder("SELECT question FROM Question AS question INNER JOIN question.questEvent AS queEvent " +
		        		"WHERE queEvent.institution = :institution AND question IN (SELECT questAccess.question FROM QuestionAccess AS questAccess WHERE questAccess.person = :loggedUser)" +
		        		" OR question.questEvent IN (SELECT questAccess2.questionEvent FROM QuestionAccess AS questAccess2 WHERE questAccess2.person = :loggedUser))");
		        
		        q = em.createQuery(queryBuilder.toString(), Question.class).setFirstResult(start).setMaxResults(length);
		        q.setParameter("institution", institution);
		        q.setParameter("loggedUser", loggedUser);
			}
			else{
		        StringBuilder queryBuilder = new StringBuilder("SELECT question FROM Question AS question INNER JOIN question.questEvent AS queEvent " +
		        		"WHERE queEvent.institution = :institution");
		        
		        q = em.createQuery(queryBuilder.toString(), Question.class).setFirstResult(start).setMaxResults(length);
		        q.setParameter("institution", institution);

			}
	        
	        return q.getResultList();
		}
		
		public void persistAndSetPreviousInactive(){
	        if (this.entityManager == null) this.entityManager = entityManager();
	       
			if(this.getPreviousVersion()!=null){
				this.previousVersion.isActive=false;
				//this.entityManager.persist(previousVersion);
				//this.previousVersion.flush();
			}
			 this.entityManager.persist(this);
			 this.flush();
			 this.entityManager.refresh(this);
		}
		
		public void  persistNonRoo(){
			if (this.entityManager == null) this.entityManager = entityManager();
			this.entityManager.persist(this);
			 this.flush();
			 this.entityManager.refresh(this);
		}

		public void  generateNewVersion(){
			if (this.entityManager == null) this.entityManager = entityManager();
			
		//this.previousVersion.setIsActive(false);
			//this.entityManager.persist(this.previousVersion);
			this.entityManager.persist(this);
			 this.flush();
			//this.entityManager.refresh(this.previousVersion);
			this.entityManager.refresh(this);
			
			
			
			
		}
}
