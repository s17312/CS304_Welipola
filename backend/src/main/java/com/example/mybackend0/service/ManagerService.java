package com.example.mybackend0.service;

import com.example.mybackend0.dto.ManagerDTO;
import com.example.mybackend0.entity.Manager;
import com.example.mybackend0.repo.ManagerRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {

    @Autowired
    private ManagerRepo managerRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<ManagerDTO> getAllManagers() {
        List<Manager> managerList = managerRepo.findAll();
        return modelMapper.map(managerList, new TypeToken<List<ManagerDTO>>(){}.getType());
    }

    public ManagerDTO saveManagers(ManagerDTO managerDTO) {
        managerRepo.save(modelMapper.map(managerDTO, Manager.class));
        return managerDTO;
    }

    public ManagerDTO updateManager(ManagerDTO managerDTO) {
        managerRepo.save(modelMapper.map(managerDTO, Manager.class));
        return managerDTO;
    }

    public boolean deleteManager(ManagerDTO managerDTO) {
        managerRepo.delete(modelMapper.map(managerDTO, Manager.class));
        return true;
    }
}
