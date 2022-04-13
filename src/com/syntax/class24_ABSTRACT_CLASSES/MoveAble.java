package com.syntax.class24_ABSTRACT_CLASSES;

public interface MoveAble {
    void move();
}

interface driveAble{
    void drive();
}

interface Car extends driveAble, MoveAble{

}
class BMW implements Car {

    @Override
    public void move() {
        System.out.println("We can move BMW");
    }

    @Override
    public void drive() {
        System.out.println("we can drive the BMW");
    }
}
class CarTester{
    public static void main(String[] args) {
        Car car = new BMW();
        car.drive();
        car.move();
        System.out.println("");

        driveAble driveAble = new BMW();
        driveAble.drive();

        MoveAble moveAble = new BMW();
        moveAble.move();


    }
}