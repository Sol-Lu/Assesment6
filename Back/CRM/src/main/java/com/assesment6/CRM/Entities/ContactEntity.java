package com.Assesment6.CRM.Entities;

import java.time.LocalDate;

public class ContactEntity {
    private String contactID;
    private LocalDate dateOfContact;
    private String viaOfContact;
    private String entityID;
    private String contentOfContact;
    private String projectID;
    private boolean client;

    public ContactEntity(String contactID, LocalDate dateOfContact, String viaOfContact, String entityID,
                         String contentOfContact, String projectID, boolean client) {
        this.contactID = contactID;
        this.dateOfContact = dateOfContact;
        this.viaOfContact = viaOfContact;
        this.entityID = entityID;
        this.contentOfContact = contentOfContact;
        this.projectID = projectID;
        this.client = client;
    }

    public ContactEntity() {
    }

    public String getContactID() {
        return contactID;
    }

    public void setContactID(String contactID) {
        this.contactID = contactID;
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

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    public String getContentOfContact() {
        return contentOfContact;
    }

    public void setContentOfContact(String contentOfContact) {
        this.contentOfContact = contentOfContact;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public boolean isClient() {
        return client;
    }

    public void setClient(boolean client) {
        this.client = client;
    }
}
