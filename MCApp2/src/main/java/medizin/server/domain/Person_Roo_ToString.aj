// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package medizin.server.domain;

import java.lang.String;

privileged aspect Person_Roo_ToString {
    
    public String Person.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AlternativEmail: ").append(getAlternativEmail()).append(", ");
        sb.append("Email: ").append(getEmail()).append(", ");
        sb.append("IsAccepted: ").append(getIsAccepted()).append(", ");
        sb.append("IsAdmin: ").append(getIsAdmin()).append(", ");
        sb.append("Name: ").append(getName()).append(", ");
        sb.append("PhoneNumber: ").append(getPhoneNumber()).append(", ");
        sb.append("Prename: ").append(getPrename()).append(", ");
        sb.append("QuestionAccesses: ").append(getQuestionAccesses() == null ? "null" : getQuestionAccesses().size()).append(", ");
        sb.append("ShidId: ").append(getShidId());
        return sb.toString();
    }
    
}