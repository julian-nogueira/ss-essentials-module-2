
package com.ss.jb.two;

/**
 * The Assignment3Main class is a driver for testing the Shape classes.
 */
public class Assignment3Main{
    public static void main(String[] args){
        Assignment3Rectangle rectangle = new Assignment3Rectangle();
        Double area = new Double(0);
        area = rectangle.calculateArea(4.0, 6.0);
        rectangle.display(area);

        Assignment3Circle circle = new Assignment3Circle();
        area = circle.calculateArea(3.0, 3.0);
        circle.display(area);

        Assignment3Triangle triangle = new Assignment3Triangle();
        area = triangle.calculateArea(4.0, 6.0);
        triangle.display(area);
    }
}
