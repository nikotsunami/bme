// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package medizin.server.domain;

import java.lang.String;
import medizin.server.domain.Institution;

privileged aspect QuestionEvent_Roo_JavaBean {
    
    public String QuestionEvent.getEventName() {
        return this.eventName;
    }
    
    public void QuestionEvent.setEventName(String eventName) {
        this.eventName = eventName;
    }
    
    public Institution QuestionEvent.getInstitution() {
        return this.institution;
    }
    
    public void QuestionEvent.setInstitution(Institution institution) {
        this.institution = institution;
    }
    
}