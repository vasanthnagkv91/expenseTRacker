package com.vasanth.expensetracker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data

public class ExpenseDTO {
	
	@JsonProperty(value = "Description")
	private String Dsc;
	
	private String Cat;
	
	private int Amt;
	
	
}
