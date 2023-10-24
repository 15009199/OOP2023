/*======================================================
* file: HelloWorld.java
* Author: Adrian Lawrynowicz
* Created: 12/09/2023
* Last Modified: 12/09/2023
* Notes: A quick example of how to output to the screen
========================================================*/
package helloworld;

import java.util.Scanner;

/**
 *
 * @author 15009199
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        
        HelloWorld File = new HelloWorld();
        
        File.customNotify();
        StudentTask1();
        StudentTask2();
        StudentTask3();
        
        
       
        
        
        
        
        
    }
    
    public static void customNotify() {
        System.out.println("This is HelloWorld method");
    }
    
    public static void StudentTask1() {
        String manufacturer, operator = "";
        int model, year, capacity, engines = 0;
        double wingspan, cost = 0.0;
        char status = 'G';
        
        manufacturer = "Boeing";
        model = 747400;
        operator = "British Airways";
        wingspan = 5.2;
        year = 1989;
        cost = 266.6;
        capacity = 660;
        engines = 4;
        
        System.out.println("Manufacturer: "+manufacturer);
        System.out.println("Model: "+model);
        System.out.println("Operator: "+operator);
        System.out.println("Wingspan: "+wingspan+" meters");
        System.out.println("Year of manufacture: "+year);
        System.out.println("Cost in millions: "+cost);
        System.out.println("Max capacity: "+capacity);
        System.out.println("Engines: "+engines);
        System.out.println("Status: "+status);
        
    }
    
    public static void StudentTask2() {
        int square = 0;
        double root = 0;
        
        for (int i = 1; i < 10; i++) {
            square = i*i;
            root = java.lang.Math.sqrt(i);
            
            System.out.println("The number is "+i+", its square is: "+square+" and its root is: "+root);
        }
    }
    
    public static void StudentTask3() {
        Scanner kboard = new Scanner(System.in);
        String choice = "";
        int card1,card2,newCard,total = 0;
        
        card1 = 5 + (int)(Math.random() * ((10 - 5) + 1));
        card2 = 5 + (int)(Math.random() * ((10 - 5) + 1));
        total = card1 + card2;
        
        System.out.println("Card 1: "+card1);
        System.out.println("Card 2: "+card2);
        
        System.out.println("Do you wish to draw a card (y/n)?");
        choice = kboard.next();
        while (choice.equalsIgnoreCase("y")) {
            newCard = 5 + (int)(Math.random() * ((10 - 5) + 1));
            System.out.println("New card: "+newCard);
            total += newCard;
            
            System.out.println("Do you wish to draw a card (y/n)?");
            choice = kboard.next();
        }
        if (total >19 && total <= 21) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost");
        }
    }

    
}
