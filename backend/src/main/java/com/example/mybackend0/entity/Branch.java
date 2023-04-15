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
public class Branch {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer branch_id;
   private String branch_name;
   private String location;
   private String phone_number;
   private String driver_name;
   private String driver_phone_number;

   @OneToMany(mappedBy = "branch")
   private List<Client> clientsId;

//   @OneToMany(cascade = CascadeType.ALL)
//   @JoinColumn(name = "material_id", referencedColumnName = "material_id")
//   private List<Material> material;

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "manager_id", referencedColumnName = "manager_id")
   private Manager manager;
}
