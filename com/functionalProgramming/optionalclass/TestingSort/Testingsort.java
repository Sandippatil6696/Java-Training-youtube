package com.functionalProgramming.optionalclass.TestingSort;

import java.util.List;

public class Testingsort {

    public static void main(String[] args) {
        List<Employe> employess = List.of(

                                        new Employe("sandip" , 20000),
                                        new Employe("Rahul" , 2000),
                                        new Employe("Kartik" , 41000),
                                        new Employe("Mayur" , 74000),
                                        new Employe("chandu" , 18000),
                                        new Employe("Paji" , 10000)
        );

        employess.stream()
            .sorted((emp1 , emp2)-> Integer.compare(emp1.getSalary(), emp2.getSalary()))
            .forEach(System.out::println);
            
                            
    }
}
