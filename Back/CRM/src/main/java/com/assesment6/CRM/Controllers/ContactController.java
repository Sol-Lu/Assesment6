package com.assesment6.CRM.Controllers;

import com.assesment6.CRM.Entities.ClientEntity;
import com.assesment6.CRM.Entities.ContactEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ContactController {
    @PutMapping ("/contact")
    public ContactEntity createContact(){
        return null;
    }

    @GetMapping("/contact")
    public List<ContactEntity> show(){
        return null;
    }
}
