package com.vasanth.expensetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vasanth.expensetracker.entities.ExpenseEntity;

public interface ExpenseRepo extends JpaRepository<ExpenseEntity,Long > {

}
