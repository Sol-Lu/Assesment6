package com.Assesment6.CRM.Entities;

import javax.swing.*;

public class MainUsernameEntity extends CrmentityEntity{
    public JPasswordField getPassword() {
        return password;
    }

    public void setPassword(JPasswordField password) {
        this.password = password;
    }

    private JPasswordField password;

    public MainUsernameEntity(String entityID, String entityName, boolean business, String email, int phoneNumber,
                              String address, JPasswordField password) {
        super(entityID, entityName, business, email, phoneNumber, address);
        this.password = password;
    }

    public MainUsernameEntity() {
    }
}
