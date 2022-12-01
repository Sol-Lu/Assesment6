package com.Assesment6.CRM.Controllers;

import com.Assesment6.CRM.Entities.CrmentityEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    public class CrmentityController {
        @PutMapping("/crmentity")
        public CrmentityEntity createCrmentity(){
            return null;
        }

        @GetMapping("/crmentity")
        @CrossOrigin(origins = "*")
        public List<CrmentityEntity> showListofEntities(){
            return null;
        }
}
