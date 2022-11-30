package com.assesment6.CRM.Entities;

import javax.swing.*;

public class MainUsernameEntity extends CrmentityEntity {
    private JPasswordField password;

    public MainUsernameEntity(String entityName, boolean business, String email, int phoneNumber, String address,
                              JPasswordField password) {
        super(entityName, business, email, phoneNumber, address);
        this.password = password;
    }

    public MainUsernameEntity() {
    }

    public JPasswordField getPassword() {
        return password;
    }

    public void setPassword(JPasswordField password) {
        this.password = password;
    }
}

