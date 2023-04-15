package com.example.mybackend0.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SiteEngineer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int site_engineer_id;
    private String name;
    private String nic;
    private String phone_number;

    @OneToOne(mappedBy = "siteEngineer")
    private Client client;
}
