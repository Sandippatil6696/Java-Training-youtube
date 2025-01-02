package com.functionalProgramming.optionalclass.TestingSort;

public class Employe {
    
    private final String name ;
    private final int salary ;

    Employe(String name , int salary){
        this.name = name;
        this.salary= salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employe [name=" + name + ", salary=" + salary + "]";
    }


    


}
