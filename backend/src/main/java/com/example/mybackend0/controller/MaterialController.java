package com.example.mybackend0.controller;

import com.example.mybackend0.dto.MaterialDTO;
import com.example.mybackend0.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v6/mybackend0")
@CrossOrigin
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping("/getMaterials")
    public List<MaterialDTO> getMaterials(){
        return materialService.getAllMaterials();
    }

    @PostMapping("/saveMaterial")
    public MaterialDTO saveMaterial(@RequestBody MaterialDTO materialDTO){
        return materialService.saveMaterial(materialDTO);
    }

    @PutMapping("/updateMaterial")
    public MaterialDTO updateMaterial(@RequestBody MaterialDTO materialDTO){
        return materialService.updateMaterial(materialDTO);
    }

    @DeleteMapping("/deleteMaterial")
    public boolean deleteMaterial(@RequestBody MaterialDTO materialDTO){
        return materialService.deleteMaterial(materialDTO);
    }
}
