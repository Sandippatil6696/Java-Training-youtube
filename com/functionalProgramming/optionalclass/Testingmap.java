package com.functionalProgramming.optionalclass;

import java.util.List;

public class Testingmap {

    public static void main(String[] args) {
        
        // create a list of String number 
        // then convert string into number 
        // then calculate square of each number 
        //then sum of them 
        List<String> stringNum = List.of("5","2","4","6","7","8");

        stringNum.stream()  /* convert list into stram */
                .map(st -> Integer.parseInt(st))  /* convert string into integer stram */
                .map(num -> Math.pow(num ,2)) /*calculate power */
                .reduce((a ,b) -> a+b) /*calculate sum of number  */
               .ifPresent(System.out::println); /*pass a method reference gto print  */
    }
}
