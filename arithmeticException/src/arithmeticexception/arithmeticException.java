/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticexception;

import java.util.Scanner;

/**
 *
 * @author Nasywa Davina
 */
public class arithmeticException {
    public static void main(String[] args) {
        //int a=100;
    //  System.out.println ("Enter the value for b");
        Scanner console = new Scanner (System.in);
    // int b = console.nextInt();
    
        System.out.println("Enter the value for c");
    //Exception Handling
        try{
    int c = console.nextInt ();
    int res=c/1;
    // 10/(b-c);
        System.out.println("The result is "+res);
    }
    catch (java.lang.ArithmeticException exception_message){
            System.out.println("adalah "+exception_message);
    }
    }
}

    