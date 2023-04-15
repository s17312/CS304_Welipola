package com.example.mybackend0.service;

import com.example.mybackend0.dto.SupplierDTO;
import com.example.mybackend0.entity.Supplier;
import com.example.mybackend0.repo.SupplierRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepo supplierRepo;

    @Autowired
    private ModelMapper modelMapper;


    public List<Supplier> getAllSuppliers() {
        List<Supplier> supplierList = supplierRepo.findAll();
        return modelMapper.map(supplierList, new TypeToken<List<SupplierDTO>>(){}.getType());
    }

    public SupplierDTO saveSupplier(SupplierDTO supplierDTO) {
        supplierRepo.save(modelMapper.map(supplierDTO, Supplier.class));
        return supplierDTO;
    }

    public SupplierDTO updateSupplier(SupplierDTO supplierDTO) {
        supplierRepo.save(modelMapper.map(supplierDTO, Supplier.class));
        return supplierDTO;
    }

    public boolean deleteSupplier(SupplierDTO supplierDTO) {
        supplierRepo.delete(modelMapper.map(supplierDTO, Supplier.class));
        return true;
    }
}
