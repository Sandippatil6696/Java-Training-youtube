package com.exceptionhandling;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to calculator ");

        System.out.print("enter your first number : ");
        int first = sc.nextInt();

        System.out.print("enter your Second  number : ");
        int second = sc.nextInt();

        try {

            int result = first / second;
            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("divide by zero , enter valid values ");
           
            System.out.printf("%s , enter valid values \n" , e.getMessage());

            System.out.printf("%s , get cuase \n" , e.getCause());

        }finally{
            System.out.println("finally block always executed whether exception handled or not");
        }

    }

}
