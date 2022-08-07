package com.vasanth.expensetracker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseManager {
	
	@PostMapping("/addExp")
	public void addExpense() {
		System.out.println("It came here");
	}
}
