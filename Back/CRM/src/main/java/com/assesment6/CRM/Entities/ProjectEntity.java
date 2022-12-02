package com.Assesment6.CRM.Entities;

import java.time.LocalDate;
import java.util.List;

public class ProjectEntity {
    private String entityID;
    private List<String> contactList;
    private LocalDate startDate;
    private LocalDate endDate;
    private String projectID;
    private String projectDescription;


    public ProjectEntity(String projectID, String entityID, List<String> contactList, LocalDate startDate, LocalDate endDate,
                         String projectDescription) {
        this.entityID = entityID;
        this.contactList = contactList;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectID = projectID;
        this.projectDescription = projectDescription;
    }

    public ProjectEntity() {
    }

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    public List<String> getContactList() {
        return contactList;
    }

    public void setContactList(List<String> contactList) {
        this.contactList = contactList;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }
}
