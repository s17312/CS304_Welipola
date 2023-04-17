package com.example.mybackend0.repo;

import com.example.mybackend0.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OderRepo extends JpaRepository<Order, Integer> {
}
