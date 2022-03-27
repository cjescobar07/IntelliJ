package com.syntax.Group7_ProjectTasks;
/*
1.	Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
Test your code.
 */


interface Shape {
    void calculateArea(double input);
    void calculatePerimeter(double input);
}

class Square implements Shape{ // can also be "abstract class Square Shape"

    @Override
    public void calculateArea(double input) {
        double area = input * input;
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter(double input) {
        double perimeter = 4*input;
        System.out.println(perimeter);

    }
}

class Circle implements Shape{

    @Override
    public void calculateArea(double input) {
        double area = Math.PI * Math.pow(input,2);
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter(double input) {
        System.out.println(2*Math.PI*input);
    }
}

class Task01_Shape{
    public static void main(String[] args) {

        Shape shape= new Square();
        shape.calculatePerimeter(10);


        //Circle area and perimeter
        Shape shape2 = new Circle();
        shape2.calculateArea(10);

    }
}
