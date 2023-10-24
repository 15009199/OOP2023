/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diceprogram;

/**
 *
 * @author 15009199
 */
public class DiceProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dice playerDice = new Dice(8, 1);
        Dice player2Dice = new Dice(); // overwrites both dices to default values
        
        System.out.println(playerDice.getNoOfFaces());
        System.out.println(player2Dice.getNoOfFaces());
        
        Dice.setNoOfFaces(12);
        
        System.out.println(playerDice.getNoOfFaces());
        System.out.println(player2Dice.getNoOfFaces());
        
        int player1;
        int player2;
        
        do {
            player1 = playerDice.rollDice();
            player2 = player2Dice.rollDice();
            System.out.println("You have rolled "+player1);
            System.out.println("You have rolled "+player2);
        }
        while (player1 != player2);

    }
    
}
