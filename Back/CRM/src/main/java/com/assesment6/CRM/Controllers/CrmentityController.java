package com.assesment6.CRM.Controllers;

import com.assesment6.CRM.Entities.ContactEntity;
import com.assesment6.CRM.Entities.CrmentityEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CrmentityController {
    @PutMapping ("/crmentity")
    public CrmentityEntity createCrmentity(){
        CrmentityEntity username = new CrmentityEntity();
        username.setEntityName("Manuel");
        username.isBusiness(false);

        return null;
    }

    @GetMapping("/crmentity")
    @CrossOrigin(origins = "*")
    public List<CrmentityEntity> showListofEntities(){
        CrmentityEntity username = new CrmentityEntity();
        username.setEntityName("Manuel");
        username.isBusiness(false);
        username.setEmail("notearrimesalapared@gmail.com");
        username.setPhoneNumber(123456789);
        username.setAddress("C/Bellavista 9ºB");
        return null;
    }
}
