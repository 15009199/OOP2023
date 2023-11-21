/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapes;

/**
 *
 * @author 15009199
 */
public class Rectangle extends Shape {
    
    private String fillColour;
    private int height;
    private int width;
    
    public Rectangle(){
        super();
        fillColour = "#000000";
        height = 0;
        width = 0;
    }
    
    public Rectangle(int xCoord, int yCoord, int strokeThickness, String strokeColour, int height, int width, String fillColour){
        
        super(xCoord, yCoord, strokeThickness, strokeColour);
        this.height = height;
        this.width = width;
        this.fillColour = fillColour;
    }

    public String getFillColour() {
        return fillColour;
    }

    public void setFillColour(String fillColour) {
        this.fillColour = fillColour;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
        System.out.println("Fill colour: "+fillColour);
        System.out.println("Height: "+height);
        System.out.println("Width: "+width);
        
        super.draw();
    }
}
