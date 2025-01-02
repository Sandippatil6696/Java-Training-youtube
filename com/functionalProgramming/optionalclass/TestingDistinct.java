package com.functionalProgramming.optionalclass;

import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {

    public static void main(String[] args) {
        
        List<Integer> number5 = List.of( 6 ,8,9,10,14,2,6,6,14,8);

        List<Integer> number = number5.stream()
                .distinct()
                .collect(Collectors.toList());

                System.out.println(number5);
                System.out.println(number);
                


        
    }

}
