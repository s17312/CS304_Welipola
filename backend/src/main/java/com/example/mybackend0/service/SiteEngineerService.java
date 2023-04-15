package com.example.mybackend0.service;

import com.example.mybackend0.dto.SiteEngineerDTO;
import com.example.mybackend0.entity.SiteEngineer;
import com.example.mybackend0.repo.SiteEngineerRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiteEngineerService {

    @Autowired
    private SiteEngineerRepo siteEngineerRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<SiteEngineerDTO> getAllSiteEngineers() {
        List<SiteEngineer> siteEngineerList = siteEngineerRepo.findAll();
        return modelMapper.map(siteEngineerList, new TypeToken<List<SiteEngineerDTO>>(){}.getRawType());
    }

    public SiteEngineerDTO saveSiteEngineer(SiteEngineerDTO siteEngineerDTO) {
        siteEngineerRepo.save(modelMapper.map(siteEngineerDTO, SiteEngineer.class));
        return siteEngineerDTO;
    }

    public SiteEngineerDTO updateSiteEngineer(SiteEngineerDTO siteEngineerDTO) {
        siteEngineerRepo.save(modelMapper.map(siteEngineerDTO, SiteEngineer.class));
        return siteEngineerDTO;
    }

    public boolean deleteSiteEngineer(SiteEngineerDTO siteEngineerDTO) {
        siteEngineerRepo.delete(modelMapper.map(siteEngineerDTO, SiteEngineer.class));
        return true;
    }
}
