package GetterSetter.com.example.utility;

import GetterSetter.com.example.geometry.Circle;
import GetterSetter.com.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(5,10);

        double cirArea = Math.PI * Math.pow(c.radius, 2);
        double rectArea = r.length * r.breadth ;

        System.out.println("area of circle is " + cirArea);
        System.out.println("area of rectangle is " + rectArea);
    }
}
