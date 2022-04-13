package com.syntax.class23_METHOD_OVERRIDING;

class Bird{
    public void sing(){
        System.out.println("Tweet tweet tweet");
    }
}

class Robin extends Bird{
    public void sing(){
        System.out.println("Twiddledeedee");
    }
}

class Pelican extends Bird{
}

public class Polymorphism {


    public static void main(String[] args) {
    Robin bird = new Robin();
    bird.sing();
    }
}
