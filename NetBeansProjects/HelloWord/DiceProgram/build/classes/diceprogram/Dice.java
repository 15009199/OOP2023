/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diceprogram;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author 15009199
 */
public class Dice {
    private static int noOfFaces;
    private int currentShownFace;
    public static final int MAX_FACES = 30;
    
    public Dice () {
        noOfFaces = 5;
        currentShownFace = 1;
    }
    
    public Dice (int noOfFaces, int currentShownFace) {
        Dice.noOfFaces = noOfFaces;
        this.currentShownFace = currentShownFace;
    }
    
    public int rollDice() {
        setCurrentShownFace(ThreadLocalRandom.current().nextInt(1, getNoOfFaces()));   
        return getCurrentShownFace();
    }

    public int getNoOfFaces() {
        return noOfFaces;
    }

    public static void setNoOfFaces(int noOfFaces) {
        Dice.noOfFaces = noOfFaces;
    }

    public int getCurrentShownFace() {
        return currentShownFace;
    }

    public void setCurrentShownFace(int currentShownFace) {
        this.currentShownFace = currentShownFace;
    }
    
    
}
