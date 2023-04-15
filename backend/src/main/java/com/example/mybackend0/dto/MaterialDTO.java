package com.example.mybackend0.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MaterialDTO {

    private int material_id;
    private String name;
    private String price_per_quantity;
    private String quantity;
    private String description;
}
