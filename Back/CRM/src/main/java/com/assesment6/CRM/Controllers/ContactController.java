package com.Assesment6.CRM.Controllers;

import com.Assesment6.CRM.Entities.ContactEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ContactController {
    @PutMapping ("/contact")
    public ContactEntity create(){
        return null;
    }

    @GetMapping("/contact")
    public List<ContactEntity> show(){
        return null;
    }
}
