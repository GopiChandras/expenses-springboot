package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.ExpensesTypes;
import com.example.repository.ExpensesTypesRepository;
import com.example.service.ExpensesTypesService;

@RestController
@RequestMapping("/expty")
public class ExpensesTypesController {

	@Autowired
	public ExpensesTypesRepository expensesTypesRepository;
	
	@Autowired
	public ExpensesTypesService expensesTypesService;
	
	@PostMapping("/post1")
	public ExpensesTypes getExpensesTypes(@RequestBody ExpensesTypes data) {
		return this.expensesTypesService.addExpensesTypes(data);
	}
}
 