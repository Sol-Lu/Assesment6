package com.Assesment6.CRM.Entities;

import java.time.LocalDate;
import java.util.List;

public class ClientEntity extends ProjectEntity{
    private String oportunityID;
    private String theme;

    public ClientEntity(String entityID, List<String> contactList, LocalDate startDate, LocalDate endDate,
                        String projectID, String projectDescription, String oportunityID, String theme) {
        super(entityID, contactList, startDate, endDate, projectID, projectDescription);
        this.oportunityID = oportunityID;
        this.theme = theme;
    }

    public ClientEntity() {
    }

    public String getOportunityID() {
        return oportunityID;
    }

    public void setOportunityID(String oportunityID) {
        this.oportunityID = oportunityID;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}

