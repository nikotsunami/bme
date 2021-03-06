// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package medizin.server.domain;

import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;
import medizin.server.domain.Mc;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Mc_Roo_Entity {
    
    declare @type: Mc: @Entity;
    
    @PersistenceContext
    transient EntityManager Mc.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Mc.id;
    
    @Version
    @Column(name = "version")
    private Integer Mc.version;
    
    public Long Mc.getId() {
        return this.id;
    }
    
    public void Mc.setId(Long id) {
        this.id = id;
    }
    
    public Integer Mc.getVersion() {
        return this.version;
    }
    
    public void Mc.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Mc.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Mc.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Mc attached = Mc.findMc(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Mc.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Mc.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Mc Mc.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Mc merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager Mc.entityManager() {
        EntityManager em = new Mc().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Mc.countMcs() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Mc o", Long.class).getSingleResult();
    }
    
    public static List<Mc> Mc.findAllMcs() {
        return entityManager().createQuery("SELECT o FROM Mc o", Mc.class).getResultList();
    }
    
    public static Mc Mc.findMc(Long id) {
        if (id == null) return null;
        return entityManager().find(Mc.class, id);
    }
    
    public static List<Mc> Mc.findMcEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Mc o", Mc.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
