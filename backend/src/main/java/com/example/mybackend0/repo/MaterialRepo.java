package com.example.mybackend0.repo;

import com.example.mybackend0.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepo extends JpaRepository<Material, Integer> {
}
