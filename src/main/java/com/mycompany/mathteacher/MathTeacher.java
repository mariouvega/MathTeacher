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
    
    public int n1, n2;

    public MathTeacher(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public static int addNumbers(int n1, int n2){
        return n1 + n2;
    }
    
    public static int subtractNumbers(int n1, int n2){
        return n1 - n2;
    }
    
    public static int multiplyNumbers(int n1, int n2){
        return n1 * n2;
    }
    
    public static int divideNumbers(int n1, int n2){
        return n1 / n2;
    }
    
    /**
     * @param args the command line arguments
     */
    
//    public static void idInt()
//        {
//            do {                
//                if (scan.hasNextInt()) {
//                    firstNum = scan.nextInt();
//                    isNum = true;
//                }else{
//                    isNum = false;
//                    scan.next();
//                }
//            } while (!isNum);
//        }
    
    public static void main(String[] args) {
        // Int verification
        
        
        // boolean to keep prgram running
        boolean run = true;
        Scanner scan = new Scanner(System.in);
        boolean isNum;
        int firstNum = 0;
        int secondNum = 0;
        
        System.out.println("Welcome to *Mental Math Practice* where you can test your addition, subtraction, multiplication, and division.");
        
        // Loop to keep running until user enter quit
        while (run) {
            System.out.println("Enter two integers:");
                 
            // Input verification, expecting an Int; for firstNum
            
            // Input verification, expecting an Int; for secondNum
            do {                
                if (scan.hasNextInt()) {
                    secondNum = scan.nextInt();
                    isNum = true;
                }else{
                    isNum = false;
                    scan.next();
                }
            } while (!isNum);
            
            System.out.println("Enter 1 to add the two numbers.");
            System.out.println("Enter 2 to subtract the second number from the first number.");
            System.out.println("Enter 3 to multiply the two numbers.");
            System.out.println("Enter 4 to divide the first number by the second number.");
        
            int userInput = 0;
            // Input verification, expecting an Int; for userInput for menu selection
            do {                
                if (scan.hasNextInt()) {
                    userInput = scan.nextInt();
                    isNum = true;
                }else{
                    isNum = false;
                    scan.next();
                }
            } while (!isNum);
            
            // Menu
            switch(userInput)
            {
                case 1:
                    System.out.println(MathTeacher.addNumbers(firstNum, secondNum));
                    break;

                case 2:
                    System.out.println(MathTeacher.subtractNumbers(firstNum, secondNum));
                    break;
                case 3:
                    System.out.println(MathTeacher.multiplyNumbers(firstNum, secondNum));
                    break;
                case 4:
                    System.out.println(MathTeacher.divideNumbers(firstNum, secondNum));
                    break;
            }
        
            System.out.println("Enter 'Quit' to end the program.");
        
            String quit = scan.next();
        
            if(quit.equalsIgnoreCase("quit"))
            {
                run = false;
            }
        }
        
    }
}
