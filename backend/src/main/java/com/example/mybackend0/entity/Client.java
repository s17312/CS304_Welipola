package com.example.mybackend0.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int client_id;
    private String firstname;
    private String lastname;
    private String email;
    private String password_f_time;
    private String password_s_time;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "branch_id",referencedColumnName = "branch_id")
    private Branch branch;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "site_engineer_id", referencedColumnName = "site_engineer_id")
    private SiteEngineer siteEngineer;

    @OneToOne(mappedBy = "client")
    private LoginDetails loginDetails;
}
