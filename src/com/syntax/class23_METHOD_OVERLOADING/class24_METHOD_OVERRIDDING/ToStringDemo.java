package com.syntax.class23_METHOD_OVERLOADING.class24_METHOD_OVERRIDDING;

public class ToStringDemo {
    String name;
    int age;
    ToStringDemo(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return name + " " + age;
    }
    public static void main(String[] args) {
        ToStringDemo toStringDemo = new ToStringDemo("Chris", 31);
        System.out.println(toStringDemo.toString());
    }
}
