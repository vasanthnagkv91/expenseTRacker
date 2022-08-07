package com.vasanth.expensetracker.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "expenses_detailed")
public class ExpenseEntity {

	@Column
	String ExpDesc;
	
	@Column
	int Amt;
	
	@Column
	String CatId;
	
	@Column
	int ExpId;
	
}
