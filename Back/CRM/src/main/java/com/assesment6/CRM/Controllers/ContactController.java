package com.assesment6.CRM.Controllers;

import com.assesment6.CRM.Entities.ContactEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class ContactController {
    @GetMapping("/contact")
    public ContactEntity createContact(){
        return null;
    }
}
