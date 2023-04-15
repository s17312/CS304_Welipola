package com.example.mybackend0.controller;

import com.example.mybackend0.dto.LoginDetailsDTO;
import com.example.mybackend0.service.LogingDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "api/v6/mybackend0")
@CrossOrigin
public class LoginDetailsController {

    @Autowired
    private LogingDetailsService logingDetailsService;

    @GetMapping("/getLoginDetails")
    public List<LoginDetailsDTO>  getLoginDetails(){
        return logingDetailsService.getAllLoginDetails();
    }

    @PostMapping("/saveLoginDetails")
    public LoginDetailsDTO saveLoginDetails(@RequestBody LoginDetailsDTO loginDetailsDTO){
        return logingDetailsService.saveLoginDetails(loginDetailsDTO);
    }

    @PutMapping("/updateLoginDetails")
    public LoginDetailsDTO updateLoginDetails(@RequestBody LoginDetailsDTO loginDetailsDTO){
        return logingDetailsService.updateLoginDetails(loginDetailsDTO);
    }

    @DeleteMapping("/deleteLoginDetails")
    public boolean deleteLoginDetails(@RequestBody LoginDetailsDTO loginDetailsDTO){
        return logingDetailsService.deleteLogiDetails(loginDetailsDTO);
    }

}
