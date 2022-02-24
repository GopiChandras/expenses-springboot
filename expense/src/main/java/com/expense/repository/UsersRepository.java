package com.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expense.models.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

}
