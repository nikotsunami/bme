package medizin.server.domain;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.transaction.annotation.Transactional;

import com.google.gwt.requestfactory.server.RequestFactoryServlet;

import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotNull;
import javax.persistence.Column;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooEntity
public class Institution {

    @NotNull
    @Column(unique = true)
    @Size(min = 3, max = 60)
    private String institutionName;
    
  
    public void mySetCurrentInstitution(){
    	HttpSession session = RequestFactoryServlet.getThreadLocalRequest().getSession();
		session.setAttribute("institutionId", this.getId());
    }
    

    public static Institution myGetInstitutionToWorkWith(){
    	HttpSession session = RequestFactoryServlet.getThreadLocalRequest().getSession();
		Long instId = (Long) session.getAttribute("institutionId");
		return Institution.findInstitution(instId);
    }
}
