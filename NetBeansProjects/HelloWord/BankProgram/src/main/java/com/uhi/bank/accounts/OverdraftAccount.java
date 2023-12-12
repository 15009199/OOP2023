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
    
    @Override
    public void withdraw(double balance) {
        // Cannot allow a withdrawal of money if it will put the balance below the overdraft limit
        if ((getBalance() - balance) < getOverdraftLimit()) {
            System.out.println("Cannot withdraw the requested amount");
        } else {
            super.withdraw(balance);
        }
        
    }
    
    @Override
    public void displayBalance() {
        System.out.println("Overdraft balance: "+super.getBalance());
    }
}
