package com.assesment6.CRM.Controllers;

import com.assesment6.CRM.Entities.ClientEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @PutMapping("/client")
    public ClientEntity createClient(){
        return null;
    }
}
