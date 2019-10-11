/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mathteacher;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class MathTeacher {
    
    public static int addNumbers(int n1, int n2){
        int result = n1 + n2;
        return result;
    }
    
    public static int subtractNumbers(int n1, int n2){
        int result = n1 - n2;
        return result;
    }
    
    public static int multiplyNumbers(int n1, int n2){
        int result = n1 * n2;
        return result;
    }
    
    public static int divideNumbers(int n1, int n2){
        int result = n2 / n1;
        return result;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to *Mental Math Practice* where you can test your addition, subtraction, multiplication, and division.");
        System.out.println("Enter two integers:");
        
        Scanner scan = new Scanner(System.in);
        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();
        
		System.out.println("Enter 1 to add the two numbers.");
		System.out.println("Enter 2 to subtract the second number from the first number.");
		System.out.println("Enter 3 to multiply the two numbers.");
		System.out.println("Enter 4 to divide the first number by the second number.");
        
        int userInput = scan.nextInt();
        
        switch(userInput)
        {
            case 1:
                addNumbers(firstNum,secondNum);
            case 2:
                subtractNumbers(firstNum,secondNum);
            case 3:
                multiplyNumbers(firstNum,secondNum);
            case 4:
                divideNumbers(firstNum,secondNum );
        }
        
        System.out.println("Enter 'Quit' to end the program.");
        
    }
}
