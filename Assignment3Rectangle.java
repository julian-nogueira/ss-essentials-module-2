
package com.ss.jb.two;

public class Assignment3Rectangle implements Assignment3Shape{
    @Override
    public Double calculateArea(Double length, Double width){
        return length * width;
    }

    @Override
    public void display(Double area){
        System.out.printf("The area of the rectangle is %.2f.\n", area);
    }
}
