package com.polymorphysum;

public class Test {
    public static void main(String[] args) {

        Car c = new Car(); // child class object 
        Vehicle v = new Vehicle(5);  // parent class object 

        Vehicle v1 = new Car(); // upcasting -- access only parent class properties 
        System.out.println(v1.getNoOfTyress());

        Vehicle v2 = new Vehicle(4);
        Car c1 = (Car) v2;   // downcasting 
        
       
        

        
    }
}
