package com.example.mybackend0.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {


    private Integer client_id;
    private String firstname;
    private String lastname;
    private String email;
    private String password_f_time;
    private String password_s_time;
    private String address;
    private String phone_number;


}
