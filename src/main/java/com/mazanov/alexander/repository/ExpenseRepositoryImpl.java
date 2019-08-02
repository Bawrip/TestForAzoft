package com.mazanov.alexander.repository;

import com.mazanov.alexander.entities.Expense;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ExpenseRepositoryImpl implements ExpenseRepository{
    private List<Expense> expenses = new ArrayList<>();

    public ExpenseRepositoryImpl() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.ENGLISH);
        Expense expense1 = new Expense();
        expense1.setId(1L);
        expense1.setComment("comment1");
        expense1.setDescription("desc1");
        expense1.setSpendingAmount(312.1);
        expense1.setDate(LocalDate.parse("21.03.2019", formatter));

        Expense expense2 = new Expense();
        expense2.setId(2L);
        expense2.setComment("comment2");
        expense2.setDescription("desc2");
        expense2.setSpendingAmount(855.31);
        expense2.setDate(LocalDate.parse("17.04.2019", formatter));

        expenses.add(expense1);
        expenses.add(expense2);
    }

    public void save(Expense expense) {
        expenses.add(expense);
    }

    public void delete(Expense expense) {
        expenses.remove(expense);
    }

    public List<Expense> getAll() {
        return expenses;
    }

    public Expense getById(Long id) {
        return expenses.get(id.intValue());
    }
}
