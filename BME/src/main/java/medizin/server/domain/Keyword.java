package medizin.server.domain;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.Target;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooEntity
public class Keyword {

    @NotNull
    @Column(unique = true)
    @Size(min = 3, max = 45)
    private String name;
    
    @PreRemove 
    private void onRemove(){
    //	questions = null;
    }
    
    @ManyToMany(mappedBy = "keywords", targetEntity = Question.class)
    private Set<Question> questions = new HashSet<Question>();
   
}
