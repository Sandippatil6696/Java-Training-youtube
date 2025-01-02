package com.functionalProgramming.optionalclass;

import java.util.List;
import java.util.Optional;

public class TestingOptional {

    public static void main(String[] args) {
        
        List<Integer> numbers = List.of(1,5,3,4,9,7,2);

       Integer num =  numbers.stream()
                .reduce(0, (a,b)-> a+b);
                System.out.println(num);
                
            // if list is empty then what so we use optinal that return empty
             Optional<Integer> num1 =numbers.stream()
                        .reduce((a,b)-> a+b);
                        
                        if (num1.isPresent()) {
                            System.out.println(num1.get());
                        }else{
                            System.out.println("list is empty");
                        }

    }

}
