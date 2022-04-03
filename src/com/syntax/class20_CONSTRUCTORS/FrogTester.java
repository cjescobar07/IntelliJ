package com.syntax.class20_CONSTRUCTORS;

public class FrogTester {
    public static void main(String[] args) {

        Frog frog = new Frog("Kermit", "Green", 5, 10);
        frog.printInfo();

        new Frog("Kermit", "Green", 2, 5).printInfo();

    }
}
