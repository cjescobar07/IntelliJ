package com.syntax.class24_ABSTRACT_CLASSES;

public class Computer {
    String make;

    Computer(String make) {
        this.make = make;
    }

    void login() {
        System.out.println("Use username and password to login");
    }
}
    class Apple extends Computer {

        Apple(String make) {
            super(make);
        }

        @Override
        void login() {
            System.out.println("Use fingerprint to login as well");
        }
    }

    class Lenovo extends Computer {
        public Lenovo(String make) {
            super(make);
        }

        @Override
        void login() {
            System.out.println("Use windows Hello to login as well");
        }
    }

    class HP extends Computer {
        public HP(String make) {
            super(make);
        }
    }


class laptopTester {
    /*
      Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
      Define common behavior within and some fields in parent class and override some methods in child classes
      Define some methods specific to child classes
      Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo("Lenovo");
        lenovo.login();
        HP hp = new HP("HP");
        hp.login();
    }

}
