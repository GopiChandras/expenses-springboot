package com.example.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.ExpensesTypes;
import com.example.repository.ExpensesTypesRepository;

import com.example.service.ExpensesTypesService;

@Service
public class ExpensesTypesImpl implements ExpensesTypesService  {
    
	@Autowired
	public ExpensesTypesRepository expensesTypesRepository;
	
	@Override
	public ExpensesTypes addExpensesTypes(ExpensesTypes data) {
		
		return expensesTypesRepository.save(data);
	}

}
