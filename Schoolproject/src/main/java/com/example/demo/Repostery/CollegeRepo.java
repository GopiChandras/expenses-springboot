package com.example.demo.Repostery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.College;

@Repository
public interface CollegeRepo  extends JpaRepository<College, Long> {

}
