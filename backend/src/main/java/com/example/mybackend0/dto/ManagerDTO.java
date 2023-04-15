package com.example.mybackend0.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ManagerDTO {

    private Integer manager_id;
    private String name;
    private String number;
    private String email;
}
