package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.PamentEntity;

public interface PaymentRepository extends JpaRepository<PamentEntity, Integer> {

}
