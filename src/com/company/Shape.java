package com.company;

import java.awt.*;

public abstract class Shape {
    private Color color;
    private boolean isFilled;

    public Shape(Color color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }
}
