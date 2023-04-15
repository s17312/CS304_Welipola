package com.example.mybackend0.repo;

import com.example.mybackend0.entity.SiteEngineer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteEngineerRepo extends JpaRepository<SiteEngineer, Integer> {
}
