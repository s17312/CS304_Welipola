package com.example.mybackend0.repo;

import com.example.mybackend0.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface ManagerRepo extends JpaRepository<Manager, Integer> {


}
