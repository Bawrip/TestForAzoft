package com.mazanov.alexander.service;

import com.mazanov.alexander.entities.Expense;
import com.mazanov.alexander.repository.ExpenseRepository;
import com.mazanov.alexander.repository.ExpenseRepositoryImpl;

import java.util.List;

public class ExpenseServiceImpl implements ExpenseService {
    private ExpenseRepository expenseRepository = new ExpenseRepositoryImpl();

    public void save(Expense expense) {
        if(expense!=null) {
            List<Expense> expenses = expenseRepository.getAll();
            if(!expenses.isEmpty()) {
                Expense lastOrder = expenses.get(expenses.size() - 1);
                expense.setId(lastOrder.getId()+1);
                expenseRepository.save(expense);
            }
        }
    }

    public void delete(Expense expense) {
        if(expense!=null) {
            expenseRepository.delete(expense);
        }
    }

    public List<Expense> getAll() {
        return expenseRepository.getAll();
    }

    public Expense getById(Long id) {
        if(id!=null) {
            return expenseRepository.getById(id);
        }
        return null;
    }
}
