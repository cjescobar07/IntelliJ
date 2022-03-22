package com.syntax.Group7_ProjectTasks;
/*
1.	Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
Test your code.
 */


interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

class Square implements Shape{
    private double length;
    private double width;

public Square(double length, double width){
    this.length = length;
    this.width = width;
}

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public double calculatePerimeter() {
        return 2* (length+width);
    }
}

class Circle implements Shape{
    private double radius;

public Circle(double radius){
    this.radius = radius;
}

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2* Math.PI * radius;
    }
}

class Task01_Shape{
    public static void main(String[] args) {
        double length = 3.0;
        double width = 3.0;

        Square square= new Square(length, width);
        System.out.println("Square area: "+ square.calculateArea());
        System.out.println("Square perimeter: "+ square.calculatePerimeter());

        //Circle area and perimeter
        double radius= 3.0;
        Circle circle= new Circle(radius);
        System.out.println("Circle area: "+circle.calculateArea());
        System.out.println("Circle perimeter: "+circle.calculatePerimeter());
    }
}
