package com.company;

import java.awt.*;

public abstract class Shape {

    private Color color;
    private boolean isFilled;

    public Shape(Color color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }


    public Color getColor() {
        return color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public abstract boolean variablesExist();
    public abstract void paintShape(Graphics g);
}
