package com.vasanth.expensetracker.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.vasanth.expensetracker.dto.ExpenseDTO;
import com.vasanth.expensetracker.repositories.ExpenseRepo;

public class ExpenseServices {
	
	@Autowired
	ExpenseRepo expRepo;
	
	public ExpenseServices() {

	}
	
	public String addExpense(ExpenseDTO exp) {
		
		
		expRepo.save(exp);
		return "Expense Added";
	}

}
