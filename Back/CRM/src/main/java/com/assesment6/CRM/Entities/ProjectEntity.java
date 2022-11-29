package com.assesment6.CRM.Entities;

import java.time.LocalDate;
import java.util.List;

public class ProjectEntity {
    private String entityName;
    private List<String> contactList;
    private LocalDate startDate;
    private LocalDate endDate;
    private String projectName;

    public ProjectEntity() {
    }

    public ProjectEntity(String entityName, List<String> contactList, LocalDate startDate, LocalDate endDate, String projectName) {
        this.entityName = entityName;
        this.contactList = contactList;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectName = projectName;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
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

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
