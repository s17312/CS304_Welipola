package com.example.mybackend0.controller;

import com.example.mybackend0.dto.ClientDTO;
import com.example.mybackend0.dto.LoginRequest;
import com.example.mybackend0.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v6/mybackend0")
@CrossOrigin
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/getClient")
    public List<ClientDTO> getClient(){
        return clientService.getAllClient();
    }

    @PostMapping("/saveClient")
    public ClientDTO saveClient(@RequestBody ClientDTO clientDTO){
        return clientService.saveClient(clientDTO);
    }

    @PutMapping("/updateClient")
    public ClientDTO updateClient(@RequestBody ClientDTO clientDTO){
        return clientService.updateClient(clientDTO);
    }

    @DeleteMapping("/deleteClient")
    public boolean deleteClient(@RequestBody ClientDTO clientDTO){
        return clientService.deleteClient(clientDTO);
    }

    @GetMapping("/getClientByNameAndPassword/{firstName}/{passwordftime}")
    public ClientDTO getClientByNameAndPassword(@PathVariable String firstname, @PathVariable String passwordftime){
        return clientService.getClientByNameAndPassword(firstname, passwordftime);
    }

    @GetMapping("/getclientbyclientid/{clientId}")
    public ClientDTO getClientByClientId(@PathVariable int clientId){
        return clientService.getClientByClientId(clientId);
    }

    @PostMapping("/client/login")
    public ClientDTO clientLogin(@RequestBody LoginRequest data){
        return clientService.clientLogin(data);
    }
}
