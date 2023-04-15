package com.example.mybackend0.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int material_id;
    private String name;
    private String price_per_quantity;
    private String quantity;
    private String description;

//    @ManyToOne(m = "material")
//    private Branch branch;

    @OneToOne(mappedBy = "material")
    private Supplier supplier;

}
