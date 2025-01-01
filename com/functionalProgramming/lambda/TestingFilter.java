package com.functionalProgramming.lambda;

import java.util.List;

public class TestingFilter {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "bananan", "mango", "date");

        fruits.stream()
                .filter(f -> f.startsWith("b"))

                .forEach(f -> System.out.println(f));

        // print odd numbers from list
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        numbers.stream()
                .filter(num -> num % 2 != 0)
                .forEach(num -> System.out.println(num));

        System.out.println();

        // method references
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);

    }
}