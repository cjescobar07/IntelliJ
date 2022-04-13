package com.syntax.class19_CONSTRUCTORS;

public class PandaTester {
    public static void main(String[] args) {
        Panda panda = new Panda();
        panda.printInfo();

        Panda panda1 = new Panda("Chris", "Red Panda");
        panda1.printInfo();
    }
}
