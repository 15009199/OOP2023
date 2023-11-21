/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uhi.bank.accounts;

/**
 *
 * @author 15009199
 */
public class BankAccount {
    
    private double balance;
    
    BankAccount() {
        
    }
    
    BankAccount(double amount) {
        
    }

    public double getBalance() {
        return balance;
    }
    
    public void displayBalance() {
        System.out.println("Balance: ");
    }

    public void deposit(double balance) {
        this.balance += balance;
    }
    
    public void withdraw(double balance) {
        this.balance -= balance;
    }
    
    public String roundMoney(double amount) {
        return null;
    }
}
