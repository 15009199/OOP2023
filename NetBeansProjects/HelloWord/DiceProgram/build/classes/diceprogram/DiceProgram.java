/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diceprogram;

import java.util.Set;

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
        
        Player[] player = new Player[2];
        
        for (int i = 0; i < player.length; i++) {
            player[i] = new Player();
        }
        
//        System.out.println(player[0].getPlayerDice().rollDice());
//        System.out.println(player[1].getPlayerDice().rollDice());
        
        //playerOne.setPlayerName("Adrian");
        
        //System.out.println(playerOne.getPlayerDice().rollDice());
        
//        Dice playerDice = new Dice(8, 1);
//        Dice player2Dice = new Dice(); // overwrites both dices to default values
//        
//        System.out.println(playerDice.getNoOfFaces());
//        System.out.println(player2Dice.getNoOfFaces());
//        
//        Dice.setNoOfFaces(12);
//        
//        System.out.println(playerDice.getNoOfFaces());
//        System.out.println(player2Dice.getNoOfFaces());
//        

        
        int playerOneDiceOne;
        int playerOneDiceTwo;
        int playerTwoDiceOne;
        int playerTwoDiceTwo;
        int count = 0;
        
        player[0].setPlayerDice();
        player[1].setPlayerDice();
        
        player[0].setPlayerName("Adrian");
        player[1].setPlayerName("Bobbbb");
        
        do {
            playerOneDiceOne = player[0].getPlayerDice()[0].rollDice();
            playerOneDiceTwo = player[0].getPlayerDice()[1].rollDice();
            
            playerTwoDiceOne = player[1].getPlayerDice()[0].rollDice();
            playerTwoDiceTwo = player[1].getPlayerDice()[1].rollDice();
            
            System.out.println(player[0].getPlayerName()+" has rolled ["+playerOneDiceOne+"] and ["+playerOneDiceTwo+"]");
            System.out.println(player[1].getPlayerName()+" has rolled ["+playerTwoDiceOne+"] and ["+playerTwoDiceTwo+"]");
            count++;
            
        }
        while (playerOneDiceOne != playerTwoDiceOne ||
               playerOneDiceOne != playerTwoDiceTwo ||
               playerOneDiceTwo != playerTwoDiceOne ||
               playerTwoDiceTwo != playerTwoDiceTwo );

        System.out.println("It took "+count+" rolls!");
    }
    
}
