package com.Assesment6.CRM.Controllers;

import com.Assesment6.CRM.Entities.OportunityEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class OportunityController {

    @PutMapping("/oportunity")
    public OportunityEntity createOportunity(){
        OportunityEntity newOportunity = new OportunityEntity();
        newOportunity.setEntityID();
        newOportunity.setContactList();
        newOportunity.setStartDate();
        newOportunity.setProjectID();
        newOportunity.setProjectDescription();
        newOportunity.setProposals();

        return newOportunity;
    }

    @GetMapping("/oportunity")
    public List<OportunityEntity> show(){
        return null;
    }
}
