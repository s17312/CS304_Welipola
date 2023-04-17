package com.example.mybackend0.repo;

import com.example.mybackend0.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<Client, Integer> {
    @Query(value = "SELECT * FROM CLIENT WHERE FIRSTNAME = ?1 AND PASSWORDFTIME = ?2", nativeQuery = true)
    Client getClientByNameAndPassword(String firstname, String passwordftime);

    @Query(value = "SELECT * FROM CLIENT WHERE email = ?1 AND PASSWORD_F_TIME = ?2", nativeQuery = true)
    Client clientLogin(String email, String password);
}
