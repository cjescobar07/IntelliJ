package com.syntax.class20_INHERITANCE;

public class Task2 {
    /*
    Write program to inherit class A that has method print F
    which is static and call or reuse that method into class B
    */
    public static void main(String[] args) {
        BB.printF();
    }
}
    class AA {
        static void printF() {
            System.out.println("I will be making lots of momeny");
        }
    }
    class BB extends AA{

    }


