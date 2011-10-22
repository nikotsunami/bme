package medizin.server.domain;

import org.apache.log4j.Logger;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Column;
import org.springframework.beans.factory.annotation.Value;

import com.google.gwt.editor.client.Editor.Ignore;
import com.google.gwt.requestfactory.server.RequestFactoryServlet;
import com.google.gwt.requestfactory.shared.Request;

import java.util.Enumeration;
import java.util.Set;

import medizin.client.managed.request.PersonProxy;
import medizin.server.domain.QuestionAccess;
import java.util.HashSet;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;

@RooJavaBean
@RooToString
@RooEntity
public class Person {

    @NotNull
    @Size(max = 50)
    private String name;

    @NotNull
    @Size(max = 50)
    private String prename;
    
    
    @Size(max = 50)
    private String shidId;

    @NotNull
    @Column(unique = true)
    @Size(min = 7, max = 50)
    private String email;

    @NotNull
    @Column(unique = true)
    @Size(min = 7, max = 50)
    private String alternativEmail;

    @Size(min = 5, max = 50)
    private String phoneNumber;

    @NotNull
    @Value("false")
    private Boolean isAdmin;

    @NotNull
    @Value("false")
    private Boolean isAccepted;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
    private Set<QuestionAccess> questionAccesses = new HashSet<QuestionAccess>();



    public void loginPerson(){
		HttpSession session = RequestFactoryServlet.getThreadLocalRequest().getSession();
		session.setAttribute("shibdId", this.shidId);
    }
    
  
	public static Person findPersonByShibId(String shibdId) {
		 return entityManager().createQuery("select o from Person o WHERE o.shidId LIKE '" + shibdId + "'", Person.class).getSingleResult();
	}
	
	private static Logger log = Logger.getLogger(Person.class);
	

	public static Person myGetLoggedPerson(){
		HttpSession session = RequestFactoryServlet.getThreadLocalRequest().getSession();
		Enumeration attNames = session.getAttributeNames();
		while ( attNames.hasMoreElements()){
			
			log.info( attNames.nextElement().toString());
		}
		
		return findPersonByShibId(session.getAttribute("shibdId").toString());
	}
}
