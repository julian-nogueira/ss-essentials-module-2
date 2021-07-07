
package com.ss.jb.two;

import java.util.regex.*;
import java.util.Scanner;

/**
 * The Assignment1 class is used to sum numbers, where the amount of numbers is
 * specified in the sum function. User input is validated against a Regex
 * expression. After all numbers are provided, the sum is displayed as a float,
 * with precision of two decimal places.
 */
public class Assignment1{
    // Regex pattern. Look for 0 or 1 '-', 1 or more '\d', and 0 or 1 '.\d'.
    public static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    // Validate input.
    public static boolean isNumeric(StringBuilder strb){
        String str = strb.toString();
        if(str == null){
            return false;
        }
        return pattern.matcher(str).matches();
    }

    // Prompt the user for input.
    public static double promptUserForInput(){
        //
        Scanner scanner = new Scanner(System.in);
        Boolean isValidNumber = new Boolean(false);
        Double validNumber = new Double(0.0);
        String prompt = "\nEnter a number.";
        String errorMessage = "You did not enter a valid number.";
        isValidNumber = false;

        while(!isValidNumber){
            StringBuilder strb = new StringBuilder();
            System.out.println(prompt);
            strb.append(scanner.nextLine());
            if(isNumeric(strb)){
                isValidNumber = true;
                validNumber = Double.parseDouble(strb.toString());
            }else{
                isValidNumber = false;
                System.out.println(errorMessage);
            }
        }

        return validNumber;
    }

    // Add validated input.
    public static void sum(){
        Double sum = new Double(0.0);
        Double curr = new Double(0.0);
        Integer count = new Integer(0);
        String instructions = "\nEnter three numbers to see their sum. You will be prompted for one number at a time. The sum is displayed with a precision of two decimal places.";
        count = 3;

        System.out.println(instructions);
        for(int i = 0; i < count; i++){
            try{
                sum += promptUserForInput();
            }catch(Exception e){
                System.out.println("Invalid input. Expected a number.");
            }
        }
        System.out.printf("\nThe sum of your numbers is: %.2f.\n", sum);
    }

    public static void main(String[] args){
        Assignment1 obj = new Assignment1();
        obj.sum();
    }
}
