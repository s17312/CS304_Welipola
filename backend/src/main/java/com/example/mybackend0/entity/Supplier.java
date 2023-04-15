package com.example.mybackend0.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="supplier")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int supplier_id;
    private String name;
    private String email;
    private String phone_number;
    private String password_f_time;
    private String password_s_time;


    @OneToOne(mappedBy = "supplier")
    private LoginDetails loginDetails;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "material_id", referencedColumnName = "material_id")
    private Material material;
}
