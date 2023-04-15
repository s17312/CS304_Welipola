package com.example.mybackend0.service;

import com.example.mybackend0.dto.BranchDTO;
import com.example.mybackend0.dto.BranchDetailsDto;
import com.example.mybackend0.entity.Branch;
import com.example.mybackend0.repo.BranchRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BranchService {
    @Autowired
    private BranchRepo branchRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<BranchDTO> getAllBranch() {
        List<Branch> branchList = branchRepo.findAll();
        return modelMapper.map(branchList, new TypeToken<List<BranchDTO>>(){}.getType());
    }

    public List<BranchDetailsDto> getAllBranchDetails(){
        List<Branch> branchList = branchRepo.findAll();

        List<BranchDetailsDto> branchDTOList = new ArrayList<>();

        branchList.forEach(b->{
            branchDTOList.add(BranchDetailsDto.builder().branch_id(b.getBranch_id()).branch_name(b.getBranch_name()).location(b.getLocation()).build());
        });
        return branchDTOList;
    }
    public BranchDTO saveBranch(BranchDTO branchDTO) {
        branchRepo.save(modelMapper.map(branchDTO, Branch.class)) ;
        return branchDTO;
    }

    public BranchDTO updateBranch(BranchDTO branchDTO) {
        branchRepo.save(modelMapper.map(branchDTO, Branch.class));
        return branchDTO;
    }

    public boolean deleteBranch(BranchDTO branchDTO) {
        branchRepo.delete(modelMapper.map(branchDTO, Branch.class));
        return true;
    }
}
