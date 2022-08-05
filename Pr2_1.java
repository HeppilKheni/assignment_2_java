//ID : 21CE056
//Name : Heppil Kheni
/*Aim :  Design a class named Circle containing following attributes and behavior.
    • One double data field named radius. The default value is 1.
    • A no-argument constructor that creates a default circle.
    • A Single argument constructor that creates a Circle with the specified radius.
    • A method named getArea() that returns area of the Circle.
    • A method named getPerimeter() that returns perimeter of it.*/

import java.util.*;
class Circle {
    private double radius;

    public final double PI = 3.14;
    Circle() {
        radius = 1;
    }
    Circle(double r) {
        radius = r;
    }
    public double getperimeter() {
        return PI * 2 * radius;
    }
    public double getarea() {
        return radius * radius * PI;
    }
}
public class Pr2_1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Area is " + c1.getarea() + " Perimeter is " + c1.getperimeter());
        Circle c2 = new Circle(5);
        System.out.printf("Area is " + c2.getarea() + " Perimeter is " + c2.getperimeter());
    }
}