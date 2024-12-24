package com.Abstraction;

public class Circle extends Shape{

   private double radius ;

//    constructor
   public Circle(double radius){
    this.radius =radius;
   }

//    getter
   public double getRadius(){
    return radius;
   }

   
// implementation method 
@Override
public double calculateArea() {
    return Math.PI * Math.pow(radius, 2);
}
}
