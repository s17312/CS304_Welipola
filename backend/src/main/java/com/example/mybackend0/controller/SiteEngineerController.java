package com.example.mybackend0.controller;

import com.example.mybackend0.dto.SiteEngineerDTO;
import com.example.mybackend0.service.SiteEngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v6/mybackend0")
@CrossOrigin
public class SiteEngineerController {

    @Autowired
    private SiteEngineerService siteEngineerService;

    @GetMapping("/getSiteEngineer")
    public List<SiteEngineerDTO> getSiteEngineer(){
        return siteEngineerService.getAllSiteEngineers();
    }

    @PostMapping("/saveSiteEngineer")
    public SiteEngineerDTO saveSiteEngineer(@RequestBody SiteEngineerDTO siteEngineerDTO){
        return siteEngineerService.saveSiteEngineer(siteEngineerDTO);
    }

    @PutMapping("/updateSiteEngineer")
    public SiteEngineerDTO updateSiteEngineer(@RequestBody SiteEngineerDTO siteEngineerDTO){
        return siteEngineerService.updateSiteEngineer(siteEngineerDTO);
    }

    @DeleteMapping("/deleteSiteEngineer")
    public boolean deleteSiteEngineer(@RequestBody SiteEngineerDTO siteEngineerDTO){
        return siteEngineerService.deleteSiteEngineer(siteEngineerDTO);
    }

}
