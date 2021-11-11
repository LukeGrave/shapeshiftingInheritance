package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static java.awt.Color.*;

public class Main extends JPanel {

    private static Graphics g;

    public static void main(String[] args) {

        List<Shape> allShapes = new ArrayList<>();

        Shape circle1 = new Circle(YELLOW, false, 30);
        Shape rectangle1 = new Rectangle(BLUE,false, 200,50);
        Shape square1 = new Square(MAGENTA,true,140);
        Shape circle2 = new Circle(BLUE, false, 80);
        Shape rectangle2 = new Rectangle(MAGENTA,true, 90,45);
        Shape square2 = new Square(YELLOW,false,90);
        Shape circle3 = new Circle(MAGENTA, true, 0);
        Shape rectangle3 = new Rectangle(YELLOW,false, -2,5);
        Shape square3 = new Square(BLUE,false,-8);

        allShapes.add(circle1);
        allShapes.add(rectangle1);
        allShapes.add(square1);
        allShapes.add(circle2);
        allShapes.add(rectangle2);
        allShapes.add(square2);
        allShapes.add(circle3);
        allShapes.add(rectangle3);
        allShapes.add(square3);

        List<Shape> workingShapes = new ArrayList<>();
        System.out.println();

        for (Shape shape : allShapes){
            if (shape.variablesExist() == true){
                if (shape instanceof Circle){
                    System.out.println("I'm a circle: ");
                } else if (shape instanceof Rectangle){
                    System.out.println("I'm a rectangle: ");
                } else if (shape instanceof  Square){
                    System.out.println("I'm a square: ");
                }
            System.out.println("I am " + shape.getColor().toString() + " --- filled: " + shape.isFilled());
            System.out.println("Area: " + shape.getArea() + " --- Perimeter: " + shape.getPerimeter() + "\n");
            workingShapes.add(shape);
            }
        }

        System.out.println("Amount of working Shapes: " + workingShapes.size());

        JFrame frame = new JFrame("Shapes");
        frame.setSize(800,800);
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setVisible(true);

        for (Shape shape:workingShapes){
            shape.paintShape(g);
        }
    }
//    TODO https://www.onlinetutorialspoint.com/java/how-to-draw-shapes-using-graphics.html

}
