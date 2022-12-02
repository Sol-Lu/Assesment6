package com.Assesment6.CRM.Entities;

public class CrmEntityEntity {
    private String entityID;
    private String entityName;
    private boolean business;
    private String email;
    private int phoneNumber;
    private String address;

    public CrmEntityEntity(String entityID, String entityName, boolean business, String email, int phoneNumber,
                           String address) {
        this.entityID = entityID;
        this.entityName = entityName;
        this.business = business;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public CrmEntityEntity() {
    }

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public boolean isBusiness(boolean b) {
        return business;
    }

    public void setBusiness(boolean business) {
        this.business = business;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
