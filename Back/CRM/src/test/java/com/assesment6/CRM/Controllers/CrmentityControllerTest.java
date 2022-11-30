package com.assesment6.CRM.Controllers;

import com.assesment6.CRM.Entities.CrmentityEntity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrmentityControllerTest {

    @Test
    void createCrmentity_usernameDoesNotExist_newUsername() {
        CrmentityController crmentityControllerTest = new CrmentityController();
        crmentityControllerTest.createCrmentity();

        assertAll(
                () ->assertEquals("Manuel",crmentityControllerTest.createCrmentity().getEntityName()),
                () ->assertFalse(crmentityControllerTest.createCrmentity().isBusiness())
        );
    }

    @Test
    void createCrmentity_usernameDoesNotExist_newUsername() {

    }
}