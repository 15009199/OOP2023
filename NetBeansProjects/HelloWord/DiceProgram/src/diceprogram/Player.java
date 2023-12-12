/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diceprogram;

/**
 *
 * @author 15009199
 */
public class Player {
    private String playerName;
    private boolean hasWon;
    private Dice[] playerDice;
    
    Player() {
       playerName = "";
       hasWon = false;
       playerDice = new Dice[2];
    }
    

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public boolean isHasWon() {
        return hasWon;
    }

    public void setHasWon(boolean hasWon) {
        this.hasWon = hasWon;
    }
    
    

//    public Dice getPlayerDice() {
//        return playerDice;
//    }
//
//    public void setPlayerDice(Dice playerDice) {
//        this.playerDice = playerDice;
//    }

    public Dice[] getPlayerDice() {
        return playerDice;
    }

    public void setPlayerDice(Dice[] playerDice) {
        this.playerDice = playerDice;
    }
    
    public void setPlayerDice() {
        for (int i = 0; i < playerDice.length; i++) {
            playerDice[i] = new Dice();
        }
    }
}
