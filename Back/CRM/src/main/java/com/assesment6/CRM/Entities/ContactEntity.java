package com.assesment6.CRM.Entities;

import java.time.LocalDate;

public class ContactEntity {
    private LocalDate dateOfContact;
    private String viaOfContact;
    private String entityName;
    private String contentOfContact;
    private boolean client;
    private String projectName;

    public ContactEntity(LocalDate dateOfContact, String viaOfContact, String entityName, String contentOfContact, boolean client, String projectName) {
        this.dateOfContact = dateOfContact;
        this.viaOfContact = viaOfContact;
        this.entityName = entityName;
        this.contentOfContact = contentOfContact;
        this.client = client;
        this.projectName = projectName;
    }

    public ContactEntity() {
    }

    public LocalDate getDateOfContact() {
        return dateOfContact;
    }

    public void setDateOfContact(LocalDate dateOfContact) {
        this.dateOfContact = dateOfContact;
    }

    public String getViaOfContact() {
        return viaOfContact;
    }

    public void setViaOfContact(String viaOfContact) {
        this.viaOfContact = viaOfContact;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getContentOfContact() {
        return contentOfContact;
    }

    public void setContentOfContact(String contentOfContact) {
        this.contentOfContact = contentOfContact;
    }

    public boolean isClient() {
        return client;
    }

    public void setClient(boolean client) {
        this.client = client;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
