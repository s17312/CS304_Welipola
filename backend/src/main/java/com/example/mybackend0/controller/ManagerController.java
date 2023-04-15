package com.example.mybackend0.controller;

import com.example.mybackend0.dto.ManagerDTO;
import com.example.mybackend0.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v6/mybackend0")
@CrossOrigin
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @GetMapping("/getManagers")
    public List<ManagerDTO> getManager(){
        return managerService.getAllManagers();
    }

    @PostMapping("/saveManager")
    public ManagerDTO saveManager(@RequestBody ManagerDTO managerDTO){
        return managerService.saveManagers(managerDTO);
    }

    @PutMapping("/updateManager")
    public ManagerDTO updateManager(@RequestBody ManagerDTO managerDTO){
        return managerService.updateManager(managerDTO);
    }

    @DeleteMapping("/deleteManager")
    public boolean deleteManager(@RequestBody ManagerDTO managerDTO){
        return managerService.deleteManager(managerDTO);
    }
}
