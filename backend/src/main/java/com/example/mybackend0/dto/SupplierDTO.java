package com.example.mybackend0.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupplierDTO {
    private int supplier_id;
    private String name;
    private String email;
    private String phone_number;
    private String password_f_time;
    private String password_s_time;
}
