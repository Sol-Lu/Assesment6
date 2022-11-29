package com.assesment6.CRM.Controllers;

import com.assesment6.CRM.Entities.OportunityEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OportunityController {

    @GetMapping("/oportunity")
        public OportunityEntity createOportunity(){
            return null;
        }
}
