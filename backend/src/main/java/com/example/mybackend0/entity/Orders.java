package com.example.mybackend0.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private String quantity;
//    private String price_per_quantity;
//    private String total;
//    private String material_name;
//    private String name;
//    private String phone;
//    private String address;
//    private String city;
//    private String closet_city;
//    private String province;
//    private String postal_code;
}
