package com.Assesment6.CRM.Controllers;

import com.Assesment6.CRM.Entities.ClientEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ClientController {
    @PutMapping("/client")
    public ClientEntity create(){
        return null;
    }

    @GetMapping("/client")
    public List<ClientEntity> show(){
        return null;
    }
}
