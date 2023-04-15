package com.example.mybackend0.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDetailsDTO {
    private int login_id;
    private String user_name;
    private String email;
    private String password;
    private String role;
}
