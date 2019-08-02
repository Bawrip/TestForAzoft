package com.mazanov.alexander.repository;

import com.mazanov.alexander.entities.Expense;

import java.util.List;

public interface ExpenseRepository {
    void save(Expense expense);

    void delete(Expense expense);

    List<Expense> getAll();

    Expense getById(Long id);
}
