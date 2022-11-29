package com.assesment6.CRM.Entities;

import java.time.LocalDate;
import java.util.List;

public class OportunityEntity extends ProjectEntity{
    private String proposals;

    public OportunityEntity() {
    }

    public OportunityEntity(String entityName, List<String> contactList, LocalDate startDate, LocalDate endDate, String projectName, String proposals) {
        super(entityName, contactList, startDate, endDate, projectName);
        this.proposals = proposals;
    }

    public String getProposals() {
        return proposals;
    }

    public void setProposals(String proposals) {
        this.proposals = proposals;
    }
}
