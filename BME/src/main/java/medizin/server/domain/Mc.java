package medizin.server.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import medizin.client.managed.request.McProxy;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.transaction.annotation.Transactional;

import com.google.gwt.requestfactory.shared.Request;

import javax.validation.constraints.NotNull;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooEntity
public class Mc {

    @NotNull
    @Column(unique = true)
    @Size(min = 2, max = 50)
    private String mcName;
    
    
   
//    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "mcs")
//    private Set<Question> questions = new HashSet<Question>();
    
  
   public static List<Mc> myGetAllMcs(){
	   
	   return entityManager().createQuery("select o from Mc o", Mc.class).getResultList();
	
	   
   }
}
