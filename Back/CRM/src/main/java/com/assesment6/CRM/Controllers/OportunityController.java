package com.assesment6.CRM.Controllers;

import com.assesment6.CRM.Entities.CrmentityEntity;
import com.assesment6.CRM.Entities.OportunityEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OportunityController {

    @PutMapping("/oportunity")
        public OportunityEntity createOportunity(){
        return null;
        }

    @GetMapping("/oportunity")
    public List<OportunityEntity> show(){
        return null;
    }
}
