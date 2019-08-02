package com.mazanov.alexander.service;

import com.mazanov.alexander.entities.Expense;

import java.util.List;

public interface ExpenseService {
    void save(Expense expense);

    void delete(Expense expense);

    List<Expense> getAll();

    Expense getById(Long id);
}
