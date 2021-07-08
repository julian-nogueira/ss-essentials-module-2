
package com.ss.jb.two;

public class Assignment3Triangle implements Assignment3Shape{
    @Override
    public Double calculateArea(Double base, Double height){
        return base * height / 2;
    }

    @Override
    public Double calculateArea(Double radius){
        return 0.0;
    }

    @Override
    public void display(Double area){
        System.out.printf("The area of the triangle is %.2f.\n", area);
    }
}
