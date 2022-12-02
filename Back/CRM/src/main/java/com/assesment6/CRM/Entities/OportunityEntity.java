package com.Assesment6.CRM.Entities;

import java.time.LocalDate;
import java.util.List;

public class OportunityEntity extends ProjectEntity{
    private String proposals;

    public OportunityEntity(String entityID, List<String> contactList, LocalDate startDate, LocalDate endDate,
                            String projectID, String projectDescription, String proposals) {
        super(projectID, entityID, contactList, startDate, endDate, projectDescription);
        this.proposals = proposals;
    }

    public OportunityEntity() {
    }

    public String getProposals() {
        return proposals;
    }

    public void setProposals(String proposals) {
        this.proposals = proposals;
    }
}
