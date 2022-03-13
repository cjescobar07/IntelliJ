package com.syntax.class22;

public class Parent {
    String name = "Parent";
    void printName(){
        System.out.println(name);
    }

}
class Child extends Parent{
     String name = "Child";
    void printName(){
        String name = "Chris"; // first priority is given to local variables
        System.out.println(name);

        System.out.println(this.name);
         /*
        when we use the "this" keyword even though we have a local variable, Java will only bring the values
        from instance variables
         */
        System.out.println(super.name);
         /*when we use the "super" keyword even though we have a local variable and instance variables inside the same
        class, Java will only bring the values from parent class instance variables
         */

        // super.printName();
    }
}
class ParentTester{
    public static void main(String[] args) {
        Child child = new Child();
        child.printName();


    }
}
