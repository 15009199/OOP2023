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
    static private final double INTEREST_RATE = 0;
    
    public CurrentAccount() {
        
    }
    
    public CurrentAccount(double amount) {
        super(amount);
    }

    public static double getINTEREST_RATE() {
        return INTEREST_RATE;
    }

}
