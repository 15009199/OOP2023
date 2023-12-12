/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uhi.bank.accounts;

/**
 *
 * @author 15009199
 */
public abstract class BankAccount {
    
    private double balance;
    
    BankAccount() {
        balance = 0D;
    }
    
    BankAccount(double amount) {
        balance = amount;
    }

    public double getBalance() {
        return balance;
    }
    
    public abstract void displayBalance();

    public void deposit(double balance) {
        this.balance += balance;
        System.out.println("Successful deposit, new balance: " + roundMoney(getBalance()));
    }
    
    public void withdraw(double balance) {
        this.balance -= balance;
        System.out.println("Successful withdraw, new balance: " + roundMoney(getBalance()));
    }
    
    public String roundMoney(double amount) {
        double roundOff = Math.round(amount*100)/100D; // https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
        return String.valueOf(roundOff); // https://www.digitalocean.com/community/tutorials/java-convert-double-to-string
    }
}
