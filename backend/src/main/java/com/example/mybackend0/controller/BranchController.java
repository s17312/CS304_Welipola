package com.example.mybackend0.controller;

import com.example.mybackend0.dto.BranchDTO;
import com.example.mybackend0.dto.BranchDetailsDto;
import com.example.mybackend0.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v6/mybackend")
@CrossOrigin("*")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @GetMapping("/getBranch")
    public List<BranchDTO> getBranch(){
        return branchService.getAllBranch();
    }

    @PostMapping("/saveBranch")
    public BranchDTO saveBranch(@RequestBody BranchDTO branchDTO){
        return branchService.saveBranch(branchDTO);
    }

    @PutMapping("/updateBranch")
    public BranchDTO updateBranch(@RequestBody BranchDTO branchDTO){
        return branchService.updateBranch(branchDTO);
    }

    @DeleteMapping("/deleteBranch")
    public boolean deleteBranch(@RequestBody BranchDTO branchDTO){
        return branchService.deleteBranch(branchDTO);
    }

    @GetMapping("/branchDetails")
    public List<BranchDetailsDto> getBranchDetailsDto(){
        return branchService.getAllBranchDetails();
    }

}
