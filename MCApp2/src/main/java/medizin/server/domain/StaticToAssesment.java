package medizin.server.domain;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Min;
import medizin.server.domain.StaticContent;
import javax.persistence.ManyToOne;
import medizin.server.domain.Assesment;

@RooJavaBean
@RooToString
@RooEntity
public class StaticToAssesment {

    @NotNull
    @Min(0L)
    private Integer sortOrder;

    @NotNull
    @ManyToOne
    private StaticContent staticContent;

    @NotNull
    @ManyToOne
    private Assesment assesment;
}
