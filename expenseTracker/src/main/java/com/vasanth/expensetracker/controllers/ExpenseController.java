package com.vasanth.expensetracker.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vasanth.expensetracker.dto.ExpenseDTO;
import com.vasanth.expensetracker.entities.ExpenseEntity;
import com.vasanth.expensetracker.services.ExpenseServices;

@RestController
public class ExpenseController {
	
	@Autowired
	ExpenseServices expSrv;
	
	@PostMapping("/addExp")
	public void addExpense(@RequestBody ExpenseDTO exp) {
		
		ModelMapper modelMapper = new ModelMapper();
		ExpenseEntity expEnt = modelMapper.map(exp, ExpenseEntity.class);

		expSrv.addExpense(expEnt);
		
	}
}
