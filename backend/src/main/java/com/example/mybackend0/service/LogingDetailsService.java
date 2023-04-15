package com.example.mybackend0.service;

import com.example.mybackend0.dto.LoginDetailsDTO;
import com.example.mybackend0.entity.LoginDetails;
import com.example.mybackend0.repo.LoginDetailsRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class LogingDetailsService {
    @Autowired
    private LoginDetailsRepo loginDetailsRepo;

    @Autowired
    private ModelMapper modelMapper;


    public List<LoginDetailsDTO> getAllLoginDetails() {
        List<LoginDetails> loginDetailsList = loginDetailsRepo.findAll();
        return modelMapper.map(loginDetailsList, new TypeToken<List<LoginDetailsDTO>>(){}.getType());
    }

    public LoginDetailsDTO saveLoginDetails(LoginDetailsDTO loginDetailsDTO) {
        loginDetailsRepo.save(modelMapper.map(loginDetailsRepo, LoginDetails.class));
        return loginDetailsDTO;
    }

    public LoginDetailsDTO updateLoginDetails(LoginDetailsDTO loginDetailsDTO) {
        loginDetailsRepo.save(modelMapper.map(loginDetailsDTO, LoginDetails.class));
        return loginDetailsDTO;
    }

    public boolean deleteLogiDetails(LoginDetailsDTO loginDetailsDTO) {
        loginDetailsRepo.delete(modelMapper.map(loginDetailsDTO, LoginDetails.class));
        return true;
    }
}
