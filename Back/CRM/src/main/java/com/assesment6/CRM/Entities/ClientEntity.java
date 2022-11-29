package com.assesment6.CRM.Entities;

import java.time.LocalDate;
import java.util.List;

public class ClientEntity extends ProjectEntity {

    private String oportunityRelatedName;
    private String subject;

    public ClientEntity(String entityName, List<String> contactList, LocalDate startDate, LocalDate endDate,
                        String projectName, String oportunityRelatedName, String subject) {
        super(entityName, contactList, startDate, endDate, projectName);
        this.oportunityRelatedName = oportunityRelatedName;
        this.subject = subject;
    }

    public ClientEntity() {
    }

    public String getOportunityRelatedName() {
        return oportunityRelatedName;
    }

    public void setOportunityRelatedName(String oportunityRelatedName) {
        this.oportunityRelatedName = oportunityRelatedName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
