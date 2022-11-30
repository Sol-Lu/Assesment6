package com.assesment6.CRM.Controllers;

import com.assesment6.CRM.Entities.CrmentityEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainUsernameController {
    @PutMapping("/crmentity")
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
