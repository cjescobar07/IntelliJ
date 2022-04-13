package com.syntax.class23_METHOD_OVERRIDING;

public class Car {

    void start(){

        System.out.println("Use keys to start the car");
    }
    void stop(){
        System.out.println("Use brakes to stop the car");
    }
    void park(){
        System.out.println("Park the car manually");
    }
}
class BMW extends Car{


    void start(){
        System.out.println("Start car with start button");
    }
    void stop(){
        System.out.println("Can use breaks or I can autoBreak");
    }
    void park(){
        System.out.println("Use parking sensors to park me");
    }
}
class Tesla extends Car{


    void start(){
        System.out.println("Start me with App or remote");
    }
    void stop(){
        System.out.println("Can use breaks or I can autoBreak");
    }
    void park(){
        System.out.println("Use parking sensors or I can auto park myself");
    }
}
class Suzuki extends Car{
    void start(){
        System.out.println("push me to start");
    }
    void stop(){
        System.out.println("I lost my breaks and tires on the way");
    }
}
