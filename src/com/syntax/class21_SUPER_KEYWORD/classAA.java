package com.syntax.class21_SUPER_KEYWORD;

public class classAA {
    String name;
    int age;
    double weight;

    public classAA(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void printInfo(){
        System.out.println(name + " " + age + " " + weight);
    }
}
class classBB extends classAA{
    public classBB(String name, int age, double weight) {
        super(name, age, weight); // this is how it will be mostly be used in our jobs.
        /*
        Because constructors are from the parent class don't participate inheritance
        we need to create a matching constructor in the child classes as well
        we can use super() to call the constructor from the parent class so that we don't have to repeat the code
         */
    }
}
class Test{
    public static void main(String[] args) {
        classBB ClassBB = new classBB("Chris", 31, 300);
        ClassBB.printInfo();

    }

}
