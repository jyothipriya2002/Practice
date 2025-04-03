package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.BudgetDTO;
import com.example.demo.service.BudgetService;

@RestController
@RequestMapping("/budget")
public class BudgetController {
    
    @Autowired
    private BudgetService budgetService;

    // Fetch all budgets
    @GetMapping("/all")
    public List<BudgetDTO> getAllBudgets() {
        return budgetService.getAllBudgets();
    }

    // Fetch budget by ID
    @GetMapping("/{id}")
    public BudgetDTO getBudget(@PathVariable int id) {
        Optional<BudgetDTO> budget = budgetService.getBudgetById(id);
        return budget.orElse(null);
    }

    // Add multiple budgets
    @PostMapping
    public String addBudgets(@RequestBody List<BudgetDTO> budgets) {
        for (BudgetDTO budget : budgets) {
            if (budget.getAmount() <= 0 || budget.getUserId() == 0) {
                return "Invalid budget details!";
            }
        }
        budgetService.addBudgets(budgets);
        return "Budgets added successfully!";
    }

    // Update budget
    @PutMapping("/{id}")
    public String updateBudget(@PathVariable int id, @RequestBody BudgetDTO updatedBudget) {
        boolean isUpdated = budgetService.updateBudget(id, updatedBudget);
        return isUpdated ? "Budget updated successfully!" : "Budget not found!";
    }

    // Delete budget
    @DeleteMapping("/{id}")
    public String deleteBudget(@PathVariable int id) {
        boolean isDeleted = budgetService.deleteBudget(id);
        return isDeleted ? "Budget deleted successfully!" : "Budget not found!";
    }
}
