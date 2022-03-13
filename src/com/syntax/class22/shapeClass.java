package com.syntax.class22;

public class shapeClass {
    /*
     Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
     In circle class create a method to calculate the area of circle. Test your code
     */

    int radius;

    public shapeClass(int radius) {
        this.radius = radius;
    }
}

class Circle extends shapeClass {
    public Circle(int radius) {
        super(radius);
    }

    void area() {

        System.out.println(3.14 * super.radius * super.radius);
    }
}

class Radius{
    public static void main(String[] args) {
        new Circle((2)).area();


    }
}

