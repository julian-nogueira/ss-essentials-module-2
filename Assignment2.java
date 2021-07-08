
package com.ss.jb.two;

import java.lang.Math;

/**
 * The Assignment2 class generates a 2D array with a specified number of rows
 * and columns. The array is then filled with random integers. A separate
 * function determines which index position contains the maximum integer value,
 * such that the indices can be returned accordingly. If the maximum integer is
 * repeated in the array, the function returns the first instance.
 */
public class Assignment2{
    // Construct a 2D array with the specified number of rows and columns.
    public static Integer[][] createIntArray(Integer rowSize, Integer colSize){
        Integer[][] arr = new Integer[rowSize][colSize];
        Integer min = new Integer(1);
        Integer max = new Integer(100);
        Integer range = new Integer(max - min + 1);

        for(int row = 0; row < rowSize; row++){
            for(int col = 0; col < colSize; col++){
                arr[row][col] = (int)(Math.random() * range) + min;
            }
        }

        return arr;
    }

    // Find the maximum integer in the array.
    public static Integer[] findMaxInteger(Integer[][] arr, Integer rowSize, Integer colSize){
        Integer rowIndex = new Integer(0);
        Integer colIndex = new Integer(0);
        Integer maxInteger = new Integer(arr[0][0]);
        Integer curr = maxInteger;
        Integer[] indices = new Integer[2];

        for(int row = 0; row < rowSize; row++){
            for(int col = 0; col < colSize; col++){
                curr = arr[row][col];
                if(curr > maxInteger){
                    rowIndex = row;
                    colIndex = col;
                    maxInteger = curr;
                }
            }
        }

        indices[0] = rowIndex;
        indices[1] = colIndex;
        return indices;
    }

    // Return the index position of the maximum integer.
    public static void main(String[] args){
        Integer rowSize = new Integer(4);
        Integer colSize = new Integer(6);
        Integer rowIndex = new Integer(0);
        Integer colIndex = new Integer(0);
        Integer maxInteger = new Integer(0);

        Assignment2 obj = new Assignment2();
        Integer[][] arr = obj.createIntArray(rowSize, colSize);
        Integer[] maxIntIndices = obj.findMaxInteger(arr, rowSize, colSize);
        rowIndex = maxIntIndices[0];
        colIndex = maxIntIndices[1];
        maxInteger = arr[rowIndex][colIndex];

        System.out.println("\nRandomly Generated Integer Array");
        System.out.println("--------------------------------");
        for(int row = 0; row < rowSize; row++){
            for(int col = 0; col < colSize; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("\n");
        System.out.println("Maximum Integer");
        System.out.println("---------------");
        System.out.println("Row    :  " + (rowIndex + 1));
        System.out.println("Column :  " + (colIndex + 1));
        System.out.println("Value  :  " + maxInteger);
    }
}
