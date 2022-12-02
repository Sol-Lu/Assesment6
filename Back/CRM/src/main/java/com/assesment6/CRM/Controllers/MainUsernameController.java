package com.Assesment6.CRM.Controllers;

import com.Assesment6.CRM.Entities.CrmEntityEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @CrossOrigin(origins = "*")
    public class MainUsernameController {
        @PutMapping("/crmentitymain")
        public CrmEntityEntity createCrmentity(){
            return null;
        }

        @GetMapping("/crmentitymain")
        public CrmEntityEntity getUsername(){
            CrmEntityEntity username = new CrmEntityEntity();
            username.setEntityID("1IndMan");
            username.setEntityName("Manuel");
            username.isBusiness(false);
            username.setEmail("notearrimesalapared@gmail.com");
            username.setPhoneNumber(123456789);
            username.setAddress("C/Bellavista 9ºB");
            return username;
        }
}
