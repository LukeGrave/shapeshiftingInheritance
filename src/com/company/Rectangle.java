package com.company;

import java.awt.*;
public class Rectangle extends Shape {

    private int width;
    private int length;

    public Rectangle(Color color, boolean isFilled, int width, int length) throws IllegalArgumentException {
        super(color, isFilled);
        try{
            if(width > 0 && length > 0){
                this.width = width;
                this.length = length;
            } else {
                throw new IllegalArgumentException("Width and Length must be higher than 0!");
            }
        } catch (IllegalArgumentException ex){
            System.out.println(ex + " --- unusable creation!!");
        }
    }

    @Override
    public void paintShape(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        int x = (int)(Math.random()*((600) + 1) + 100);   //number between 100 and 700 -- field is 800x800
        int y = (int)(Math.random()*((600) + 1) + 100);
        g2d.setColor(getColor());
        if (isFilled()==true){
            g2d.fillRect(x,y, length, width);
        } else {
            g2d.drawRect(x,y, length, width);
        }
    }

    @Override
    public boolean variablesExist() {
        if (this.width > 0 && this.length > 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return (width*2)+(length*2);
    }
}
