package com.syntax.class24;

public class Parent {
   final String name = "Chris";
   final void Method(){
       // name = "Chris; can reassign if a variable is fine
        System.out.println("I am the parent");
    }
}
class Child extends Parent{
    
    /*void Method(){
    can't override because it is final method
     */

    }