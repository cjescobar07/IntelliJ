package com.syntax.class24_ABSTRACT_CLASSES;

public interface Human {
    // public static final are redundant because by default all the variables are
    // public static final
    // public static final int legs = 2;
    int legs = 2;
    // public abstract void walk();

    void walk();
    static void printLegs(){
        System.out.println(legs);
    }
    public default void noNeedToWorry(){
        System.out.println("Default methods are there to support functional programming");
    }
    interface livingBeing{
        static void printLegs(){
            System.out.println("Not sure");
        }
    }
    class Student implements Human, livingBeing{

        @Override
        public void walk() {
            System.out.println("I can walk");
        }

        public static void main(String[] args) {
            Student student = new Student();
            student.walk();
            // Student.printLegs();
            Human.printLegs();
            livingBeing.printLegs();
        }
    }
}
