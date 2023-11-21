/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uhi.bank.accounts;

/**
 *
 * @author 15009199
 */
public class OverdraftAccount extends BankAccount {
    
    private double overdraftLimit;
    
    public OverdraftAccount() {
        overdraftLimit = 0;
    }
    
    public OverdraftAccount(double limit) {
        this.overdraftLimit = limit;
    }
    
    public OverdraftAccount(double amount, double limit) {
        super(amount);
        this.overdraftLimit = limit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    
    
}
