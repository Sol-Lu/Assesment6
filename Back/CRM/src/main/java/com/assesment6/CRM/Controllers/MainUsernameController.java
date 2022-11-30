package com.assesment6.CRM.Controllers;

import com.assesment6.CRM.Entities.CrmentityEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class MainUsernameController {
    @PutMapping("/crmentitymain")
    public CrmentityEntity createCrmentity(){
        return null;
    }

    @GetMapping("/crmentitymain")
    public CrmentityEntity showUsername(){
        CrmentityEntity username = new CrmentityEntity();
        username.setEntityName("Manuel");
        username.isBusiness(false);
        username.setEmail("notearrimesalapared@gmail.com");
        username.setPhoneNumber(123456789);
        username.setAddress("C/Bellavista 9ºB");
        return username;
    }
}
