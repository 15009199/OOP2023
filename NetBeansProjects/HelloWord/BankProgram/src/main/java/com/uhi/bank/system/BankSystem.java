/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uhi.bank.system;
import com.uhi.bank.accounts.BankAccount;
import com.uhi.bank.accounts.CurrentAccount;
import com.uhi.bank.accounts.OverdraftAccount;
import java.util.Scanner;


/**
 *
 * @author 15009199
 */
public class BankSystem {
    public static void main(String[] args) {
        BankAccount account;
        int userChoice;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Select account type:");
        System.out.println("[1] Current Account");
        System.out.println("[2] Overdraft Account");
        userChoice = keyboard.nextInt();
        
        account = switch (userChoice) {
            case 1 -> new CurrentAccount();
            case 2 -> new OverdraftAccount();
            default -> throw new IllegalArgumentException("Unknown account type: "+userChoice);
        };
        
        account.displayBalance();
    }
}
