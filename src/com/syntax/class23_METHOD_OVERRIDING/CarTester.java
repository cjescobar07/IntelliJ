package com.syntax.class23_METHOD_OVERRIDING;

public class CarTester {
    public static void main(String[] args) {  
    BMW bmw = new BMW();
    bmw.start();
    bmw.stop();
    bmw.park();

    System.out.println("----------------------");

    Tesla tesla = new Tesla();
    tesla.start();
    tesla.stop();
    tesla.park();

    System.out.println("----------------------");

    Suzuki suzuki = new Suzuki();
    suzuki.start();
    suzuki.stop();
    suzuki.park();

    System.out.println("----------------------");

    Car car = new BMW();
    car = new Tesla();
    car = new Suzuki();
    car.start();
    // BMW bmw1 = new Car();

    Object str = new String("sbdf");


    }
}
