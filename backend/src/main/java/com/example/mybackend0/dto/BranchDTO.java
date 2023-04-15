package com.example.mybackend0.dto;

//import jakarta.persistence.Column;
//import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BranchDTO {

    private Integer branch_id;
    private String branch_name;
    private String location;
    private String phone_number;
    private String driver_name;
    private String driver_phone_number;
}
