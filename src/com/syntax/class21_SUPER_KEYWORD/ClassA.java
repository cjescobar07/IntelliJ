package com.syntax.class21_SUPER_KEYWORD;

public class ClassA {
    void method(){
        System.out.println("Method from Class A");
    }
}
class ClassB extends ClassA{
    void method(){
        System.out.println("Method from Class B");
    }
    void test(){
        method();
        this.method();
        super.method();
    }
}
class Tester{
    public static void main(String[] args) {
        ClassB classB= new ClassB();
        classB.test();
    }
}
