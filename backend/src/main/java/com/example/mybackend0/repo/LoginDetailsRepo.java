package com.example.mybackend0.repo;

import com.example.mybackend0.entity.LoginDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginDetailsRepo extends JpaRepository<LoginDetails, Integer> {
}
