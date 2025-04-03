package com.example.demo.model;

public class Budget {
    private int id;
    private Integer userId;
    private String category;
    private double amount;
    private String month;

    // Default Constructor
    public Budget() {}

    // Parameterized Constructor
    public Budget(int id, Integer userId, String category, double amount, String month) {
        this.id = id;
        this.userId = userId;
        this.category = category;
        this.amount = amount;
        this.month = month;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Integer getUserId() { return userId; }
    public void setUserId(Integer userId) { this.userId = userId; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getMonth() { return month; }
    public void setMonth(String month) { this.month = month; }
}
