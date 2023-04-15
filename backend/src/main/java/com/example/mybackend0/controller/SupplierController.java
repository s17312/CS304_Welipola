package com.example.mybackend0.controller;

import com.example.mybackend0.dto.SupplierDTO;
import com.example.mybackend0.entity.Supplier;
import com.example.mybackend0.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "api/v6/mybackend0")
@CrossOrigin
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/getAllSuppliers")
    public List<Supplier> getSupplier(){
        return supplierService.getAllSuppliers();
    }

    @PostMapping("/saveSupplier")
    public SupplierDTO saveSupplier(@RequestBody SupplierDTO supplierDTO){
        return supplierService.saveSupplier(supplierDTO);
    }

    @PutMapping("/updateSupplier")
    public SupplierDTO updateSupplier(@RequestBody SupplierDTO supplierDTO){
        return supplierService.updateSupplier(supplierDTO);
    }

    @DeleteMapping("/deleteSupplier")
    public boolean deleteSupplier(@RequestBody SupplierDTO supplierDTO){
        return supplierService.deleteSupplier(supplierDTO);
    }
}
