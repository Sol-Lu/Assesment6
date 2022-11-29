package com.assesment6.CRM.Controllers;

import com.assesment6.CRM.Entities.ClientEntity;
import com.assesment6.CRM.Entities.OportunityEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientControllerTest {
    private OportunityEntity oporunityTest = new OportunityEntity("entityName", Arrays.asList("Contact1", "Contact2"),
            LocalDate.parse("2021-08-20"), LocalDate.parse("2022-09-10"), "OportunityProject1", "Proposal1 ");

    @DataProvider(name="dataprovider1")
    public Object[][] dataProvider1(){
        ClientEntity clientTest1 = new ClientEntity();
        clientTest1.setEntityName(oporunityTest.getEntityName());
        clientTest1.setStartDate(oporunityTest.getEndDate());
        clientTest1.setEndDate(null);
        clientTest1.setContactList(Arrays.asList("ContactA"));
        clientTest1.setProjectName("ClientProjectA");
        clientTest1.setOportunityRelatedName(oporunityTest.getProjectName());
        clientTest1.setSubject("Get app 1A made");

        return new Object[][]{
                {clientTest1}
        };
    }

    @Test
    void createClient_clientDoesNotExistAndFreeOportunity_newClient(Object input, boolean expected) {
        Assert.assertEquals();
    }

    @Test
    void createClient_noOportunityFree_errorMessage() {
    }

    @Test
    void createClient_clientDoesExist_errorMessage() {
    }
}