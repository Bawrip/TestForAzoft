package com.mazanov.alexander.controller;

import com.mazanov.alexander.entities.Expense;
import com.mazanov.alexander.service.ExpenseService;
import com.mazanov.alexander.service.ExpenseServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Controller
public class ExpenseController {
    private ExpenseService expenseService = new ExpenseServiceImpl();

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String getExpensePage(Model model) {
        List<Expense> expenses = expenseService.getAll();
        model.addAttribute("expenseList", expenses);
        return "expense";
    }

    @RequestMapping(value = "/add-new-expense", method=RequestMethod.GET)
    public String addNewExpensePage() {
        return "addNewExpense";
    }

    @RequestMapping(value="/add-new-expense", method=RequestMethod.POST)
    public String addNewExpense(@RequestParam(value="description") String description,
                                @RequestParam(value="spendingAmount") Double spendingAmount,
                                @RequestParam(value="comment") String comment) {
        Expense expense = new Expense();
        expense.setDescription(description);
        expense.setSpendingAmount(spendingAmount);
        expense.setComment(comment);
        expense.setTime(null);
        expense.setDate(null);

        expenseService.save(expense);
        return "redirect:/";
    }

    @RequestMapping(value="delete/{id}", method=RequestMethod.GET)
    public String deleteItem(@PathVariable Long id) {
        Expense expense = expenseService.getById(id);
        expenseService.delete(expense);
        return "redirect:/";
    }
}
