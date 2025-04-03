package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.dto.BudgetDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BudgetService {
    private final List<BudgetDTO> budgetList = new ArrayList<>();

    // Get all budgets
    public List<BudgetDTO> getAllBudgets() {
        return budgetList;
    }

    // Get a budget by its ID
    public Optional<BudgetDTO> getBudgetById(int id) {
        return budgetList.stream().filter(b -> b.getId() == id).findFirst();
    }

    // Add budgets (Bulk Insert)
    public void addBudgets(List<BudgetDTO> budgets) {
        budgetList.addAll(budgets);
    }

    // Update budget
    public boolean updateBudget(int id, BudgetDTO updatedBudget) {
        for (int i = 0; i < budgetList.size(); i++) {
            if (budgetList.get(i).getId() == id) {
                budgetList.set(i, updatedBudget);
                return true;
            }
        }
        return false;
    }

    // Delete budget
    public boolean deleteBudget(int id) {
        return budgetList.removeIf(b -> b.getId() == id);
    }
}
