package com.example.mybackend0.service;

import com.example.mybackend0.dto.MaterialDTO;
import com.example.mybackend0.entity.Material;
import com.example.mybackend0.repo.MaterialRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.Character.getType;

@Service
public class MaterialService {

    @Autowired
    private MaterialRepo materialRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<MaterialDTO> getAllMaterials() {
        List<Material> materialList= materialRepo.findAll();
        return modelMapper.map(materialList, new TypeToken<List<MaterialDTO>>(){}.getType());
    }

    public MaterialDTO saveMaterial(MaterialDTO materialDTO) {
        materialRepo.save(modelMapper.map(materialDTO, Material.class));
        return materialDTO;
    }

    public MaterialDTO updateMaterial(MaterialDTO materialDTO) {
        materialRepo.save(modelMapper.map(materialDTO, Material.class));
        return materialDTO;
    }

    public boolean deleteMaterial(MaterialDTO materialDTO) {
        materialRepo.delete(modelMapper.map(materialDTO, Material.class));
        return  true;
    }
}
