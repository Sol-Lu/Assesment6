package com.Assesment6.CRM.Controllers;

import com.Assesment6.CRM.Entities.CrmEntityEntity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainUsernameControllerTest {

    @Test
    void createCrmentity() {
    }

    @Test
    void getUsersData_dataAvailable() {
        MainUsernameController userController = new MainUsernameController();
        CrmEntityEntity userEntity = userController.getUsername();

        assertAll(
                () -> assertNotNull(userEntity.getEntityName()),
                () -> assertFalse(userEntity.getEntityName().trim().isEmpty()),
                () -> assertNotNull(userEntity.getEmail()),
                () -> assertFalse(userEntity.getEmail().trim().isEmpty()),
                () -> assertNotNull(userEntity.getEntityID()),
                () -> assertFalse(userEntity.getEntityID().trim().isEmpty()),
                () -> assertNotNull(userEntity.getAddress()),
                () -> assertFalse(userEntity.getAddress().trim().isEmpty()),
                () -> assertNotEquals(0,userEntity.getPhoneNumber())
        );
    }
}