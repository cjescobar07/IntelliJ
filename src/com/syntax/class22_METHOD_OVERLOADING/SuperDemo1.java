package com.syntax.class22_METHOD_OVERLOADING;

public class SuperDemo1 {
}
class AAA{

}
class BBB{
    String name;
    BBB(){

    }
    BBB(String name){
        super();
        // this(); we can't use this() and super() inside the same constructor
        this.name = name;
    }
}