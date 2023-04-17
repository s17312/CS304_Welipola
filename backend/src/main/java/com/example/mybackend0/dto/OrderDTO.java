package com.example.mybackend0.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private int oder_id;
    private String quantity;
    private String price_per_quantity;
    private String total;
    private String material_name;
    private String name;
    private String phone;
    private String address;
    private String city;
    private String closet_city;
    private String province;
    private String postal_code;
}
