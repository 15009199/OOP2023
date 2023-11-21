/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapes;

/**
 *
 * @author 15009199
 */
public class Main {
    public static void main(String[] args) {
        
        Rectangle Rectangle;
//        
//        theShape = new Shape(12, 23, 2, "#00FF00");
//        theShape.draw();

        Rectangle = new Rectangle(10, 12, 2, "#00FF00", 100, 150, "#F0F0F0");
        
//        Rectangle.setxCoord(10);
//        Rectangle.setyCoord(12);
//        Rectangle.setStrokeThickness(2);
//        Rectangle.setStrokeColour("#00FF00");
//        
//        Rectangle.setFillColour("#F0F0F0");
        
        Rectangle.draw();
        
        
    }
}
