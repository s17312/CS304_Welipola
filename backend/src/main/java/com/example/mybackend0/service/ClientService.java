package com.example.mybackend0.service;

import com.example.mybackend0.dto.ClientDTO;
import com.example.mybackend0.entity.Client;
import com.example.mybackend0.repo.ClientRepo;
//import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepo clientRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<ClientDTO> getAllClient() {
        List<Client> clientList = clientRepo.findAll();
        return modelMapper.map(clientList, new TypeToken<List<ClientDTO>>(){}.getType());
    }

    public ClientDTO saveClient(ClientDTO clientDTO){
        clientRepo.save(modelMapper.map(clientDTO, Client.class));
        return clientDTO;
    }

    public ClientDTO updateClient(ClientDTO clientDTO) {
        clientRepo.save(modelMapper.map(clientDTO, Client.class));
        return clientDTO;
    }

    public boolean deleteClient(ClientDTO clientDTO) {
        clientRepo.delete(modelMapper.map(clientDTO,Client.class));
        return true;
    }


    public ClientDTO getClientByNameAndPassword(String firstname, String passwordftime) {
        Client client = clientRepo.getClientByNameAndPassword(firstname, passwordftime);
        return modelMapper.map(client, ClientDTO.class);
    }
}
