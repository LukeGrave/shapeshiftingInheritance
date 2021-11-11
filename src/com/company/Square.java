package com.company;

import java.awt.*;

public class Square extends Shape {

    private int length;

    public Square(Color color, boolean isFilled, int length) throws IllegalArgumentException  {
        super(color, isFilled);
        try{
            if(length > 0){
                this.length = length;
            } else {
                throw new IllegalArgumentException("Length must be higher than 0!");
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
        if (isFilled()==true) {
            g2d.fillRect(x, y, length, length);
        } else {
            g2d.drawRect(x, y, length, length);
        }
        g2d.setColor(getColor());
    }

    @Override
    public boolean variablesExist() {
        if (this.length > 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getArea() {
        return length*length;
    }

    @Override
    public double getPerimeter() {
        return length*4;
    }
}
