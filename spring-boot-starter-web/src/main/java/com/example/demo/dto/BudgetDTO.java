package com.example.demo.dto;

public class BudgetDTO {
    private int id;
    private int userId;
    private String category;
    private double amount;
    private String month;

    // Default constructor
    public BudgetDTO() {}

    // Constructor
    public BudgetDTO(int id, int userId, String category, double amount, String month) {
        this.id = id;
        this.userId = userId;
        this.category = category;
        this.amount = amount;
        this.month = month;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getMonth() { return month; }
    public void setMonth(String month) { this.month = month; }
}
