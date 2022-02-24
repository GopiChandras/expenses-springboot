package com.expense.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expense.models.Expenses;
@Repository
public interface ExpenseRepository  extends JpaRepository<Expenses, Long>{

}
