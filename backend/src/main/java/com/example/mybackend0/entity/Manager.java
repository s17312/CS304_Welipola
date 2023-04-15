package com.example.mybackend0.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer manager_id;
    private String name;
    private String number;
    private String email;

    @OneToOne(mappedBy = "manager")
    private LoginDetails loginDetails;

    @OneToOne(mappedBy = "manager")
    private Branch branch;
}
