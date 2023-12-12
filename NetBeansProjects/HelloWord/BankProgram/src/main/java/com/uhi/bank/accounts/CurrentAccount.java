/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uhi.bank.accounts;

/**
 *
 * @author 15009199
 */
public class CurrentAccount extends BankAccount {
    // Static variable belongs to the class and not to object (instance)
    // Single copy to be shared by all instances of the class
    // A static variable can be accessed directly by the class name and doesn’t need any object
    // A final variable can only be initialized once
    static private final double INTEREST_RATE = 5;
    static private final double LIMIT = 0;
    
    public CurrentAccount() {
        
    }
    
    public CurrentAccount(double amount) {
        super(amount);
    }

    public static double getINTEREST_RATE() {
        return INTEREST_RATE;
    }
    
    @Override
    public void withdraw(double balance) {
        // Cannot allow a withdrawal of money if it will put the balance below the overdraft limit
        if ((getBalance() - balance) < LIMIT) {
            System.out.println("Cannot withdraw the requested amount");
        } else {
            super.withdraw(balance);
        }
        
    }
    
    @Override
    public void deposit(double balance) {
        double balanceWithInterest = balance + INTEREST_RATE;
        super.deposit(balanceWithInterest);
    }
    
    @Override
    public void displayBalance() {
        System.out.println("Current balance: "+super.getBalance());
    }

}
