package com.functionalProgramming.lambda;

import java.util.List;

public class TestReduce {
    public static void main(String[] args) {
        
        List<Integer> numbers = List.of(5 , 6 ,8,11,6,7);

        

        // lambda expression 
        Integer sum = numbers.stream()
        .reduce(0, (a, b) -> a +b);
        System.out.println(sum);


        int max = numbers.stream().reduce(Integer.MIN_VALUE, (a,b) -> a > b ? a: b);
        System.out.println(max);

        int min = numbers.stream().reduce(Integer.MAX_VALUE, (a,b) -> a < b ? a: b);
        System.out.println(min);



        // filter out a  string length is greater than 10 and concatenates them  
        List<String> strs = List.of("sandip patil is" , "ganda" , "ghatiya" , "londa" , "learning java from" , "kg ka " , "kg koding youtube channel");

        String result = strs.stream()
            .filter(st -> st.length() > 10)
            .reduce("", (a ,b) -> a+" "+b);

            System.out.println(result);

    }

}
