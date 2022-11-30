package com.assesment6.CRM.Controllers;

import com.assesment6.CRM.Entities.ClientEntity;
import com.assesment6.CRM.Entities.ContactEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class ContactController {
    @PutMapping ("/contact")
    public ContactEntity createContact(){
        ContactEntity newContact = ContactEntity();
        newContact.setDateOfContact("2021-02-02");

        newContact.setEntityName("Nombre de empresa");

        do{


        }while (newContact.getEntityName()!= username) | (lista de users no está vacia)

        if newContact.getEntityName()=

        LocalDate dateOfContact, String viaOfContact, String entityName, String contentOfContact,
        boolean client, String projectName

        return null;
    }

    @GetMapping("/contact")
    public List<ContactEntity> show(){
        return null;
    }
}
