/*
 * Author:
 * Project Name:
 * Version:
 * Date:
 * Class: 
 */
package com.mycompany.shapes;

public class Shape {
    
    private int xCoord;
    private int yCoord;
    private int strokeThickness;
    private String strokeColour;
    
    public Shape(){
        strokeColour = "#000000";
        strokeThickness = 0;
        xCoord = 0;
        yCoord = 0;
    }
    
    public Shape(int xCoord, int yCoord, int strokeThickness, String strokeColour) {
        this.strokeColour = strokeColour;
        this.strokeThickness = strokeThickness;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public int getStrokeThickness() {
        return strokeThickness;
    }

    public void setStrokeThickness(int strokeThickness) {
        this.strokeThickness = strokeThickness;
    }

    public String getStrokeColour() {
        return strokeColour;
    }

    public void setStrokeColour(String strokeColour) {
        this.strokeColour = strokeColour;
    }
    
    public void draw() {
        System.out.println("Stroke colour is: "+strokeColour);
        System.out.println("Stroke thickness is: "+strokeThickness);
        System.out.println("X coord is: "+xCoord);
        System.out.println("Y coord is: "+yCoord);
    }
}
