package com.Abstraction;

public class TestShapes {
    public static void main(String[] args) {
        // Shape s = new Shape(); // you can not make object of abstract class 
           Circle c = new Circle(5);
           Square s = new Square(6.2);

           System.out.println("area of circle is "+ c.calculateArea());
           System.out.println("are of square is " + s.calculateArea());
        
    }
}
