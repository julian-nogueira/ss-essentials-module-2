
package com.ss.jb.two;

public class Assignment3Circle implements Assignment3Shape{
    @Override
    public Double calculateArea(Double length, Double width){
        return 0.0;
    }

    @Override
    public Double calculateArea(Double radius){
        return Math.PI * (radius * radius);
    }

    @Override
    public void display(Double area){
        System.out.printf("The area of the circle is %.2f.\n", area);
    }
}
