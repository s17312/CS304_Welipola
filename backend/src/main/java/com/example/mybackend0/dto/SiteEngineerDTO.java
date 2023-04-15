package com.example.mybackend0.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SiteEngineerDTO {

    private int site_engineer_id;
    private String name;
    private String nic;
    private String phone_number;
}
