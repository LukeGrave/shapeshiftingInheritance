package com.company;

import java.awt.*;
public class Circle extends Shape {

    private int radius;

    public Circle(Color color, boolean isFilled, int radius) throws IllegalArgumentException  {
        super(color, isFilled);
        try {
            if (radius > 0) {
                this.radius = radius;
            } else {
                throw new IllegalArgumentException("Radius must be higher than 0!");
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
        if (isFilled()==true){
            g2d.fillOval(x,y, radius, radius);
        } else {
            g2d.drawOval(x,y, radius, radius);
        }
        g2d.setColor(getColor());
    }

    @Override
    public boolean variablesExist() {
        if (this.radius > 0){
        return true;
        } else {
            return false;
        }
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

}
