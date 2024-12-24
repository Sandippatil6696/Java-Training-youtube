package com.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.commute(); // own method

        // object class - is a parent class of an all classes in java 
        System.out.println(v.toString());
        System.out.println(v.hashCode());
        System.out.println(v.getClass());

        TwoWheeler t = new TwoWheeler();
        t.commute(); // parent method  
        t.balance(); // own method 

        Motorcycle m = new Motorcycle();
        m.commute(); // grandparent method 
        m.balance(); // parent class method
        m.start(); // own method 


    }
}
