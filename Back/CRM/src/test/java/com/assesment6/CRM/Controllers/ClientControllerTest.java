package com.assesment6.CRM.Controllers;

import com.assesment6.CRM.Entities.ClientEntity;
import com.assesment6.CRM.Entities.OportunityEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.internal.annotations.IDataProvidable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientControllerTest {
    private OportunityEntity oporunityTest = new OportunityEntity("entityName", Arrays.asList("Contact1", "Contact2"),
            LocalDate.parse("2021-08-20"), LocalDate.parse("2022-09-10"), "OportunityProject1",
            "Proposal1 ");

    private ClientEntity clientTest1 = new ClientEntity(oporunityTest.getEntityName(), Arrays.asList("ContactA"),
            oporunityTest.getEndDate(), null, "ClientProjectA", oporunityTest.getProjectName(),
            "Get app 1A made");

    private ClientEntity clientTest2 = new ClientEntity(oporunityTest.getEntityName(), Arrays.asList("ContactB"),
            oporunityTest.getEndDate(), null, "ClientProjectB", oporunityTest.getProjectName(),
            "Get app 1A made");

    @Test
    void createClient_clientDoesNotExistAndFreeOportunity_newClient() {
        ClientController clientCTest1 = null;


        assertAll("",
                ()-> assertEquals("entityName", clientCTest1.create())


        );
    }

    @Test
    void createClient_noOportunityFree_errorMessage() {
        ClientEntity clientEntityTest1 = clientTest2;
    }

    @Test
    void createClient_clientDoesExist_errorMessage() {
        ClientEntity clientEntityTest1 = clientTest1;
    }
}