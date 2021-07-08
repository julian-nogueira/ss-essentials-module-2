
package com.ss.jb.two;

/**
 * The Assignment3Shape class is an interface for the Rectangle, Circle, and
 * Triangle classes.
 */
public interface Assignment3Shape{
    public Double calculateArea(Double length, Double width);

    public Double calculateArea(Double radius);

    public void display(Double area);
}
