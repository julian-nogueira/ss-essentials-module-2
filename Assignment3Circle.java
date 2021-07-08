
package com.ss.jb.two;

public class Assignment3Circle implements Assignment3Shape{
    @Override
    public Double calculateArea(Double length, Double width){
        return Math.PI * length * width;
    }

    @Override
    public void display(Double area){
        System.out.printf("The area of the circle is %.2f.\n", area);
    }
}
